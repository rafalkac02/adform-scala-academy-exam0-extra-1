object PascalsTriangle extends App {

  type Row = Seq[Int]

  // analyze given row and return next row according to the Pascal's Triangle rules
  def nextRow(row: Row): Row = {
    // zip two rows to compare and get sum
    val pairs = (0 +: row).zip(row :+ 0)
    pairs.map({ case (a, b) => a + b })
  }


  // return pascal's triangle (Seq of Rows)
  def pascalTriangle(n: Int): Seq[Row] = {
    var rows = n match {
      case 0 => Seq.empty
      case _ => Seq(Seq(1))
    }

    def addRows(n: Int): Seq[Row] = rows.length match {
      case l if l >= n => rows
      case _ =>
        rows = rows :+ nextRow(rows.last)
        addRows(n)
    }
    addRows(n)
  }
}