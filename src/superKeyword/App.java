package superKeyword;

/**
 * Kadang kita ingin mengakses method yang ada di class Parent yang sudah terlanjur kita override di class Child
 * Untuk mengakses method di Class Parent, kita bisa menggukana kata kunci "super"
 * Tidak hanya method, Field yg ada di CLass Parent pun bisa di akses di Class Child menggunakan kata kunci "super"
 */

public class App {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Shape");
    System.out.println("=========================================");
    Shape shape = new Shape();
    System.out.println(shape.getCorner());
    System.out.println("=========================================");

    System.out.println();
    System.out.println("=========================================");
    System.out.println("ShapeChild");
    System.out.println("=========================================");
    ShapeChild shapeChild = new ShapeChild();
    System.out.println(shapeChild.getCorner());
    System.out.println(shapeChild.getParentCorner());
    System.out.println("=========================================");
  }
}
