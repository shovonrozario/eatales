package eatales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Class for application start-up. */
@SpringBootApplication
public class Application {

  /**
   * Starts up the application.
   *
   * @param args start-up arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
