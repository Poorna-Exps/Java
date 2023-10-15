package string_programs;

import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {
        String str = "Welcome to Open Text Poorna";
        //str = str.replaceAll(" ","");
        char[] charArr = str.toCharArray();


        System.out.println("Char arr lenght:- "+charArr.length);

        for(int i=0;i<charArr.length;i++){

            int count = 0;
            for(int j=0;j<charArr.length;j++){
//                String chari = Character.toString(charArr[i]);
//                String charj = Character.toString(charArr[j]);
//                System.out.println(chari+" "+charj);
                if(charArr[i] == charArr[j]){
                    count = count+1;
                }
            }
            System.out.println(charArr[i]+" is repeated "+count+" times");
        }
    }
}
