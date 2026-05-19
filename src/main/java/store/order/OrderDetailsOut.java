package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderDetailsOut(
    String id,
    LocalDateTime date,
    String currency,
    List<OrderItemOut> items,
    BigDecimal total
) {
}
