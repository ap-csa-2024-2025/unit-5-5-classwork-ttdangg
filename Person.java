public class Person
{
    private String firstName; 
    private String lastName;
    private int age; 
    private int socialNum;

    public String getfirstName()
    {
        return firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public int getage()
    {
        return age;
    }

    public int getsocialNum()
    {
        return socialNum;
    }



    public void setFirstName(String FIRSTNAME)
    {
        firstName = FIRSTNAME;
    }

    public void setLastName(String LASTNAME)
    {
        lastName = LASTNAME;
    }

    public void setAge(int AGE)
    {
        age = AGE;
    }

    public void setSocialNum(int SOCIALNUM )
    {
        socialNum = SOCIALNUM;
    }

    public String toString()
    {
        return "SSN: " + socialNum + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age;
    }







}
