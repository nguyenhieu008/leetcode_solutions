package array_string

object e169 {
  /* Solution 1:
  - For each value, we count the number of its occurrences.
  - If we found a value that occurs more than half of array size, we stop for loop and return.
  - Because for loop does not have break, we use array.find to stop after we found the result.
  - Time complexity: O(n^2)
  - Space complexity: O(1)
   */
//  def majorityElement(nums: Array[Int]): Int = {
//    nums.find{ x =>
//      val c = nums.count(_ == x)
//      c > nums.size / 2
//    }.get
//  }

  /* Solution 2:
  - Instead of recounting for each element, we main a hash table that stores the occurrences of values
  - Also, we have occurrences for all elems, we can easily get the max value one to return.
  - Time complexity: O(n)
  - Space complexity: O(n)
   */

//  def majorityElement(nums: Array[Int]): Int = {
//    val occurrences = nums.groupBy(identity).view.mapValues(_.length)
//    occurrences.find(c => c._2 > nums.length / 2).get._1
//  }

  /* Solution 3:
  - Moore voting: We pair elements together, if 2 elems are different, we throw them off.
  - So we store the count variable and the current major. We iterate through array, if we see a different value than the current major,
  - we reduce the count variable, otherwise, we increase the count. If the count variable is 0, it means all prev values
  - have been paired out, and we make the next value as the current major
  - Time complexity: O(n)
  - Space complexity: O(1)
   */

  def majorityElement(nums: Array[Int]): Int = {
    nums.foldLeft((nums(0), 0))((accumulator, x) => accumulator match {
      case (_, 0) => (x, 1)
      case (y, c) => if (x == y) (y, c + 1) else (y, c - 1)
    })._1
  }

}
