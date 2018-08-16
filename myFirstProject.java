import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
public class myFirstProject {
    public static void main(String[] args) {
        Greeting();
        System.out.print("\n");
        System.out.print("\n");
        budget();
        System.out.print("\n");
        System.out.print("\n");
        timeDifference();
        System.out.print("\n");
        System.out.print("\n");
        area();
    }

    public static void Greeting(){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Tripmania!\n");
        System.out.print("What is your name?");
        String name= input.nextLine();
        System.out.print("Nice to meet you "+ name+ ", Where you planning to travelling to?");
        Scanner place_name = new Scanner(System.in);
        String place= place_name.nextLine();
        System.out.print("Great! "+ place+" is a very adorable place to visit.\n");
    }

    public  static void budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend in your destination?");
        int days=input.nextInt();
        System.out.print("Well "+days+" days seems like a nice time for a vacation.\n");
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        Scanner money = new Scanner(System.in);
        double usd=money.nextDouble();
        System.out.print("What is the symbol of the currency of the country you want to visit?");
        Scanner currency = new Scanner(System.in);
        String curr_name= currency.next();
        System.out.print("How many "+curr_name+" are there in 1 USD?");
        Scanner convert = new Scanner(System.in);
        double eur= convert.nextDouble();
        int hours= days*24;
        int min= hours*60;
        int sec= min*60;
        double price=usd/12;
        System.out.print("For travelling for "+days+" days, is equivalent to "+hours+" hrs, "+min+" min and "+sec+" seconds.\n");
        System.out.print("If you are willing to spend "+usd+" USD then it will cost you "+price+" USD per day.\n");
        double barc=usd*eur;
        double barc_day=barc/12;
        System.out.print("Overall it will cost you "+barc+" EUR in your currency for the whole trip and "+barc_day+" "+curr_name+" per day.");
    }

    public static void timeDifference(){
        System.out.print("Well for an another country there might be a difference between the time zone of the two countries.");
        Scanner input=new Scanner(System.in);
        String reply= input.next();
        System.out.print("What is the time difference, in hours, between your destination and your home?");
        Scanner difference=new Scanner(System.in);
        double time= difference.nextDouble();
        double noon= time+12;
        double night=time+00;
        System.out.print("That means if there is noon in your destination then there will be "+noon+":00 hrs in your home and if their midnight at your destination then there will be "+night+":00 hrs in your home.");
    }

    public static void area(){
        System.out.print("What is the area of your destination country in square km?");
        Scanner input= new Scanner(System.in);
        double region= input.nextDouble();
        double miles=region*0.39;
        System.out.print("Then the area of your destination country in square miles is "+miles+" sq miles.");

    }
}
