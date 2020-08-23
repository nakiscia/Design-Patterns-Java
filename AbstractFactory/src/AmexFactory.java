
//Concreate Factory
public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(String cardType) {
        if(cardType.equals("GOLD"))
            return new AmexGoldCreditCard();
        if(cardType.equals("PLATINIUM"))
            return new AmexPlatiniumCreditCard();

        return null;
    }

    @Override
    public Validator getValidator(String cardType) {
        if(cardType.equals("GOLD"))
            return new AmexGoldValidator();
        if(cardType.equals("PLATINIUM"))
            return new AmexPlatiniumValidator();

        return null;
    }
}
