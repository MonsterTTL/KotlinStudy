package PackageTest

fun unitsSupported() = listOf("Mertic","Imperial")

fun precision(): Int = throw java.lang.RuntimeException("Error!!!")

//单例
object Tempterature {
    fun c2f(c:Double) = c * 9.0/5 +32
    fun f2c(f:Double) = (f - 32) * 5.0/9
}

object Distance{
    fun milesToKm(miles:Double) = miles * 1.609
    fun kmToMiles(kms:Double) = kms / 1.609
}

//总结下来：如果一些函数是高级的，通用的和广泛使用的，那么就把它们放在顶级函数中。
//如果一些函数之间的关系比其他的函数更加密切，就把它们放在一个单例中
//如果一些函数存在依赖关系，可以把它们放在一个单例中