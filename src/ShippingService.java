import java.util.ArrayList;
import java.util.List;

public class ShippingService {
    private final List<String> shipments = new ArrayList<>();

    public boolean createShipment(
            String product,
            int quantity,
            String address
    ) {
        if (address == null || address.isBlank()) {
            return false;
        }

        String shipment = quantity + " x " + product
                + " -> " + address;

        shipments.add(shipment);
        return true;
    }
}