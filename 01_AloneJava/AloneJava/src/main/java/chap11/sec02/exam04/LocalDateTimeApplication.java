package chap11.sec02.exam04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : chap11.sec02.exam04
 * fileName : LocalDateTimeApplication
 * author : GGG
 * date : 2023-09-27
 * description : 날짜/시간을 모두 가져오는 함수
 * 요약 : 
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
public class LocalDateTimeApplication {
    public static void main(String[] args) {
//      TODO : 날짜 + 시간
        LocalDateTime localDateTime = LocalDateTime.now(); // 현재 날짜 + 시간
        System.out.println(localDateTime); // 결과 출력

        System.out.println("--------- 날짜 포맷 주기 ----------");
        System.out.println("--------- yyyy-MM-dd HH:mm:ss -------");
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//       현재날짜에 날짜 포맷 적용 : 날짜객체변수.format(날짜포맷)
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }
}
