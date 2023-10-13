public class conditionals {
    public static void main(String[] args) {

      //checking if number is even or odd
        int num = 17;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

      //checking if number is positive or negative
        if(num > 0){
            System.out.println(num + " is positive");
        }else{
            System.out.println(num + " is negative");
        }
     //checking if number is prime
        boolean isPrime = true;
            for(int x = 2; x < 100 ; x++){
                if (num % x == 0 ){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
               System.out.println(num + " is not prime");
            }else{
                System.out.print(num + " is prime");
            }
        }



        }







