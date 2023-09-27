package chap12.sec01.exam08;

import java.util.Objects;

/**
 * packageName : chap12.sec01.exam08
 * fileName : Student
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class Student {
//    TODO : 속성, 생성자 , 함수
    public int sno; // 학번
    public String name; // 이름

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

    @Override
    public String toString() {
        return ("학번 : " + sno + " , " + "이름 : " + name);
    }
}
