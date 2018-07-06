class Person {
  // Declare the instance fields
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  // Define the constructor to set the instance fields
  Person(String firstName, String lastName, int age, double height, double weight) {
    System.out.println("Created an instance of the Person class.");
    // Set the instance field name using the value of the argument
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;    
  }
}
