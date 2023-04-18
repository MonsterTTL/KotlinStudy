// Day2 主要学习类的相关知识
import PackageTest.*

fun main(){
    //1.匿名类
    println("匿名类")
    drawCirCle()
    println("\n")
    //2.匿名类实现接口
    println("匿名类实现接口")
    createRuna().run()
    println("\n")
    //3.object 单例
    println("单例")
    Util.numberOfProcessors()
    println("\n")
    //4.单例实现接口
    println("单例实现接口")
    moveIt(Sun)
    println(Sun.radiusInKM)
    println("\n")
    //5.Package + 单例 + 方法
    println("Package + 单例 + 方法")
    println(PackageTest.unitsSupported())
    println(PackageTest.Tempterature.f2c(75.253))
    println(Tempterature.c2f(24.305))
    println("\n")
    //6.创建类
    println("创建类")
    val FakePerson = Person("FakeMan",0,"Moon")
    println("${FakePerson.name},${FakePerson.age},${FakePerson.address},${FakePerson.initNumber}")
    println("\n")
}

//使用匿名内部类--也只能在该方法里访问
fun drawCirCle() {
    val circle = object {
        val x = 10
        val y = 20
        val radius = 30
    }
    println("${circle.x},${circle.y},${circle.radius}")
}

//方法返回一个Runnable 其中的匿名类实现了 Runnable接口
fun createRuna():Runnable {

    var runn = object : Runnable{
        override fun run() {
           println("Execute--Runnable")
        }
    }

    return runn;
}

//实现两个接口的匿名类
fun createTwoInterface():Runnable {
    val twoInterface = object :Runnable,AutoCloseable{
        override fun run() {
            println("Implement run")
        }

        override fun close() {
            println("Implement close")
        }
    }

    return twoInterface
}

//简单实现接口
fun createSimpleInterface():Runnable = Runnable { println("Simple Implement Run Method") }

//单例对象
object Util{
    fun numberOfProcessors() = println(Runtime.getRuntime().availableProcessors())
}

//单例拥有属性字段和方法
object Sun : Runnable{
    val radiusInKM = 696000
    var coreTemperatureInC = 1500000

    override fun run() {
        println("Sun's Run")
    }
}

fun moveIt(runnable:Runnable){
    runnable.run()
}

//创建类
class Person constructor(val name:String,val age:Int) {

    //为address字段设置set方法
    var address:String = ""
        set(value) {
        if (value == ""){
            field = "Kotlin之父"
        }else{
            field = value
        }
    }
    get() = address



    constructor(name:String,age:Int,address:String):this(name,age){
        this.address = address
    }

    public var initNumber = 0

    init {
        initNumber = 100
        println("假人已创建")
    }

}

