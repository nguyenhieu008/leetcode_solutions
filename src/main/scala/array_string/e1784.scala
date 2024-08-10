package array_string

object e1784 {
  /* Solution 1: - Because string always starts with 1. The string is invalid if there is a substring "01"
  - Find first index of "01". If yes => return false.
  - Time complexity: O(n)
  - Space complexity: O(1)
   */
//  def checkOnesSegment(s: String): Boolean = {
//    s.indexOf("01") < 0
//  }

  /* Solution 2: iterative.
  - Time complexity: O(n)
  - Space complexity: O(1)
   */

  def checkOnesSegment(s: String): Boolean = {
    var isValid = true
    var i = 0
    while (isValid && i < s.length - 1) {
      if (s(i) == '0' && s(i + 1) == '1') isValid = false
      i = i + 1
    }
    isValid
  }
}
