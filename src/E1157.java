import java.util.Scanner;

public class E1157 {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            count[ch - 'A']++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        // Z -> I: 4, M: 1, P: 1, S: 4, Z: 5
        for(int i=0; i<26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            }else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}
