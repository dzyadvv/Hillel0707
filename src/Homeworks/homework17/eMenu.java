package Homeworks.homework17;

public enum eMenu {
    СОУС("1", 10),
    СЫР("2", 20),
    КОТЛЕТА("3", 30);

    final String number;
    final int price;

    eMenu(String number, int price) {
        this.number = number;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

}
