import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();

        player3.setUsername(userInput);

        System.out.println(player3.getUsername()); //displays new username 
        
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";
   
   private String rank = "n/a";

   private String ID = "n/a"

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}


// CHALLENGES:
//ADD ID attribute
//ADD "rank" attribute: (5 ranks of your choice, like N00b, Bruh, Novice, Hacker, Gawd)

//Create getters and setters (mutator methods) for both.
//Test by printing setters and getters 
    