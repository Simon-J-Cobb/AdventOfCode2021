package day6

class Swarm2(fish: List<Int>) {

    var fishNumbers = toSwarm(fish)

    fun toSwarm(fishes: List<Int>): MutableMap<Int,Long> {
        var fishNumbers = mutableMapOf<Int,Long>(0 to 0,1 to 0, 2 to 0, 3 to 0, 4 to 0 , 5 to 0, 6 to 0 ,7 to 0 , 8 to 0)
        for(fish in fishes){
            fishNumbers[fish] = fishNumbers.getValue(fish) + 1
        }
        return fishNumbers

    }

    fun day(){
        var newFishNumbers = mutableMapOf<Int,Long>(0 to 0,1 to 0, 2 to 0, 3 to 0, 4 to 0 , 5 to 0, 6 to 0 ,7 to 0 , 8 to 0)

        for(i in 1..8){
            newFishNumbers[i-1] = fishNumbers.getValue(i)
        }
        newFishNumbers[8] = fishNumbers.getValue(0)
        newFishNumbers[6] = newFishNumbers.getValue(6) + fishNumbers.getValue(0)
        fishNumbers = newFishNumbers
    }

    fun day(int: Int){
        repeat(int){
            day()
        }
    }

    fun size():Long{
        return fishNumbers.values.sum().toLong()
    }
}