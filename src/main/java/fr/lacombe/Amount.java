package fr.lacombe;

public class Amount {
    private final double money;

    public Amount(double money) {
        this.money = money;
    }

    String getFormatAmount() {
        return String.format("%.2f", money).replace(',', '.');
    }
}
