package string_programs;

import java.util.*;

public class Count {

    public static void main(String[] args) {
        List<Object> list;
        Map<Object,Integer> map = new HashMap<>();
        Object[] objArr = {"obj","obj2","obj3","obj3"};
        list = Arrays.asList(objArr);
        for (Object obj:list){
            if(map.containsKey(obj)){
                int count = map.get(obj);
                map.put(obj,count+1);
            } else{
                map.put(obj,1);
            }
        }
        System.out.println(map);
    }
}
