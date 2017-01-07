public class TwelveDays {
    private static String[] days = new String[] {"first", "second", "third", "fourth", "fifth", "sixth", "seventh",
        "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static String[] gifts = new String[] {
            "a Partridge in a Pear Tree.",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
    };

    public static String verse(int verseNumber) {
        return constructVerse(verseNumber);
    }

    public static String verses(int verseNumberStart, int verseNumberEnd) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = verseNumberStart; i <= verseNumberEnd; i++) {
            stringBuilder.append(constructVerse(i));
            if (i != 12) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static String sing() {
        return verses(1, 12);
    }

    private static String constructVerse(int verseNumber) {
        StringBuilder stringBuilder = new StringBuilder("On the " + days[verseNumber - 1]
                + " day of Christmas my true love gave to me, ");
        for (int i = verseNumber; i > 0; i--) {
            if (verseNumber != 1 && i == 1) stringBuilder.append("and ");
            stringBuilder.append(gifts[i - 1]);
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
