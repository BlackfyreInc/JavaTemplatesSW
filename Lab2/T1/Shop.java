import java.util.ArrayList;
import java.util.List;

public class Shop {

    public void simulate() {
        final double MARGIN = 0.6;

        Coffee coffee = new Coffee();

        Drink espresso = coffee.createDrink(TypeOfDrink.ESPRESSO);
        Drink americano = coffee.createDrink(TypeOfDrink.AMERICANO);
        Drink cappuccino = coffee.createDrink(TypeOfDrink.CAPPUCCINO);
        Drink latte = coffee.createDrink(TypeOfDrink.LATTE);

        List<Drink> Drinks = new ArrayList<>();
        Drinks.add(americano);
        Drinks.add(latte);
        Drinks.add(espresso);
        Drinks.add(cappuccino);

        Integer revenue = getRevenue(coffee, Drinks, MARGIN);
        Integer cost = getCost(coffee, Drinks);
        Integer income = getIncome(revenue, cost);

        System.out.printf("Revenue for the day: %s UAH%n", revenue);
        System.out.printf("Spent during that day: %s UAH%n", cost);
        System.out.printf("Income for the day: %s UAH%n", income);
    }

    private Integer getRevenue(Calculations section, List<Drink> drinks, Double margin) {
        for (Drink drink : drinks) {
            drink.calculatePrice(margin);
        }

        return section.calculateAllPrices(drinks);
    }

    private Integer getCost(Calculations section, List<Drink> drinks) {
        return section.getAllCosts(drinks);
    }

    private Integer getIncome(Integer revenue, Integer cost) {
        return revenue - cost;
    }
}
