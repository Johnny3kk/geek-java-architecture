package HomeWork4;

import java.math.BigDecimal;

public class DoubleExtra extends Extra {

    public DoubleExtra(Order order, String name, BigDecimal price) {
        super(order, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price.multiply(new BigDecimal(2)).add(order.getPrice());
    }

    @Override
    public String getName() {
        return order.getName() + " with double " + this.name;
    }

}
