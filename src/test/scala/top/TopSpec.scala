package top

import chiseltest._
import org.scalatest._
import chisel3._

class TopSpec extends FlatSpec with ChiselScalatestTester with Matchers {
  behavior of "top"
  it should "receive 0x08" in {
    test(new Top()) { c =>
      c.clock.step(20)
    }
  }
}
