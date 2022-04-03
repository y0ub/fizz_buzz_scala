class FizzBuzz
{
  def fizz_buzz(n: Int) = (n % 3, n % 5) match {
    case (0, 0) => "fizz_buzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case (_, _) => n;
  }
}

object main
{
  def main(args: Array[String])
  {
    var fizz_buzz = new FizzBuzz();
    (1 to 100).map(fizz_buzz.fizz_buzz).foreach(println)
  }
}
