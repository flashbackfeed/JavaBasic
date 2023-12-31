package chap07.sec01.exam04;

/**
 * packageName : chap07.exam04
 * fileName : DmbCellPhoneApplication
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class DmbCellPhoneApplication {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("애플","검정",10);
        System.out.println("모델 : " + dmbCellPhone.model);   // 부모속성
        System.out.println("색상 : " + dmbCellPhone.color);   // 부모속성
        System.out.println("채널 : " + dmbCellPhone.channel); // 자식속성

//        전화 걸기 : 부모 기능
        dmbCellPhone.powerOn(); // 전원켜기
        dmbCellPhone.bell(); // 통화음
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요~ 반갑습니다");
        dmbCellPhone.hangUp();

//        tv 수신 : 자식 기능
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannel(12);
        dmbCellPhone.turnOffDmb();
    }
}
