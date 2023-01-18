public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Хлеб", 30);
        Basket basket1 = new Basket();
        basket1.add("Мясо", 250);
        basket1.add("Масло", 100);
        basket1.add("Картофель", 30, 2);
        System.out.println("Средняя стоимость корзин = " + Basket.getAveregePrise());
        System.out.println("Средняя цена товара = " + Basket.getTotalCost());
        basket.print("Milk");
    }
}
