package chap08.verify.exam01;

/**
 * packageName : chap08.verify.exam01
 * fileName : CalculatorApplication
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
// 문제 : 실행 클래스의 결과와 Calculator(추상클래스)를 확인해서
//       자식 클래스 GoodCalc 디자인(코딩)하세요
// 결과 :
//    5
//    -1
//    3.0
public class CalculatorApplication {
    public static void main(String[] args) {
        GoodCalc goodCalc = new GoodCalc();

        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int[]{2,3,4}));
    }
}
