package HomeWork4;

import java.math.BigDecimal;

public class FreeExtra extends Extra {

    public FreeExtra(Order order, String name, BigDecimal price) {
        super(order, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return order.getPrice();
    }

}
