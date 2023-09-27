package chap06.sec02.exam02;

/**
 * packageName : chap06.Sec02.exam02
 * fileName : FieldApplication
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class FieldApplication {
    public static void main(String[] args) {
//        객체생성 : new 연산자(힙방에 해당 객체를 생성함)
//        TODO : 클래스명 명명법 : 첫글자 대문자 나머지 소문자, 단어 사이는 대문자(파스칼표기법)
//        사용법 : 클래스명 객체변수명 = new 생성자함수();
        FieldInit fieldInit = new FieldInit();

//         모든 속성 출력
        System.out.println("byte: " + fieldInit.byteField);
        System.out.println("short: "+fieldInit.sField);
        System.out.println("int: "+fieldInit.iField);
        System.out.println("long: "+fieldInit.lField);
        System.out.println("float: "+fieldInit.fField);
        System.out.println("double: "+fieldInit.dField);
        System.out.println("char: "+fieldInit.cField);
        System.out.println("boolean: "+fieldInit.bField);
        System.out.println("int[]: "+fieldInit.arrField);
        System.out.println("String: "+fieldInit.strField);


    }





}
