package day2

class Solution {
    fun solution1(instructions: List<Pair<String,Int>>) : Int{
        val sub = Submarine()
        for(instruction in instructions){
            sub.move(instruction)
        }
        return sub.depth * sub.horizontal

    }
}