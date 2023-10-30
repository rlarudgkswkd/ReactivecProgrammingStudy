package com.example.reactorstudy;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

@Slf4j
public class BackPressureExample {
  public static void main(String[] args) {
    Flux.range(1, 5)
        .doOnRequest(data -> log.info("# doOnRequest: {}", data))
        .subscribe(new BaseSubscriber<Integer>() {
          @Override
          protected void hookOnSubscribe(Subscription subscription) {
            request(2);
          }

          @SneakyThrows
          @Override
          protected void hookOnNext(Integer value) {
            Thread.sleep(2000L);
            log.info("# hookOnNext: {}", value);
            request(2);
          }
        });
  }
}