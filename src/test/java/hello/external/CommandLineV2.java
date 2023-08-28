package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

/**
 * 외부 설정 - 커맨드 라인 옵션 인수 (스프링이 커맨드 라인 인수의 불편함 해소시킴 - key:value 검색 가능)
 */
@Slf4j
public class CommandLineV2 {
    //'--url=devdb --username=dev_user --password=dev_pw mode=on'
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);
        }

        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionArgs = {}", appArgs.getNonOptionArgs()); //`--`들어간 옵션 제외
        log.info("OptionsNames = {}", appArgs.getOptionNames()); //`--`들어간 옵션 출력

        Set<String> optionNames = appArgs.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option arg {} = {}", optionName, appArgs.getOptionValues(optionName)); //`--`들어간 옵션 key-value 형태로 출력
        }

        List<String> url = appArgs.getOptionValues("url"); //'--url=devdb --url=devdb2 --username=dev_user --password=dev_pw mode=on'
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");
        log.info("url={}", url); //`--`들어간 옵션 key-value 형태로 출력
        log.info("username={}", username);
        log.info("password={}", password);
        log.info("mode={}", mode); //'mode=on'은 문자 (key-value X)
    }
}
