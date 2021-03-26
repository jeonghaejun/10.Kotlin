

//class Human(var name: String, var age: Int, var addr: String="서울"){
//
//    override fun hashCode(): Int {
//        print("Hash Code called")
//        return super.hashCode()
//    }
//
//    override fun toString() = "$name $age $addr"
//    // python : __str__() 같은 역할
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Human) {  // other가 Human 인스턴스인가?
//            val h = other as Human  // Any에서 Human으로 타입 캐스팅
//            return name == other.name && age == other.age && addr == other.addr
//        } else {  // other가 Human이 아닌 경우는 다름으로 판정
//            return false
//        }
//    }
//    // python __eq__() 같은 역할
//}

// 위의 과정을 한방에 data class로 해결
data class Human(var name: String, var age: Int, var addr: String="서울")


fun main(){
    val h1 = Human("홍길동",20)
    val h2 = Human("고길동",40,"수원")
    val h3 = Human("고길동",40,"수원")

    println(h1)   // 내부에서 h1.toString()의 리턴값을 출력
    println(h2)
    println(h3)

    // 내용이 같냐? 검사, 참조가 같냐는 ===
    println(h1 == h2)  // 내부적으로 h1.equals(h2) 검사
    println(h2 == h3)

    // 내용이 같냐?
//    println(h1.equals(h2))
//    println(h2.equals(h3))
    val h4 = h3 // 같은 참조를 가지겠다는 것
    println(h3 === h4)  // true
    val h5 = h3.copy(age=25)  // 복사본 생성
    println(h5)
    println(h3 === h5)  // false
}