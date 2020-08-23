
//Concreate Factory
public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(String cardType) {
        if(cardType.equals("GOLD"))
            return new VisaGoldCreditCard();
        if(cardType.equals("BRONZE"))
            return new VisaPlatiniumCreditCard();

        return null;
    }

    @Override
    public Validator getValidator(String cardType) {
        if(cardType.equals("GOLD"))
            return new VisaGoldValidator();
        if(cardType.equals("PLATINIUM"))
            return new VisaPlatiniumValidator();
        return null;
    }
}
