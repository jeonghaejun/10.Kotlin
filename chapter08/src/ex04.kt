fun main(args: Array<String>) {
    val patronList = mutableListOf <String> ("Eli", "Mordoc", "Sophie")

    for(patron in patronList) {
        println("좋은 밤입니다. $patron 님")
    }
    println()

    patronList.forEach { patron ->
        println("좋은 밤입니다. $patron 님")
    }
    println()

    patronList.forEach { println("좋은 밤입니다. $it 님") }
    println()

    patronList.forEachIndexed { index, patron ->
        println("좋은 밤입니다. $patron 님 - 당신은 ${index+1} 번째 입니다.")
    }
}