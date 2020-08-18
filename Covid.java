public class Covid
{
    //fields
    private int totalCases;
    private int activeCases;
    private int  totalDeaths;
    private int totalRecovered ;

    private int newDeaths;
    private int newDisCharges;
    private int new_Cases;

    //we utilise the constructor
    Covid(int total, int activ, int death, int recover)
    {
        totalCases = total;
        activeCases = activ;
        totalDeaths = death;
        totalRecovered = recover;
    }

    //accessors

    public void setNewCases(int newCases)
    {
        new_Cases = newCases;
    }

    public void setActiveCases( int active)
    {
        activeCases = active;
    }

    public void setTotalDeaths(int deaths)
    {
        totalDeaths = deaths;
    }

    public void setNewDeaths(int newDeaths)
    {
        this.newDeaths = newDeaths;
    }
    public void setTotalRecoveries(int recoveries)
    {
        totalRecovered = recoveries;
    }

    public void setNewRecoveries( int newDisCharges)
    {
        this.newDisCharges = newDisCharges;
    }

    public void setTotalCases(int totalCases)
    {
        this.totalCases = totalCases;
    }

    //getters
    
    public int getActiveCases()
    {
        activeCases = activeCases + new_Cases - newDeaths; 
        return activeCases;
    }

    public int getRecoveries()
    {
        totalRecovered += newDisCharges;
        return totalRecovered;
    }

    public int getDeaths()
    {
        totalDeaths += newDeaths;
        return totalDeaths;
    }

    public int GetTotalCases()
    {
        if(new_Cases==0 && newDisCharges!=0)
            totalCases =(activeCases + (totalRecovered - newDisCharges) + totalDeaths);

            else if(newDeaths==0 && newDisCharges!=0)
            totalCases =(activeCases + (totalRecovered - newDisCharges) + totalDeaths);

            else
                totalCases = ((totalCases < 0) ? 0 : (activeCases + (totalRecovered) + totalDeaths));
        return totalCases;
    }

}