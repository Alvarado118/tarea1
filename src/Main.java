public class Main {
    public static void main(String[] args) {
        Producto producto_1 = new Producto(1, "Refigerador", 5000, 1);
        electronico producto_2 = new electronico(2, "Telefono", 10000,1, "Iphone");

        System.out.println("Descuento aplicado al Telefono: "+producto_2.Calculardescuento(10)+"Q");

        orden orden = new orden();
        orden.Agregar(producto_1);
        orden.Agregar(producto_2);

        orden.Mostrar();
    }
}