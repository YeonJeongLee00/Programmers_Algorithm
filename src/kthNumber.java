import java.util.*;
/*

* 2020.12.24
* 프로그래머스 - k번째 수
*
* */

public class kthNumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // commands의 크기만큼 답이 나온다.
        int result = 0; // answer의 인덱스

        for (int i = 0; i < commands.length; i++){
            int k = 0;
            int [] temp = new int[commands[i][1] - commands[i][0] + 1]; // 배열카피 저장할 temp 배열
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++){
            // Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]) 대체가
                temp[k] = array[j];
                k++;
            }
            Arrays.sort(temp); // 배열 정렬
            answer[result] = temp[commands[i][2] - 1]; // 답 저장
            result++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array, commands));
    }
}
