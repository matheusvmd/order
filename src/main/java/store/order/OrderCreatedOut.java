package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderCreatedOut(
    String id,
    LocalDateTime date,
    List<OrderItemOut> items,
    BigDecimal total
) {
}
