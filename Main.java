abstract class phone{
    int ram;
    int storage;
    String cpu;
    String ChargingSpeed;
    double refreshRate;
    int battery;
    String waterResistance;
    String biometric;
    String Camera;
    String os;
    int osVersion;
}

interface S20 extends phone{
    
}
class Samsung extends phone{
    os = "Android";
    String Origin = "Korea";
    String osSkin = "OneUI";
}

class Apple extends phone{
    os = "iOS";
    String Origin = "USA";
    String osSkin = "NULL";
}



public class Main{
    public static void main(String[] args) {
        
    }
}