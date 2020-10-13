package Proyecto_POO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class Conexion_API {
    /*se crean 9 items que, 3 de cada tipo*/
    static Armaduras ArmaduraOro;
    static Armaduras ArmaduraPlata;
    static Armaduras ArmaduraDiamante;
    static Armas Espada;
    static Armas Arco;
    static Armas Hacha;
    static Pociones PosionVida;
    static Pociones PosionAgilidad;
    static Pociones PosionSecreta;

    public static void conexion_API() throws Exception {

        /*se hace el request*/
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://covid-193.p.rapidapi.com/countries")
                .get()
                .addHeader("x-rapidapi-host", "covid-193.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "02353b1fc6msh8db8a21dbda3b14p19eedfjsn691f78aa408b")
                .build();

        Response response = client.newCall(request).execute();
        String resStr = response.body().string();/*la respuesta se hace un string*/
        JSONObject json = new JSONObject(resStr);/*luego un json*/
        JSONArray a = (JSONArray) json.get("response");/*luego un jsonarray para sacar la informacion que ocupamos*/

        for (int i = 0; i < 9; i++) {/*con este for se van creando los items uno a uno*/

                String articulo = a.get(i).toString();/*se saca un valor del jsonarray*/

                if (articulo.equals("Afghanistan")) {/*se compara con un string, segun el string va creando difrentes items, hasta que
                    se creen todos*/
                   
                    ArmaduraOro = new Armaduras();
                    ArmaduraOro.setNombre("Armadura de Oro");
                    ArmaduraOro.setPrecio(50);
                    ArmaduraOro.setValordePrioridad(10);
                    ArmaduraOro.getNombre();
                    ArmaduraOro.getValordePrioridad();
                    ArmaduraOro.getPrecio();
                    

                } else if (articulo.toString().equals("Albania")) {
                    ArmaduraPlata = new Armaduras();
                    ArmaduraPlata.setNombre("Armadura de Plata");
                    ArmaduraPlata.setPrecio(100);
                    ArmaduraPlata.setValordePrioridad(20);
                    ArmaduraPlata.getNombre();
                    ArmaduraPlata.getValordePrioridad();
                    ArmaduraPlata.getPrecio();
                    
                } else if (articulo.toString().equals("Algeria")) {
                    ArmaduraDiamante = new Armaduras();
                    ArmaduraDiamante.setNombre("Armadura de Diamante");
                    ArmaduraDiamante.setPrecio(200);
                    ArmaduraDiamante.setValordePrioridad(30);
                    ArmaduraDiamante.getNombre();
                    ArmaduraDiamante.getValordePrioridad();
                    ArmaduraDiamante.getPrecio();
                   
                } else if (articulo.toString().equals("Andorra")) {
                    Espada = new Armas();
                    Espada.setNombre("Espada Excalibur");
                    Espada.setPrecio(40);
                    Espada.setValordePrioridad(32);
                    Espada.getNombre();
                    Espada.getValordePrioridad();
                    Espada.getPrecio();
                    
                } else if (articulo.toString().equals("Angola")) {
                    Arco = new Armas();
                    Arco.setNombre("Arco Goujian");
                    Arco.setPrecio(100);
                    Arco.setValordePrioridad(50);
                    Arco.getNombre();
                    Arco.getValordePrioridad();
                    Arco.getPrecio();
                    
                } else if (articulo.toString().equals("Anguilla")) {
                    Hacha = new Armas();
                    Hacha.setNombre("Hacha Skeggöx");
                    Hacha.setPrecio(250);
                    Hacha.setValordePrioridad(70);
                    Hacha.getNombre();
                    Hacha.getValordePrioridad();
                    Hacha.getPrecio();
                    
                } else if (articulo.toString().equals("Antigua-and-Barbuda")) {
                    PosionVida = new Pociones();
                    PosionVida.setNombre("Posion de Vida");
                    PosionVida.setPrecio(40);
                    PosionVida.setAgilidad(30);
                    PosionVida.getNombre();
                    PosionVida.getAgilidad();
                    PosionVida.getPrecio();
                    
                } else if (articulo.toString().equals("Argentina")) {
                    PosionAgilidad = new Pociones();
                    PosionAgilidad.setNombre("Posion de Agilidad");
                    PosionAgilidad.setPrecio(60);
                    PosionAgilidad.setAgilidad(50);
                    PosionAgilidad.getNombre();
                    PosionAgilidad.getAgilidad();
                    PosionAgilidad.getPrecio();
                    
                } else if (articulo.toString().equals("Armenia")) {
                    PosionSecreta = new Pociones();
                    PosionSecreta.setNombre("Posion Secreta");
                    PosionSecreta.setPrecio(80);
                    PosionSecreta.setAgilidad(70);
                    PosionSecreta.getNombre();
                    PosionSecreta.getAgilidad();
                    PosionSecreta.getPrecio();
                    
                }

            }
        
        }

    }

