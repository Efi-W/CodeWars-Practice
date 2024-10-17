package EightKyu;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    } //replace all 0-4 to 0 and all 5-9 to 1, in a string format
}
