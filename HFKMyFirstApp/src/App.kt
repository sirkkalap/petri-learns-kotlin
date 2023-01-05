fun main() {
    println("Pow!")

    var x = 3
    val name = "Petri"
    x *= 10
    // Hmmm. Kommentti.
    print("x is $x")

    while (x > 20) {
        x -= 1
        print(" x is now $x")
    }
    for (i in 1..10) {
        x += 1
        print(" x is now $x")
    }

    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }

    if (name == "Petri") {
        println("$name Strike")
    }

    x = 4
    while (x > 3) {
        println(x)
        x -= 1
    }

    var z = 27

    while (z == 10) {
        // never runs
        println(z)
        z += 6
    }

    x = 1
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop x = $x.")
        x += 1
    }
    println("After the loop. x = $x.")

    x = 3
    var y = 1
    if (x > y) {
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    }

    println(
        if (x > y) "x is greater than y"
        else "x is not greater than y"
    )

    println("This runs always.")
    yabba()
}

fun yabba() {
    var x = 1
    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x += 1
    }
    if (x == 3) println("Do")
}