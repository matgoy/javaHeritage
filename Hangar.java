public class Hangar{

    public static void main(String[] args){
        Car voiture = new Car("mercedes",8878);
        Boat bateau = new Boat("lamborghini", 17);
        System.out.println(voiture.doStuff());
        System.out.println(bateau.doStuff());
    }
}