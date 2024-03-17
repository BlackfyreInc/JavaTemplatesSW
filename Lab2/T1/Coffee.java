public class Coffee extends Calculations {
    final Integer ESPRESSO_COST = 35;
    final Integer AMERICANO_COST = 40;
    final Integer CAPPUCCINO_COST = 50;
    final Integer LATTE_COST = 50;

    @Override
    public Drink createDrink(TypeOfDrink type) {
        Drink result;

        switch (type) {
            case ESPRESSO -> result = new Espresso(ESPRESSO_COST);
            case AMERICANO -> result = new Americano(AMERICANO_COST);
            case CAPPUCCINO -> result = new Cappuccino(CAPPUCCINO_COST);
            case LATTE -> result = new Latte(LATTE_COST);
            default -> result = null;
        }

        return result;
    }
}