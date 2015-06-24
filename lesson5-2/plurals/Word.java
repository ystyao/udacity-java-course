// Bluej project: lesson5-2/plurals

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        // TODO: Complete this method
        // If the word ends in y preceded by a consonant you take away the y and add ies.
        // If the word ends in y preceded by a vowel, you just add an s.
        // You add an es when a word ends in o, or s, or sh, or ch.
        // In all the other case just add an s.
        // you can use the
        //  isVowel
        //  isConsonant
        //  is
        // methods from below.
        
        int length = this.letters.length();
        String pluralWord = this.letters;;
        
        if     (this.is(length - 1,"y")) // test to see if word ends in "y"
        {
            if (this.isConsonant(length - 2))   // if ends in constant + y then remove "y" and add "ies"
            {
                pluralWord = this.letters.substring(0, length - 1); //remove "y"
                pluralWord += "ies";
            }
            else // if ends in vowel + y then just add "s"
            {

                pluralWord += "s";
            }

        }
        else if (
               this.is(length - 1,"o")
            || this.is(length - 1,"s")
            || ((this.is(length - 2,"s") || this.is(length - 2,"c")) && this.is(length - 1,"h"))
            )// test for o || s || sh || ch ending
        {
            pluralWord += "es";
        }
        return pluralWord;
    
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
}
