package example

import example.Supermarket.ItemPrice
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class SupermarketSpec extends AnyFreeSpec with Matchers {
  "validateUserInput" - {
    "given 'A' return true" ignore {}
    "given 'ABAC' return true" ignore {}
    "given a space return false" ignore {}
    "given a comma return false" ignore {}
    "given numbers return false" ignore {}
    "given lower case letters return false" ignore {}
    "given an empty string return false" ignore {}
  }
  "countItem" - {
    "given 'A' return ('A', 1)" ignore {}
    "given 'AA' return ('A', 2)" ignore {}
    "given 'AB' return ('A', 1)('B', 1)" ignore {}
    "given 'ABA' return ('A', 2)('B', 1)" ignore {}
    "given 'ABBACDA' return the correct output" ignore {}
    "given an empty string return an empty list" ignore {}
  }
  "priceItem" - {
//    val specialPrice: ItemPrice = ???
//    val noSpecialPrice: ItemPrice = ???
    "given ('A', 1) return price 1.00" ignore {}
    "given ('A', 2) return price 1.50" ignore {}
    "given ('A', 3) return price 2.50" ignore {}
    "given ('A', 2), when there's no special price, return price 2.00" ignore {}
  }
}
