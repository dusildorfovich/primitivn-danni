public class BonusMilesService {
    public int calculate(int ticketCost) {
        int rubForMile = 20;
        int bonusMile = ticketCost / rubForMile;
        return bonusMile;
    }

}
