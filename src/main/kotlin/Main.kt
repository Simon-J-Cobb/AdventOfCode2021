import day1.Solution

fun main() {
    val depths: List<Int> = ReadFile().readFileInAsListofNumbers("src/main/resources/day1/Question1")
    println(Solution().solution1(depths))
    println(Solution().solution2(depths))
}