// This is Lazy Load implementation. Contrary to clasical implementation this
// type of implementation is less costly in terms of performance..
// PS : This is not a Thread safe implementation..
public class DBSingletonLazyLoad {
    private static DBSingletonLazyLoad instance;
    private DBSingletonLazyLoad(){}

    public static DBSingletonLazyLoad getDBSingletonLazyLoad(){
        if(instance == null)
            instance = new DBSingletonLazyLoad();

        return instance;
    }
}
