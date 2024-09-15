package entity.personal;

public interface IPerson {

    public long getId();

    public String getLastName();

    public void setLastName(String lastName);

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getDateOfBirth();

    void setDateOfBirth(String dateOfBirth);

    public int getAge();

}
