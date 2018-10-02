public class VendingMachine {

    private int tokens, cans;

    public void setCans(int cans)
    {
        this.cans = cans;
    }

    public int getCans()
    {
        return cans;
    }

    public void setTokens(int tokens)
    {
        this.tokens = tokens;
    }

    public int getTokens()
    {
        return tokens;
    }

    public VendingMachine()
    {
        this.cans = 30;
        this.tokens = 0;
    }

    public VendingMachine(int cans, int tokens)
    {
        this.cans = cans;
        this.tokens = tokens;
    }

    public void fillUp(int cansAdd)
    {
        int currentCans = getCans();
        setCans(cansAdd + currentCans);
    }

}
