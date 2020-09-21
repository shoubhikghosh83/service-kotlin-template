package com.tcs.service.template.perf

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class PTSimulationTemplate extends Simulation {


  val scn = scenario("Template Check").repeat(100, "n") {
    exec(
      http("GetModel-API")
        .get("http://localhost:8091/api/v1/getModel")
        .check(status.is(200))
    )
  }
  setUp(scn.inject(atOnceUsers(10))).maxDuration(FiniteDuration.apply(5, "minutes"))
}
