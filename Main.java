public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
   Dog dog1 = new Dog("joe", "mama", 17.9, "brown", true);

   System.out.println("Dog1 stats: " + dog1); 
   System.out.println("Name: " + dog1.dogName());
   System.out.println("Breed: " + dog1.dogBreed());
   System.out.println("Weight: " + dog1.dogWeight());
   System.out.println("Color: " + dog1.dogColor());
   System.out.println("House Trained: " + dog1.dogHouseTrained());

  System.out.println();

   Dog dog2 = new Dog("dirty", "dan", 784.5, "white", false);

   System.out.println("Dog2 stats: " + dog2); 
   System.out.println("Name: " + dog2.dogName());
   System.out.println("Breed: " + dog2.dogBreed());
   System.out.println("Weight: " + dog2.dogWeight());
   System.out.println("Color: " + dog2.dogColor());
   System.out.println("House Trained: " + dog2.dogHouseTrained());

  System.out.println();

   Dog dog3 = new Dog("perona", "beagle", 59.8, "black", true);

   System.out.println("Dog3 stats: " + dog3); 
   System.out.println("Name: " + dog3.dogName());
   System.out.println("Breed: " + dog3.dogBreed());
   System.out.println("Weight: " + dog3.dogWeight());
   System.out.println("Color: " + dog3.dogColor());
   System.out.println("House Trained: " + dog3.dogHouseTrained());
  }
}
