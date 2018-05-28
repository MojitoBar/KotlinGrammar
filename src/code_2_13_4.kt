interface RemoteControl{
    fun Turnon()
    fun Turnoff()
}

class Computer:RemoteControl{
    override fun Turnoff() {
        println("컴퓨터 전원 끄기")
    }

    override fun Turnon() {
        println("컴퓨터 전원 켜기")
    }
}

class Television:RemoteControl{
    override fun Turnoff() {
        println("티비 전원 끄기")
    }

    override fun Turnon() {
        println("티비 전원 켜기")
    }
}

fun main(arg:Array<String>){
    var tv = Television()
    var pc = Computer()

    tv.Turnon()

    pc.Turnoff()
}