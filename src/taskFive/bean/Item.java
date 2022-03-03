package taskFive.bean;

public class Item {
    private final String name;
    private final int volume;
    private final int price;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", volume = " + volume
                + ", price = " + price;
    }

    public int getPrice() {
        return price;
    }

    public Item(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }


}
