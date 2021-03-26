class Player(_name: String,   // 초기화 순서1
             var healthPoints:Int,    // 멤버 변수화
             var isBlessed: Boolean,  // 멤버 변수화
             private val isImmortal: Boolean) {  // 멤버 변수화
    var name = _name  // 초기화 순서2
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    val hometown by lazy{
        selectHometown()
    }

    fun selectHometown(): String {
        return "Seoul"
    }

    init {  // 초기화 순서3
        println("init block")
        require(healthPoints > 0, {"healthPoints는 0보다 커야 합니다."})
        require(name.isNotBlank(), {"플레이어는 이름이 있어야 합니다."})
    }

    constructor(name:String) : this(name, healthPoints=100, isBlessed=true, isImmortal=false){  // 초기화 순서4
        println("보조 생성자")
    }

    fun castFireball(numFireballs: Int = 2) =
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}