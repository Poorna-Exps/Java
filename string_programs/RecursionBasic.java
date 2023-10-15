package string_programs;

public class RecursionBasic {

    public static void main(String[] args) {
        recursion(3);
    }
    static void recursion(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        recursion(n-1);
        System.out.println("Coming out of recursion:- "+n);
    }
}
