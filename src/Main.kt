fun main() {
    var max= findMAxandMin(arrayOf(4,5,6,7,8), true)
    var min = findMAxandMin(arrayOf(4,3,4,2,5,6,9),false)
    println("the maximum value is $max")
    println("the minimum value is $min")

}
 fun findMAxandMin( numbers: Array<Int>, SearchResult: Boolean): Int {
     var max = numbers[0]
    var min = max
    if (SearchResult){
        for (number in numbers){
            if (number > max)
                max = number
        }
        return max
    }else
        for (number in numbers){
            if (number< min)
                min = number
        }
    return min
 }