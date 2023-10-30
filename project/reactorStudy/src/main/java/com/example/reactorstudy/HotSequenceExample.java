package com.example.reactorstudy;

import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class HotSequenceExample {
  public static void main(String[] args) throws InterruptedException {
    String[] singers = {"Singer A", "Singer B", "Singer C", "Singer D", "Singer E"};

    log.info("# Begin concert:");
    Flux<String> concertFlux =
        Flux
            .fromArray(singers)
            .delayElements(Duration.ofSeconds(1))
            .share();

    concertFlux.subscribe(
        singer -> log.info("# Subscriber1 is watching {}'s song", singer)
    );

    Thread.sleep(2500);

    concertFlux.subscribe(
        singer -> log.info("# Subscriber2 is watching {}'s song", singer)
    );

    Thread.sleep(3000);
  }
}
