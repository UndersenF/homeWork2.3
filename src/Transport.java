public abstract class Transport {
    protected final String modelName;
    protected final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }


}
