package Lessons.lesson13.enamExample;

public enum Country {

    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    ZIMBAVU;

    String currency;

    Country() {

    }

    Country(String currency) {
        this.currency = currency;
    }
}
