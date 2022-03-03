package taskFive;

import taskFive.bean.Item;
import taskFive.bean.Vault;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    public  void solutionKnapsack(Vault vault, List<Item> items) {

        int count = items.size();
        int maxWeight = vault.getVolume();

        int[][] A;
        A = new int[count + 1][];
        for (int i = 0; i < count + 1; i++) {
            A[i] = new int[maxWeight + 1];
        }

        for (int k = 0; k <= count; k++) {
            for (int s = 0; s <= maxWeight; s++) {
                if (k == 0 || s == 0) {
                    A[k][s] = 0;
                } else {
                    if (s >= items.get(k - 1).getVolume()) {
                        A[k][s] = Math.max(A[k - 1][s], A[k - 1][s - items.get(k - 1).getVolume()] + items.get(k - 1).getPrice());
                    } else {
                        A[k][s] = A[k - 1][s];
                    }
                }
            }
        }

        ArrayList<Item> result = new ArrayList<>();
        traceResult(A, items, count, maxWeight, result);

        System.out.println("The optimal solution:");
        for (Item item : result) {
            System.out.println(item);
        }
    }

    private  void traceResult(int[][] A, List<Item> items, int k, int s, ArrayList<Item> result) {
        if (A[k][s] == 0) {
            return;
        }
        if (A[k - 1][s] == A[k][s]) {
            traceResult(A, items, k - 1, s, result);
        } else {
            traceResult(A, items, k - 1, s - items.get(k - 1).getVolume(), result);
            result.add(items.get(k));
        }
    }
}
