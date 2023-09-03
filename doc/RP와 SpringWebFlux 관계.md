# Reactive Programming과 Java Spring WebFlux의 관계
## Reactive Programming (RP)
- Reactive Programming은 데이터 스트림과 이벤트를 처리하기 위한 비동기적인 프로그래밍 스타일을 의미합니다. RP는 데이터의 흐름과 변화를 관찰하고 이에 반응하는 방식으로 프로그램을 작성합니다. 이 패러다임은 대용량 및 실시간 데이터 처리, 다중 스레드와 스레드 안전성 등과 관련이 있습니다. RP를 통해 코드는 더 효율적이며 확장 가능하며 반응적이게 작동할 수 있습니다.

## Java Spring WebFlux
- Java Spring WebFlux는 Spring Framework의 일부로서 Reactive Programming을 기반으로 하는 웹 애플리케이션을 개발하기 위한 모듈입니다. Spring WebFlux는 Spring 5 버전부터 도입되었으며, 서버 및 클라이언트 측 비동기 웹 애플리케이션 개발을 위한 API를 제공합니다. 이 모듈을 사용하면 높은 동시성 및 확장성을 갖는 웹 애플리케이션을 구축할 수 있습니다.

### Java Spring WebFlux 특징

- Annotation-Based: Spring WebFlux는 Spring Framework의 일부로서 주로 애너테이션을 사용하여 컨트롤러와 라우팅을 정의합니다.
- Reactive Streams 지원: Reactive Streams는 Java 9 이상에서 표준화된 비동기 스트림 프로그래밍 API로, Spring WebFlux는 이를 지원하여 리액티브 스트림을 처리합니다.
- Non-Blocking I/O: Spring WebFlux는 블로킹 I/O 대신 넌블로킹 I/O를 사용하며, 이를 통해 동시성 처리를 개선합니다.
- 함수형 및 반응적 프로그래밍 스타일: Spring WebFlux는 함수형 프로그래밍 스타일을 지원하며, Reactive Programming 개념을 통합하여 코드를 더 반응적으로 작성할 수 있도록 합니다.

Java Spring WebFlux는 주로 대용량 데이터 스트리밍, 실시간 웹 소켓 애플리케이션, IoT (Internet of Things) 시스템 등과 같이 비동기 및 반응적인 웹 애플리케이션을 구축하고자 하는 경우에 유용합니다. 이것은 전통적인 Spring MVC 프레임워크와 비교하여 높은 동시성과 확장성을 제공할 수 있도록 합니다.
