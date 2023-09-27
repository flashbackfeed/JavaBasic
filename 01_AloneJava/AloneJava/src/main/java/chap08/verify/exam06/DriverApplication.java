package chap08.verify.exam06;

/**
 * packageName : chap08.verify.exam06
 * fileName : DriverApplication
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
// TODO: 연습문제) 매개변수의 다형성 예제(인터페이스 이용)
//      아래 결과를 보고
//      Driver(전략클래스) 클래스, Bus 클래스 , Taxi 클래스를 완성하세요
// 결과 :
//    버스가 달립니다.
//    택시가 달립니다.
public class DriverApplication {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); // 버스가 달립니다.
        driver.drive(taxi);// 택시가 달립니다.
    }
}
