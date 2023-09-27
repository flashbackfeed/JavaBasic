package chap12.sec01.exam01;

/**
 * packageName : chap12.sec01.exam01
 * fileName : SolutionApplication
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

import java.util.List;

/**
 * 입출력 예
 * n	k	result
 * 10	3	[3, 6, 9]
 * 15	5	[5, 10, 15]
 */
public class SolutionApplication {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> answer = solution.solution(10,3);
        System.out.println(answer);
    }
}
