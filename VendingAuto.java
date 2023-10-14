import java.util.List;

interface VendingAuto {


    default void initDrinks(List<HotDrink> dr) {
    }

    default Drink getDrink(String name) {
        return null;
    }


}
