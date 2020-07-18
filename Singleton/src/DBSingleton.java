
// This is classical implementation of Singleton...
public class DBSingleton {
    private static DBSingleton instance = new DBSingleton();
    private DBSingleton(){}
    public static DBSingleton getDBSingleton()
    {
        return instance;
    }
}
