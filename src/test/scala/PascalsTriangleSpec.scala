import org.scalatest._
import flatspec._
import matchers._
import PascalsTriangle._

class PascalsTriangleSpec extends AnyFlatSpec with should.Matchers {

  "nextRow()" should "take a row and return the next row according to Pascal Triangle rules" in {

    nextRow(Seq(1)) shouldBe Seq(1, 1)
    nextRow(Seq(1, 1)) shouldBe Seq(1, 2, 1)
    nextRow(Seq(1, 2, 1)) shouldBe Seq(1, 3, 3, 1)
    nextRow(Seq(1, 3, 3, 1)) shouldBe Seq(1, 4, 6, 4, 1)
  }

  "pascalTriangle()" should "return Pascal's triangle (Seq of rows) of a given size" in {

    pascalTriangle(0) shouldBe Seq.empty
    pascalTriangle(1) shouldBe Seq(Seq(1))
    pascalTriangle(2) shouldBe Seq(Seq(1), Seq(1, 1))
    pascalTriangle(3) shouldBe Seq(Seq(1), Seq(1, 1), Seq(1, 2, 1))
    pascalTriangle(4) shouldBe Seq(Seq(1), Seq(1, 1), Seq(1, 2, 1), Seq(1, 3, 3, 1))
    pascalTriangle(5) shouldBe Seq(Seq(1), Seq(1, 1), Seq(1, 2, 1), Seq(1, 3, 3, 1), Seq(1, 4, 6, 4, 1))
  }
}