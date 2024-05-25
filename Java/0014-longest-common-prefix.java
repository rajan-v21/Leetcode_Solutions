import java.util.Scanner;

class LongestCommonPrefix {
    public String common(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        //stringbuilder is faster than string bcz stringbuilder is mutable
        //but string is immutable
        for(int i = 0; i < n; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else break;
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i = 0; i< strs.length; i++){
            res = common(res, strs[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for(int i = 0; i < n; i++){
            strs[i] = sc.next();
        }
        System.out.println(obj.longestCommonPrefix(strs));
        sc.close();
    }
}