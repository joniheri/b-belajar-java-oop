package superConstructor;

/**
 * Tidak hanya untuk mengakses Method ataupun Field yang ada di Class Parent, kata kunci "super" juga bisa digunakan untuk mengakses Constructor
 * Namun untuk mengakses Class Parent Contructor, kita harus mengaksesnya didalam Class Child Constructor
 * Jikda Class Parent tidak memiliki COnstructor yang tidak ada Parameternya(tidak memiliki Default Constructor), maka Class Child wajib mengakses Class Parent Constructor Tersebut
 */
public class App {
  public static void main(String[] args) {

    System.out.println();
    Manager manager = new Manager("Jon");
    System.out.println(manager.name);

    System.out.println();
    VicePresident vicePresident = new VicePresident("Heri");
    System.out.println(vicePresident.name);
  }
}
