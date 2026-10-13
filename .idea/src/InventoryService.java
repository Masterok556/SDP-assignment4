import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private final Map<String, Integer> stock = new HashMap<>(
            Map.of("book", 5, "phone", 2)
    );

    private final Map<String, Integer> prices = Map.of(
            "book", 20,
            "phone", 100
    );

    public int getTotalPrice(String product, int quantity) {
        if (!prices.containsKey(product) || quantity <= 0) {
            return -1;
        }

        return prices.get(product) * quantity;
    }

    public boolean reserve(String product, int quantity) {
        int available = stock.getOrDefault(product, 0);

        if (quantity <= 0 || available < quantity) {
            return false;
        }

        stock.put(product, available - quantity);
        return true;
    }

    public void release(String product, int quantity) {
        int current = stock.getOrDefault(product, 0);
        stock.put(product, current + quantity);
    }
}