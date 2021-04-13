import java.util.HashMap;
/*
* 프로그래머스 - 위장
* */
class Camouglage {
    public int Solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            int num = 1;
            if(hs.containsKey(clothes[i][1])){
                num = hs.get(clothes[i][1]) + 1;
            }
            hs.put(clothes[i][1], num);
        }

        Object[] val = hs.values().toArray();
        for (int i = 0; i <val.length ; i++) {
            answer = answer * ((int)val[i] + 1);
        }

        return answer - 1;
    }
}