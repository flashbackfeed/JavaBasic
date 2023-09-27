package chap12.sec01.verify.exam04;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : Board
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class Board {
    private String title;
    private String Content;
// TODO : 기본생성자, 풀 생성자
    public Board() {
    }

    public Board(String title, String content) {
        this.title = title;
        Content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return Content;
    }
}
