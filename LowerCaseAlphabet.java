import java.util.Scanner;
public class LowerCaseAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findPairs(str));
    }

    public static int findPairs(String str) {
        int count_a = 0,result = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a') {
                count_a++;
            } else if(str.charAt(i) == 'g') {
                result += count_a;
            }
        }
        return result;
    }
}