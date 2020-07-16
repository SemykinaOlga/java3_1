public class Mili {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 150000;
        int mili = service.calculate(cost);
        System.out.println(mili);
    }
}
