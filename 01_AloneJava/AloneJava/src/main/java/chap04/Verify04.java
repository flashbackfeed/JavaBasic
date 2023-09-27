package chap04;

/**
 * packageName : chap04
 * fileName : Verify04
 * author : GGG
 * date : 2023-09-19
 * description : 4장 연습문제 : 조건문/반복문
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Verify04 {
    /**
     * 연습문제 1: for문을 이용해서 1 ~ 100 까지의 정수중에서
     *             3의 배수의 총합을 구하는 코드를 작성해 보세요
     */
    public void exam01(){
        int sumVal = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%3!=0){
                continue;
            }
            sumVal = sumVal +i;

        }
        System.out.println(sumVal);
    }

    /**
     * 연습문제 2: whlie문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을 때
     * 나오는 눈을(눈1, 눈2) 형태로 출력하고,
     * 눈의 합이 5가 아니면 계속 주사위를 던지고,
     * 눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요
     * 힌트 : int num1 = (int)(Math.random() * 6) +1;
     *        int num2 = (int)(Math.random() * 6) +1;
     */
    public void exam02(){
        while (true){
            // 주사위 2개
            int num1 = (int)(Math.random() * 6) +1; // 주사위 1
            int num2 = (int)(Math.random() * 6) +1; // 주사위 2
            System.out.println("(" + num1 + ", " + num2 + ")" + " " +(num1+num2));
            if (num1+num2 == 5){
                System.out.println("합이 5인 조합이 나왔습니다.");
                break;
            }

        }
        System.out.println("프로그램을 종료합니다");
    }

    /**
     * 연습문제 3: 중첩 for문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력해 보세요
     * 단 , x 와 y는 10 이하의 자연수입니다.
     */
    public void exam03(){
        for (int x = 1; x<=10; x++){
            for(int y = 1; y<=10; y++){
                if ((4*x)+(5*y) == 60){
                    System.out.println("("+ x + "," + y+")");

                }
            }
        }
    }
    /**
     * 연습문제 4: for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해 보세요.
     * 출력 : * (1행(i) : * 1개(j)) i == j : 줄바꿈 j는 i의 숫자만큼 반복문을 실행
     *        **(2행(i) : * 2개(j)) i == j : 줄바꿈 j는 i의 숫자만큼 반복문을 실행
     *        *** (3행(i) : * 3개(j)) i == j : 줄바꿈 j는 i의 숫자만큼 반복문을 실행
     *        **** (4행(i) : * 4개(j)) i == j : 줄바꿈 j는 i의 숫자만큼 반복문을 실행
     */
    public void exam05(){
        for(int i =1; i<5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"); // 별출력 + 줄바꿈 안함
                if(i == j){
                    System.out.println(); // 줄바꿈
                }
            }

        }

    }
}
