public class HotDrink extends Drink {
    protected int t;

    public int getT() {
        return this.t;
    }

    public void setT(int t) {
        this.t = t;
    }


    public HotDrink(String name, int volume, double price, int t) {
        super(name, volume, price);
        this.t = t;

    }

    public String toPrint() {
        return String.format("%s - %d мл - %.2f руб - температура %d градусов\n", this.getName(), this.getVolume(),
                this.getPrice(), this.getT());
    }


}
