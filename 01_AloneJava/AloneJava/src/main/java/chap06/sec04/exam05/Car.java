package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : Car
 * author : GGG
 * date : 2023-09-20
 * description : 차 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Car {
//    TODO : 속성, 생성자함수, 함수(메소드)
    int speed; // 자동차 속도

    /**
     * 키를 돌립니다. 출력
     */
    void keyTurnOn(){
//        결과출력 : sout
        System.out.println("키를 돌립니다.");

    }

    /**
     * 달립니다 5개 출력 + 속도 함수
     */
    void run(){
//        반복문 5번 실행
        for (int i = 0; i <= 50; i=i+10) {
            this.speed = i;
            System.out.println("달립니다. 시속 : " + this.speed + "km/h");
        }

    }

    /**
     * 현재 속성의 값을 구하는 함수 : getter 함수
     * 사용법 : 리턴자료형 get속성명(){return 속성명;}
     */
     int getSpeed() {
        return speed;
    }
}// end of class
