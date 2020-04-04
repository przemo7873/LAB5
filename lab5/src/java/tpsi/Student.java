package tpsi;

public class Student 
{
    private String firstName;
    private String lastName;
    private String email;
    Student(String f,String l, String e)
    {
        this.firstName=f;
        this.lastName=l;
        this.email=e;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getEmail()
    {
        return email;
    }
}
