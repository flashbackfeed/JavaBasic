package chap08.verify.exam03;

/**
 * packageName : chap08.verify.exam03
 * fileName : MethodApplication
 * author : GGG
 * date : 2023-09-22
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
// 문제 : 아래는 매개변수의 다형성을 이용한 예제입니다.
//     아래 소스를 보고 자식 클래스들을 완성하세요
// 결과 :
//    Line
//    Shape
//    Rect
//    Circle
public class MethodApplication {

    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        MethodApplication.paint(shape); // Shape의 draw() 실행. "Shape" 출력
        MethodApplication.paint(new Line()); // Line의 draw() 실행. "Line" 출력
        MethodApplication.paint(new Rect()); // Rect의 draw() 실행. "Rect" 출력
        MethodApplication.paint(new Circle()); // Circle의 draw() 실행. "Circle" 출력

//        자바의 객체 배열
//        Shape[] shapes = new Shape[]{new Line(), new Shape(),new Rect(),new Circle() };
//
//        for(Shape shape : shapes) {
//            paint(shape);
//        }
    }
}
