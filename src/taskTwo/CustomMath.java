package taskTwo;

import java.util.ArrayList;

public class CustomMath {

    public ArrayList<Integer> searchPrimeNumbers(double number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int twoInt = 2;
        while (number !=1) {
            if (number % twoInt == 0){
                arrayList.add(twoInt);
                number /= twoInt;
            } else if (twoInt == 2){
                twoInt++;
            } else {
                twoInt += 2;
            }
        }
        return arrayList;
    }

}
