public class Truck extends EngineTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);}

        public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }

    public void doService() {
        super.doService();
        checkTrailer();
    }
}


