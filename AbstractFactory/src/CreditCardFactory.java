// Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore)
    {
        if(creditScore>650){
            return new AmexFactory();
        }
        else{
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(String cardType);
    public abstract Validator getValidator(String cardType);
}
