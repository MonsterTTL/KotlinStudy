import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

fun main(){

        // 类型安全检查 and Elvis运算符
        val result:String? = nikeName(null)
        val result2:String? = nickName("XuMingYang")
        println("result1: $result, result2: $result2")
        // 类型检查和转换
        val greet:Any = "subString"
        val Dog:Any = Animal()
        val Cat:Any = Animal()
        val ans = Dog == Cat
        val ans2 = Dog == greet
        println("Cat and Dog:${Dog == Cat};greet is Dog:${Dog == greet}")

        val num1 = 3
        val num2 = 5
        println(maxLambda(num1,num2).invoke())
        welcome("GGBone","WellDone")

        //筛选偶数
        val arrs = intArrayOf(1,2,3,4,5,9,10,20,22,63,73,83,100)
        val arrs2 = listOf(1,2,3,4,5,9,10,20,22,63,73,83,100)
        val answer = selectOu(*arrs2.toIntArray())
        val answer2 = selectOu(*arrs)
        println("Here is Answers:")
        for(number in answer) println(number)

        //解构
        destructTest()
        destructTest2()
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

fun maptest(){
        val myMap = mapOf("1" to "One","2" to "Two","3" to "Three")

        for(entr in myMap){
                println("${entr.key}--->${entr.value}")
        }
}

fun nikeName(name:String?):String?{
        //可空类型
        if(name == "William"){
                return "Bill"
        }
        return name?.reversed()?.toUpperCase()?:"Joker" //安全运算符 和 Elvis运算符
}

fun nickName(name:String?) = when(name) {
        "William" -> "Bill"
        null -> "Joker"
        else -> name.reversed().toUpperCase()
}

class Animal{
        override fun equals(other: Any?): Boolean {
                return other is Animal  //is 运算符，检查引用所指向对象是否属于特定类型 像InstanceOf
        }
}
fun sayHello(content:String):Unit{
        println("Welcome: $content")
        return Unit
}

fun maxLambda(number1:Int,number2: Int)= {
       if(number1 > number2) number1 else number2
}

fun welcome(name:String,content:String = "Hello"){
        println("$name,$content")
}

fun selectOu(vararg numbers:Int):ArrayList<Int>{
    val ans = ArrayList<Int>()
    for(number in numbers){
        if(number % 2 == 0)
           ans.add(number)
    }
    return ans
}

fun getFullName() = Triple("John","Quincy","Adams")
fun destructTest(){
        val result = getFullName()
        val first = result.first
        val second = result.second
        val third = result.third
        println("first=$first,second=$second,third=$third")
}

fun destructTest2(){
        val result = getFullName()
        val(first,second,third) = result
        println("first=$first,second=$second,third=$third")
}

