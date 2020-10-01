package lms



object Main extends App {
    val c = experimental.RustBinding.getClass
    experimental.RustBinding.helloWorldFromScala
    println("Hello World from Scala!")
    while(true) { }
}
