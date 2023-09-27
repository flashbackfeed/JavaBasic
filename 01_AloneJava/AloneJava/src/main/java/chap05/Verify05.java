package chap05;

import java.util.ArrayList;

/**
 * packageName : chap05
 * fileName : Verify05
 * author : GGG
 * date : 2023-09-19
 * description : 배열 / 열거형 연습문제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Verify05 {
    /**
     * 연습문제 : 주어진 배열에서 최대값을 구해보세요.
     * //  결과
     *     max: 8
     *    1) max 변수 = 0
     *    2) 반복문 돌려서 max < array[i] => max = array[i]
     *    3) 반복문 종료하면 max 값에는 최대값이 들어가있음
     */

    public void exam04(){
        int[] array = {1,5,3,8,2};
        int max = 0; // 최소값으로 초기화
        for(int i=0; i<array.length; i++){
           if(max < array[i]){ // max 값을 비교 : 작으면 큰값을 넣기
               max = array[i];
           }
        }
//        최종적으로 최대값이 max에 들어가있음
        System.out.println("max : " + max);



    }
    /**
     * 연습문제 : 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균을 구해보세요.
     * 힌트 : 배열변수.length
     */
    public void exam05(){
        int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
       int sum = 0; // 합계 변수
       double avg = 0.0; // 평균 변수
       int count = 0; // 배열의 원소 개수 세는 변수
        for(int i=0; i < array.length; i++){
//            i = 0; {95,86} j = 0; 일때 95 j = 1; 일때 86
//            i = 1; {83,82,96} j = 0; 일때 83 j =1; 일때 82
//            ...
            for(int j=0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                count++; // 배열 원소 갯수 세기
            }
        }
        avg = (double) sum/count;
        System.out.println(sum);
        System.out.println(avg);
    }


}
