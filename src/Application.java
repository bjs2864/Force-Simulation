import Model.Troop;
import Model.Environment.*;
public class Application {

    private static Environment location;
    private static Troop red;
    private static Troop blue;

    public static void terrainInfo(){
        System.out.println("Please select a region (0-7): ");
        System.out.println("\t(0)Open Field");
        System.out.println("\t(1)Forest");
        System.out.println("\t(2)Suburb");
        System.out.println("\t(3)City");
        System.out.println("\t(4)Desert");
        System.out.println("\t(5)Jungle");
        System.out.println("\t(6)Arctic");
        System.out.println("\t(7)Mountain");
    }

    public static void main(String[] args){
        if(args.length==0) {
            System.out.println("Hello, welcome to Force-Simulation!");
        }
        terrainInfo();
        char[] input=System.in.toString().toCharArray();
        char last=input[input.length];
        last-=48;
        while(!(last>=0 && last<=7)){
            System.out.println("Sorry, bad input!");
            terrainInfo();
            input=System.in.toString().toCharArray();
            last=input[input.length];
            last-=48;
        }
        switch (last){
            case 0:
                location=new OpenField();
                break;
            case 1:
                location=new Forest();
                break;
            case 2:
        }

    }
}
