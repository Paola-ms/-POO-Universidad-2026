
public class Main {

    public static void main(String[] args) {
        System.out.println("=========TEST DE ENCAPSULAMIENTO Y SEGURIDAD DE DATOS==========");
        Producto producto1 = new Producto("Laptop ASUS Core i7", "Lap-001", 18500.0, 10);
        System.out.println("=========DATOS INICIALES DEL PRODUCTO=========");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());
        System.out.println("=========INTENTO DE MODIFICAR DATOS CON VALORES INVÁLIDOS=========");
        producto1.setPrecio(-50);
        producto1.setStock(-10);
        System.out.println();
        System.out.println("=========DATOS DESPUÉS DE INTENTAR MODIFICAR CON VALORES INVÁLIDOS=========");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());
        System.out.println("=========Sistema de descuento=========");
        producto1.aplicarDescuento(20);
        System.out.println("Precio después del descuento: $" + producto1.getPrecio());
    }
}
