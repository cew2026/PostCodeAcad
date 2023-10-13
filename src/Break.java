public class Break {
    public static void main(String[] args) {
       int numPrint = 0;
       for(int x =0; x <= 100; x++){
           if(x%2==0){
               System.out.println(x +" ");
               numPrint +=1;
           }
           if(numPrint==10){
               break;
           }
       }
    }
}
