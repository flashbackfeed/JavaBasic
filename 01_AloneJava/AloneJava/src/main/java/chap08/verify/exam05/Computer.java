package chap08.verify.exam05;

/**
 * packageName : chap08.verify.exam05
 * fileName : Computer
 * author : GGG
 * date : 2023-09-22
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn()
    {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff()
    {
        System.out.println("전원을 끕니다.");
    }
}

