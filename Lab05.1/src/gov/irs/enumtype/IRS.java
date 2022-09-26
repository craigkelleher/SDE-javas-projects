package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {
  public static IRS getInstance(){
    return IRSEnum.INSTANCE; //need IRS interface to have IRSenum extend IRS
    // so instances of IRSenum is-a IRS. Need to sign the interface contract
  }

  // Methods
  void collectTaxes(); //abstract method, by default methods in interface are abstract

  void register(TaxPayer payer);

}
