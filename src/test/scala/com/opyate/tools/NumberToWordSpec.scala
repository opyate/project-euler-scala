package com.opyate.tools

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FunSuite, FlatSpec}

/**
 * Tests for the first 1000 English words for numbers.
 *
 * @author Juan Uys
 */

class NumberToWordSpec extends FunSuite with ShouldMatchers with TableDrivenPropertyChecks {

  val numbersAndWords =
    Table(
    ("number", "word"),
    (0, ""),
    (1, "one"),
    (2, "two"),
    (3, "three"),
    (4, "four"),
    (5, "five"),
    (6, "six"),
    (7, "seven"),
    (8, "eight"),
    (9, "nine"),
    (10, "ten"),
    (11, "eleven"),
    (12, "twelve"),
    (13, "thirteen"),
    (14, "fourteen"),
    (15, "fifteen"),
    (16, "sixteen"),
    (17, "seventeen"),
    (18, "eighteen"),
    (19, "nineteen"),
    (20, "twenty"),
    (21, "twenty-one"),
    (25, "twenty-five"),
    (30, "thirty"),
    (31, "thirty-one"),
    (35, "thirty-five"),
    (40, "fourty"),
    (41, "fourty-one"),
    (45, "fourty-five"),
    (50, "fifty"),
    (60, "sixty"),
    (70, "seventy"),
    (80, "eighty"),
    (90, "ninety"),
    (100, "one hundred"),
    (101, "one hundred and one"),
    (102, "one hundred and two"),
    (103, "one hundred and three"),
    (104, "one hundred and four"),
    (105, "one hundred and five"),
    (106, "one hundred and six"),
    (107, "one hundred and seven"),
    (108, "one hundred and eight"),
    (109, "one hundred and nine"),
    (110, "one hundred and ten"),
    (111, "one hundred and eleven"),
    (112, "one hundred and twelve"),
    (113, "one hundred and thirteen"),
    (114, "one hundred and fourteen"),
    (115, "one hundred and fifteen"),
    (116, "one hundred and sixteen"),
    (117, "one hundred and seventeen"),
    (118, "one hundred and eighteen"),
    (119, "one hundred and nineteen"),
    (120, "one hundred and twenty"),
    (121, "one hundred and twenty-one"),
    (122, "one hundred and twenty-two"),
    (123, "one hundred and twenty-three"),
    (124, "one hundred and twenty-four"),
    (125, "one hundred and twenty-five"),
    (126, "one hundred and twenty-six"),
    (127, "one hundred and twenty-seven"),
    (128, "one hundred and twenty-eight"),
    (129, "one hundred and twenty-nine"),
    (130, "one hundred and thirty"),
    (131, "one hundred and thirty-one"),
    (135, "one hundred and thirty-five"),
    (200, "two hundred"),
    (201, "two hundred and one"),
    (250, "two hundred and fifty"),
    (999, "nine hundred and ninety-nine"),
    (1000, "one thousand")
//    (2000, "two thousand"),
//    (10000, "ten thousand"),
//    (100000, "one hundred thousand"),
//    (1000000, "one million")
    )

  for ((n,w) <- numbersAndWords) {
    test("The English word for number %s is '%s'".format(n, w)) {
      NumberToWord(n) should be (w)
    }
  }
}