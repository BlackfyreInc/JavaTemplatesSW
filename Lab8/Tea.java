public class Tea extends Beverage {
    public Tea(int sugar, Additive additive, OrderType orderType) {
        super(sugar, additive, orderType);
    }

    @Override
    public void prepare() {
        System.out.println("Tea");
        System.out.printf("Add %s: %s ml%n", additive.getAdditive(), additive.getVolume());
        if (sugar > 0) System.out.printf("Add sugar: %s pieces", sugar);
    }

    @Override
    public int cost() {
        int additiveCost = additive.cost();
        return 7 + additiveCost;
    }

    @Override
    public void drink() {
        String Description = "Drink tea";

        String additiveType = additive.getAdditive();
        if (!additiveType.equals("water")) {
            Description += " with " + additiveType;
        }
        Description += ", ordered to " + orderType.getOrderType();

        System.out.println(Description);
    }
}
