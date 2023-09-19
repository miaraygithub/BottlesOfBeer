import java.util.Scanner;//We're gonna need scanner objects! woohoo
public class BottlesOfBeer {
    public static void main(String[] args) { //main method (my bestie)
        final int beerBottlesOriginal; //To store the ideal user beer number (unaltered)
        int beerBottles; //To iterate over, keeping track of how many beer bottles we have (gets changed)
        Scanner sc = new Scanner(System.in); //Scanner object named sc
        System.out.println("Enter the number of bottles to start with: "); //Prompt user for ideal bottle number
        beerBottlesOriginal = sc.nextInt(); //Store beer number to the safe (does not get messed with) variable
        beerBottles = beerBottlesOriginal; //Start our iterative variable out at the ideal beer number
        if (beerBottlesOriginal >= 2) { //Basically this is everything that happens above one bottle left
            while (beerBottles > 2) { //any beer number that's above two has no plurality issues so we can just iterate until we get down to 2
                System.out.println(beerBottles + " bottles of beer on the wall, " + beerBottles + "bottles of beer."); //first line of the verse
                System.out.println("Take one down and pass it around, " + beerBottles + "bottles of beer on the wall.\n"); //second line of the verse, \n is there to make our stanza breaks
                beerBottles -= 1; //take one beer off of the wall

            }
            System.out.println("2 bottles of beer on the wall, 2 bottles of beer."); //This first line is standard formula, nothing new
            System.out.println("Take one down, and pass it around, 1 bottle of beer on the wall.\n"); //when there's one BOTTLE, we can't follow the same formula so this stanza is pulled out of the loop
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer."); //no matter how many bottles, we'll always get down to one, so it happens even if the input number is one
        System.out.println("Take one down, and pass it around, 0 bottles of beer on the wall.\n"); //second line of the verse

        System.out.println("0 bottles of beer on the wall, 0 bottles of beer."); //this line of the song does not depend on plurality
        if (beerBottlesOriginal > 1) {
            System.out.println("Go to the store and buy some more, " + beerBottlesOriginal + "bottles of beer on the wall"); //this sentance works for all except one
        } else if (beerBottlesOriginal == 1) { //if the user inputs only one beer we don't want to have our last message be "1 bottles of beer on the wall
            System.out.println("Go to the store and buy some more, 1 bottle of beer on the wall."); //the special case for 1 (idk if this should've been included I was just testing edge cases and the plurality was bad. I assume that we don't have to worry about if they input no beers or negative beers
        }
    }
}