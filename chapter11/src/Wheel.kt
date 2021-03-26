class Wheel {
    lateinit var alignment: String

    fun initAligment() {
        alignment = "Good"
    }

    fun printAlignment() {
        if(::alignment.isInitialized) println(alignment)
    }
}

fun main(args: Array<String>){
    val w = Wheel()
    println("초기화 전")
    w.printAlignment()
    println("초기화 후")
    w.initAligment()
    w.printAlignment()
}