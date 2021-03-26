fun readLine(): String ? {
     return "hello world"
//     return ""
//    return null
}

fun main(args: Array<String>) {
    // xxx.let{ }, it은 xxx에 대한 참조임

    var beverage = readLine()?.let {
        if(it.isNotBlank()) {
            it.capitalize()
        } else {
            "맥주"
        }
    }
    // beverage = null // 에러가 아님
    println(beverage)
}