import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5,};
        int counter = 0;
        int max = 0;
        for (int n = 0; n < numbers.length; n++) {
            System.out.println("n:"+numbers[n]);
         counter = counter + numbers[n];
         System.out.println("counter"+counter);
         if (numbers[n] > max){
             max = numbers[n];
            }
         System.out.println(max + " is the greatest number in the array");
        }





    }
}
