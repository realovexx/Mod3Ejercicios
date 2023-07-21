package tienda;

import tienda.servicios.ProductoServicio;

public class Tienda {

    public static void main(String[] args) throws Exception {

        ProductoServicio ps = new ProductoServicio();
        

        ps.menu();

    }

}
