package game

class Player {
    var name = "madrigal"  // 멤버 변수는 반드시 초기화 되야 함. 초기화하지 않으면 에러
        get() = field.capitalize()
        //        get(){return field.capitalize()}
        set(value) {
            field=value.trim()
        }

    fun castFireball(numFireballs: Int = 2) =
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}