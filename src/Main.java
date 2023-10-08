public class Main {
    public static void main(String[] args) {
        MercedesBenzCar basicCar = new BasicMercedesBenz();
        MercedesBenzCar carWithLeatherInterior = new LeatherInteriorDecorator(basicCar);
        MercedesBenzCar carWithSunroof = new SunroofDecorator(basicCar);
        MercedesBenzCar carWithAllFeatures = new SunroofDecorator(new LeatherInteriorDecorator(basicCar));

        System.out.println("Basic Car: " + basicCar.getDescription() + ", Cost: $" + basicCar.getCost());
        System.out.println("Car with Leather Interior: " + carWithLeatherInterior.getDescription() + ", Cost: $" + carWithLeatherInterior.getCost());
        System.out.println("Car with Sunroof: " + carWithSunroof.getDescription() + ", Cost: $" + carWithSunroof.getCost());
        System.out.println("Car with All Features: " + carWithAllFeatures.getDescription() + ", Cost: $" + carWithAllFeatures.getCost());
    }
}
