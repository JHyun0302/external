package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 외부 설정 - OS 환경 변수
 */
@Slf4j
public class OsEnv {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            log.info("env {}={}", key, System.getenv(key));
        }

        //DBURL=dev.db.com 개발서버 - 외부 설정
        //DBURL=prod.db.com 운영서버 - 외부 설정
        System.getenv("DBURL");
    }
}
