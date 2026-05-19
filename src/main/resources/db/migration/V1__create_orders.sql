CREATE TABLE IF NOT EXISTS orders.orders (
    id VARCHAR(36) PRIMARY KEY,
    account_id VARCHAR(36) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    total_usd NUMERIC(12, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS orders.order_items (
    id VARCHAR(36) PRIMARY KEY,
    order_id VARCHAR(36) NOT NULL REFERENCES orders.orders(id) ON DELETE CASCADE,
    product_id VARCHAR(36) NOT NULL,
    quantity INTEGER NOT NULL,
    unit_price_usd NUMERIC(12, 2) NOT NULL,
    total_usd NUMERIC(12, 2) NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_orders_account_id ON orders.orders(account_id);
CREATE INDEX IF NOT EXISTS idx_order_items_order_id ON orders.order_items(order_id);
