package ExamenOrdinario22_23;
public class main{
private String nombre;
private int saldo;
public main(String nombre, int saldo) {
this.nombre = nombre;
this.saldo = saldo;
}
public int getSaldo() {
return saldo;
}
public String getNombre() {
return nombre;
}
public void setSaldo(int cantidad) {
this.saldo += cantidad;
}
}
