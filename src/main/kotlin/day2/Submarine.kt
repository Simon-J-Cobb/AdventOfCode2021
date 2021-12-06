package day2

class Submarine {
    var depth: Int = 0
    var horizontal: Int = 0
    var aim: Int = 0

    fun move(instruction: Pair<String, Int>){
        when(instruction.first){
            "forward" -> {horizontal += instruction.second}
            "down" ->{depth += instruction.second}
            "up"->{depth -= instruction.second}
    }
    }

    fun moveWithAim(instruction: Pair<String, Int>){
        when(instruction.first){
            "forward" -> {horizontal += instruction.second;depth +=  instruction.second * aim}
            "down" ->{aim += instruction.second}
            "up"->{aim -= instruction.second}
    }}

}