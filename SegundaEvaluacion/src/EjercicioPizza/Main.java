package EjercicioPizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Deluxe!!", "Cuatro Quesos Bordes Rellenos de Queso");
        Pizza pizza2 = new Pizza("Mediana OFERTON !!!!", "A elegir");

        pizza1.servida();
        Pizza pizza3 = new Pizza("Pequeña 2x1 !!!!", "Hawaiana");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        pizza1.servida();

        System.out.println("------Estado de las Pizzas aqui en pantalla------");

        System.out.println("Pedidas: "+ Pizza.getPedida());
        System.out.println("Servidas: "+ Pizza.getServida());


        System.out.println("------------------------------------");

        System.out.println("La Que Falta Se La Comio El NUEVO !!");

        System.out.println("------------------------------------");


    }

}
