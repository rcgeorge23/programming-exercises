package uk.co.novinet.codewars;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Arrays.asList;

public class HighestScoringWord {

    private static final Map<Character, Integer> LETTER_SCORES = new HashMap<Character, Integer>() {{
        put('a', 1);
        put('b', 2);
        put('c', 3);
        put('d', 4);
        put('e', 5);
        put('f', 6);
        put('g', 7);
        put('h', 8);
        put('i', 9);
        put('j', 10);
        put('k', 11);
        put('l', 12);
        put('m', 13);
        put('n', 14);
        put('o', 15);
        put('p', 16);
        put('q', 17);
        put('r', 18);
        put('s', 19);
        put('t', 20);
        put('u', 21);
        put('v', 22);
        put('w', 23);
        put('x', 24);
        put('y', 25);
        put('z', 26);
    }};

    public static String high(String s) {
        List<String> words = asList(s.split(" "));

        AtomicReference<Integer> highestScore = new AtomicReference<>(0);
        AtomicReference<String> highestScoringWord = new AtomicReference<>("");

        words.forEach(word -> {
            int scoreForCurrentWord = calculateWordScore(word);

            if (scoreForCurrentWord > highestScore.get()) {
                highestScoringWord.set(word);
                highestScore.set(scoreForCurrentWord);
            }
        });

        return highestScoringWord.get();
    }

    private static int calculateWordScore(String word) {
        return word.chars().mapToObj(i -> (char) i)
                .map(key -> LETTER_SCORES.get(key))
                .reduce(0, (integer, integer2) -> integer + integer2);
    }
}
