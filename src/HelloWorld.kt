import sun.awt.windows.ThemeReader
import java.io.File
import java.io.FileNotFoundException
import java.util.*
import java.util.Random as R

fun main(args: Array<String>){

// 패키지 예제
//    var random = R()
//    var randomNumber = random.nextInt()
//
//
//    println("랜덤하게 뽑은 숫자는 ${randomNumber} 입니다.")

// 배열 예제 1
//    var arr:Array<Int> = arrayOf(0, 1, 2, 3)
//
//    println(Arrays.toString(arr))


// 배열 예제 2
//    var arr2 = Array(5, { i -> i.toString() })
//
//    println(arr2 is Array<String>)
//    println(Arrays.toString(arr2))


// if조건문 예제
//    var num:Int = 10
//    if (num == 0){
//        println("num은 0입니다.")
//    }
//    else if (num == 10){
//        println("num은 10입니다.")
//    }
//    else{
//        println("num은 0과 10이 아닙니다.")
//    }


// if문 예제1
//    var a = 10
//    var b = 20
//    var c = if (a==b){
//        println("if문의 코드블럭 실행")
//        "a는 b와 같은 값입니다."
//    }
//    else{
//        println("else문의 코드블럭 실행")
//        "a는 b와 다른 값입니다."
//    }
//
//    println(c)


// if문 예제2
//    var a = 10
//    var b = 20
//
//    var c = if(a==b) "같다" else "다르다"
//    println(c)



// when 문법 예제1
//    var num:Int = 10
//
//    when(num){
//        0 -> println("0입니다.")
//        5 -> println("5입니다.")
//        10 -> println("10입니다.")
//
//        else -> {
//            println("0, 5, 10에 속하지 않습니다.")
//            println("이렇게 중괄호로 여러 라인을 쓸 수 있다 ㅎㅎ.")
//        }
//    }


// when 문법 예제2
//    var num:Int = 10
//    var arr:IntArray = intArrayOf(6, 7, 8, 9)
//
//    when(num){
//        0, 1 -> println("0 혹은 1 입니다.")
//        in 2..5 -> println("2와 5사이의 수 입니다.")
//        in arr -> println("arr 배열에 속합니다.")
//        !in arr -> println("arr 배열에 속하지 않습니다.")
//    }



// when의 타입 검사 및 형변환
//    var unknownObject:Any = "ABCDEFG"
//
//    class TestClass{
//        fun print(){
//            println("TestClass의 print메소드 실행")
//        }
//    }
//
//    when(unknownObject){
//        is TestClass -> println(unknownObject.print())
//        is String -> println(unknownObject.length)
//        is Int -> println(unknownObject.minus(10))
//    }



// when 문법으로 함수 선언하기
//    fun digit(num:Int) = when(num){
//        in 0..9 -> "한 자리 수"
//        in 10..99 -> "두 자리 수"
//        in 100..999 -> "세 자리 수"
//        else -> "Out of range"
//    }
//
//    var num:Int = 50
//    val digitStr = digit(num)
//
//    println(digitStr)



// for문 인덱스, range, 사용법
//    var arr = arrayOf("A", "B", "C", "D", "E")
//
//    for (item in arr){
//        println(item)
//    }
//
//    for (idx in arr.indices){
//        println(arr[idx])
//    }
//
//    for (idx in 0..arr.size-1){
//        println(arr[idx])
//    }
//    for ((idx, value) in arr.withIndex()){
//        println("$idx 번째 값은 $value 입니다.")
//    }


//    while문 예제1
//    var i = 0
//    while(i < 10){
//        println(i)
//        i++
//    }



//    do while문 예제1
//    class NumberGenerator{
//        val random = java.util.Random()
//
//        fun generateRandomNumber() : Int{
//            return random.nextInt(100)
//        }
//    }
//
//    var gen = NumberGenerator()
//
//    do{
//        val number = gen.generateRandomNumber()
//        println(number)
//    }while(number % 2 == 0)



//    break문 예제
//    var arr = arrayOf("A", "B", "C", "D", "E")
//
//    for (i in arr){
//        println(i)
//        if (i == "C"){
//            break
//        }
//    }



//    continue 예제
//    var arr = arrayOf("A", "B", "C", "D", "E")
//
//    for (i in arr){
//        if (i == "C"){
//            continue
//        }
//        println(i)
//    }


//    label문 예제
//    label@ for (i in 0..9){
//        for (j in 0..9){
//            println("$i / $j")
//            if (i == 3 && j == 3){
//                break@label
//            }
//        }
//    }



//    코틀린의 try-catch
//    var str = "a"
//    var num:Int
//
//    try {
//        num = str.toInt()
//    } catch (e:NumberFormatException){
//        println("예외 발생")
//        num = 0
//    } finally {
//        println("finally 구문")
//    }
//
//    println("num의 값은 $num 입니다.")



//    try-catch문의 표현식으로의 사용
//    var number = try{
//        "10A".toInt()
//    }catch (e:NumberFormatException){
//        println("예외발생")
//        0
//    }
//
//    println("number의 값은 $number 입니다.")
//



//    try-with-resoure   use문 예제
//    var path = "D:\\test.txt"
//    var writeString = "Hello World!"
//
//    File(path).outputStream().use {
//        it.write(writeString.toByteArray())
//    }
//
//    try {
//        File(path).inputStream().use {
//            println(String(it.readBytes()))
//        }
//    } catch (e:FileNotFoundException){
//        println("File Not Found!")
//    }



//    함수 사용 & 인자값에 디폴트값 부여
//    fun sum(a:Int, b:Int = 5) : Int{
//        return a + b
//    }
//    var result = sum(10)
//    println(result)



//    간단한 함수 선언
//    fun sum(a:Int, b:Int) = a + b



//    가변인자 예제
//    fun printNumbers(vararg numbers:Int){
//            println(numbers)
//    }
//
//    printNumbers(1, 2, 3, 4)



//    내부함수 예제
//    fun function1(num1:Int):Int{
//        fun function2(num2:Int):Int{
//            fun function3(num3:Int):Int{
//                return num3 + 1
//            }
//            return function3(num2)+ 1
//        }
//        return function2(num1) + 1
//    }
//
//    println(function1(0))





//    람다 예제1
//    fun invokeFunction1(f: ()->Unit){
//        f()
//    }
//
//    fun invokeFunction2(num:Int, f: ()->String){
//        println("인자로 받은 숫자 : $num")
//        var reternValue = f()
//        println(reternValue)
//    }
//
//    invokeFunction1{ println("콜백 함수 실행") }
//
//    invokeFunction2(20, {
//        println("콜백함수 여러줄 실행")
//        "리턴 문자열"
//    })
//
//    for (i in 1..5){
//        Thread{
//            println("${i}번 스레드")
//        }.start()
//    }




//    여러 인자를 받는 람다표현식
//    fun invokeFunction3(f: (Int, Int)->Int){
//        val returnValue = f(10, 20)
//        println(returnValue)
//    }
//
//    invokeFunction3({
//        a, b -> var c = a + b
//        c})



//    미리 선언한 함수 넘기기
//    fun invokeFunction3(f: (Int, Int)->Int){
//        val returnValue = f(10, 20)
//        println(returnValue)
//    }
//
//    fun sum(a:Int, b:Int):Int {
//        return a + b
//    }
//
//    invokeFunction3(::sum)



//    단일 매개변수 함수를 더 간결하게
//    fun invokeFunction4(f: (Int)->String){
//        val returnValue = f(10)
//        println(returnValue.length)
//    }
//
//    invokeFunction4{
//        println("단일 매개변수 it의 값 : $it")
//        it.toString()
//    }
}