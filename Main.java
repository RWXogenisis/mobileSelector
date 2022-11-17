import java.util.*;
import java.lang.String;

abstract class phone{
    String Origin;
    String osSkin;
    String Company;
    String model;
    int ram;
    int storage;
    String cpu;
    int ChargingSpeed;
    double refreshRate;
    int battery;
    String waterResistance;
    String biometric;
    int Camera;
    String OpSys;
    int osVersion;
    double price;
    abstract void display();
}

class S20 extends phone
{
    S20(){
        Company = "Samsung";
        OpSys = "Android";
        Origin = "Korea";
        osSkin = "OneUI";
        model = "S20";
        ram = 8;
        storage = 64;
        cpu = "Exynos";
        ChargingSpeed = 25;
        refreshRate = 120;
        battery = 4000;
        waterResistance = "IP68";
        biometric = "fingerprint";
        Camera = 64;
        osVersion = 10;
        price = 50000.00;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}

class ZFold3 extends phone{
    ZFold3(){
        Company = "Samsung";
        OpSys = "Android";
        Origin = "Korea";
        osSkin = "OneUI";
        model = "Z Fold 3";
        ram = 12;
        storage = 256;
        cpu = "Snapdragon 888";
        ChargingSpeed = 25;
        refreshRate = 120;
        battery = 4400;
        waterResistance = "IPX8";
        biometric = "fingerprint";
        Camera = 12;
        osVersion = 11;
        price = 170000.00;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}

class Iphone14 extends phone{
    Iphone14(){
        OpSys = "iOS";
        Origin = "USA";
        osSkin = "NULL";
        Company = "Apple";
        model = "Iphone 14";
        storage = 128;
        ram = 6;
        cpu = "A15";
        ChargingSpeed = 25;
        refreshRate = 60;
        battery = 3000;
        Camera = 12;
        waterResistance = "IP68";
        biometric = "FaceID";
        osVersion = 16;
        price = 80000;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}
class Iphone14pro extends phone{
    Iphone14pro(){
        OpSys = "iOS";
        Origin = "USA";
        osSkin = "NULL";
        Company = "Apple";
        model = "Iphone 14 Pro";
        storage = 256;
        ram = 6;
        cpu = "A16";
        ChargingSpeed = 15;
        refreshRate = 120;
        battery = 3200;
        Camera = 48;
        waterResistance = "IP68";
        biometric = "FaceID";
        osVersion = 16;
        price = 129000;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}

class NordCE2 extends phone{
    NordCE2(){
        OpSys = "Android";
        Origin = "China";
        osSkin = "Oxygen";
        Company = "OnePlus";
        model = "Nord CE 2";
        storage = 128;
        ram = 8;
        cpu = "Mediatek Dimensity 900";
        ChargingSpeed = 65;
        refreshRate = 90;
        battery = 4500;
        Camera = 64;
        waterResistance = "NIL";
        biometric = "Fingerprint";
        osVersion = 11;
        price = 25000;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}

class TenR5G extends phone{
    TenR5G(){
        OpSys = "Android";
        Origin = "China";
        osSkin = "Oxygen";
        Company = "OnePlus";
        model = "10R 5G";
        storage = 128;
        ram = 8;
        cpu = "Mediatek Dimensity 8100 Max";
        ChargingSpeed = 80;
        refreshRate = 120;
        battery = 5000;
        Camera = 50;
        waterResistance = "NIL";
        biometric = "Fingerprint";
        osVersion = 12;
        price = 35000;
    }
    void display(){
        System.out.println("Company:" + Company + "\nModel Name: " + model + "\nPrice: " + price + "\nOrigin: " + Origin + "\nOS: " + osSkin + "\nSpecs:\nram: " + ram + "GB\nStorage: " + storage + "GB\ncpu: " + cpu + "\nCharging Speed: " + ChargingSpeed + "W\nRefresh Rate: " + refreshRate + "Hz\nBattery: " + battery + "maH\nWater Resistance rating: " + waterResistance + "\nSecurity features: " + biometric + "\nRear Camera Resolution: " + Camera + "MP\nOS version: " + osVersion);
    }
}

class manager{
    S20 Samsung1 = new S20();
    ZFold3 Samsung2 = new ZFold3();
    Iphone14 apple1 = new Iphone14();
    Iphone14pro apple2 = new Iphone14pro();
    NordCE2 One1 = new NordCE2();
    TenR5G One2 = new TenR5G();
    int count = 6;

    void available(){
        System.out.println("Available companies:\n");
        System.out.println("Samsung\nOneplus\nApple");
    }

    void decider(double tempPrice, String temp){
        phone[] array = new phone[count]; // creating an array of objects to make it easier for comarison
        array[0] = Samsung1;
        array[1] = Samsung2;
        array[2] = apple1;
        array[3] = apple2;
        array[4] = One1;
        array[5] = One2;
        int tempCount = 0; // in case no phones are found

        System.out.println();

        for (int i = 0; i<count; i++){
            if((temp.equalsIgnoreCase(array[i].Company) || temp.equalsIgnoreCase("NIL")) && array[i].price <= tempPrice){
                array[i].display();
                System.out.println("\n\n");
                tempCount++;
            }
        }

        if (tempCount==0){
            System.out.println("Sorry no mobiles under given conditions found");
        }
    }

}


public class Main{
    public static void main(String[] args) {
        manager calc = new manager();
        Scanner scan  = new Scanner(System.in);
        double target;
        String tarComp;

        System.out.println("Welcome to Mobile Selector\n");
        calc.available();
        try{
            System.out.println("Enter the price range: ");
            target = scan.nextDouble();
            System.out.println("Company of choice(NIL if none): ");
            tarComp = scan.next();


            calc.decider(target, tarComp);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a valid input. Try again");
        }
        finally{
            scan.close();
        }

    }
}
