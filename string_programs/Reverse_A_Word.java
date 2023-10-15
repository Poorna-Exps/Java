package string_programs;

public class Reverse_A_Word {

    public static void main(String[] args){
        String str = "My Name Is Poorna";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        String[] arr = str.split(" ");
        //String newStr = "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<arr.length;i++){
             //newStr = newStr+word+" ";
             stringBuilder.append(arr[arr.length-i-1]).append(" ");
        }
        return stringBuilder.toString();
    }
}
