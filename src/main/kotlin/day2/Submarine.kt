package day2

class Submarine {
    var depth: Int = 0
    var horizontal: Int = 0

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

}