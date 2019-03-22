package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)
  println(1 == x)
  // + - * / & | ^ << >>

  println(!(1 == x))

  var a = 2
  a += 3
  println(a)

  // Instructions vs Expressions
  val aCondition = true
  // se the difference here, if returns a value is not an instruction like in java
  // where it would be:
  // if(aCondition) aConditionedVal = 5 else aConditionedVal = 15
  val aConditionedVal = if(aCondition) 5 else 15
  println(if(aCondition) 5 else 15)
  println(5 == (if(aCondition) 5 else 15))

  //Loops exists but are discouraged because they cause side effects
  // NEVER EVER WRITE THIS AGAIN
  var i = 0
  while(i < 1) {
    println(i)
    i += 1
  }

  // EVERYTHING IN Scala IS AN EXPRESSION (NEVER USE INSTRUCTIONS)


  //SIDE EFFECTS -> println, whiles, reassigning
  val aValue = (i = 7)
  println(aValue) // -> () Unit === void

  // CODE BLOCKS
  val aBlock = {
    val y = 2
    val z = y + 1
    // the last expression is the value of the block expression
    if (z > 1) "hola" else "adios"
  }

  println(aBlock)
}
