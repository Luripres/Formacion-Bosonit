package org.primer

object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val strings = textFile("C:/Spark/spark-3.1.3-bin-hadoop2.7/README.md")
    strings.show(10, false)
    strings.count()
  }

}
