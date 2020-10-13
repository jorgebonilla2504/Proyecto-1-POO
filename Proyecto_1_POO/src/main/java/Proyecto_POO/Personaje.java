package Proyecto_POO;

public class Personaje {/*se le dan atributos al personaje*/
    public static int Resistencia;
    public static int Defensa;
    public static int Ataque;
    public static int Agilidad;
    public static int Salud;
    public static int Monedas;
    

    public Personaje(int nuevaResistencia,int nuevaDefensa,int nuevoAtaque,int nuevoAgilidad,int nuevoSalud, int nuevaMonedas)  {
        Resistencia = nuevaResistencia;/*se crea un personaje con nuevas stats segun el parametro*/
        Defensa = nuevaDefensa;
        Ataque = nuevoAtaque;
        Agilidad = nuevoAgilidad;
        Salud = nuevoSalud;
        Monedas = nuevaMonedas;
    }

    public static int getMonedas(){/*para pedir las monedas del jugador*/
        return Monedas;
    }

    public static int getResistencia(){/*para pedir la resistencia del jugador*/
        return Resistencia;
    }
    public static int getDefensa(){/*para pedir la defensa del jugador*/
        return Defensa;
    }
    public static int getAtaque(){/*para pedir el ataque del jugador*/
        return Ataque;
    }
    public static int getAgilidad(){/*para pedir la agilidad del jugador*/
        return Agilidad;
    }
    public static int getSalud(){/*para pedir la salued del jugador*/
        return Salud;
    }
}

