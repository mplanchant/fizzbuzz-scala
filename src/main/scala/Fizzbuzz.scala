object Fizzbuzz {

  def apply(range: Range): List[String] = {
    require(range.start > 0)
    require(range.end >= range.start)
    range.map(of).toList
  }

  private def divisibleByThree(x: Int) = x % 3 == 0

  private def divisibleByFive(x: Int) = x % 5 == 0

  private def divisibleByThreeAndFive(x: Int) = divisibleByThree(x) && divisibleByFive(x)

  private def of(number: Int): String = {
    if (divisibleByThreeAndFive(number)) "fizzbuzz"
    else if (divisibleByThree(number)) "fizz"
    else if (divisibleByFive(number)) "buzz"
    else number.toString
  }
}
