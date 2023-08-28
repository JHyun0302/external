package hello.external;

import lombok.extern.slf4j.Slf4j;

/**
 * 외부 설정 - 커맨드 라인 인수 (자바가 지원, 단점 존재)
 * 단점 : key-value 스타일이 아닌 문자 스타일... (파싱 불가능)
 */
@Slf4j
public class CommandLineV1 {
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);
        }
    }
}
