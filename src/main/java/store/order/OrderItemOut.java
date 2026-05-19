package store.order;

import java.math.BigDecimal;

public record OrderItemOut(
    String id,
    ProductRefOut product,
    int quantity,
    BigDecimal total
) {
}
