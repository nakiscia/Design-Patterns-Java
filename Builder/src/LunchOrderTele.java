// This is the telescoping constructor example of Lunch Order class.
// Since we did not use the setters, we satisfy the immutablity but
// this way is not a flexiable way to do that..
// For example if we want to create the object by just giving the information of
// bread and dressing. For that we need to create such alternative constructor for that
// or just past null to others.
public class LunchOrderTele {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTele(String bread, String condiments, String dressing) {
        this(bread,condiments);
        this.dressing = dressing;
    }

    public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
        this(bread,condiments,dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
