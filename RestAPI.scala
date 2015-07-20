
import org.http4s._
import org.http4s.dsl._
import org.http4s.server._
import org.http4s.server.blaze.BlazeBuilder



object MathService {
  val service = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, ${name}")
    case GET -> Root / "max" / items => {
      val nums = parseNumberList(items)
      val result = 45 // I don't know!
      Ok(result.toString)
    }
    case GET -> Root / "average" / items => {
      val nums = parseNumberList(items)
      val result = 32 // I don't know!
      Ok(result.toString)
    }
  }

  def parseNumberList(numList: String) = {
    numList.split(",").map(_.toInt).toList
  }
}


object RestAPI extends App {

  val port = 8080

  BlazeBuilder.bindHttp(port)
    .mountService(MathService.service, "/")
    .run
    .awaitShutdown()
}
