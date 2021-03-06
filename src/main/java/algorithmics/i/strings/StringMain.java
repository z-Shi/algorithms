package algorithmics.i.strings;

import static algorithmics.i.strings.StringDistance.calculateDistance;


public class StringMain {

    public static void main(String[] args) {
        String first = "abadcdb";
        String second = "acbacacb";
        int distance = calculateDistance(first, second);
        System.out.println("Distance between '" + first + "' and '" + second + "' is: " + distance);

        StringSearch searcher = new StringSearch();

        String text = "round and round the merry go round";
        String pattern = "round";

        int startingPosition = searcher.bruteForce(text, pattern);
        System.out.println("Pattern: '" + pattern + "' found in Text: '" + text + "' with starting position: " + startingPosition);

        pattern = "ACGUCACGUACGAA";
        searcher.kmp(text, pattern);
        text = "bacbabababacaab";
        pattern = "ababaca";

        startingPosition = searcher.kmp(text, pattern);
        System.out.println("Pattern: '" + pattern + "' found in Text: " + text + "' with starting position: " + startingPosition);

        startingPosition = searcher.bm(text, pattern);
        System.out.println("Pattern: '" + pattern + "' found in Text: " + text + "' with starting position: " + startingPosition);
    }

}
