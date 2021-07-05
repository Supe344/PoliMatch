class Politician {
  private boolean supportAbortion;
  private boolean supportLGBTQ;
  private boolean supportMinimumWageIncrease;
  private boolean supportMedicaidExpansion;
  private boolean supportStateGovSpending;

  public Politician(boolean A, boolean B, boolean C, boolean D, boolean E){
    supportAbortion = A;
    supportLGBTQ = B;
    supportMinimumWageIncrease = C;
    supportMedicaidExpansion = D;
    supportStateGovSpending = E;
  }

  public boolean getSupportAbortion(){
    return supportAbortion;
  }

  public boolean getSupportLGBTQ(){
    return supportLGBTQ;
  }
  
  public boolean getSupportMinimumWageIncrease(){
    return supportMinimumWageIncrease;
  }
  
  public boolean getSupportMedicaidExpansion(){
    return supportMedicaidExpansion;
  }

  public boolean getSupportStateGovSpending(){
    return supportStateGovSpending;
  }

  public String toString(){
    String abortion = "";
    if(this.supportAbortion == true){
      abortion = "Pro-Choice";
    }
    else{
      abortion = "Pro-Life";
    }

    String LGBTQ = "";
    if(this.supportLGBTQ == true){
      LGBTQ = "Support";
    }
    else{
      LGBTQ = "Against";
    }

    String IMW = "";
    if(this.supportMinimumWageIncrease == true){
      IMW = "Support";
    }
    else{
      IMW = "Againt";
    }

    String medicaid = "";
    if(this.supportMedicaidExpansion == true){
      medicaid = "Support";
    }
    else{
      medicaid = "Against";
    }

    String SGS = "";
    if(this.supportStateGovSpending == true){
      SGS = "Support";
    }
    else{
      SGS = "Against";
    }

    String a = "Stance on abortion: " + abortion;
    String b = "Stance on LGBTQ: " + LGBTQ;
    String c = "Stance on increasing minimum wage: " + IMW;
    String d = "Stance on medicaid expantion: " + medicaid;
    String e = "Stance on state government spending: " + SGS;
    
    return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
  }
}