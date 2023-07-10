package com.naveen.dsa.leetcode.algorithms.twopointers;
//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

import java.util.StringTokenizer;

public class ReverseWordsInAString {

    public static void main(String[] args) {

        String sentence = "Stopped by the woods on a snowy evening";

        String paragraph = "I have just returned from a visit to my landlord - the solitary neighbour that I shall be troubled with.\n" +
                "This is certainly a beautiful country! In all England, I do not believe that I could have fixed on a situation so\n" +
                "completely removed from the stir of society. A perfect misanthropist's heaven: and Mr. Heathcliff and I are\n" +
                "such a suitable pair to divide the desolation between us. A capital fellow! He little imagined how my heart\n" +
                "warmed towards him when I beheld his black eyes withdraw so suspiciously under their brows, as I rode up,\n" +
                "and when his fingers sheltered themselves, with a jealous resolution, still further in his waistcoat, as I\n" +
                "announced my name. The 'walk in' was uttered with closed teeth, and expressed the sentiment, 'Go to the Deuce:' even the gate over\n" +
                "which he leant manifested no sympathising movement to the words; and I think that circumstance determined\n" +
                "me to accept the invitation: I felt interested in a man who seemed more exaggeratedly reserved than myself. Joseph was an elderly, nay, an old man: very old, perhaps, though hale and sinewy. 'The Lord help us!' he\n" +
                "soliloquised in an undertone of peevish displeasure, while relieving me of my horse: looking, meantime, in\n" +
                "my face so sourly that I charitably conjectured he must have need of divine aid to digest his dinner, and his\n" +
                "pious ejaculation had no reference to my unexpected advent. Wuthering Heights is the name of Mr. Heathcliff's dwelling. 'Wuthering' being a significant provincial\n" +
                "adjective, descriptive of the atmospheric tumult to which its station is exposed in stormy weather. Pure,\n" +
                "bracing ventilation they must have up there at all times, indeed: one may guess the power of the north wind\n" +
                "blowing over the edge, by the excessive slant of a few stunted firs at the end of the house; and by a range of\n" +
                "gaunt thorns all stretching their limbs one way, as if craving alms of the sun. Happily, the architect had\n" +
                "foresight to build it strong: the narrow windows are deeply set in the wall, and the corners defended with large\n" +
                "jutting stones.";

        Long startTime = System.currentTimeMillis();
        System.out.println(leetcodeApproach1(paragraph));
        Long stopTime = System.currentTimeMillis();
        System.out.println("Executed in "+(stopTime-startTime)+"ms");
    }

    public static String leetcodeApproach1(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: words){
            sb.append(new StringBuffer(word).reverse().toString());
        }
        return sb.toString().trim();
    }




    //This only executes in
    public static String mySolution(String s){

        String reverse = "";
        StringTokenizer st = new StringTokenizer(s," ");

        while (st.hasMoreTokens()){
            String word = st.nextToken();
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse+=word.charAt(i);
            }
            reverse+=" ";
        }
        return reverse.substring(0, reverse.length()-2);

    }
}
