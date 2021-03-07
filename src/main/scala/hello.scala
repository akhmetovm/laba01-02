import scala.io.Source

object hello {
  def main(args: Array[String]): Unit = {
    println("Hello world")
  }
  case class uData (userid: String, item: String, rating: String, timestamp: String)

  def openFileTolist(fileName: String): Unit ={
    val lines = Source.fromFile(fileName).getLines.toList
    val mappedLines = lines.map(line => line.split("\t").map(_.trim))
    val filtredLines = mappedLines.filter(_(1).equals("176"))
    println(mappedLines.length)
    println(filtredLines.length)
    println(mappedLines(0)(1))
    println(filtredLines(0)(1))


  }

  openFileTolist("C:\\Users\\pin\\IdeaProjects\\laba01-02\\data\\u.data")
}