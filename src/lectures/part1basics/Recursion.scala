package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  println("Recursion")

  // will overflow the call stack eventually -> NOT TAIL RECURSIVE
  def factorial(x: Long): Long = {
    if(x <= 1) 1
    else x * factorial(x-1)
  }

  println(factorial(5))
  // won't work println(factorial(11115))

  // TAIL RECURSIVE, WON'T BREAK THE STACK RECURSION CALL (USES ACCUMULATOR)
  def factorial2(x: BigInt): BigInt = {
    @tailrec
    def helper(x: BigInt, acc: BigInt): BigInt = {
      if(x <= 1) acc
      else helper(x-1, x * acc)
    }
    helper(x, 1)
  }

  println(factorial2(1111))

  // WHEN NEED LOOPS, USE TAIL RECURSION.
}
