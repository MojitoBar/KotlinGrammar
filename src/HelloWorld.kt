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
}