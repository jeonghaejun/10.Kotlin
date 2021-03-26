val patronList2 = mutableListOf <String> ("Eli", "Mordoc", "Sophie")

fun main(args: Array<String>) {
    println(patronList2)
    patronList2.remove("Eli")
    patronList2.add("Alex")
    patronList2.add(0, "Alex")
    println(patronList2)

    patronList2.set(0, "Alexis")
    println(patronList2)
}