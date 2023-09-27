package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : StudentApplication
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
// 문제 : 실행클래스와 부모클래스 Person 을 보고 자식 클래스 Student 를 완성하세요
// 결과:
//    홍길동
//    1234567
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student("홍길동"); // 자식 생성자(매개 1개)

        student.setId("1234567");

        System.out.println(student.getName());  // 홍길동
        System.out.println(student.getId());    // 1234567
    }
}
