package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderSummaryOut(
    String id,
    LocalDateTime date,
    BigDecimal total
) {
}
