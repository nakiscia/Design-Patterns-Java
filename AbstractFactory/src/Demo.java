public class Demo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(300);

        CreditCard creditCard = creditCardFactory.getCreditCard("GOLD");
        Validator validator = creditCardFactory.getValidator("GOLD");
        System.out.println(creditCard.getClass());
        System.out.println(validator.getClass());

    }
}
