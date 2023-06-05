public class BonusMilesService {
    int amountForBonus = 20;
    int miles;

    public int calculate(int price) {
        miles = price / amountForBonus;
        return miles;
    }
}
