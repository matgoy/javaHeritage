public class Car extends Vehicle{



    protected Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis " + brand + "je fais Zoom Zoom et j'ai " + kilometers + " km";
    }


}