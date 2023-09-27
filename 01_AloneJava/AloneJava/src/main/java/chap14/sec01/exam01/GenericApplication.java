package chap14.sec01.exam01;

/**
 * packageName : chap14.sec01.exam01
 * fileName : GenericApplication
 * author : GGG
 * date : 2023-09-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
import java.util.ArrayList;

public class GenericApplication {
    public static void main(String[] args) {
//        TODO: 여기부터 코딩
//   TODO : 제네릭 : 향상된 배열에서 자료를 추가할 때 자료형을 제한하는 것
//        사용법 : List<제한할자료형> list = new ArrayList<>();
//           부모 : Product, 자식 : Tv, Audio 클래스
        ArrayList<Product> productArrayList = new ArrayList<>();
        ArrayList<Tv> tvArrayList = new ArrayList<>();
//      TODO : 1) 아래 에러
//        ArrayList<Product> tvArrayList = new ArrayList<Tv>(); 자료형이 일치하지 않음

//      TODO : 2) productArrayList : 부모 클래스 배열에 자식 넣기 ?
        productArrayList.add(new Tv()); // o
        productArrayList.add(new Audio()); // o
        
//      TODO : 3) tvArrayList : 당연히 Tv 객체만 배열에 추가 가능함
        tvArrayList.add(new Tv());

        System.out.println("--- 함수의 매개변수에 제네릭 사용 ---");
        printAll(productArrayList); // 당연함
//      TODO : 에러 발생 : 부모라도 자식클래스는 안됨 : 대상 클래스만 가능
//         printAll(tvArrayList);

        System.out.println("----- 제네릭의 특수한 형태 -----");
        System.out.println("----- <> -----");
//      TODO : <? extends Tv> : Tv의 자식 클래스만 가능함 (부모 x)
        printAll2(tvArrayList); // o
//      printAll2(productArrayList); // x (부모 안됨)

        System.out.println("---- <? super Product> ----");
//      TODO : <? super Product> : Product의 부모 클래스만 가능함(자식 x)
        printAll3(productArrayList); // o
//      printAll3(tvArrayList); // x (자식 안됨)
        System.out.println("------ <?> ------");
//      TODO : <?> : 모든 자료형이 가능
        printAll4(productArrayList); // o
        printAll4(tvArrayList); // o

    }


    public static void printAll(ArrayList<Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll2(ArrayList<? extends Tv> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll3(ArrayList<? super Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll4(ArrayList<?> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }
}

