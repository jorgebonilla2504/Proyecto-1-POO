package Proyecto_POO;
import static Proyecto_POO.Conexion_API.conexion_API;


public class Main {
    static Personaje Player1;/*se crea un nuevo personaje*/
    
    public static void main(String[] args) throws Exception {
        Player1 = new Personaje(30,25,15,45,100,500);/*se crea el personaje dandole stats*/
        conexion_API();/*se crean todos los items utilizando la API*/
        Tienda store = new Tienda();/*se crea la interfaz tienda*/
        store.setTitle("Tienda POO");/*se le da un titulo a la interfaz*/
        store.setVisible(true);/*se hace visible la interfaz para que el usuario comience a interactuar*/
    }
}