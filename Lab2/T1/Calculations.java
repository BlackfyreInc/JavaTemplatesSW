import java.util.List;

public abstract class Calculations {

    public Integer calculateAllPrices(List<Drink> items) {
        Integer result = 0;

        for (Drink item : items) {
            result += item.getPrice();
        }

        return result;
    }

    public Integer getAllCosts(List<Drink> items) {
        Integer result = 0;

        for (Drink item : items) {
            result += item.getCost();
        }

        return result;
    }

    public abstract Drink createDrink(TypeOfDrink type);

}

