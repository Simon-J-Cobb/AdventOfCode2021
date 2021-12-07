package day4

class Solution {

    fun solution1(game: ReadFileBingo): Int{
        for(number in game.numbers){
            for(board in game.boards){
                var score = board.call(number)
                if(score != 0)
                    {return score}
            }
        }
        return 0
    }

    fun solution2(game: ReadFileBingo): Int{
        for(number in game.numbers){
            for(board in game.boards){
                if(board.won){
                    continue
                }
                var score = board.call(number)
                if(game.boards.none { !it.won })
                {return score}
            }
        }
        return 0
    }
}