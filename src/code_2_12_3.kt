fun main(args: Array<String>){
    val book = Book("Kotlin", "Daniel")
    val ebook = EBook("Kotlin", "Daniel", "https://devdogs.kr")

    book.printInfo()
    ebook.printInfo()
}

open class Book(){
    var title:String = ""
    var author:String = ""

    constructor(title:String) : this(){
        this.title = title
    }

    constructor(title:String, author:String) : this(title){
        this.author = author
    }

    open fun printInfo(){
        println("제목은 ${title}, 저자는 ${author} 입니다.")
    }
}

class EBook(title:String, author:String, var url:String?) : Book(title, author){
    constructor() : this("", "", null)

    override fun printInfo() {
        println("제목은 ${title} 저자는 ${author} 접속 URL은 ${url} 입니다.")
    }
}