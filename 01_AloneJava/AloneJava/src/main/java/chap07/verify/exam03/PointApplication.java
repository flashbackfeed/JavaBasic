package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
 * fileName : PointApplication
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
// 연습문제 2: 아래 실행 클래스를 보고 Point 객체를 코딩하세요.
//    속성의 변수명은 x, y 로 하세요
// 결과 :
//     (0,0)
//     (10,20)
public class PointApplication {
    public static void main(String[] args) {
//        TODO : 생성자 오버로딩 ( 매개변수 기본생성자, 2개짜리 생성자)
//    객체 생성
        Point point = new Point(); // 기본생성자로 객체생성
        point.showPoint(); // (0,0) 출력

//    객체 생성2
        Point point2 = new Point(10,20); // 매개변수 2개짜리 생성자로 객체 생성
        point2.showPoint(); // (10,20) 출력


//      객체의 함수 호출

    }
}
