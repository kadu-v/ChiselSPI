import spi.SpiMaster

object Elaborater extends App {
  val argsx =
    args :+ "--target-dir" :+ "out" :+ "--emission-options=disableMemRandomization,disableRegisterRandomization"
  (new chisel3.stage.ChiselStage).emitVerilog(new SpiMaster(), argsx)
}
