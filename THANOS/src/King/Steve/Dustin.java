package King.Steve;

import java.util.ArrayList;

public class Dustin {
        static void main(String[] args) {
            System.out.println("Dustin is the best character in Stranger Things");

            ArrayList<String> DustinQuotes = new ArrayList<>();
            DustinQuotes.add("She's our friend and she's crazy!");
            DustinQuotes.add("Never tell me the odds!");
            DustinQuotes.add("I may be a pretty shitty boyfriend, but turns out I'm actually a pretty damn good babysitter.");
            System.out.println("Dustin's best quotes:");
            for (String quote : DustinQuotes) {
                System.out.println(quote);
            }

        }
}
