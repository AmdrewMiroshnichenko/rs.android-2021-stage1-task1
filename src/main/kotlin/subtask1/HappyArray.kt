package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList = sadArray.toMutableList()
        var isReady = false
        var index: Int = 1
        var counter: Int = 0

        while (counter < happyList.size - 1) {
            while (!isReady && index < happyList.size - 1) {
                if (happyList.get(index) > happyList.get(index - 1) + happyList.get(index + 1)) {
                    happyList.removeAt(index)
                } else {
                    if (index != happyList.size - 1) {
                        index++
                    } else {
                        isReady = true;
                    }
                }
            }
            index = 1
            counter++
        }
        val happyArray = happyList.toIntArray()
        return happyArray
    }
}
