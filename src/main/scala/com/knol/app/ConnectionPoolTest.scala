package com.knol.app

import com.knol.util.ConnectionPool
import java.sql.ResultSet
import org.slf4j.LoggerFactory

object ConnectionPoolTest extends App {

  val logger = LoggerFactory.getLogger(this.getClass)
  val query = "select * from emp"
  ConnectionPool.getConnection match {
    case Some(connection) =>
      try {
        val statement = connection.createStatement()
        val result = statement.executeQuery(query)
        val scalaResultSet = new MyResultSet(result) map { r => (r.getString(1), r.getString(2), r.getString(3)) }
        scalaResultSet foreach println _
      } catch {
        case exception: Exception =>
          logger.warn("Error in excuting query" + exception.printStackTrace())
      } finally {
        if (!connection.isClosed()) connection.close()
      }
    case None =>
      println("Not geting connection from connection pooling")
  }

}

class MyResultSet(rs: ResultSet) extends Iterator[ResultSet] {
  def hasNext: Boolean = rs.next()
  def next(): ResultSet = rs
}