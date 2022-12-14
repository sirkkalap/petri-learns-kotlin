fun main() {
    val name = "Petri"
    println("Pow! My name is $name")

    var x = 3
    x *= 10
    // Hmmm. Kommentti.
    print("x is $x")

    while ( x > 20) {
        x -= 1
        print(" x is now $x")
    }
    for (i in 1..10) {
        x += 1
        print(" x is now $x")
    }
}