package lectures.part1basics

object Functions extends App {
  println("Functions")

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hola", 7))

  def aParameterlessFunction(): Int = {
    43
  }

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aLoopLike(a: String, n: Int): String = {
    if (n < 1) a
    else a + " " + aLoopLike(a, n-1)
  }

  println(aLoopLike("<---<+>", 5))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def isPrime(a: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else a % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(a / 2)
  }

  def fibonacci(n: Int): Int =
    if(n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))
  println(isPrime(1223))
}
