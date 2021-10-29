package top

import chisel3._

class Top() extends Module {
  val io = IO(new Bundle {})
}

object Elaborate extends App {
  (new chisel3.stage.ChiselStage).emitVerilog(new Top(), args)
}
