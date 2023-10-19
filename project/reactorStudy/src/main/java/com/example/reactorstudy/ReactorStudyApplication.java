package com.example.reactorstudy;

import java.util.Arrays;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorStudyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactorStudyApplication.class, args);
    List<Task> tasks = Arrays.asList(Task.builder().name("dd")
        .component("dd").build(),Task.builder().name("d22d")
        .component("d22d").build());

    String korBtc = "비트코인";

    tasks.stream()
        .filter(d -> d.name.startsWith("d"))
        .map(d -> d.getName() + "(" + korBtc + ")" )
        .forEach(cc -> System.out.println(cc));
  }


  @Builder
  @Data
  public static class Task{
    String name;
    String component;
  }

}
