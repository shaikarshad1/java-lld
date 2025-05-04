package src.creational.singleton;

public class DBConfig {

    private static DBConfig dbConnection= null;

    private DBConfig(){
        System.out.println("obtained db connection");
    }

    public static DBConfig getDbConnection(){
        if(dbConnection==null)
            synchronized (DBConfig.class) {
            if(dbConnection==null)
                dbConnection = new DBConfig();
            }
        return dbConnection;
    }
}
