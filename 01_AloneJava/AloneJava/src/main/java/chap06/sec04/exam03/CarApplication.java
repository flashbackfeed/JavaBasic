package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
 * fileName : CarApplication
 * author : GGG
 * date : 2023-09-20
 * description : 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        //객체생성
        Car car = new Car();
        // 1) 기름넣기
        car.setGas(0);
        // 2) 남아있는 기름 확인 : true , 없으면 false
        boolean gasState = car.isLeftGas();
        // 3) 자동차 출발
        if(gasState) {
            System.out.println("출발합니다.");
            car.run();
        }
        // 4) 기름확인
        if (car.isLeftGas() == true){
            System.out.println("gas를 넣을 필요가 없습니다.");
        } else{
            System.out.println("gas를 주입하세요");
        }



    }
}
