// importing random number utility
import java.util.Random;

// creating Coin class
public class Coin {
    // creating String variable named sideUp
    private String sideUp;

    // creating default constructor for randomly determining side of coin
    public Coin() {
        // calling the toss function
        toss();
    }

    // creating void member function named toss
    public void toss() {
        Random randNum = new Random();
        // value for random toss of only 2 possibilities (heads or tails)
        int res = rand.nextInt(2);

        // if-statement determining what happens when either heads or tails
        if (result == 0) {
            sideUp = "heads";
        }
        else {
            sideUp = "tails";
        }
    }

    // creating member function named getSideUp
    public void getSideUp() {
        return sideUp;
    }
}