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
}