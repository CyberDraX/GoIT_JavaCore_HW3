public class SaveStarShip {

    public int calculateDistance(int distance) {
        return distance > 0 ? distance : distance / -1;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}