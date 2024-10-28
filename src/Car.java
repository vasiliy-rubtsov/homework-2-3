public class Car extends TransportVehicle implements MotorVehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку легкового автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель легкового автомобиля");
    }

    public void check() {
        updateTyres();
        checkEngine();
    }
}

