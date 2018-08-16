import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        System.out.print("Let’s play a game called “Odds and Evens\n");
        part1();
    }

    public static void part1(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Hi "+ name+ ", which do you choose?");
        String reply = input.nextLine();
        while(!reply.equals("O") && !reply.equals("E")){
            System.out.print("Please reply between \"O\" or \"E\" ");
            reply = input.next();
        }
        if(reply.equals("O")){
            System.out.print(name+" has picked odds! The computer will be evens.\n");
        }
        else if(reply.equals("E")){
            System.out.print(name+" has picked evens! The computer will be odds.\n");
        }
        for(int i=0; i<=30; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        System.out.print("\n");

        //Part 2
        System.out.print("How many \"fingers\" do you put out?");
        int finger = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number "+computer);
        for(int i=0; i<=30; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        int sum= finger+computer;
        System.out.println(finger+ " + " +computer+" = "+ sum);
        if(sum%2==0){
            System.out.println(sum+" is .....even!");
            if(reply.equals("O")){
                System.out.println("That means "+name+" lose!!! :(");
            }
            else if(reply.equals("E")) {
                System.out.println("That means " + name + " wins!! :)");
            }
        }
        else{
            System.out.println(sum+" is .....odd!");
            if(reply.equals("O")){
                System.out.println("That means "+name+" wins!! :)");
            }
            else if(reply.equals("E")) {
                System.out.println("That means "+name+" lose!!! :(");
            }
        }
    }
}
