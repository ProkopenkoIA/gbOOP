import java.util.ArrayList;

public class Main {
    public static void main (String[] args)
    {
        HotDrink drink1 = new HotDrink("Водичка", 10, 150, 20);
        HotDrink drink2 = new HotDrink("Чай", 15.50, 200, 60);
        HotDrink drink3 = new HotDrink("Кофе", 35.5, 120, 50);

        System.out.println(drink1.toString());
        System.out.println(drink2.toString());
        System.out.println(drink3.toString());
        //System.out.println();

        ArrayList<Product> arrayList = new ArrayList<>();

        arrayList.add(drink1);
        arrayList.add(drink2);
        arrayList.add(drink3);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(arrayList);



        HotDrink getDrink= vendingMachine.getProduct("Чай", 200,60);

        if (getDrink != null){
            System.out.println("Вы купили:");
            System.out.println(getDrink.toString());
        }
        else {
            System.out.println("Такго напитка нет в автомате.");
        }
    }
}