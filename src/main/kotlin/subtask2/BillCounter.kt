package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var billList = bill.toMutableList()
        var annaBill = 0
        var index = 0
        var answer: String

        billList.removeAt(k);
        while (index < billList.size){
            annaBill += billList.get(index)
            index++
        }

        annaBill /= 2

        if (b - annaBill == 0) {
            answer = "bon appetit"
        } else {
            var temp = b - annaBill
            answer = temp.toString()
        }

        return answer

    }
}
