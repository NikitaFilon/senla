package taskFive;

import taskFive.bean.Item;
import taskFive.bean.ItemList;
import taskFive.bean.Vault;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ItemSorter knapsack = new ItemSorter();
        List<Item> items = ItemList.createItemDatabase();
        Vault vault = new Vault(7);
        System.out.println("Source items: ");
        System.out.println(items);
        System.out.println("Safe size = " + vault.getVolume());
        ArrayList<Item> result = knapsack.solutionKnapsack(vault,items);
        System.out.println("The optimal solution:");
        for (Item item : result) {
            System.out.println(item);
        }
    }

}
