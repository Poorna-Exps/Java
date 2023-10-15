package string_programs;

public class Reverse_A_String {

    public static void main(String[] args) {
        String str = "My Name Is Poorna";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        StringBuilder reverse= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(str.length()-i-1);
            reverse.append(ch);
        }
        return reverse.toString();
    }
}
