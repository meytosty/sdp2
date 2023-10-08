class LeatherInteriorDecorator implements MercedesBenzCar {
    private MercedesBenzCar car;

    public LeatherInteriorDecorator(MercedesBenzCar car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Leather Interior";
    }

    @Override
    public double getCost() {
        return car.getCost() + 5000.0;
    }
}
