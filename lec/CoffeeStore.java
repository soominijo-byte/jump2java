public class CoffeeStore {
    public static void main(String[] args) {
        CoffeeM coffeeM = new CoffeeM();
        coffeeM.insertItem(CoffeeType.CAFE_LATTE.name(), 1000);
        coffeeM.insertItem(CoffeeType.ICE_AMERICANO.name(), 1500);
        coffeeM.insertItem(CoffeeType.AMERICANO.name(), 1200);
        for(String itemName : coffeeM.itemlist.keySet()){
            System.out.println(itemName + " : " + coffeeM.itemlist.get(itemName));
        }
        System.out.println(coffeeM.insertMoney(10000));
        System.out.println(coffeeM.withdrawMoney(1000));
        coffeeM.sellItem(CoffeeType.CAFE_LATTE.name(), 5000);

    }
}
