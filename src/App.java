public class App {
  public static void main(String[] args) {
    var person1 = new Person();
    Person person2 = new Person();
    Person person3;
    person3 = new Person();

    System.out.println(person1);
    System.out.println(person3);
    System.out.println(person3);
    System.out.println();


    person1.name = "Jon Heri";
    person1.address = "Depok";
    //  person1.phoneNumber="112233"; --> tidak bisa di ubah, karena menggunakan final(constant)
    System.out.println("Nama: " + person1.name);
    System.out.println("Alamat: " + person1.address);
    System.out.println();
    person1.helloBro("Bro");
    System.out.println();

    // Constructor
    PersonConstuctor personConstuctor1 = new PersonConstuctor("Jon", "Depok");
    System.out.println();

    PersonConstuctor personConstuctor2 = new PersonConstuctor("Tita", "Jakarta");
    System.out.println();
    // Constructor

    // ConstructorOverloading
    PersonConstuctorOverloading personConstuctorOverloading1 = new PersonConstuctorOverloading("Jon", "Depok");
    System.out.println();

    PersonConstuctorOverloading personConstuctorOverloading2 = new PersonConstuctorOverloading("Tita");
    System.out.println();

    PersonConstuctorOverloading personConstuctorOverloading3 = new PersonConstuctorOverloading("Tita", 30);
    System.out.println();
    // ConstructorOverloading
  }
}
