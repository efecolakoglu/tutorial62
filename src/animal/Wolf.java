package animal;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " Howl!\uD83C\uDDF9\uD83C\uDDF7";
    }
}
