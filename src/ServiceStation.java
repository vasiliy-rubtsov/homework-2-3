public class ServiceStation {

    private void updateTyres(TransportVehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

    /**
     * Техобслуживание легковых автомобилей
     * @param vehicle Car
     */
    public void check(Car vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        updateTyres(vehicle);
        vehicle.checkEngine();
    }

    /**
     * Техобслуживание велосипедов
     * @param vehicle Bicycle
     */
    public void check(Bicycle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        updateTyres(vehicle);
    }

    /**
     * Техобслуживание грузовиков
     * @param vehicle Truck
     */
    public void check(Truck vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        updateTyres(vehicle);
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }

    public void check(TransportVehicle vehicle) {
        if (vehicle instanceof Car) {
            check((Car) vehicle);
        } else if (vehicle instanceof Truck) {
            check((Truck) vehicle);
        } else {
            check((Bicycle) vehicle);
        }
    }
}

