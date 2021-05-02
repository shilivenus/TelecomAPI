package belong.telecom.models;

import java.util.List;

public class Customer {
  private int id;
  private String name;
  private List<PhoneNumber> phoneNumbers;

  public Customer(int id, String name, List<PhoneNumber> phoneNumbers)
  {
    this.id = id;
    this.name = name;
    this.phoneNumbers = phoneNumbers;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public List<PhoneNumber> getPhoneNumbers()
  {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
  }
}
