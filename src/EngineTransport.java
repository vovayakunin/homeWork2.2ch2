public abstract class EngineTransport extends WheeledTransport {
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    public void doService() {
        super.doService();
        checkEngine();
    }
}

