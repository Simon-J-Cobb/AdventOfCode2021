package day6

class Swarm(fish: List<Int>) {

    var fish = toSwarm(fish)

    private fun toSwarm(fish: List<Int>):MutableList<Lanternfish>{
        return fish.map { Lanternfish(it) }.toMutableList()
    }

    private fun day(){
        repeat(fish.filter { it.timer == 0 }.size){ fish.add(Lanternfish(9))}
        fish.map { it.grow() }

    }

    fun day(int: Int){
        repeat(int){
            day()
        }
    }

    fun size():Int{
        return fish.size
    }

    fun toList():List<Int>{
        return fish.map { it.timer }
    }

    class Lanternfish(var timer: Int){

        private val resetTime = 6;
        fun grow(){
            if(timer==0){
                timer = resetTime
            }
            else{
                timer -= 1
            }
        }

    }
}