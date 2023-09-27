package chap08.verify.exam07;

/**
 * packageName : chap08.verify.exam07
 * fileName : VehicleApplication
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
public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run(); // 버스가 달립니다.

        Bus bus = (Bus)vehicle; // 강제 타입 변환 (원복)

//        bus객체의 고유 함수 : checkFare()
        bus.checkFare();  // 승차요금을 체크합니다.
    }
}


