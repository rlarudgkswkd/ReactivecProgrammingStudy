import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class SpringWebFluxTestT2Micro extends Simulation {
  val httpConf = http.baseUrl("http://15.164.233.46:8091")

  val scn = scenario("API Test")
    .exec(http("Get All Todos")
      .get("/todos")
      .check(status.is(200)))

  setUp(
    scn.inject(atOnceUsers(1000)) // 1000명의 사용자 동시 접속
  ).protocols(httpConf)
}