Seq(Seq(1)) :+ Seq(2, 3)

Seq.empty[Seq[Int]] :+ Seq(1)

val row = List(1, 2, 3)
(0 +: row).zip(row :+ 0)