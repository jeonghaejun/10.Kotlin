fun main(args: Array<String>){
    val player = Player("Madrigal")
    // val player2 = Player // 디폴트 생성자 없음
    println(player.name)
    println(player.healthPoints)
    println(player.isBlessed)
    // --> apply

    val player2 = Player("Hong gildong")
    println(player2)
    player2.apply { println("$name $healthPoints $isBlessed") }

    println(player2.hometown)
}
