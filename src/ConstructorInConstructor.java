class ConstructorInConstructor {
  String name;
  String address;
  final String phoneNumber = "081211223344";

  // Constructor
  ConstructorInConstructor(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
    System.out.println("Hallo, My Name is: " + paramName + ", live in: " + address);
  }

  ConstructorInConstructor(String paramName) {
    this(paramName, null);
  }

  ConstructorInConstructor() {
    this(null);
  }
}
