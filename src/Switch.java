public class Switch {
    public static void main(String[] args) {
        int date = 1; //print the date according to the number given
        String day;
        switch(date){
            case 0:
                day = "Monday";
                System.out.println("Today is " + day);
                break;
            case 1:
                day = "Tuesday";
                System.out.println("Today is " + day);
                break;
            case 2:
                 day = "Wednesday";
                System.out.println("Today is " + day);
                break;
            case 3:
                 day = "Thursday";
                System.out.println("Today is " + day);
                break;
            case 4:
                day = "Friday";
                System.out.println("Today is " + day);
                break;
            case 5:
                 day = "Saturday";
                System.out.println("Today is " + day);
                break;
            case 6:
                 day = "Sunday";
                System.out.println("Today is " + day);
                break;
            default:
                System.out.println("I don't know what day it is today!");
        }

        int score = 5; //range of scores is from 1-5 and print out the grade corralated with the score
        char grade;
        switch(score){
            case  1:
                grade = 'F';
                System.out.println("My grade " + score);
                break;
            case  2:
                grade = 'D';
                System.out.println("My grade " + score);
                break;
            case  3:
                grade = 'C';
                System.out.println("My grade " + score);
                break;
            case 4:
                grade = 'B';
                System.out.println("My grade " + score);
                break;
            case  5:
                grade = 'A';
                System.out.println("My grade " + score);
                break;
            default:
                System.out.println("I don't know what grade you got");
        }

    }
}
