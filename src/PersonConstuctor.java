class PersonConstuctor {
  String name;
  String address;
  final String phoneNumber = "081211223344";

  // Constructor
  PersonConstuctor(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
    System.out.println("Hallo, My Name is: " + paramName + ", live in: " + address);
  }
  // End Constructor
}
