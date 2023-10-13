public class dataTypes {
    public static void main(String[] args) {
        byte red = 100;
        short orange = 1000;
        int yellow = 1000000000;
        long green = 100000000000L;
        float blue = 10.54f;
        double purple = 99.99d;
        boolean pink = true;
        char black = 'B';
//printing variables
        System.out.println(red);
        System.out.println(orange);
        System.out.println(yellow);
        System.out.println(green);
        System.out.println(blue);
        System.out.println(purple);
        System.out.println(pink);
        System.out.println(black);
//converting int to double
        double myPurple = yellow; //automatic casting
        System.out.println(myPurple);
//converting double to int
        int myYellow = (int) purple; //automatic casting
        System.out.println(myYellow);


    }
}
