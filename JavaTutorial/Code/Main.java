public class Main {
    public static void main(String[] args){

        Planet[] planets = {
            new Planet("Jupiter", 354679413, 43562795),
            new Planet("Saturn", 35628, 36278)
        };
        
        Spaceship[] spaceships = {
            new Spaceship("SpaceX Starship", 3569837),
            new Spaceship("Millennium Falcon", 2343254)
        };

        if(s1.canFlyTo(p1)){
            p1.printInfo();
            s1.printInfo();
        }

        if(s1.canFlyTo(p2)){
            p2.printInfo();
        }
        
    }
}
