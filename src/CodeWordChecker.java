public class CodeWordChecker {
    //Constructor can be two int s and a String
    //can also be constructed from a single parameter that specifies a String that must not occur
    //the two ints specify the min and max length a code word can be
    //default min/max length is 6 and 20

    //Instance Variables
    private int mini;
    private int maxi;
    private String key;
    private String codeWord;

    //Constructor Method
    public CodeWordChecker(int mini, int maxi, String key){
        //Initial instance variables
        this.mini = mini;
        this.maxi = maxi;
        this.key = key;

    }
    public CodeWordChecker(String key){
        mini = 6;
        maxi = 20;
        this.key = key;
    }


    public boolean isValid(String word){
        //method isValid accepts a String parameter and returns true/false if the String is a valid code word
        return word.length() >= mini && word.length() <= maxi && !word.contains(key);
    }

    public char charAt(int index){
        //Returns the char value at the specified index
        return codeWord.charAt(index);
    }

    public String concat(String str){
    //Concatenates the specified string to the end of this string and returns the result
        return codeWord.concat(str);
    }

    public boolean contains(CharSequence s){
    //Returns true if and only if this string contains the specified sequence of char values.
        return codeWord.contains(s);
    }

    //public boolean equals(Object anObject){
    //Compares this string to the specified object

    //}

    public int indexOf(int ch){
    //Returns the index within this string of the first occurrence of the specified character
        return codeWord.indexOf(ch);
    }

    public int indexOf(String str){
    //Returns the index within this string of the first occurrence of the specified substring
        return codeWord.indexOf(str);
    }

    public boolean isEmpty(){
    //Returns true if and only if length() is zero.
        return codeWord.length() == 0;
    }

    public int length(){
    //Returns the length of the string.
        return codeWord.length();

    }

    public boolean startsWith(String prefix){
    //Tests if this string starts with the specified prefix.
        return codeWord.startsWith(prefix);
    }

    public String toString(){
    //This object(which is already a string!) is itself returned.
        return codeWord.toString();
    }

    public String trim(){
    //Returns a (possibly new) string whose value is this string, with any leading and trailing whitespace removed.
        return codeWord.trim();
    }



}
