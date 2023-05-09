object BubbleSort2 {
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        var temp = 0
        for (i in 0 until n) {
            for (j in 1 until n - i) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1]
                    arr[j - 1] = arr[j]
                    arr[j] = temp
                }
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 60, 35, 2, 45, 320, 5)
        println("Kotlin: Przed sortowaniem")
        for (i in arr.indices) {
            print(arr[i].toString() + " ")
        }
        println()
        bubbleSort(arr)
        println("Kotlin: Po sortowaniu")
        for (i in arr.indices) {
            print(arr[i].toString() + " ")
        }
    }
}