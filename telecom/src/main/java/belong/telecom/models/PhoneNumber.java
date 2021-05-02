package belong.telecom.models;

public class PhoneNumber {
  private String telePhoneNumber;
  private boolean isActivate;

  public PhoneNumber(String telePhoneNumber, boolean isActivate)
  {
    this.telePhoneNumber = telePhoneNumber;
    this.isActivate = isActivate;
  }

  public String getTelePhoneNumber()
  {
    return telePhoneNumber;
  }

  public void setTelePhoneNumber(String telePhoneNumber)
  {
    this.telePhoneNumber = telePhoneNumber;
  }

  public boolean getIsActivate()
  {
    return isActivate;
  }

  public void setIsActivate(Boolean isActivate)
  {
    this.isActivate = isActivate;
  }
}
