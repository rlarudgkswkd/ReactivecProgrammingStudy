package com.example.reactorstudy;

import com.example.reactorstudy.util.MyLogger;
import java.util.logging.Logger;
import reactor.core.publisher.Flux;

public class flatMapExample {

  private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

  public static void main(String[] args) {
    Flux
        .just("Good", "Bad")
        .flatMap(feeling -> Flux
            .just("Morning", "Afternoon", "Evening")
            .map(time -> feeling + " " + time))
        .subscribe(logger::info);
  }
}
