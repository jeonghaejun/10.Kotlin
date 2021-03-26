fun main(args:Array<String>) {
    val map = mapOf<String, Double>(
        "Eli" to 10.5,
        "Sophie" to 5.5
    )
    println(map)

    val map2 = mutableMapOf<String, Double>(
        Pair("Eli", 10.5),
        Pair("Sophie", 5.5)
    )
    map2 += "Sophie" to 6.0
    println(map2)

    map2["Sophie"] = 7.0
    println(map2["Sophie"])

    map2["Sophie2"] = 8.0
    println(map2)

    var value : Double // null 허용하지 않음
//    value = map2["test"] // 맵[] 리턴타입은 Double? <-- null허용

    value = map2.getOrElse("Sophie2"){8.0}
    println(value)
    value=map2.getOrDefault("test",0.0)
    println(value)
    println()

    // forEach로 Map 순회하면서 출력
    map2.forEach{key,value ->
        println("$key : $value")
    }

}