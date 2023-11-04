package inheritance;

/**
 * Inheritance
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * Dalam artian, kira bisa membuat class Parent dan class Child
 * Satu class Child hanya boleh punya 1 class Parent. Sedangkan 1 class Parent beloh mempunyai lebih dari 1 class Child
 * Saat class Child diturunkan, maka semua field dan method yg ada di class Parent, secara otomatis akan dimiliki oleh class child
 * Untuk melakukan pewarisan,di class child, kita harus menggunakan kata kunci "extends" lalu diikuti dg nama classParent nya
 */

public class App {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Inheritance");
    System.out.println("=========================================");
    Inheritance inheritance = new Inheritance();
    inheritance.name = "Heri";
    inheritance.sayHello("Jon");
    System.out.println("=========================================");

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Child Inheritance");
    System.out.println("=========================================");
    ChildInheritance childInheritance = new ChildInheritance();
    childInheritance.name = "Oktya";
    childInheritance.sayHello("Tita");
    System.out.println("=========================================");


    System.out.println();
    System.out.println("=========================================");
    System.out.println("Manager");
    System.out.println("=========================================");
    Manager manager = new Manager();
    manager.name = "Jon Heri";
    manager.sayHello("Tita Oktya");
    System.out.println("=========================================");

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Child Manager");
    System.out.println("=========================================");
    ChildManager childManager = new ChildManager();
    childManager.name = "Tita Oktya";
    childManager.sayHello("Jon Heri");
    System.out.println("=========================================");
    System.out.println();

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Child Manager2");
    System.out.println("=========================================");
    ChildManagerTwo childManagerTwo = new ChildManagerTwo();
    childManagerTwo.name = "Jon";
    childManagerTwo.sayHello("Heri");
    childManagerTwo.increement();
    System.out.println("=========================================");
    System.out.println();

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Child Manager3");
    System.out.println("=========================================");
    ChildManagerTree childManagerTree = new ChildManagerTree();
    childManagerTree.decrement();
    System.out.println("=========================================");
    System.out.println();
  }
}
