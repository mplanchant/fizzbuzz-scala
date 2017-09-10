import org.scalatest.{FlatSpec, Matchers}

class FizzbuzzTest extends FlatSpec with Matchers {

  "Fizzbuzz" should "throw exception if range start is <= 0" in {
    assertThrows[IllegalArgumentException] {
      Fizzbuzz(-1 to 3)
    }
  }

  it should "throw exception if range is descending" in {
    assertThrows[IllegalArgumentException] {
      Fizzbuzz(10 to 1)
    }
  }

  it should "return List(\"1\", \"2\", \"fizz\") when range is 1 to 3" in {
    Fizzbuzz(1 to 3) shouldBe List("1", "2", "fizz")
  }

  it should "return List(\"buzz\", \"11\", \"fizz\", \"13\", \"14\", \"fizzbuzz\") when range is 10 to 15" in {
    Fizzbuzz(10 to 15) shouldBe List("buzz", "11", "fizz", "13", "14", "fizzbuzz")
  }

}
