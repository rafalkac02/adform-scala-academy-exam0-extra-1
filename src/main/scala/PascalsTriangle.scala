object PascalsTriangle extends App{

  val row1 = List(1)

  def nextRow(row: Seq[Int]): Seq[Int] = {
    // zip two rows to compare and get sum
    val pairs = (0 +: row).zip(row :+ 0)
    pairs.map({ case (a, b) => a + b })
  }

  def generateTriangle(n: Int): Seq[Seq[Int]] = {
    var triangle = Seq.empty[Seq[Int]]

    def addRows(counter: Int): Seq[Seq[Int]] = counter match {
      case 1 =>
        Seq(1) ++ addRows(counter + 1)
        triangle
      case x if (x == n+1) => triangle
      case _ =>
        triangle = triangle :+ nextRow(triangle.last)
        triangle
    }

    addRows(1)
  }
}
