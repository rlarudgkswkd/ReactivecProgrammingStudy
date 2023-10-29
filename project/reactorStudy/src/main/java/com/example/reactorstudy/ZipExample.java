package com.example.reactorstudy;

import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class ZipExample {
  public static void main(String[] args) throws InterruptedException {
    Flux
        .zip(
            Flux.just(1, 2, 3).delayElements(Duration.ofMillis(300L)),
            Flux.just(4, 5, 6).delayElements(Duration.ofMillis(500L))
        )
        .subscribe(tuple2 -> log.info("# onNext: {}", tuple2));

    Thread.sleep(2500L);
  }
}
