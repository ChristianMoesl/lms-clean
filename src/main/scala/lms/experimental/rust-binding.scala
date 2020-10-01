package lms.experimental

object RustBinding {
  def helloWorldFromScala: Unit = println("Hello World")

  def startProgram(): Unit = {
    assert(g == null)
    g = mkGraphBuilder()
    try {
      val block = body
      Graph(g.globalDefs, block, g.globalDefsCache.toMap)
    } finally {g = null}

  }
}
