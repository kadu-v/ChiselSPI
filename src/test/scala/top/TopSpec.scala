package top

import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import chisel3._
import chiseltest.WriteVcdAnnotation

class TopSpec extends AnyFlatSpec with ChiselScalatestTester with Matchers {
  behavior of "top"
  it should "receive 0x08" in {}
}
