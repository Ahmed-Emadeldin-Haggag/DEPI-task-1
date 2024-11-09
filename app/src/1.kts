fun main() {
    var name: String? = "Alice"

    // Using non-null assertion
    val length = name!!.length

    println("Length of the name is: $length") // Output: Length of the name is: 5

    // Now, let's set name to null
    name = null

    // This will throw a NullPointerException
    val lengthWithNull = name!!.length // Uncommenting this line will cause an exception
}
