package day1

class Solution() {

    fun solution1(depths: List<Int>): Int {
        var count = 0
        depths.windowed(2).forEach {
            if(it[0] < it[1])
                count += 1

        }
        return count

    }

    fun solution2(depths: List<Int>): Int {
        return 0
    }
}