import java.util.Arrays;

public class SaveStarShip {

    public int calculateDistance(int distance) {
        return distance > 0 ? distance : distance / -1;
    }

    public String[] getPlanets(String galaxy) {

        String galaxyPlanets;
        if (galaxy.equals("Miaru")) {
            galaxyPlanets = "Maux, Reux, Piax";
        } else if (galaxy.equals("Milkyway")) {
            galaxyPlanets = "Earth, Mars, Jupiter";
        } else if (galaxy.equals("DangerBanger")) {
            galaxyPlanets = "Fobius, Demius";
        } else {
            galaxyPlanets = "";
        }
        return  new String[] {galaxyPlanets};
    }

    public  String choosePlanet(long distanceToEarth) {
        return distanceToEarth < 45677 ? "Earth" : "Pern";
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));
    }
}