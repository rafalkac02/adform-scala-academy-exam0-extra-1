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
}