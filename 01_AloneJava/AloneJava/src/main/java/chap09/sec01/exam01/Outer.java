package chap09.sec01.exam01;

/**
 * packageName : chap09.sec01.exam01
 * fileName : Outer
 * author : GGG
 * date : 2023-10-02
 * description : 특수클래스 -> 중첩 클래스 : 클래스 안에 클래스
 * 요약 :
 *            클래스의 3요소 : 속성, 생성자, 함수
 *            멤버 클래스 - 일반 속성 클래스 : 외부 클래스를 생성해야 내부 클래스를 사용 가능
 *                        - 정적 속성 클래스 : 외부 클래스 생성없이 바로 사용 가능
 *            로컬 클래스 - 함수(메소드) 안의 클래스 : 함수를 실행해야 사용 가능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class Outer {
//     TODO : 클래스의 3요소 : 속성, 생성자, 함수
//       생성자
    
    public Outer() {
        System.out.println("외부 클래스가 생성됨");
    }

//   TODO : 일반 속성 (내부) 클래스
    public class Attr{
//        생성자
    public Attr() {
        System.out.println("Attr 내부 클래스가 생성됨");
    }
    int field1; //속성

    void method1(){

    }
}

// TODO : 정적(전역, 공유) 속성 (내부) 클래스
    static class Share{

    public Share() {
        System.out.println("Share 정적 객체가 생성됨");
    }
    int field1; // 일반 속성

    static int field2; // 정적 속성

    void method1(){ // 일반 함수
        
    }
    static void method2(){  // 정적 함수
        System.out.println("정적함수가 실행됨");
    }
}

// TODO : 로컬 클래스 : 함수 안의 클래스
    void method(){
//       TODO : 내부 클래스
        class Local{
//          생성자
            public Local() {
                System.out.println("Local 객체가 생성됨");
            }
            int field1; // 속성
            void method1(){ // 함수
                
            }
            
        }
//        Local 객체 생성
        Local local = new Local();
        local.field1 = 3; // 내부 클래스 속성
        local.method1(); // 내부 클래스 함수
    }
}
