package uk.co.novinet.codewars;

import static org.junit.Assert.*;
import org.junit.Test;


public class ScrambleTest {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
   
    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramble.scramble("rkqodlw","world"), true);
        testing(Scramble.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scramble.scramble("katas","steak"),false);
        testing(Scramble.scramble("scriptjavx","javascript"),false);
        testing(Scramble.scramble("scriptingjava","javascript"),true);
        testing(Scramble.scramble("scriptsjava","javascripts"),true);
        testing(Scramble.scramble("javscripts","javascript"),false);
        testing(Scramble.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scramble.scramble("commas","commas"),true);
        testing(Scramble.scramble("sammoc","commas"),true);
    }
}