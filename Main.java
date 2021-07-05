import java.util.*;

class Main {
  
  public static void main(String[] args) {
    Politician royCooper = new Politician(true, true, true, true, true);
    Politician danForest = new Politician(false, false, false, false, false);
    
    //Prompts
    System.out.println("Hello and welcome to PoliMatch! This is program is designed to determine which political candidate you should vote for depending on how your ideals match with their ideals.\n");
    System.out.println("Lets start off by having you answer a few questions!\n");


    Scanner sc = new Scanner(System.in);
    //Intial questions to determine user input
    System.out.println("Without looking at extranious cases, do you think abortion should be legal?");
    String abort = sc.nextLine();
    boolean a = true;
    if(abort.equals("No") || abort.equals("no")){
      a = false;
    }

    System.out.println("Do you believe the advancement of LGBTQ+ rights is good for your community?");
    String LGBTQ = sc.nextLine();
    boolean b = true;
    if(LGBTQ.equals("No") || LGBTQ.equals("no")){
      b = false;
    }

    System.out.println("Do you believe the minimum wage should be increased?");
    String mwi = sc.nextLine();
    boolean c = true;
    if(mwi.equals("No") || mwi.equals("no")){
      c = false;
    }

    System.out.println("Do you support the expansion of medicaid?");
    String medicaid = sc.nextLine();
    boolean d = true;
    if(medicaid.equals("No") || medicaid.equals("no")){
      d = false;
    }

    System.out.println("Do you support state government spending as a means of promoting economic growth?");
    String govSpending = sc.nextLine();
    boolean e = true;
    if(govSpending.equals("No") || govSpending.equals("no")){
      e = false;
    }
    
    Politician userInput = new Politician(a, b, c, d, e);
    System.out.println("\n" + userInput);


    //calculate the number of points each politian gets based on 
    //the number of common ideals
    int pointsCooper = 0;
    int pointsForest = 0;
    
    if(userInput.getSupportAbortion() == royCooper.getSupportAbortion()){
      pointsCooper++;
    }
    if(userInput.getSupportAbortion() == danForest.getSupportAbortion()){
      pointsForest++;
    }

    if(userInput.getSupportLGBTQ() == royCooper.getSupportLGBTQ()){
      pointsCooper++;
    }
    if(userInput.getSupportLGBTQ() == danForest.getSupportLGBTQ()){
      pointsForest++;
    }

    if(userInput.getSupportMinimumWageIncrease() == royCooper.getSupportMinimumWageIncrease()){
      pointsCooper++;
    }
    if(userInput.getSupportMinimumWageIncrease() == danForest.getSupportMinimumWageIncrease()){
      pointsForest++;
    }

    if(userInput.getSupportMedicaidExpansion() == royCooper.getSupportMedicaidExpansion()){
      pointsCooper++;
    }
    if(userInput.getSupportMedicaidExpansion() == danForest.getSupportMedicaidExpansion()){
      pointsForest++;
    }

    if(userInput.getSupportStateGovSpending() == royCooper.getSupportStateGovSpending()){
      pointsCooper++;
    }
    if(userInput.getSupportStateGovSpending() == danForest.getSupportStateGovSpending()){
      pointsForest++;
    }



    //calcutes which politician is best for you
    if(pointsCooper > pointsForest){
      System.out.println("According to my calculation, you shold vote for Roy Cooper!");
    }
    else if(pointsCooper < pointsForest){
      System.out.println("According to my calculation, you shold vote for Dan Forest!");
    }
    else{
      System.out.println("It seems that you were indecisive about a few of the questions. Please enter a definite \"yes\" or \"not\" so that I can better calculate who you should vote for.");
    }


    
  }
}