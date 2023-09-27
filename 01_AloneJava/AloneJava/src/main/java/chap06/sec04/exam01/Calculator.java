package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
 * fileName : Calculator
 * author : GGG
 * date : 2023-09-20
 * description : 모델 클래스
 *             함수(멤버 메소드)
 * 요약 :     MVC 디자인 패턴 : M(Model), V(View), C(Controller)
 *            함수형태 :
 *                 접근제어자 리턴자료형 함수명(매개변수1, ... , 매개변수n){실행문;}
 *                 ex) public void sample(int a, String b, double c){}
 *                 접근제어자 : public(공용), default(생략, package 내에서는 사용가능) 등
 *                 함수이름 명명법: 낙타표기법(카멜표기법), 첫글자 소문자 단어 + 단어의 첫 문자는 대문자
 *                 매개변수 : 함수 실행시 전달되는 데이터
 *                 리턴자료형 : 함수가 실행된 이후 결과값을 내보내기 할때 사용
 *                 리턴값이 없는 함수 형태 호출 : 객체변수.함수()
 *                 리턴값이 있는 함수 형태 호출 : 리턴자료형 변수 = 객체변수.함수()
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Calculator {
//   TODO : 속성(멤버변수, 필드), 생성자함수, 함수(메소드)
//   속성 생략 : 사물이나 사람의 특징을 나타냄
//   생성자 생략
//    TODO : 함수 : 사물이나 사람의 동작(행동)을 나타냄

    /**
     * 전원 켜는 함수 : 리턴값 없이 만듬
     * 사용법 : 접근제어자 리턴자료형 함수명(매개변수1, ... 매개변수n){}
     * 접근제어자 : public(공용),private(개인),default(생략), protected
     */
       void powerOn(){
        System.out.println("전원을 켭니다.");
    }

/**
 *  더하기 함수 : 리턴값이 있는 함수
 */

int plus(int x,int y){
   int result = x + y;
    return result; // 결과 내보내기의 자료형(정수:int)
}
    public double divide(int x, int y){
        double result2 = (double)(x/y);
        return result2;
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
}
