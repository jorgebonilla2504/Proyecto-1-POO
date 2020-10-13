package Proyecto_POO;

public class Armaduras {

    private  int Precio;/*Se le da un precio a la armadura*/
    private  String Nombre;/*se le da un nombre a la armadura*/
    private  int ValordePrioridad;/*este es el stat que va a dar armadura*/

    public  void setNombre (String nuevoNombre){/*para darle nombre*/
        Nombre = nuevoNombre;
    }
    public  void setPrecio (int nuevoPrecio){/*para darle el coste a la armadura*/
        Precio = nuevoPrecio;
    }
    public  void setValordePrioridad (int nuevoValor){/*para darle un valor a lo que va a sumar*/
        ValordePrioridad = nuevoValor;
    }

    public  String getNombre(){/*con esto podemos pedir el nombre de una armadura*/
        return Nombre;
    }
    public  int getPrecio(){/*con esto podemos pedir el precio de una armadura*/
        return Precio;
    }
    public  int getValordePrioridad(){/*con esto podemos pedir cuanto va a sumar a un stat del jugador*/
        return ValordePrioridad;
    }
}
