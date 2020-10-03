public class Dog {
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;

  public Dog(String dogName, String dogBreed, double dogWeight, String dogColor, boolean dogHouseTrained) {
    name = dogName;
    breed = dogBreed;
    weight = dogWeight;
    color = dogColor;
    houseTrained = dogHouseTrained;
  }

  public String dogName() {
    return name;
  }

  public String dogBreed() {
    return breed;
  }

  public double dogWeight() {
    return weight;
  }

  public String dogColor() {
    return color;
  }

  public boolean dogHouseTrained() {
    return houseTrained;
  }

  public String toString() {
    return name + "🐶";
  }
}
