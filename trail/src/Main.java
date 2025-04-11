public class Main{
    public static void main(String[] args){
        int i,j;
        String arg = "";
        for(i = 0;i < 5;i++){
            arg = "";
            for(j = 0;j < i + 1;j++){
                arg += "*";
            }
            System.out.println(arg);
        }
        printIndexed("i an your father");
        System.out.println(stutter("what can i say"));
        int[] scores = {1,2,100,100,2};
        System.out.println(scores100(scores));
        System.out.println(scoresIncreasing(scores));
    }
    public static void printIndexed(String str){
        int Slength = str.length();
        String output = "";
        for(int i = 0;i < Slength;i++){
            if(str.charAt(i) != ' ') {
                output += str.charAt(i);
                output += Slength - i - 1;
                output += ' ';
            }
        }
        System.out.println(output);
    }
    public static String stutter(String str){
        String output = "";
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != ' ') {
                output += str.charAt(i);
                output += str.charAt(i);
            }else{
                output += ' ';
            }
        }
        return output;
    }
    public static int quatrant(int x,int y){
        if (x == 0 || y == 0)
            return 0;
        else if(y > 0 && x > 0)
            return 1;
        else if(y > 0 && x < 0)
            return 2;
        else if(y < 0 && x < 0)
            return 3;
        else
            return 4;
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



