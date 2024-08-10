import java.util.Scanner;

public class E1919 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] str1_arr = new int[26];
        int[] str2_arr = new int[26];

        for(int i=0; i<str1.length(); i++){
            str1_arr[str1.charAt(i) - 'a']++;
        }

        for(int j=0; j<str2.length(); j++){
            str2_arr[str2.charAt(j) - 'a']++;
        }

        int count = 0;
        for(int k=0; k<26; k++){
            count += Math.abs(str1_arr[k]-str2_arr[k]);
        }

        System.out.println(count);
    }
}
