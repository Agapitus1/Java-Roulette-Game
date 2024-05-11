class TestRoulette
{
    Roulette r1, r2;
    
    TestRoulette()
    {
        r1 = new Roulette("Jerry","Yellow","Blue",100);
        r2 = new Roulette("Owen","Red","Green",100);
        
        r1.displayColours();
        r1.spin();
        
        r2.displayColours();
        r2.spin();
    }
}