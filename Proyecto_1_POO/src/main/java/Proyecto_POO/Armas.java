package Proyecto_POO;

    public class Armas {
        private int Precio;/*Se le da un precio al arma*/
        private String Nombre;/*Se le da un nombre al arma*/
        private int Ataque;/*Se le da un valor a esta variable que sera la que indique cuanto ataque sumara a las stats*/

        public  void setNombre (String nuevoNombre){/*para darle un nombre al arma*/
            Nombre = nuevoNombre;
        }
        public  void setPrecio (int nuevoPrecio){/*para darle un precio al arma*/
            Precio = nuevoPrecio;
        }
        public  void setValordePrioridad (int nuevoAtaque){/*para darle la cantidad de araque que sumara*/
            Ataque = nuevoAtaque;
        }

        public String getNombre(){/*para pedir el nombre del arma*/
            return Nombre;
        }
        public int getPrecio (){/*para pedir el precio del arma*/
            return Precio;
        }
        public int getValordePrioridad(){/*para pedir la cantidad de ataque que sumara el arma*/
            return Ataque;
        }
    }

