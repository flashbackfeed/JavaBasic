package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
 * fileName : Calculator
 * author : GGG
 * date : 2023-09-20
 * description : 계산기 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Calculator {
// TODO : 속성(멤버변수,필드) , 생성자함수, 함수(메소드)

    public double areaRectangle(int r1){
        double result = (double)r1 * (double)r1;
        return result;

    }
    public double areaRectangle(int r1, int r2){
        double result = (double)r1 * (double)r2;
        return result;
    }
}
