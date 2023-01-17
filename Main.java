public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Хлеб", 30);
        Basket basket1 = new Basket();
        basket1.add("Мясо", 250);
        basket1.add("Масло", 100);
        System.out.println("Средняя стоимость корзин = " + Basket.getAveregePrise());
        System.out.println(Basket.getCount());
        basket.print("Milk");
    }
}
