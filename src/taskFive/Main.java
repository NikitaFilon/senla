package taskFive;

import taskFive.bean.Item;
import taskFive.bean.ItemList;
import taskFive.bean.Vault;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        List<Item> items = ItemList.createItemDatabase();
        Vault vault = new Vault(7);
        System.out.println("Source items: ");
        System.out.println(items);
        System.out.println("Safe size = " + vault.getVolume());
        knapsack.solutionKnapsack(vault,items);
    }

}
