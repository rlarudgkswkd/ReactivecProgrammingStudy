package com.example.reactorstudy;

import java.util.Arrays;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorExampl1 {

  public static void main(String[] args) {
    SpringApplication.run(ReactorExampl1.class, args);
    Flux<String> sequence = Flux.just("Good","shit");
    sequence
        .map(data -> data.toLowerCase())
        .subscribe(data -> System.out.println(data));
  }


}
