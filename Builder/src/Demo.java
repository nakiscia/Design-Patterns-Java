public class Demo {
    public static void main(String[] args) {
        LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
        LunchOrderBuilder lunchOrderBuilder = builder.build();

        System.out.println(lunchOrderBuilder.getBread());
        System.out.println(lunchOrderBuilder.getCondiments());
        System.out.println(lunchOrderBuilder.getDressing());
        System.out.println(lunchOrderBuilder.getMeat());

    }

}
