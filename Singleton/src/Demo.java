public class Demo {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getDBSingleton();
        DBSingleton instance2 = DBSingleton.getDBSingleton();
        System.out.println(instance == instance2);

        DBSingletonLazyLoad instance3 = DBSingletonLazyLoad.getDBSingletonLazyLoad();
        DBSingletonLazyLoad instance4 = DBSingletonLazyLoad.getDBSingletonLazyLoad();
        System.out.println(instance3 == instance4);

        DBSingletonThreadSafe instance5 = DBSingletonThreadSafe.getDBDbSingletonThreadSafe();
        DBSingletonThreadSafe instance6 = DBSingletonThreadSafe.getDBDbSingletonThreadSafe();
        System.out.println(instance5 == instance6);
    }
}
