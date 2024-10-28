public class ServiceStation {
   public void check(TransportVehicle vehicle) {
       System.out.println("Обслуживаем " + vehicle.getModelName());
       vehicle.check();
   }
}

