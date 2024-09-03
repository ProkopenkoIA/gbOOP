public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Владимир");
        Human human2 = new Human("Олег");
        Human human3 = new Human("Сергей");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}