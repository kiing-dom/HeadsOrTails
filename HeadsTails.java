/* making a Heads or Tails Simulator in Java
    if the value is less than 0.5 it comes out as heads,
    otherwise it comes out as tails */

public class HeadsTails {
    public static void main(String[] args) {
// adding a theoretical "50-50" chance that either value is selected
        if(Math.random() < 0.5){
            //prints out heads if it less than 0.5
            System.out.println("Heads");

        }
        //otherwise it is Tails.
        else{
            System.out.println("Tails");
        }
    }
    
}
