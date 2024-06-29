public class JavaStringPalindrome {
    public static boolean printPalindrome(String str){
            int n = str.length();
        for(int i = 0; i<str.length(); i++){
           if(str.charAt(i) != str.charAt(n-1-i)){
               return false;
           }
        }

        return true;
    }
public static void main(String[] args) {
    String name = "abba";
    System.out.println(printPalindrome(name));
}
}
