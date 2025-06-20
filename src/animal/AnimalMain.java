package animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("mirmirr"),
                new Lion("simba"),
                new Dog("tony"),
                new Wolf("fang")
        };


        for (Animal a : animals) {
            System.out.println(a.makeNoise());
            System.out.println(a.roam());
            a.sleep();
            System.out.println();
        }
    }
}
