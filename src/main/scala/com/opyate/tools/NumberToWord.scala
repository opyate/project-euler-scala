package com.opyate.tools

/**
 * This only needs to go up to "one thousand" for problem 17.
 *
 * @author Juan Uys
 */

object NumberToWord {

  def apply(i: Int) = build(i)

  def build(i: Int): String = build(i.toString, "")

  @annotation.tailrec
  def build(n: String, s: String): String = {
    n.size match {
      case 4 if (n == "1000") => "one thousand"
      case 4 if (n.startsWith("10")) => build(n.substring(1), s + "one thousand and ")
      case 4 if (n.startsWith("1")) => build(n.substring(2), s + "one thousand")
      case 3 if (n.endsWith("00")) => s + simple(n.substring(0,1)) + " hundred"
      case 3 => build(n.substring(1), s + simple(n.substring(0,1)) + " hundred and ")
      case 2 if (n.startsWith("1")) => s + simple(n)
      case 2 if (n.endsWith("0")) => s + simple(n)
      case 2 if (s.endsWith("and ") && n.startsWith("0")) => s + simple(n.substring(0,1) + "0") + simple(n.substring(1))
      case 2 if (s.endsWith("and ")) => s + simple(n.substring(0,1) + "0") + "-" + simple(n.substring(1))
      case 2 => s + simple(n.substring(0,1) + "0") + "-" + simple(n.substring(1))
      case i => s + simple(n)
    }
  }
  
  def simple(i: String) = i match {
    case "1" => "one"
    case "2" => "two"
    case "3" => "three"
    case "4" => "four"
    case "5" => "five"
    case "6" => "six"
    case "7" => "seven"
    case "8" => "eight"
    case "9" => "nine"
    case "10" => "ten"
    case "11" => "eleven"
    case "12" => "twelve"
    case "13" => "thirteen"
    case "14" => "fourteen"
    case "15" => "fifteen"
    case "16" => "sixteen"
    case "17" => "seventeen"
    case "18" => "eighteen"
    case "19" => "nineteen"
    case "20" => "twenty"
    case "30" => "thirty"
    case "40" => "forty"
    case "50" => "fifty"
    case "60" => "sixty"
    case "70" => "seventy"
    case "80" => "eighty"
    case "90" => "ninety"
    case s if (s.startsWith("0")) => ""
    case _ => "undefined"
  }
}