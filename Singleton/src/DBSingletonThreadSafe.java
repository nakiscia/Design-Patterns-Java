
// This is thread safe and more efficient implementation of Singleton..
// For thread safety it uses Double check lock method..
public class DBSingletonThreadSafe {
    // Volatile is a keyword that help us to keep singleton as one in sync block...
    private static volatile DBSingletonThreadSafe instance;

    private DBSingletonThreadSafe(){}

    public static DBSingletonThreadSafe getDBDbSingletonThreadSafe(){
        // We can do the same process by adding synchronized keyword to method but it is bad in terms of performance...
        if(instance == null){ // First check if instance is null
            synchronized (DBSingletonThreadSafe.class){ // Then enter the synchronized block to double check..
                if(instance == null) // Double check...
                    instance = new DBSingletonThreadSafe();
            }
        }
        return instance;
    }

}
