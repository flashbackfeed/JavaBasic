package chap04;

/**
 * packageName : chap04
 * fileName : Sec0402
 * author : GGG
 * date : 2023-09-19
 * description : 반복문
 * 요약 :
 * for문 : for(초기화식; 조건식; 증감식){반복문;}
 * => 조건식이 true 일때만 반복문이 실행됨
 * while문 : 초기화식;
 * while(조건식){
 * 반복문;
 * 증감식;
 * }
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 * <p>
 * 예제 1) 1 ~ 10까지 화면에 출력하세요
 */

/**
 * 예제 1) 1 ~ 10까지 화면에 출력하세요
 *         단,반복문이용
 */

public class Sec0402 {

    public void exam01() {
        int count = 0;
        // TODO: fori : for문 단축키
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(count);

        }
    }

    /**
     * 예제 2) 1 ~ 100까지 합을 출력 : 반복문 이용(누적합)
     * sum = sum + i; (i는 1씩 증가)
     */
    public void exam02() {
        int sumVal = 0;
        // TODO: fori : for문 단축키
        for (int i = 1; i <= 100; i++) {
            sumVal = sumVal + i;
        }
        System.out.println(sumVal);
    }
    /**
     * 예제 : 주사위 2편 : 주사위를 던져서 나오는 숫자를 화면에 계속 화면에 
     * 출력하되 6이 나오면 반복문을 중단하고 빠져나오세요.
     * 단, 빠져 나올때 프로그램종료 라고 출력하세요
     */
    public void exam08(){

        while(true){ // 무한루프
            int num = (int)(Math.random() * 6) + 1; // 주사위돌리기
//            주사위 숫자 화면 출력
            System.out.println(num);
//            TODO : 아래 완성하세요 : 6 나오면 빠져나가기
            if (num == 6) {
                break; // 반복문 강제 중단
            }

        }
        System.out.println("프로그램 종료");
    }

    /**
     * 예제 : 1 ~ 10 사이의 수 중에서 짝수만 출력하는 코드 : continue문 사용하기
     * 힌트 : continue : 아래 실행을 skip 하고 반복문 계속 진행시키기
     */
    public void exam09(){
          int sumOdd = 0;
        for (int i = 1; i <= 10; i++) {
            // 홀수는 출력 안함
            if (i%2==1){
                continue; // 밑에 출력 명령문이 실행 안됨
            }
            System.out.println(i);
            sumOdd = sumOdd + i;
        }
        System.out.println(sumOdd);
    }
    /**
     * 새로나온 사용법 : 반복문의 라벨
     * 활용 : 중첩 for문에서 주로 사용
     */
    public void exam10(){
        Outter:
        for (int upper = 'A'; upper < 'Z' ; upper++) {
            for (int lower = 'a'; lower < 'z' ; lower++){
                System.out.println((char)upper + "-" + (char)lower); // 화면출력
//                g가 나오면 (안쪽/바깥쪽 모두)반복문 중단
                if (lower == 'g'){
                    break Outter; // 2중 반복문이 모두 중단됨
                }
            }

        }
        System.out.println("프로그램 종료");
    }
}
