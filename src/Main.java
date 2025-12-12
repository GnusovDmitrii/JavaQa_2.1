public class Main {
    public static void main(String[] args) {

        int priceTicket = 13676;                          // стоимость билета
        int numberBonusRubles = 20;                        // количество рублей для одной бонусной мили
        int numberMiles = priceTicket / numberBonusRubles; // количество начисленных миль

        System.out.println("Вам начисленно: " + numberMiles + " бонусных милей");
    }
}
