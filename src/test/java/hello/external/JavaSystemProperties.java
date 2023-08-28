package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * Edit Configuration -> add VM options
 * '-Durl=devdb -Dusername=dev_user -Dpassword=dev_pw' 추가
 */
@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {

        System.getProperty("hello key", "hello value"); //자바 시스템 속성 자바 코드로 보기 -> 외부로 설정을 분리하는 효과 X
        String hello_key = System.getProperty("hello_key");
        log.info("hello_key={}", hello_key);

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}", key, System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }
}
