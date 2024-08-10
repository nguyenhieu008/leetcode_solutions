package array_string

object e1790 {
  /* Solution 1: Iterative. Find all diffs positions. Then apply conditions:
  - No diffs
  - Exactly 2 diffs then they must equal interchangeably
  - Time complexity: O(n)
  - Space complexity: O(n)
   */
//  def areAlmostEqual(s1: String, s2: String): Boolean = {
//    var diff: Array[Int] = Array()
//
//    var i = 0
//    while (i < s1.length) {
//      val c1 = s1(i)
//      val c2 = s2(i)
//      if (c1 != c2) {
//        diff :+= i
//      }
//      i = i + 1
//    }
//
//    def exactlyOneSwap(diff: Seq[Int]): Boolean = {
//      if (diff.length == 2) {
//        val i1 = diff(0)
//        val i2 = diff(1)
//
//        s1(i1) == s2(i2) && s1(i2) == s2(i1)
//      }
//      else false
//    }
//
//    diff.isEmpty || exactlyOneSwap(diff)
//  }


  /* Solution 2:
  - 1 pointer from beginning and 1 pointer from end to find 2 diffs positions. Then apply condition:
  - If first pointer reaches the end of string => no diffs => true
  - If not, first pointer must be smaller than second pointer. They must equal interchangeably then the substring between them must match.
  - Time Complexity: O(n)
  - Space complexity: O(1)

   */
//  def areAlmostEqual(s1: String, s2: String): Boolean = {
//    var i = 0
//    var j = s1.length - 1
//
//    while (i < s1.length && s1(i) == s2(i)) i = i + 1
//    while (j >= 0 && s1(j) == s2(j)) j = j - 1
//
//    (i == s1.length) || (i < j && s1(i) == s2(j) && s1(j) == s2(i) && s1.substring(i + 1, j) == s2.substring(i + 1, j))
//  }

  /* Solution 3:
  - Zip them together to filter diff-chars
  - Apply condition:
  - Time complexity: O(n)
  - Space complexity: O(n)
   */
  def areAlmostEqual(s1: String, s2: String): Boolean = {
    val diffs = (s1 zip s2).filter((c1, c2) => c1 != c2)
    diffs.isEmpty || (diffs.size == 2 && diffs.head._1 == diffs.last._2 && diffs.head._2 == diffs.last._1)
  }
}
