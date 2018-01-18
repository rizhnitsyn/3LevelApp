package by.demo;

public class MyService {

    public static String getInfoFromServiceLayer() {
        System.out.println("begin new feature");
        System.out.println("third feature");
        System.out.println("third feature1");
        System.out.println("four feature1feature1");
        System.out.println("four feature1feature1sdsd");
        System.out.println("four lastsdsdsdfdf");
        return MyDatabase.getInfoFromDbLayer() + " service layer. Cherry-pick/ Second test. Second Feature!qweqweqwe";

    }
}
