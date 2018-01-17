package by.demo;

public class MyService {

    public static String getInfoFromServiceLayer() {
        return MyDatabase.getInfoFromDbLayer() + " service layer";
    }
}
