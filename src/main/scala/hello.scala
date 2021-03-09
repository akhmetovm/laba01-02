import scala.io.Source
//import org.json4s._
//import org.json4s.native.Serialization._
//import org.json4s.native.Serialization

object hello {
  def main(args: Array[String]): Unit = {
    println("Hello world1")
  }
  case class uData (userid: String, item: String, rating: String, timestamp: String)
  //case class filmStats (r1: String, r2: String, r3: String, r4:String, r5: String)


  def openFileTolist(fileName: String): Unit ={
    val csvSource = Source.fromFile(fileName)
    val lines = csvSource.getLines.toList
    val mappedLines = lines.map(line => line.split("\t").map(_.trim))

    val filtredLines = mappedLines.filter(_(1).equals("176"))

    //val groupByRating = mappedLines.groupBy(_(2)).mapValues(_.size)

   // println(groupByRating("1"))
    csvSource.close()
  }

  openFileTolist("C:\\Users\\pin\\IdeaProjects\\laba01-02\\data\\u.data")
}