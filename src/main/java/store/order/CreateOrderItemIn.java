package store.order;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CreateOrderItemIn(
    @NotBlank(message = "idProduct is required")
    String idProduct,

    @Min(value = 1, message = "quantity must be greater than zero")
    int quantity
) {
}
