import java.util.*;
/*
 * 프로그래머스 - 두개 뽑아서 더하기
 */
class addSelectedTwoNumbers {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(!al.contains(sum)){
                    al.add(sum);
                }
            }
        }

        Collections.sort(al);
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}
