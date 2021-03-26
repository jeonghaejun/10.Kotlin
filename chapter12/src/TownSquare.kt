class TownSquare: Room("Town Square") {
    private val bellSound = "댕댕"
    override val dangerLevel = super.dangerLevel - 3 // 부모의 가시성을 따른다 protected

    final override fun load() = "당신의 참여를 주민들이 다 함께 환경합니다!\r\n" + ringBell()

    fun ringBell() = "당신의 도착을 종탑에서 알림니다. $bellSound"
}

// 부모 타입 변수로는 모든 자식을 참조 할 수 있음
fun printRoomInfo(room: Room){
    println(room.description())
    println(room.load())
//    println(room.ringBell())  // 에러: 부모의 함수만 호출가능
}

fun main(){
    // val ts = TownSquare()
    val ts: TownSquare
    ts = TownSquare()
    // ts = Room("Foyer") // 에러, 자식 타입 변수로 부모 참조 불가
    printRoomInfo(ts)
    println(ts.ringBell())

    // println(ts.dangerLevel) // 가시성 때문에 안된다 즉, 오버라이드되면 부모의 가시성을 그대로 가지고 온다.

    var room: Room
    room = Room("Fayer")  // Ok
//    room = TownSquare()  // 부모타입 변수로는 모든 자식을 참조 할 수 있음
    printRoomInfo(room)
}