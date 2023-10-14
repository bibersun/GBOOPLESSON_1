import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<HotDrink> drinks = new ArrayList<>();
        drinks.add(new HotDrink("Кофе капучино", 200, 120, 70));
        drinks.add(new HotDrink("Какао", 250, 150, 75));
        drinks.add(new HotDrink("Чай зелёный", 500, 100, 80));
        HotVA va = new HotVA("ТЦ", drinks);
        ArrayList<HotDrink> drinks2 = new ArrayList<>();
        drinks2.add(new HotDrink("Кофе капучино", 200, 120, 70));
        drinks2.add(new HotDrink("Какао", 250, 150, 75));
        drinks2.add(new HotDrink("Чай чёрный", 500, 100, 80));
        HotVA va2 = new HotVA("ТЦ2", drinks2);
        String s = "Чай чёрный";
        HotDrink hotDrink = va.getDrink(s);
        String s2 = "Чай чёрный";
        HotDrink hotDrink2 = va2.getDrink(s2);
        if (hotDrink == null){
            System.out.printf("Напитка %s нет в %s%n",s, va.getName());
        } else {
            System.out.printf("Напиток %s выдан в %s%n", hotDrink.getName(), va.getName());
        }
        if (hotDrink2 == null){
            System.out.printf("Напитка %s нет в %s%n", s2, va2.getName());
        } else {
            System.out.printf("Напиток %s выдан в %s%n", hotDrink2.getName(), va2.getName());
        }
    }


}
