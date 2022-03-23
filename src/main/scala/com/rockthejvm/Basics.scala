package com.rockthejvm

object Basics extends App {
  //  Defining a value
  val meaningOfLife: Int = 42
  //  Types: Int, Boolean, Char, Double, Float, String
  val aBoolean = false

  //  Strings
  val aString = "I love scala"
  val aComposedString = "I" + "love" + "scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  //  Expressions => structures that can be reduced to a value
  val anExpression = 2 + 3

  //  if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999

  //  code blocks
  val aCodeBlock = {
    //  definitions
    val aLocalValue = 67
    //  value of block is value of last expression
    aLocalValue + 3
  }

  //  define a function
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  //  define a recursive function
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  println(factorial(12))

  //  In scala we don't use loops or iteration, we use RECURSION!

  //  The unit type = no meaningful value === "void" in other programming languages
  //  Type of side effects like print
}
