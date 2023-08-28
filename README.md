## Inflearn

<img src="https://github.com/JHyun0302/server/assets/60764632/24cec8a1-ddb4-42c4-8e5b-2ff8d8fe6f49"  width="600" height="300"/>

### 강의명 : [스프링 부트 - 핵심 원리와 활용](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC-%ED%99%9C%EC%9A%A9)

- 지식공유자 : 김영한

### 강의 내용

- 스프링 부트가 제공하는 5가지 핵심 기능
    1. 내장 서버
    2. 자동 라이브러리 관리
    3. 자동 구성
    4. 외부 설정
    5. 모니터링 & 관리 기능

- 정리 : 유지보수하기 좋은 애플리케이션 개발의 가장 기본 원칙은 변하는 것과 변하지 않는 것을 분리하는 것이다.
    1. OS 환경 변수
    2. 커맨드 라인 옵션 인수
        - `CommandLineV1` : 자바 지원
            - 단점 : key:value 스타일이 아닌 문자 스타일... (파싱 불가능)
        - `CommandLineV2` : 자바 + 스프링
            - 해결 : key:value 검색 가능

    3. 스프링 통합
        - client(개발자)는 Environment로 key 주면 Enviroment가 value 찾아줌

    - 우선순위
        1. 더 유연한 것이 우선권 가짐.
        2. 범위가 넒은 것 보다 좁은 것이 우선권 가짐.
            - ex. **OS 환경변수 < 자바 시스템 < 커맨드 라인 옵션 인수**

    - 설정 데이터 우선순위
        - jar 내부 application.properties **(가장 낮음)**
        - jar 내부 프로필 적용 파일 application-{profile}.properties
        - jar 외부 application.properties
        - jar 외부 프로필 적용 파일 application-{profile}.properties **(가장 높음)**