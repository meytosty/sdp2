class SunroofDecorator implements MercedesBenzCar {
    private MercedesBenzCar car;

    public SunroofDecorator(MercedesBenzCar car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Sunroof";
    }

    @Override
    public double getCost() {
        return car.getCost() + 3000.0;
    }
}
