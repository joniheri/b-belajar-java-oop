package thisKeyword;


public class ThisKeyword {

  String name;
  String address;

  ThisKeyword(String paramName, String paramAddres) {
    this.name = paramName;
    this.address = paramAddres;
    System.out.println("My name " + name + ", I live in " + address);
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + this.name + ", My name is " + paramName);
  }

}
