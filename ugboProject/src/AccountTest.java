public class AccountTest {
   private String firstName;
   private String lastName;
   private int age;
   private String nextOfKin;

   public void setName(String myFirstName, String myLastName){
      this.firstName = myFirstName;
      this.lastName = myLastName;
   }
   public String getName() {
      return (firstName + " " + lastName);
   }
   public void setAge(int age) {
      this.age = age;
   }
   public int getAge() {
      return age;
   }

   public void setNextOfKin(String nextOfKin) {
      this.nextOfKin = nextOfKin;
   }

   public String getNextOfKin() {
      return nextOfKin;
   }
}


