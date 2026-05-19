package store.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product", url = "${clients.product.url}")
public interface ProductClient {

    @GetMapping("/products/{id}")
    ProductSnapshotOut findById(@PathVariable String id);

}
