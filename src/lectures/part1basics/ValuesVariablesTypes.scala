package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 22
  println(x)
  val s = "Hola"
  println(s)

  // val immutable
  val aInt: Int = 10
  val aStr: String = "abc"
  val aChar: Char = 'a'
  val aBool: Boolean = false
  val aShort: Short = 1234
  val aLong: Long = 12343453453L
  val aFloat: Float = 28.3f
  val aDouble: Double = 3.14

  // var mutable
  var aVariable: Int = x
  aVariable = 10
  // ...
}
