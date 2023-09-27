package chap15.sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap15.sec01.exam11
 * fileName : ReaderApplication
 * author : GGG
 * date : 2023-09-27
 * description : 1 문자씩 읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
public class ReaderApplication {
    public static void main(String[] args) throws Exception {
//      TODO : 파일 읽기용(입력용)으로 접근
        Reader reader = new FileReader("src/main/resources/test7.txt");
//      TODO : 1문자씩 읽기(자동증가) => 리턴 : 아스키코드값이 리턴됨
        while (true){
            int data = reader.read();
//      TODO : 종료 조건 : 파일의 끝 : -1
            if (data == -1){
                break;
            }
            System.out.println((char) data); // 아스키코드값 -> 문자로 변환
        }
        reader.close();

    }
}
