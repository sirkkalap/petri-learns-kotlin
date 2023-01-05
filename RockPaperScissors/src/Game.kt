fun main() {
    val selections = arrayOf("Kivi", "Paperi", "Sakset")
    val game = getGameChoice(selections)
    val user = getUserChoice(selections)
    println("Minun valintani: $game")
    println(getResult(user, game))
}

fun getUserChoice(selections: Array<String>): String {
    println("Valitse yksi näistä: ${selections.joinToString()}")
    var userInput = ""
    do {
        userInput = readLine()!!
    } while (!selections.contains(userInput))
    return userInput
}

fun getGameChoice(selections: Array<String>): String {
    val rand = (Math.random() * selections.size).toInt()
    return selections[rand]
}

fun getResult(user: String, game: String): String {
    return if (user == game) {
        "Tasapeli"
    }
    else {
        if (isBetter(user, game)) {
            "Voitit"
        } else {
            "Hävisit"
        }
    }
}

fun isBetter(s1:String, s2:String): Boolean {
    when {
        s1 == "Kivi" && s2 == "Paperi" -> return false
        s1 == "Kivi" && s2 == "Sakset" -> return true
        s1 == "Paperi" && s2 == "Kivi" -> return true
        s1 == "Paperi" && s2 == "Sakset" -> return false
        s1 == "Sakset" && s2 == "Kivi" -> return false
        s1 == "Sakset" && s2 == "Paperi" -> return true
    }
    return false
}