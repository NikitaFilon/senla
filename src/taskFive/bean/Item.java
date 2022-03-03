package taskFive.bean;

public class Item {

    private  String name;
    private  int volume;
    private  int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(int price) {
        this.price = price;
    }

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
