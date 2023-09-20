package com.example.reactiveprogrammingtest;

import reactor.core.publisher.Flux;

public class ReactiveProgrammingTestApplication {

    public static void main(String[] args) {
        Flux<String> flux = Flux.just("A");
        flux.map(i -> "foo" + i);
        flux.subscribe(System.out::println);
    }

}
