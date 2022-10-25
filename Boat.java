public class Boat extends Vehicle{


    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis " + brand + " je fais glou glou et j'ai " + kilometers + " km";
    }
}