public class Mili {
    public static void main(String[] args) {
        BonusMilesService service=new BonusMilesService();
        int price=150000;
        int mili=service.calculate(price);
        System.out.println(mili);
    }
}
