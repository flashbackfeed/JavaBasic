package chap06.sec04.verify.exam03;

/**
 * packageName : chap06.sec04.verify.exam03
 * fileName : MemberService
 * author : GGG
 * date : 2023-09-20
 * description : 멤버 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class MemberService {

// TODO : login 함수 : id 가 "hong" 이고(&&) password 가 "12345" => true 리턴
//                                                          아니면 false 리턴

    boolean login(String id, String pwd){
        if(id.equals("hong") && pwd.equals("12345") ){
            return true;
        } else {
            return false;
        }

    }

    void logout(String id){
        if (id.equals("hong")){
            System.out.println(id + "이 로그아웃 되었습니다. ");
        }


    }
}
