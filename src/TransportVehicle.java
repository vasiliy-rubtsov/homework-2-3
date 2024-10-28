public abstract class TransportVehicle {
    private final String  modelName;
    private final int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public abstract void updateTyre();

    public abstract void check();

    public void updateTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
