package store.order;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record CreateOrderIn(
    @NotEmpty(message = "items must not be empty")
    List<@Valid CreateOrderItemIn> items
) {
}
