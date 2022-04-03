object test
{
  def main(args: Array[String])
  {
    for {
         i <- (0 to 12 by 3) if i % 2 == 0
         j <- (1 to 3)} {
           println(i * j)
         }
  }
}
