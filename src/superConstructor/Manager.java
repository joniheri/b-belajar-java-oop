package superConstructor;

class Manager {
  String name;

  Manager(String name) {
    this.name = "Jon";
  }
}

class VicePresident extends Manager {

  VicePresident(String paramName) {
    super(paramName);
    System.out.println(paramName);
  }
}
