// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // Стоимость билета
        int miles = service.calculate(price);

        System.out.println("Количество миль, начисленных за билет:");
        System.out.println((miles) + " миль(-я)");

    }
}