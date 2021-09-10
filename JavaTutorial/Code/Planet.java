public class Planet {
    public String name;
    public long radius;
    public long distance;

    public Planet(String name, long radius, long distance){
        this.name = name;
        this.radius = radius;
        this.distance = distance;
    }

    public static void main(String[] args){
        Planet p1 = new Planet("Saturn", 21678, 125678);
        Planet p2 = new Planet("Jupiter", 32678294659l, 3562794329l);

    }
}
