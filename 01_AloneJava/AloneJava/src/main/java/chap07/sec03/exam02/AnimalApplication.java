package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : AnimalApplication
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
public class AnimalApplication {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("------------------------");
//       TODO : 2번째 사용목적 : 다형성 이용
        Animal animal = new Dog();
        animal.sound(); // 멍멍
        animal = new Cat();
        animal.sound(); // 야옹
        


    }



}
