package day4

class Bingo(numbers: List<List<Int>>) {

    var Grid = toBingoGrid(numbers)

    private fun toBingoRow(row: List<Int>): List<BingoSquare>{
        return row.map{BingoSquare(it)}
    }

    private fun toBingoGrid(numbers: List<List<Int>>): List<List<BingoSquare>>{
        return numbers.map{toBingoRow(it)}
    }

    fun call(number: Int): Int{
        for(row in Grid)
            for(item in row){
                item.call(number)
            }
        if(winCheck()){
            return sumOfUnCalled() * number
        }
        return 0
    }

    fun rowCheck():Boolean{
        for(row in Grid)
            for(i in row.indices){
                if(row[i].called && i == 4)
                    return true
                else if(row[i].called)
                    continue
                else
                    break
            }
        return false;
    }

    fun columnCheck():Boolean{
        var columncounter = 0
        while (columncounter < 5){
            var rowcounter = 0
            while (rowcounter < 5) {
                if (Grid[rowcounter][columncounter].called && rowcounter == 4)
                    return true
                else if (Grid[rowcounter][columncounter].called)
                    ++rowcounter
                else
                    break
            }
            ++columncounter
            }
        return false;

    }

    fun winCheck():Boolean{
        return rowCheck() || columnCheck()
    }

    fun sumOfUnCalled():Int{
        var sum = 0;
        for(row in Grid){
            for(item in row){
                if(!item.called)
                    sum += item.number
            }
        }
        return sum;
    }



    class BingoSquare(int: Int){
        var called = false;
        var number = int;

        fun call(int: Int){
            if(number == int)
                called = true;
        }

    }
}