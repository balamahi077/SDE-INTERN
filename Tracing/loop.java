package Tracing;
class loop {

    public static void main(String[] args) {

    //    for(int index = 1; index <= 5;) {
    //     System.out.println("Algo ");
    //    }

    // for(;;) { //infinite
    //     System.out.println("alogo");
    // }

    //step forword by 2
    for(int index = 1; index <= 10; index+=2) { // odd
        System.out.println(index);

    }

    //step forword by 2
    for(int index = 2; index <= 10; index+=2) { //even
        System.out.println(index);
    }

    //step backword by 1
    for(int index = 10; index >= 1; index--) {
        System.out.println(index);
    }

    //step backword by 2
    for(int index = 10; index >= 1; index-=2) {
        System.out.println(index);
    }

    //other valid forms
    // 1.start from 0
    for(int index = 0; index<=5; index++) {
        System.out.println(index);
    }

    // 2.start from nagative number
    for(int index = -5; index<=5; index++) {
        System.out.println(index);
    }

    // 3.print character
    for(char index = 'A'; index <= 'Z'; index++) {
        System.out.println(index);
    }

    // 4.floating point
    for(double index = 1.1; index<=5.5; index++) {
        System.out.println(index);
    }

    // 5.infinite loop
    for(int index = 1; index<=5;) {
        System.out.println(index);
    }


    //Beginner mistakes
    //1. for(int i=5; i>=1; i++);

    

}
}