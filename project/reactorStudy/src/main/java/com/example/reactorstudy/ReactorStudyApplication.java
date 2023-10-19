package com.example.reactorstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorStudyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactorStudyApplication.class, args);
    Flux
        .just(1,2,3,4,5,6)
        .filter(n -> n % 2 == 0 )
        .map(n -> n *2)
        .subscribe(System.out::println);
  }

}
