package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author nguyenminhkhoa
 */
public class Hello {

    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        
        for(int i = 0; i < list.size(); i++){
            if(check.test(list.get(i)))
                return i;
        }     
        return -1;
    }


    
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList();
        List<Integer> numberList = new ArrayList();
        stringList.add("AA");
        stringList.add("BB");
        numberList.add(1);
        numberList.add(2);
        String s1 = "CC";
        int num = 2;
        
        if (Hello.linearSearch(stringList, s -> s.equals(s1)) == -1)
            System.out.println(s1 + " is not found on the list");
        else System.out.println(s1 + " is found at the index " + Hello.linearSearch(stringList, s -> s.equals(s1)));
        
        if (Hello.linearSearch(stringList, s -> s.equals("AA")) == -1)
            System.out.println("AA is not found on the list.");
        else System.out.println("AA is found at the index " + Hello.linearSearch(stringList, s -> s.equals("AA")));
        
        if (Hello.linearSearch(numberList, s -> s.equals(num)) == -1)
            System.out.println(num + " is not found on the list.");
        else System.out.println(num + " is found at the index " + Hello.linearSearch(numberList, s -> s.equals(num)));
        
    }
    
}
