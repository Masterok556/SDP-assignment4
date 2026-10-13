public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();

        System.out.println(facade.placeOrder("book", 4, "")? "Order placed successfully" : "Order failed");
        System.out.println(facade.placeOrder("book", 4, "Astana")? "Order placed successfully" : "Order failed");
        System.out.println(facade.placeOrder("phone", 2, "Astana")? "Order placed successfully" : "Order failed");
        System.out.println(facade.placeOrder("book", 2, "Almaty")? "Order placed successfully" : "Order failed");
    }
}