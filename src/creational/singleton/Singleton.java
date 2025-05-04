package src.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {

    public static void main(String[] args) {
//       eagerLoading();
        lazyLoading();
    }

    public static void eagerLoading(){
        DBConfig dbConnection1=DBConfig.getDbConnection();
        DBConfig dbConnection2=DBConfig.getDbConnection();
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
    }

    public static void lazyLoading(){
        ExecutorService es= Executors.newCachedThreadPool();
        es.execute(()-> System.out.println(DBConfig.getDbConnection()));
        es.execute(()-> System.out.println(DBConfig.getDbConnection()));
        es.execute(()-> System.out.println(DBConfig.getDbConnection()));
        es.shutdown();
    }

}
