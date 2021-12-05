
fun main() {
    val depths: List<Int> = ReadFile().readFileInAsListofNumbers("src/main/resources/day1/Question1")
    println(day1.Solution().solution1(depths))
    println(day1.Solution().solution2(depths))
    val instructions: List<Pair<String,Int>> = ReadFile().readFileInAsListofStringsAndNumbers("src/main/resources/day2/Question1")
    println(day2.Solution().solution1(instructions))
    println(day2.Solution().solution2(instructions))

}