enum class Direction(private val str: String) {
    NORTH("λΆ"),
    EAST("λ"),
    SOUTH("λ¨"),
    WEST("μ");

    override fun toString() = str
}

fun main(){
    var dir = Direction.EAST
    println(dir)
    dir = Direction.NORTH
    println(dir)
}