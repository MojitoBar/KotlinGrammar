private data class Book_2_14_3(var title:String = "", var author:String = "", var price:Int =0)

fun main(args:Array<String>){
    var book = Book_2_14_3("Kotlin", "Daniel", 10000)
    println("${book.title} / ${book.author} / ${book.price}")

    var book2 = book.copy(title = "Android", price = 12222)
    println("${book2.title} / ${book2.author} / ${book2.price}")

    println(book == book2)

    book2.price = 30000
    println("${book2.title} / ${book2.author} / ${book2.price}")
}