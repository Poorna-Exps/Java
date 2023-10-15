package string_programs;

public class Palindrom {

    public static boolean isPalindrome(int x) {
        int reverse=0,rem = 0;
        int temp = x;
        while (x>0){
            rem = x%10;
            reverse = (reverse*10)+rem;
            x = x/10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        int number = 1221;
        boolean result =isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result); // Output: true
    }
}
