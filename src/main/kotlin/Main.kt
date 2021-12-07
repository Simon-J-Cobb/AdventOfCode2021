import day4.ReadFileBingo

fun main() {
    val depths: List<Int> = ReadFile().readFileInAsListofNumbers("src/main/resources/day1/Question1")
    println(day1.Solution().solution1(depths))
    println(day1.Solution().solution2(depths))
    val instructions: List<Pair<String,Int>> = ReadFile().readFileInAsListofStringsAndNumbers("src/main/resources/day2/Question1")
    println(day2.Solution().solution1(instructions))
    println(day2.Solution().solution2(instructions))
    val matrix: List<String> = ReadFile().readFileInAsListofStrings("src/main/resources/day3/Question1")
    println(day3.Solution().solution1(matrix))
    println(day3.Solution().solution2(matrix))
    var file = ReadFileBingo("src/main/resources/day4/Question1")
    println(day4.Solution().solution1(file))
    println(day4.Solution().solution2(file))

}