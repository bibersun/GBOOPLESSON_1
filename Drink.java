abstract class Drink {
    protected String name;
    protected double price;
    protected int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Drink(String name, int volume, double price) {
        this.setName(name);
        this.setVolume(volume);
        this.setPrice(price);
    }

}
