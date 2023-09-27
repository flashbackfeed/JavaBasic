package chap06.sec02.verify;

/**
 * packageName : chap06.sec02.verify
 * fileName : MemberApplication
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

/**
 * Member 객체를 생성하고 속성에 아래의 값으로 저장한 후 속성의 값을 출력하세요
 * 결과 :
 *      이름 : 최하얀
 *      id : 23
 */
public class MemberApplication {
    public static void main(String[] args) {
//        객체 생성
//        사용법 : 클래스명 객체변수명 = new 생성자함수();
      Member member = new Member();
      member.id = "23";
      member.name= "최하얀";
        System.out.println("id :" +member.id);
        System.out.println("name :"+member.name);
    }
}
