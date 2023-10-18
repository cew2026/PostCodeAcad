import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //
        System.out.println("Hello world!");
        Main myApp=new Main();
        stringReverse("goodbye ");
        maxNum(4,7);
        sumNum (4,10,6,7);

    }

    private static void sumNumOne(int i, int i1) {
    }

    public Main (){
        student charlotte = new student("charlotte ",15, 99);
        student alex = new student("alex ",13, 95);
        student sean = new student("sean ",18, 90);
        student ryan = new student("ryan ", 17, 96);
        charlotte.printInfo();
        alex.printInfo();
        sean.printInfo();
        ryan.printInfo();
        int grades[] = {charlotte.grade, alex.grade, sean.grade, ryan.grade};
        int total = 0;
        for(int x = 0; x<grades.length;x++){
        total=total+grades[x];
        }
        total=total/grades.length;
        System.out.println(total+ " is the average grade");


        Person becca = new Person("becca ",18," 32 Orno, ME");
        becca.printInfo();

    }
    //parameters first section
    public static void stringReverse(String Reverse){
        for(int y = Reverse.length()-1;y >= 0;y--){
            System.out.print(Reverse.charAt(y));

        }



    }
    //printing out the bigger number
    static void maxNum(int a, int b){
        if(a>b){
            System.out.println(a+" is the bigger number");
        }else{
            System.out.println(b+" is the bigger number");
        }
    }

    static void sumNum(int a, int c, double d, double e){
        System.out.println(a+c + " is the integer number sum");
        System.out.println(d+e + " is the double number sum");

    }

}




