package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : Computer
 * author : GGG
 * date : 2023-09-20
 * description : 컴퓨터 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Computer {
//    TODO : 속성, 생성자함수 , 함수(메서드)
//    속성생략
//    생성자함수 생략
//    TODO : 함수
//          배열을 함수의 매개변수로 사용하면 장점이 있음
//          실행시에 함수의 매개변수로 1개를 넣을지 2개를 넣을지 정해지지 않았을 때 사용

    int sum1(int[] value){
        int sum = 0;
//      매개변수 배열의 개수까지 모두 더하는 로직
        for (int i = 0; i < value.length ; i++) {
            sum = sum + value[i]; // 누적합

        }
        return sum;
    }
    
    // TODO : 기능 추가 : 매개변수의 모든 값을 곱하는 함수를 만들어보세요
    int multi(int[] value){
        int mul = 1;
        for (int i = 0; i < value.length ; i++) {
            mul = mul * value[i];

        }
        return mul;
    }

//    TODO : 자바의 새로운 기능 : ... 연산자
//          ...value : 매개변수의 각각의 변수를 배열로 만들어줌
int sum2(int ...value){
    int sum = 0;
//      매개변수 배열의 개수까지 모두 더하는 로직
    for (int i = 0; i < value.length ; i++) {
        sum = sum + value[i]; // 누적합

    }
    return sum;
}
}
