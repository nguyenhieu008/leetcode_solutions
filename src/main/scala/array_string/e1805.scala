package array_string

import collection.immutable.HashSet

object e1805 {
//  def numDifferentIntegers(word: String): Int = {
//    word.foldLeft(("", HashSet[String]()))((acc, c) =>
//      if (c >= '0' && c <= '9') {
//        if (acc._1 == "0") (c.toString, acc._2)
//        else (acc._1 + c, acc._2)
//      }
//      else {
//        if (acc._1.nonEmpty) ("", acc._2 + acc._1)
//        else ("", acc._2)
//      }
//    ) match
//      case ("", s) => s.size
//      case (v, s) => (s + v).size
//  }

  def numDifferentIntegers(word: String): Int = {
    word.replaceAll("[a-z]+", " ").trim.split(" ").filter(_.nonEmpty).map(s => s.replaceFirst("^0+", "")).toSet.size
  }
}
