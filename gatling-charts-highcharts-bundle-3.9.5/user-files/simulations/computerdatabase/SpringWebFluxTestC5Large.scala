import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class SpringWebFluxTestC5Large extends Simulation {
  val httpConf = http.baseUrl("http://13.125.220.180:8091")

  val scn = scenario("API Test")
    .exec(http("Get All Todos")
      .get("/todos")
      .check(status.is(200)))

  setUp(
    scn.inject(rampUsers(10000).during(10)) // 1000명의 사용자 동시 접속
  ).protocols(httpConf)
}