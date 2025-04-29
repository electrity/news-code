import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> letterMap = new HashMap<>();
        // 遍历小写字母 'a' 到 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // 计算字母对应的数字
            int num = c - 'a' + 1;
            // 将字母和对应的数字放入映射中
            letterMap.put(c, num);
        }
        return letterMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i : nums){
            intMap.put(i,i*i);
        }
        return intMap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> letterMap = new HashMap<>();
        for(String word : words){
            if(letterMap.containsKey(word)) letterMap.put(word,letterMap.get(word) + 1);
            else letterMap.put(word,1);
        }
        return null;
    }
}
