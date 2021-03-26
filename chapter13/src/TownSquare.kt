open class TownSquare: Room("Town Square") {
    private val bellSound = "댕댕"
    override val dangerLevel = super.dangerLevel - 3 // 부모의 가시성을 따른다 protected

    override fun load() = "당신의 참여를 주민들이 다 함께 환경합니다!\r\n" + ringBell()

    fun ringBell() = "당신의 도착을 종탑에서 알림니다. $bellSound"
}

// 부모 타입 변수로는 모든 자식을 참조 할 수 있음
fun printRoomInfo(room: Room){
    println(room.description())
    println(room.load())
//    println(room.ringBell())  // 에러: 부모의 함수만 호출가능
}

fun main(){
    // TownSquare 클래스를 상속하여 자식 정의.
    // 그리고 인스턴스를 생성해서 리턴
    // 중요도 ****
    val test = object: TownSquare() {  // TownSquare 클래스를 상속하여 자식 정의. 그리고 인스턴스를 생성해서 리턴
        override fun load()= "새로운 로드입니다."
    }

    println(test.load())
    println(test.description())
}
