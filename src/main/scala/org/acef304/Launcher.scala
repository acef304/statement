package org.acef304

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
  * Created by acef304 on 09/04/2017.
  */
class Launcher extends App{
  override def main(args: Array[String]): Unit = {

  }
}

case class csvOperation(operationDate: Option[LocalDateTime], actualDate: Option[LocalDateTime],
                       description: Option[String], merchant: Option[String], place: Option[String],
                       country: Option[String], currency: Option[String], sum: Option[String],
                       accCurrency: Option[String], actSum: Option[String])

object RaiffParser {
  def parseFile(path: String): Iterator[csvOperation] = {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    scala.io.Source.fromFile(path, "cp1251").getLines().map{
      str =>
        println(str)
        val splStr = str.split(";")
        csvOperation(Some(LocalDateTime.parse(splStr(0), formatter)), Some(LocalDateTime.parse(splStr(1), formatter)),
        Some(splStr(2)), Some(splStr(3)), Some(splStr(4)), Some(splStr(5)), Some(splStr(6)),
          Some(splStr(7)), Some(splStr(8)), Some(splStr(9)))
    }
  }
}