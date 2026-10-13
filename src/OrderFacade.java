public class OrderFacade {
    private final InventoryService inventory = new InventoryService();
    private final PaymentProccesor payment = new PaymentProccesor();
    private final ShippingService shipping = new ShippingService();

    public boolean placeOrder(String product, int quantity, String address) {
        int totalPrice = inventory.getTotalPrice(product, quantity);

        if (totalPrice <= 0) {
            return false;
        }

        if (!inventory.reserve(product, quantity)) {
            return false;
        }

        if (!payment.pay(totalPrice)) {
            inventory.release(product, quantity);
            return false;
        }

        if (!shipping.createShipment(product, quantity, address)) {
            payment.refund(totalPrice);
            inventory.release(product, quantity);
            return false;
        }

        return true;
    }
}