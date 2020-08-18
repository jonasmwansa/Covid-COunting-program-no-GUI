import java.util.Scanner;

public class covidTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Covid covidObj = new Covid(441, 317, 7,117);

        printSummary(covidObj);

        //we get the latest information from the user

        System.out.printf("\n\nEnter the number of new cases in the last 24 hours\n>>");
        int newCases = input.nextInt();

        System.out.printf("Enter the number of recoveries in the last 24 hours\n>>");
        int recoveries = input.nextInt();

        System.out.printf("Enter the number of deaths in the last 24 hours\n>>");
        int deaths = input.nextInt();

        covidObj.setNewCases(newCases);
        covidObj.setNewDeaths(deaths);
        covidObj.setNewRecoveries(recoveries);

        //we print the update summary
        printSummary(covidObj);
        

    }

    //we use this private method to print screen
        private static void printSummary(Covid covidTest)
        {
            System.out.printf("\n\n\t\t\tREPUBLIC OF ZAMBIA, THE MINISTRY OF HEALTH\n\n\t\t\t----------COVID-19 SUMMARY DETAILS--------\n\n");
            System.out.printf("Active Cases: %d\t|Total Recovered: %d\t|Total Deaths: %d\t|Total Cases Confirmed: %d\n",
            covidTest.getActiveCases(), covidTest.getRecoveries(), covidTest.getDeaths(), covidTest.GetTotalCases());

        }
}