package util;

import java.util.Random;

public class Utility {

    public class RandomNameGenerator {

        private static String[] Names = {
                "John", "Jane", "Michael", "Sarah", "David", "Emily",
                "James", "Jessica", "Robert", "Linda", "William", "Patricia",
                "Daniel", "Barbara", "Matthew", "Elizabeth"
        };

        public static String generateRandomName() {
            Random random = new Random();
            return Names[random.nextInt(Names.length)];
        }
    }

    public class RandomEmailGenerator {
        private static final String[] FIRST_NAMES = {
                "Ava", "Liam", "Zoe", "Ethan", "Maya", "Jasper", "Nina", "Leo"
        };

        private static final String[] LAST_NAMES = {
                "Robinson", "Thompson", "Martin", "Harris", "Brown", "Davis", "Miller", "Wilson"
        };

        public static String generateRandomEmail() {
            Random random = new Random();
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            return String.format("%s.%s@xyz.com", firstName.toLowerCase(), lastName.toLowerCase());
        }
    }
    // TODO: generate random email (gmail or outlook)
    private static final String[] GMAIL_DOMAINS = {"gmail.com"};
    private static final String[] OUTLOOK_DOMAINS = {"outlook.com"};

    public static String generateRandomEmail() {
        Random random = new Random();
        String[] domains = random.nextBoolean() ? GMAIL_DOMAINS : OUTLOOK_DOMAINS;
        String domain = domains[random.nextInt(domains.length)];

        int length = random.nextInt(10) + 5; // Random length between 5 and 14
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 97); // Random lowercase letter
            username.append(c);
        }

        return username + "@" + domain;
    }
    // TODO: generate complex password of 12 digit
    private static final String CHAR_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER_CASE = CHAR_LOWER_CASE.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?";

    public static String generateComplexPassword(int length) {
        String chars = CHAR_LOWER_CASE + CHAR_UPPER_CASE + NUMBER + SPECIAL_CHAR;
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));

        }

        return sb.toString();
    }

    public class AddressGenerator {

        private static final String[] STREET_NAMES = {
                "Main St", "High St", "Broadway", "1st Ave", "2nd Ave",
                "3rd Ave", "Maple Dr", "Oak St", "Pine St", "Cedar Ave"
        };

        private static final String[] CITY_NAMES = {
                "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
                "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
        };

        private static final String[] STATES = {
                "NY", "CA", "IL", "TX", "AZ",
                "PA", "TX", "CA", "TX", "CA"
        };

        private static final Random RANDOM = new Random();

        public static String generateRandomAddress() {
            // Generate random components of the address
            String streetNumber = String.valueOf(RANDOM.nextInt(9999) + 1); // Random number between 1 and 9999
            String streetName = STREET_NAMES[RANDOM.nextInt(STREET_NAMES.length)];
            String cityName = CITY_NAMES[RANDOM.nextInt(CITY_NAMES.length)];
            String state = STATES[RANDOM.nextInt(STATES.length)];
            String postalCode = generateRandomPostalCode();

            // Construct the full address
            return String.format("%s %s, %s, %s %s", streetNumber, streetName, cityName, state, postalCode);
        }

        public static String generateRandomPostalCode() {
            // Generate a random 5-digit postal code
            return String.format("%05d", RANDOM.nextInt(100000));
        }

    }

    public class MobileNumberGenerator {

        private static final Random RANDOM = new Random();

        public static String generateRandomMobileNumber() {
            // Assuming a 10-digit mobile number
            StringBuilder mobileNumber = new StringBuilder();

            // Generate a random mobile number
            // Start with a digit from 7 to 9 (common starting digits for mobile numbers)
            mobileNumber.append(RANDOM.nextInt(3) + 7); // Generates 7, 8, or 9

            // Generate the next 9 digits
            for (int i = 1; i < 10; i++) {
                mobileNumber.append(RANDOM.nextInt(10)); // Generates a digit from 0 to 9
            }

            return mobileNumber.toString();
        }
    }



}
