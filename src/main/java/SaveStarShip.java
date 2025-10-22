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

    public int calculateFuelPrice(String fuel, int count) {

        int price;
        switch (fuel) {
            case "STAR100":
                price = count * 70;
                break;
            case "STAR500":
                price = count * 120;
                break;
            case "STAR1000":
                price = count * 200;
                break;
            default:
                price = count * 50;
        }
        return price;
    }

    public int roundSpeed(int speed) {
        
        int roundedSpeed = 0;
        if (speed >= 10 && speed <= 89) {
            roundedSpeed = Math.round(speed / 10f) *10;
        }
        return roundedSpeed;
    }

    public int calculateNeededFuel(int distance) {

        int distanceCount = 1000;
        if (distance > 20) {
            return distanceCount + (distance - 20) * 5;
        } else {
            return distanceCount;
        }
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));
    }
}