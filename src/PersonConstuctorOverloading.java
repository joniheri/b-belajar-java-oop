class PersonConstuctorOverloading {
  String name;
  String address;
  final String phoneNumber = "081211223344";

  // Constructor
  PersonConstuctorOverloading(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
    System.out.println("Hallo, My Name is: " + paramName + ", live in: " + address);
  }

  PersonConstuctorOverloading(String paramName) {
    name = paramName;
    System.out.println("Hallo, My Name is: " + paramName);
  }

  PersonConstuctorOverloading(String paramName, int paramAge) {
    name = paramName;
    System.out.println("Hallo, My Name is: " + paramName + ", age: " + paramAge);
  }
  // End Constructor
}
