package chap05;

/**
 * packageName : chap05
 * fileName : Sec0501
 * author : GGG
 * date : 2023-09-19
 * description : 참조 자료형과 참조 변수
 * 요약 :
 *        기본자료형 = int(4),long(8),float(4),double(8),boolean 자료형
 *        => stack 영역 : 값이 그대로 저장됨
 *        참조자료형 = String(문자열), 배열, 객체
 *        => stack 영역 : 주소값이 저장됨
 *        => heap 영역 : 값이 저장됨
 *        JVM(Java Virtual Machine) : 자바 가상 머신 : JDK (자바 가상 머신이 포함되어있음)
 *        역할 : linux/windows(운영체제) 모든 곳에서 실행할 수 있게 만드는 프로그램
 *        비교연산자(==) : 기본자료형에서는 값을 비교하고
 *                          참조 자료형에서는 주소(방번호)를 비교하게 됨
 *                          (스택영역에 저장된 값을 비교함)
 *        null point exception(예외) : 프로그램을 강제 비정상 중단함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Sec0501 {
    /**
     * 비교연산자(==)와 equals 함수 예제
     */
    public void stringEqualExam(){
        // 참조 자료형
        // 참조자료형 객체변수 = new 생성자함수();
        // 메모리에 랜덤한 주소(방번호) 값으로 생성됨
        String strVar1 = new String("신민철");
        String strVar2 = new String("신민철");
        
        // 주소(방번호) 비교 : 개발자 입장에서는 의미 없음
        if(strVar1==strVar2){
            System.out.println("두개의 주소가 같음");
        } else {
            System.out.println("두개의 주소가 다름");
        }

        // equals() 함수 사용 : 값을 비교하는 함수
        if (strVar1.equals(strVar2) == true){
            System.out.println("값이 같음");
        } else {
            System.out.println("값이 다름");
        }
//        null pointer exception(에러)
//        배열에서 null 에러
        int[] intArray = null; // 방이 없음(공간 없음)
        intArray[0] = 10; // 0번지 방에 10번을 넣으니 null 에러 발생
        
//        객체에서 null 에러
        String str = null; // 권장 코딩 : String str = "";
//        문자열의 길이를 가져오는 함수 : 문자열.length()
        System.out.println("총 문자수: " + str.length()); // null 에러 발생
    }
    
}
