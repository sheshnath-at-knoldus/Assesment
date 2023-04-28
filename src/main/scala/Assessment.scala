package com.knoldus

import com.typesafe.scalalogging.Logger

import scala.annotation.tailrec

case class Person(name: String)

object Assessment extends App {

  val logger = Logger(getClass)

  //Ques 1
  val decimalNumber = 2.3034
  logger.info(f" $decimalNumber%.2f")

  //Ques 2
  val name: String = "Sheshnath"
  logger.info("" + name.toPerson)
  implicit class extraMethodClass(name: String) {
    val toPerson: Person = Person(name)
  }

  //Ques 3
  private val list = List(List('a', 'h', 'l'),
    List('p'),
    List('i', 'j', 'k', 'l', 'f'),
    List('y', 'q'),
    List('a', 'f', 'r'))
  logger.info("" + list.sortBy(value => value.length))

  //Ques 4
  private val number = 123
  private val lengthOfNumber = number.toString.length
  logger.info("" + getFullWord(number, "", lengthOfNumber + 1))

  @tailrec
  private def getFullWord(number: Int, result: String, length: Int): String = {
    if (length == 1)
      result
    else {
      val listType = number % 10
      val finalResult = listType match {
        case 1 => "One"
        case 2 => "Two"
        case 3 => "Three"
        case 4 => "Four"
        case 5 => "Five"
        case 6 => "Six"
        case 7 => "Seven"
        case 8 => "Eight"
        case 9 => "Nine"
        case 0 => "Zero"
      }
      getFullWord(number / 10, finalResult + result, length - 1)
    }
  }
}






