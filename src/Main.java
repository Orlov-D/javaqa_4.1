public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Бонус= " + miles);

        price = 3015;
        miles = service.calculate(price);
        System.out.println("Бонус= " + miles);

        miles = service.calculate(5100);
        System.out.println("Бонус= " + miles);
    }
}