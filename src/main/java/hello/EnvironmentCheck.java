package hello;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 외부 설정 - 스프링 통합
 * 1. Client(개발자)는 key값을 Environment에게 줌.
 * 2. Environment는 (OSEnv, Java System Prop, CommandLine Opt, prop Source)에서 key값에 맞는 value값 찾음. (우선순위 존재)
 * <p>
 * 실행
 * Java System Prop (Add VM Options): `-Durl=devdb -Dusername=dev_user -Dpassword=dev_pw`
 * CommandLine (Program Arguments): `--url=devdb --username=dev_user --password=dev_pw mode=on`
 */
@Slf4j
@Component
public class EnvironmentCheck {
    private final Environment env;

    public EnvironmentCheck(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void init() {
        String url = env.getProperty("url");
        String username = env.getProperty("username");
        String password = env.getProperty("password");
        log.info("env url={}", url);
        log.info("env username={}", username);
        log.info("env password={}", password);
    }
}
