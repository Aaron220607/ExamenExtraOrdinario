class Ej1 {
public static void main(String[] args) {
Clase1 obj1 = new Clase1(5, 3);
System.out.print(obj1.modificar(6) + " ");
Clase1 obj2 = new Clase1(7, 2);
System.out.print(obj2.modificar(6) + " ");
obj2 = obj1;
System.out.println(obj2.modificar(7) + " ");
}
}