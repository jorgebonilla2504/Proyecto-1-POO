package Proyecto_POO;

public class Pociones {
    private int Precio;/*se le da un precio a la pocion*/
    private String Nombre;/*se le da un nombre a la pocion*/
    private int Agilidad;/*se le da un valor que modificara las stats del jugador a esta variable*/

    public  void setNombre (String nuevoNombre){/*se crea un nombre para la pocion*/
        Nombre = nuevoNombre;
    }
    public  void setPrecio (int nuevoPrecio){/*se crea un precio para la pocion*/
        Precio = nuevoPrecio;
    }
    public  void setAgilidad (int nuevoAgilidad){/*se crea un valor que modificara las stats del jugador*/
        Agilidad = nuevoAgilidad;
    }

    public String getNombre(){/*para pedir el nombre de la pocion*/
        return Nombre;
    }
    public int getPrecio(){/*para pedir el precio de la pocion*/
        return Precio;
    }
    public int getAgilidad(){/*para pedir cuanto sumara la pocion a las stats del jugador*/
        return Agilidad;
    }

}
