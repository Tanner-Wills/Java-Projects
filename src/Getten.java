public class Getten {

    public static void main(String[] args) {
        CodeWordChecker checker1 = new CodeWordChecker(5, 8, "$");
        CodeWordChecker checker2 = new CodeWordChecker("pass");
        checker2.isValid("haa");

    }
}
