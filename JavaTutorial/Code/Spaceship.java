public class Spaceship {
    public String name;
    public long distance;

    public Spaceship(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println(String.format("Spaceship Name: %s", name, name));
        System.out.println(String.format("Spaceship Distance: %d", distance));
        System.out.println("-----------------------------------");
    }

    public boolean canFlyTo(Planet planet) {

        if (distance >= planet.distance) {
            System.out.println(String.format("%s can fly to %s", name, planet.name));
            return true;
        }
        else{
            System.out.println(String.format("%s can not fly to %s", name, planet.name));
            return false;
        }

    }
}
