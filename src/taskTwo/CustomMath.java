package taskTwo;

public class CustomMath {

    public static void searchPrimeNumbers(double number){

        int a = 2;

        while (number !=1) {
            if (number % a == 0){
                System.out.println(a + "  ");
                number /= a;
            } else if (a == 2){
                a++;
            } else {
                a += 2;
            }
        }
    }
}
