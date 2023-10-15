package string_programs;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(factorial(0));
        m(3);
    }
    static int factorial(int num){
        if(num==0){
            return 1;
        } else{
            return (num*factorial(num-1));
        }
    }

    static void m(int i){
        if(i == 0)
            return;
        System.out.println(i);
        m(i-1);
        System.out.println("coming out:-"+i);
    }
}
