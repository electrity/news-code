import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers. */
    public static int sum(List<Integer> L) {
        int sum = 0;
        if (L == null) { // 确保 if 后有空格
            return 0;
        }
        for (int i : L) { // for 后有空格，{ 与条件同一行
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list. */ // 顶格注释
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> list = new ArrayList<>();
        for (int i : L) { // for 后有空格
            if (i % 2 == 0) { // if 后有空格，条件表达式空格正确
                list.add(i);
            }
        }
        return list;
    }

    /** Returns a list containing the common items of the two given lists. */ // 修正：item → items（复数）
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> list = new ArrayList<>();
        for (int i : L1) { // for 后有空格
            for (int j : L2) { // for 后有空格
                if (i == j) { // if 后有空格
                    list.add(j);
                }
            }
        }
        return list;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */ // 顶格注释
    public static int countOccurrencesOfC(List<String> words, char c) {
        int total = 0;
        for (String word : words) { // for 后有空格
            for (int i = 0; i < word.length(); i++) { // for 后有空格
                if (word.charAt(i) == c) { // if 后有空格
                    total++;
                }
            }
        }
        return total;
    }
}