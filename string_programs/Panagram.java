package string_programs;

import java.util.HashSet;
import java.util.Set;

//Sentence contains all letters from a to z or A to Z;
public class Panagram {

    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(panagramOrNOt(str));
    }

    static boolean panagramOrNOt(String str){
       Set<Character> set = new HashSet<>();
       char[] charArr = str.toCharArray();
       for(char ch:charArr){
           if(ch>='a' && ch<='z'){
             set.add(ch);
           }
           if(ch>='A' && ch<='Z'){
               ch = Character.toLowerCase(ch);
               set.add(ch);
           }
       }
       return (set.size()==26);
    }
}
