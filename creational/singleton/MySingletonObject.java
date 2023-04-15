package creational.singleton;

public class MySingletonObject {

    private static MySingletonObject instance;
    private String value;

    //Private constructor to avoid multiple instantiations
    private MySingletonObject(String value){
        this.value = value;
    }

    //The only way to retrieve the object. If the instance is null the object will be created otherwise returned
    public static MySingletonObject getInstance(String value){

        if(instance == null){
            instance = new MySingletonObject(value);
        }
        return instance;
    }
}
