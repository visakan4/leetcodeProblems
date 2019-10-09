import java.util.HashMap;

public class JewelStone {

    /**
     * Leetcode: https://leetcode.com/problems/jewels-and-stones/submissions/
     * Percentage: 93.48%
     * Runtime : 1ms
     */

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashMap<Character,Integer> jewels = new HashMap<>();
        char[] jewelsArray = J.toCharArray();
        char[] stonesArray = S.toCharArray();
        int jewelsLength = jewelsArray.length;
        int stonesLength = stonesArray.length;
        if (jewelsLength == 0 || stonesLength == 0 ){
            return count;
        }
        for (int i = 0; i < jewelsArray.length; i++){
            jewels.put(jewelsArray[i],1);
        }
        for (int j = 0; j < stonesArray.length; j++){
            if (jewels.containsKey(stonesArray[j])){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        JewelStone jewelStone = new JewelStone();
        System.out.println(jewelStone.numJewelsInStones("","ZZ"));
    }
}
