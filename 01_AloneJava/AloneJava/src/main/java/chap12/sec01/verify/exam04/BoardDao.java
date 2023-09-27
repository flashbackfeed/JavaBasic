package chap12.sec01.verify.exam04;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : BoardDao
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
public class BoardDao {

    public List<Board> createDept(){

        List<Board> boards = new ArrayList<>();

        boards.add(new Board("제목1","내용1"));
        boards.add(new Board("제목2","내용2"));
        boards.add(new Board("제목3","내용3"));
        return boards;
    }
}
