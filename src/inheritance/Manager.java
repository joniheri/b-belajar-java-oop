package inheritance;

class Manager {
  String name;

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My Name is " + this.name);
  }

}

class ChildManagerTwo extends Manager {
  void increement() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Count: " + (i + 1));
    }
  }
}

class ChildManagerTree extends Manager {
  void decrement() {
    for (int i = 10; i > 0; i--) {
      System.out.println("Count: " + (i));
    }
  }
  
}
