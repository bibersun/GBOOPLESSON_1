import java.util.List;

public class HotVA implements VendingAuto {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<HotDrink> drinks;

    public HotVA(String name, List<HotDrink> drinks) {
        this.name = name;
        initDrinks(drinks);
    }

    public void initDrinks(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    public HotDrink getDrink(String name) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getDrink(String name, int volume) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getDrink(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getT() == temperature) {
                return drink;
            }
        }
        return null;
    }
}
