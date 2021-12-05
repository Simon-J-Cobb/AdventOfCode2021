package day2

class Submarine {
    var depth: Int = 0
    var horizontal: Int = 0
    var aim: Int = 0

    fun move(instruction: Pair<String, Int>){
        if(instruction.first == "forward"){
            horizontal += instruction.second
        }
        else if(instruction.first == "down"){
            depth += instruction.second
        }
        else if(instruction.first == "up"){
            depth -= instruction.second
        }
        else{
        }
    }

    fun moveWithAim(instruction: Pair<String, Int>){
        if(instruction.first == "forward"){
            horizontal += instruction.second
            depth +=  instruction.second * aim
        }
        else if(instruction.first == "down"){
            aim += instruction.second
        }
        else if(instruction.first == "up"){
            aim -= instruction.second
        }
        else{
        }
    }



}