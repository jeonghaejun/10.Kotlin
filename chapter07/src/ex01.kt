const val TAVERN_NAME = "Taernly's Folly"

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
}

private fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiou]")) {
    when(it.value) {
        "a" -> "4"
        "e" -> "3"
        "i" -> "1"
        "o" -> "0"
        "u" -> "|_|"
        else -> it.value
    }
}

private fun placeOrder(menuData: String) {
    val indexofApostrophe = TAVERN_NAME.indexOf('\'')
    val tarvernMaster = TAVERN_NAME.substring(0 until indexofApostrophe)
    println("마드리갈은 $tarvernMaster 에게 주문한다.")
    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "마드리드갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    val phrase = "와, $name 진짜 좋구나"
    println("마드리갈이 감탄한다: ${toDragonSpeak(phrase)}")
}