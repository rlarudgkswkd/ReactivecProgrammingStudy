package com.example.reactorstudy;

import com.example.reactorstudy.util.MyLogger;
import java.util.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;


public class SubscribeOnExample {

  private static final Logger logger = Logger.getLogger(MyLogger.class.getName());
  public static void main(String[] args) throws InterruptedException {
    Flux.fromArray(new Integer[] {1, 3, 5, 7})
        .subscribeOn(Schedulers.boundedElastic())
        .doOnNext(data -> logger.info("# doOnNext: {}"))
        .doOnSubscribe(subscription -> logger.info("# doOnSubscribe"))
        .subscribe(data -> logger.info("# onNext: {}"));

    Thread.sleep(500L);

  }
}
