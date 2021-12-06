package example

object Supermarket extends App {

  case class SpecialPrice(count: Int, price: Float)
  case class ItemPrice(item: String, singlePrice: Float, specialPrice: SpecialPrice)

  def run(args: Array[String]): Unit = {

    val transactionPrices = for {
      userInput <- validateUserInput(args)
      itemCount <- countItem(userInput)
      itemSum <- priceItem(itemCount)
      (_, singleItemPrice) = itemSum
    } yield singleItemPrice

    transactionPrices match {
      case Nil => println("Sorry, this transaction failed. Please ensure your input is valid.") //improve.
      case itemPrices => println(s"Thank you for your order. That will be £${itemPrices.sum} please!")
    }
  }

  // validate user input from the CLI
  // use regex to check that string is in form "ABAC" for example
  // could also check whether we have all the items requested
  def validateUserInput(input: Array[String]): List[String] = ???

  // count items given in user input
  // eg if the input was "ABA", output would be List(("A", 2), ("B", 1))
  def countItem(item: String): List[(String, Int)] = ???

  // output price for the item(s) using ItemPrice
  // the output doesn't have to include item name (SKU), but would be nice if we wanted a detailed receipt
  def priceItem(itemCount: (String, Int)): List[(String, Float)] = ???
}

