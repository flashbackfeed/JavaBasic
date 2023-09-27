package chap08.sec01.exam01;

/**
 * packageName : chap08.sec01.exam01
 * fileName : SmartTelevision
 * author : GGG
 * date : 2023-09-22
 * description : 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("스마트TV 전원을 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("스마트TV 전원을 끕니다.");

    }

    @Override
    public void search(String url) {
        System.out.println(url +"을 검색합니다.");

    }
}
