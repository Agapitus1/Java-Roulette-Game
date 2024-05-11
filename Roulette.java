class Roulette
{
    //Attributes
    String playerName, colourA, colourB;
    int maxScore;
    
    //Alternate Constructor
    Roulette(String thePlayerName, String theColourA, String theColourB, int theMaxScore)
    {
        playerName = thePlayerName;
        colourA = theColourA;
        colourB = theColourB;
        maxScore = theMaxScore;
    }
    
    //Procedure
    void displayColours()
    {
      System.out.println("Colour A is: " + colourA + " and Colour B is: " + colourB);
    }
    
    void spin()
    {
        //double * int = double
        double score = Math.random() * maxScore;
        System.out.println("Congratulation! You have spun a " + score);
    }
}