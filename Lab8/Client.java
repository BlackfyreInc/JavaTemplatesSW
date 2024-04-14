public class Client {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new HotWater(200), new EatInsideOrder());
        Coffee blackCoffee = new Coffee(3, new HotWater(200), new TakeawayOrder(), true);
        Tea blackTea = new Tea(0, new HotWater(300), new EatInsideOrder());

        beverageData(blackChocolate);
        beverageData(blackCoffee);
        beverageData(blackTea);

        Chocolate milkChocolate = new Chocolate(3, new Milk(200), new TakeawayOrder());
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200), new EatInsideOrder(), false);
        Tea teaWithMilk = new Tea(2, new Milk(300), new TakeawayOrder());

        beverageData(milkChocolate);
        beverageData(coffeeWithMilk);
        beverageData(teaWithMilk);
    }

    private static void beverageData(Beverage beverage) {
        beverage.prepare();
        System.out.printf("Cost is %s EUR\n",  beverage.cost());
        beverage.drink();
    }

}
