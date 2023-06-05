public class Main {
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order("", "", 0, 0);
        Filler filler = new Filler();
        filler.inputFromConsole(order);
        Saver saver = new Saver();
        saver.saveToJson(order);
    }
}