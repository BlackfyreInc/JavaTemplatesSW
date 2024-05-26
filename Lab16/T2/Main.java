package T3_2;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("4070", 175);
    ShopItem pencils = new ShopItem("3090", 0);
    ShopItem paper = new ShopItem("4060", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    for (ShopItem item : shop){
      System.out.println(item);
    }

    for (ItemsIterator itemsIterator = shop.itemsQuantityDescendingIterator(); itemsIterator.hasNext();){
      System.out.println(itemsIterator.next());
    }
  }
}
