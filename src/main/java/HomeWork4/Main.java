package HomeWork4;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Order powerSupply = new Product(new Long(1), "Chieftec 850W-GRT", new BigDecimal(148));

        powerSupply = new RegularExtra(powerSupply, "Master Manual", new BigDecimal(13));
        powerSupply = new DoubleExtra(powerSupply, "Warranty", new BigDecimal(15));
        powerSupply = new FreeExtra(powerSupply, "Installation", new BigDecimal(2));

        System.out.println(powerSupply.getName());
        System.out.println(powerSupply.getPrice());
    }
}
