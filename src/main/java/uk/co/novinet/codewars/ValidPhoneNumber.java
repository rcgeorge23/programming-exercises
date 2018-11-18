package uk.co.novinet.codewars;

import java.util.regex.Pattern;

public class ValidPhoneNumber {

    private static final Pattern PATTERN_VALID_PHONE_NUMBER = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");

    public static boolean validPhoneNumber(String phoneNumber) {
        return PATTERN_VALID_PHONE_NUMBER.matcher(phoneNumber).matches();
    }
}
