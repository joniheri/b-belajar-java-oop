package inheritance;

/**
 * Inheritance
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * Dalam artian, kira bisa membuat class Parent dan class Child
 * Satu class Child hanya boleh punya 1 class Parent. Sedangkan 1 class Parent beloh mempunyai lebih dari 1 class Child
 * Saat class Child diturunkan, maka semua field dan method yg ada di class Parent, secara otomatis akan dimiliki oleh class child
 * Untuk melakukan pewarisan,di class child, kita harus menggunakan kata kunci "extends" lalu diikuti dg nama classParent nya
 */

class Inheritance {
  String name;


  void sayHello(String name) {
    System.out.println("Hello " + name + ", My Name is " + this.name);
  }

}

class ChildInheritance extends Inheritance {

}
