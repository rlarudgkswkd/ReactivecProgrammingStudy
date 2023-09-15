# 우테코_호돌의 Spring Webflux

[[10분 테코톡] 🐅호돌의 Spring Webflux](https://www.youtube.com/watch?v=4x1QRyMIjGU)

Spring Framework ->
ioc , di, PSA, AOP ,경량 컨테이너 ,POJO, 트랜잭션

책 : 초보 웹 개발자를 위한 스프링5 프로그래밍 입문

Spring 5.X 특징?

- JDK 8 부터 지원
- Kotlin 지원
- 호환 라이브러리 변경(JUnit 5, JDBC 4.0, Hibernate 5...)
- Reactive Programming 지원

---

새로운 기술을 배우는 가장 정확한 방법 : Documentation 읽기

-> 

[Spring WebFlux :: Spring Framework](https://docs.spring.io/spring-framework/reference/web/webflux.html)

---

- 
- 적은 수의 스레드로 동시성 처리
- 논 블로킹
- functional programming

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/02c5fda5-9a5a-4321-822d-e950fd321728/1c14cbe8-2fa0-447e-8905-1a9bfab1734f/Untitled.png)

- 클라이언트가 요청이 오면 스레드 풀에서 스레드를 반환해주는데 그때 모든 스레드가 사용중이면 Queue에 쌓임. 그래서 CPU, Memory는 충분하지만 쓰레드가 모자라서 처리가 느려지는 일 있음.
- 그렇다고 단순히 스레드를 늘린다고 해결되는 문제가 아님
    - cpu, 메모리에 부하로 성능 저하
    - 컨텍스트 스위칭

---

## 넷플릭스법

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/02c5fda5-9a5a-4321-822d-e950fd321728/dd0ebee4-1e73-459b-8ac6-4a3654293b97/Untitled.png)

## 트래픽이 대폭 증가하는 현대 소프트웨어 환경

- 무어의 법칙이 한계에 다다름
- 그러면서 멀티 코어 프로세서에서 대안을 찾기 시작하며 동시성 프로그래밍이 중요해짐.
- facebook 이 1.5 billion임
    - 그 이전 20년을 합친것보다 많음.
- 리액티브 매니페스토
    - 좋은 반응성
    - 회복 탄력성
    - 유연성

## LinkedIn의 Thread Pool Hell

- 다 쓰면 latency가 엄청 지연됨.
    - 왜 지연이 발생할까

## Netflix의 API 아키텍처 재설계

- 다수의 네트워크다 보니 지연이 발생
- 하나의 네트워크로 합쳐서 queue로 던져주고 하나의 스레드에서 병렬 처리를 하자.
    - RxJava를 만듬

## 기존 Spring MVC: 스레드를 늘려서 동시성을 처리

- Blocking I/O

## Webflux : 적은 수의 스레드로 동시성을 처리

- Asynchronous Non-blocking I/O
    - 우의 Non Blocking :
    
    [우의 non blocking - Google Search](https://www.google.com/search?q=우의+non+blocking&rlz=1C5CHFA_enKR1039KR1040&oq=우의+non+blocking&aqs=chrome..69i57j0i546j0i546i649j0i546l3.4456j0j7&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:7ed5b650,vid:IdpkfygWIMk,st:0)
    

## Webflux가 Spring MVC보다 무조건 빠른가요?

- 적은 스레드로 메모리를 효율적으로 사용하는 것 뿐
- 속도가 빠르다 보다는 적은 리소스로 많은 트래픽을 감당한다.

## Functional Programming

- 단순하게 생각하면
    - 함수가 일급 개체로 쓰일 수 있어( == 반환값, 인자가 될 수 있음) 메소드 체이닝과 람다를 섞어 쓰는 것(Java 8~)

## Reactive Programming / Reactive Stream / Backpressure

- 리액티브의 정의
    - Non blocking I/O 에 Reactive Stream 과 Backpressure를 곁들였다.
    - 작은 수의 쓰레드로 확장성 있는 Non-blocking / Event Driven 개발을 지향한다. → **머선 말?**

## Reactive Stream

- Asynchronous , Non-blocking으로 작동하는 Stream
- 근데 Stream 기능이 무지무지 많은것
- Publisher 에서 변경이 생기면 Subscriber에 변경된 데이터들을 Stream으로 전달
- 이 Stream으로 프로그래밍 하는 것이 Reactive Programming(모든것은 Stream)

## Backpressure

- subscriber로 들어오는 Stream양을 조정, 적은 컴퓨팅 자원으로 일을 처리하기 가능한 정도씩만 받기
- 들어오는 양을 조절하는 컷 담당
- 물론 이건 실시간 통신을 사용하지 않는 이상 크게 느끼기 어려울 것 같은데? text/ event-stream을 써보자

## Reactor & RxJava / Mono & Flux

- 리액티브 API

## Reactor & RxJava: JDK9 스펙의 Reactive Stream을 구현한 라이브러리

## Flux, an Asynchronous Sequence of 0-N items

- 0에서 N개

## Mono, Asynchronous 0-1 Result

- 0에서 한개

## 또 다른 기능: Annotated Controller / Function Endpoints

- 프로그래밍 모델

## Annotated Controller

- 익숙한 어노테이션 패턴
    - @RestController
- webMvc 와 WebFlux 차이
    - Mono나 Flux를 사용할수 있는것이 차이

## Function Endpoints: HandlerFunction

- HttpServletRequests를 MVC에서 받음
- 여기서는 ServerRequest 를 사용
    - 논 블로킹 용 Request

## Function Endpoints: ServerRequest와 ServerResponse

- bodyToMono

## Function Endpoints: RouterFunction

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/02c5fda5-9a5a-4321-822d-e950fd321728/9c9212c4-4707-40c1-973e-47e9c3fac8a1/Untitled.png)

## Functional Endpoints: nest() 으로 경로 nesting 하기

## Functional Endpoints: before(), after(), filter() 적용하기

## Functional Endpoints: @Bean 으로 Application 등록하기

- 스프링 컨테이너가 관리하도록 Bean에 등록해서 사용하기

## Spring MVC vs Spring Webflux

- web clients ↔ reactive clients
- Netty

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/02c5fda5-9a5a-4321-822d-e950fd321728/47be144a-1e0c-418c-ad45-05525ca8aecd/Untitled.png)

- 쓰려면 end to end모든것을 그거로 써야한다. 어느거는 Reactive로 쓰고 이런것 좋지 않음.
- R2DBC
    - JDBC 처럼 리액티브 뭐시기임
- 적용 가능성
    - 제대로 작성하는 MVC가 되어 있으면 굳이 변경할 필요는 없다. 굳이 쓰려고 하다가 오히려 안좋을수 있음
    - 팀의 규모가 크고 전환에 따른 학습 곡선이 가파른 점을 명심해야한다.
        - 전체를 전환하는 것보다 Reactive WebClient 를 사용하는 것. 작은것부터 시작하여 이점을 측정해보자.
    

## 오늘의 결론

- Spring 5에서는 Reactive Stack
    - Spring Webflux는 Spring Reactive Stack의 Web Framework 역할을 맡는다. (Spring MVC의 포지션)
    - Reactive Programming은 컴퓨팅 자원을 효율적으로 운용하기 위해 고안된 프로그래밍 패러다임이다.
    - Reactive Programming은 Asynchronous Non-blocking IO, Data Stream 에 기반해 메소드 체이닝과 람다식으로 이뤄진다.

## 오늘의 결론: Reactive, Spring Webflux 무서워 할 필요 없다.

---

## 김경한 생각

- Reactive 프로그래밍 리뷰할때
    - 기존과의 차이
    - 적용 사례
    - Best case 코드
    - 기능 적용 후 효과
