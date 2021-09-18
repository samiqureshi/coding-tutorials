public class Planet {
    public String name;
    public long radius;
    public long distance;

    public Planet(String name, long radius, long distance){
        this.name = name;
        this.radius = radius;
        this.distance = distance;
    }

    public void printInfo(){
        System.out.println("-----------------------------------");
        System.out.println(String.format("Planet Name: %s", name, name));
        System.out.println(String.format("Planet Radius: %d Kms", radius));
        System.out.println(String.format("Planet Distance: %d Kms", distance));
        System.out.println("-----------------------------------");
    }
}
