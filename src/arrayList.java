import java.util.ArrayList;
import java.util.Collections;
public class arrayList {

    public static void main(String[] args) {
        int chosenNumber = 7;

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(7); //0
        numberList.add(97);//1
        numberList.add(22);//2
        numberList.add(15);//3
        numberList.add(64);//4
        numberList.add(8);//5
        numberList.add(17);//6
        numberList.add(19);//7
        numberList.add(90);//8

        numberList.remove(7);
        numberList.remove(5);

        numberList.size();

        Collections.sort(numberList);
        for (int i: numberList){
            System.out.println(i);

        }
        if(numberList.contains(chosenNumber)){
            System.out.println("your numbers contain " + chosenNumber);
        }
        System.out.println(numberList + "is " + numberList.size()+ " long");

    }
}