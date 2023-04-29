public class ServiceStation {
    public void check(Serviceable serviceable) {
        serviceable.doService();
    }
    public void check(Serviceable[] serviceables) {
        for (Serviceable serviceable : serviceables) {
            serviceable.doService();
        }
    }


}