package eatales.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/** Controller for application health check. */
@RestController
@RequestMapping("health")
public class HealthCheckController {

  // Successful health check response
  private static Map<String, String> satusOk = Collections.singletonMap("status", "OK");

  /**
   * Returns default health check response.
   *
   * @return OK status
   */
  @RequestMapping
  public Map<String, String> checkHealth() {
    return satusOk;
  }
}
