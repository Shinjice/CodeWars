public class NameMe 
{
    String firstName;
    String lastName;
    String fullName;

    public NameMe(String first, String last) 
    {
        this.firstName = first;
        this.lastName = last;
        this.fullName = firstName+" "+lastName;
   }
   
   public String getFirstName()
   {
     return this.firstName;
   }
   public String getLastName()
   { 
     return this.lastName;
   }
   public String getFullName()
   {
     return this.fullName;
   }
 }

//https://www.codewars.com/kata/547c71fdc5b2b38db1000098/train/java