public class CarCreditManager extends BaseCreditManager implements CreditManager.ICreditManager {
    @Override
    public void Calculate() {
        System.out.println("Araba kredisi hesaplandı");
    }
}
