public class BonusMilesService {
    public int calculate(int cost) {
        int bonus;
        if (cost % 20 == 0) {
            bonus = cost / 20;
        } else {
            bonus = (cost - cost % 20) / 20;
        }
        return bonus;
    }
}
