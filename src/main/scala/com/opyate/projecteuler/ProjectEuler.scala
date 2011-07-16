package com.opyate.projecteuler

/**
 * @tparam I the input type
 * @tparam R the result type
 */
trait ProjectEuler[I <: Any, R <: Any] {
  def answer(input: Option[I]): R
}