package Varargs;

public class CountEvens {
    
    static int countEvenNumbers(int...arr)
    {
        int count = 0;
        for(int num : arr)
        {
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static void printTeamNames(String...names)
    {
        System.out.println("Printing Team Members Name");
        int count = 1;
        for(String name : names)
        {
            System.out.println("Member " + count + " " + name);
            count++;
        }
    }

    static int countNofKeys(int key,int...arr)
    {
        int count = 0;
        for(int num : arr)
        {
            if(key == num)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {

        System.out.print(countEvenNumbers(1,2,3,4,5,6));

        System.out.println();

        System.out.println(countNofKeys(20,20,10,20,30,20,40,20));

        System.out.println();

        String[] names = new String[]{"Balakrishna" ,"Shashank","Athrav","Thippesh","Adarsh"};
        printTeamNames(names);
    }
}
