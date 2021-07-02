public class Getten {

    public static void main(String[] args) {
        CodeWordChecker checker1 = new CodeWordChecker(5, 8, "$");
        CodeWordChecker checker2 = new CodeWordChecker("pass");
        String codeWord = "GonFreecs";
        System.out.println(codeWord.length());
        System.out.println(codeWord.contains("Free"));

    }
}
