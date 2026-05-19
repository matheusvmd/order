package store.order;

import java.math.BigDecimal;

public record ProductSnapshotOut(
    String id,
    String name,
    BigDecimal price,
    String unit
) {
}
