package HomeWork4;

import java.math.BigDecimal;

public abstract class Extra implements Order {

    protected Order order;

    protected String name;

    protected BigDecimal price;

    public Extra(Order order, String name, BigDecimal price) {
        this.order = order;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return order.getName() + " with " + this.name;
    }

    @Override
    public abstract BigDecimal getPrice();
}
