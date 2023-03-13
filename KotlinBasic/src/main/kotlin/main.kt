fun main(){
        ///test()
        ///println(message("jack","kotlin"))
        //lambdaTest(arr=arrayListOf(2,2,3,5,4))()
        greet("wb",1)
}
//字符串模版 用${}定位
fun message(name:String,mode:String):String = "Hello $name,Welcome to $mode"
fun test(st1:String){
        var factor = 2
        fun douleIt(n:Int) = n * factor
        var messager = "The factor is $factor"
        factor = 0
        println(messager)
        println(factor)

}

fun lambdaTest(arr:ArrayList<Int>)={arr.forEach({x-> println(x)})
}
fun greet(name: String = "world", times: Int, message: String = "Hello") {
        repeat(times) {
                println("$message, $name!")
        }
}
