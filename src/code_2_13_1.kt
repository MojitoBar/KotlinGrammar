fun main(args:Array<String>){
    var rec = Rectangle()
    var cir = Circle()

    rec.draw()
    cir.draw()
}

abstract class Shape{
    abstract fun draw()
}

class Rectangle : Shape(){
    override fun draw() {
        println("사각형 그리기")
    }
}

class Circle : Shape(){
    override fun draw() {
        println("원 그리기")
    }
}