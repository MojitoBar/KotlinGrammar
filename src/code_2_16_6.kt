object NullCheckExam2{
    fun nullCheckReturn(str:String?){
        str ?: return
        println(str)
    }

    fun nullCheckBreak(str:Array<String?>){
        for (i in str){
            i ?: break
            println(i)
        }
    }
}

fun main(args:Array<String>){
    NullCheckExam2.nullCheckReturn(null)
    NullCheckExam2.nullCheckReturn("Hello World")

    val arr = arrayOf("A", "B", null, "C", "D")
    NullCheckExam2.nullCheckBreak(arr)

}