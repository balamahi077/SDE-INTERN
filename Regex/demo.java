package Regex;

public class demo {

    /*
        1).(dot) --> matches any single character (except new line)
            ex: 'a' is matched with regex .

        2)[abc] --> matches exactly one character from given set
            ex: 'a' --> [abc] --> o/p true
                'ab' --> [abc] --> o/p false
                'abc' --> [abc] --> o/p false

        3)[abc][vz] --> First char must be 'a' or 'b' or 'c'
                        second char must be 'v' or 'z'

        4)[^abc] --> matches | not matches

        5)[a-z1-7] --> matches any lowercase letter, any digits 1 to 7

        6)[A|B] --> matches 'A' or 'B'

        7)XZ --> matches exact sequence
    */
    
    public static void main(String[] args) {
        
        pratice();
    }

    public static void pratice()
    {
        String text = "a";

        // 1
        System.out.println(text.matches(".")); // any Character

        //2
        System.out.println("a".matches("[abc]"));

        //3
        String name = "Balakrishna";
        System.out.println(name.matches("[B]"));
        
    }

}
