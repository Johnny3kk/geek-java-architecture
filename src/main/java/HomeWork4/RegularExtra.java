package HomeWork4;

import java.math.BigDecimal;

public class RegularExtra extends Extra {

    public RegularExtra(Order order, String name, BigDecimal price) {
        super(order, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price.add(order.getPrice());
    }
}
