import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        int i,j;
        StringBuilder arg;
        for(i = 0;i < 5;i++){
            arg = new StringBuilder();
            for(j = 0;j < i + 1;j++){
                arg.append("*");
            }
            System.out.println(arg);
        }
        printIndexed("i an your father");
        System.out.println(stutter("what can i say"));
        int[] scores = {1,2,100,100,2};
        System.out.println(scores100(scores));
        System.out.println(scoresIncreasing(scores));
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(9);
        list.add(3);
        list.add(0);
        list.add(8);
        list.add(null);

        System.out.println(list);
    }
    public static void printIndexed(String str){
        int Length = str.length();
        StringBuilder output = new StringBuilder();
        for(int i = 0;i < Length;i++){
            if(str.charAt(i) != ' ') {
                output.append(str.charAt(i));
                output.append(Length - i - 1);
                output.append(' ');
            }
        }
        System.out.println(output);
    }
    public static String stutter(String str){
        StringBuilder output = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != ' ') {
                output.append(str.charAt(i));
                output.append(str.charAt(i));
            }else{
                output.append(' ');
            }
        }
        return output.toString();
    }
    public static boolean scoresIncreasing(int[] scores) {
        int index = 0;
        for(;index < scores.length - 1;index++){
            if(scores[index] > scores[index + 1])
                return false;
        }
        return true;
    }
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }
}



