package Methods;
import java.util.*;

public class arrEvenNumber {
    
    public static void main(String[] args) {

        int input = 10;
        int result = makeItHalf(input);
        System.out.println(result);

        int input_v2 = 20;
        makeItHalf_v2(input_v2);
        System.out.println(input_v2);

        Data newData = new Data();
        newData.number = 200;
        makeItHalf(newData);
        System.out.println(newData.number);
        
    }

    public static int makeItHalf(int num) 
    {
        int number = num / 2;
        return number;
    
    }

    public static void makeItHalf_v2(int num)
    {
        num = num / 2;
    }

    public static void makeItHalf(Data newData)
    {
        newData.number = newData.number / 2 ;
    }

}


