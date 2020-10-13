
package Proyecto_POO;


public class Tienda extends javax.swing.JFrame {

    public Tienda() {
        initComponents();
        eEResist.setVisible(false);/*se ponen las etiquetas que muestran al jugador las stats que tendria si 
        se equipa un item en invisible*/
        eEDefense.setVisible(false);
        eEAgili.setVisible(false);
        eEAtack.setVisible(false);
        eEHp.setVisible(false);
        menosOro.setVisible(false);/*se ponen en invisible las etiquetas que muestran cantidades de oro, ya sea menos
        o mas oro, al comprar o al vender*/
        oroM.setVisible(false);
        oritopapa.setVisible(false);
        oroV.setVisible(false);
        noOro.setVisible(false);
        inventF.setVisible(false);/*esta etiqueta inidica que el jugador no tiene espacio en el inventario, al principio es invisible*/
        p1Resist = Main.Player1.getResistencia();/*se definen los atributos que tendra el jugador*/
        p1Monedas =  Main.Player1.getMonedas();
        p1Defensa =  Main.Player1.getDefensa();  
        p1Atack =  Main.Player1.getAtaque();
        p1Agi =  Main.Player1.getAgilidad();
        p1Hp =  Main.Player1.getSalud(); 
        /*se le hace saber al jugador el oro que tiene mediante una etiqueta*/
        oroPlayer.setText(String.valueOf(p1Monedas));
        /*se le hace saber al jugador sus stats mediante etiquetas*/
        resist.setText("RESISTENCIA: " + p1Resist);
        defense.setText("DEFENSA: " + p1Defensa);
        attack.setText("ATAQUE: " + p1Atack);
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " + p1Hp);
        /*el texto de los botones del inventario al principio estan vacios*/
        i1.setText(" ");
        i2.setText(" ");
        i3.setText(" ");
        i4.setText(" ");
        i5.setText(" ");
        i6.setText(" ");
        i7.setText(" ");
        i8.setText(" ");
        i9.setText(" ");
        /*este label indica si tiene un item equipado*/
        labelEquipado.setVisible(false);
        /*las variables de equipado dan una se�al al programa de cuando un item esta equipado*/
        /*un uno equivale a no estar equipado*/
        equipado1 = 1;
        equipado2 = 1;
        equipado3 = 1;
        equipado4 = 1;
        equipado5 = 1;
        equipado6 = 1;
        equipado7 = 1;
        equipado8 = 1;
        equipado9 = 1;
    }
    /*las variables res son para restar stats*/
    public int resHp;
    public int resAgi;
    public int resAtack;
    public int resResist;
    public int monedasI;/*esto indica las monedas que el jugador perdera al comprar*/
    /*se definen los atributos que van a modificar las stats del personaje*/
    public int armor;
    public int atack;
    public int agili;
    public int hps;
    public String nombt;/*esto indica el nombre que tendra un boton en el inventario*/
    public int p1I;/*esto indica la cantidad de items que tiene el usuario en el inventario*/
    /*se definen las stats del jugador*/
    public int p1Resist;
    public int p1Monedas;
    public int p1Defensa;
    public int p1Atack;
    public int p1Agi;
    public int p1Hp;
    public int compra;/*esto inidicara si el jugador puede o no comprar*/
    public int venta;/*esto es el oro que se le sumara al
    jugador al vender un item de su inventario*/
    public int caso;/*esto indica el numero de boton que presiono el jugador en su inventario*/
    /*las variables equipado indican si un item esta equipado o no*/
    public int equipado9;
    public int equipado8;
    public int equipado7;
    public int equipado6;
    public int equipado5;
    public int equipado4;
    public int equipado3;
    public int equipado2;
    public int equipado1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        canvas1 = new java.awt.Canvas();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        plata = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        resist = new javax.swing.JLabel();
        oroPlayer = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        defense = new javax.swing.JLabel();
        attack = new javax.swing.JLabel();
        agi = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        noOro = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        i1 = new javax.swing.JButton();
        i3 = new javax.swing.JButton();
        i2 = new javax.swing.JButton();
        i4 = new javax.swing.JButton();
        i6 = new javax.swing.JButton();
        i5 = new javax.swing.JButton();
        i7 = new javax.swing.JButton();
        i9 = new javax.swing.JButton();
        i8 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        oroV = new javax.swing.JLabel();
        oritopapa = new javax.swing.JLabel();
        equi = new javax.swing.JButton();
        labelEquipado = new javax.swing.JLabel();
        eEResist = new javax.swing.JLabel();
        eEDefense = new javax.swing.JLabel();
        eEAtack = new javax.swing.JLabel();
        eEAgili = new javax.swing.JLabel();
        eEHp = new javax.swing.JLabel();
        inventF = new javax.swing.JLabel();
        oroM = new javax.swing.JLabel();
        menosOro = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Armadura de Oro ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        plata.setText("Armadura de Plata ");
        plata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plataMouseClicked(evt);
            }
        });
        plata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plataActionPerformed(evt);
            }
        });

        jButton3.setText("Armadura de Diamante");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Arco Goujian ");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Excalibur");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Hacha Skeggöx ");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Pocion de Vida");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Pocion de Agilidad ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Pocion Secreta");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Armaduras");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Armas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pociones");

        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        resist.setText(";");

        oroPlayer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comprar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comprar.setText("Comprar");
        comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tu oro:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        defense.setText(";");

        attack.setText(";");

        agi.setText(";");

        hp.setText(";");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("PLAYER 1 STATS:");

        noOro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOro.setText("No tienes suficiente oro para ese item!");

        jInternalFrame1.setVisible(true);

        i1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i1MouseClicked(evt);
            }
        });

        i3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i3MouseClicked(evt);
            }
        });

        i2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i2MouseClicked(evt);
            }
        });

        i4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i4MouseClicked(evt);
            }
        });

        i6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i6MouseClicked(evt);
            }
        });

        i5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i5MouseClicked(evt);
            }
        });

        i7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i7MouseClicked(evt);
            }
        });

        i9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i9MouseClicked(evt);
            }
        });

        i8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i8MouseClicked(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton20.setText("Vender");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Inventario:");

        oroV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        oritopapa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oritopapa.setText("Oro +");

        equi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equi.setText("Equipar");
        equi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equiMouseClicked(evt);
            }
        });

        labelEquipado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEquipado.setText("Este item esta equipado!");

        eEResist.setText(";");

        eEDefense.setText("Defensa + 0");

        eEAtack.setText(";");

        eEAgili.setText(";");

        eEHp.setText(";");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(labelEquipado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(oritopapa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oroV, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eEResist, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(i1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(i4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(i7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(i8, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(i2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(i5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(i3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(i6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(eEDefense, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eEAtack, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eEAgili, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eEHp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(oroV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oritopapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(labelEquipado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eEResist, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eEDefense, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eEAtack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eEAgili, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eEHp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        inventF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inventF.setText("No hay espacio en tu inventario!");

        oroM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        menosOro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosOro.setText("Oro  -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(oroPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(inventF))
                                    .addComponent(noOro, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 631, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menosOro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oroM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resist, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(noOro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(oroPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inventF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plata, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resist, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menosOro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oroM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plataActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la armadura de oro por lo tanto solo mostrara el valor que sumara este item*/
        attack.setText("ATAQUE: " + p1Atack);/*el ataque se muestra igual*/
        resist.setText("RESISTENCIA: " + p1Resist + " + " + Conexion_API.ArmaduraOro.getValordePrioridad());/*la resistencia se muestra con la suma que da el item*/
        agi.setText("AGILIDAD: " + p1Agi);/*la agilidad queda igual*/
        hp.setText("SALUD: " + p1Hp);/*la salud tambien*/
        /*en caso de una compra, se ponen todas las variables listas para hacer los cambios en el inventario
        y para quitar el oro
        */
        armor =  Conexion_API.ArmaduraOro.getValordePrioridad();
        monedasI = Conexion_API.ArmaduraOro.getPrecio();
        nombt = Conexion_API.ArmaduraOro.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plataMouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la armadura de plata por lo tanto solo mostrara el valor que sumara este item*/
        attack.setText("ATAQUE: " + p1Atack);
        resist.setText("RESISTENCIA: " + p1Resist + " + " + Conexion_API.ArmaduraPlata.getValordePrioridad());
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " +  p1Hp);
        armor = Conexion_API.ArmaduraPlata.getValordePrioridad();
        monedasI = Conexion_API.ArmaduraPlata.getPrecio();
        nombt = Conexion_API.ArmaduraPlata.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_plataMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la armadura de diamante por lo tanto solo mostrara el valor que sumara este item*/
        attack.setText("ATAQUE: " + p1Atack);
        resist.setText("RESISTENCIA: " + p1Resist + " + " + Conexion_API.ArmaduraDiamante.getValordePrioridad());
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " +  p1Hp);
        armor = Conexion_API.ArmaduraDiamante.getValordePrioridad();
        monedasI = Conexion_API.ArmaduraDiamante.getPrecio();
        nombt = Conexion_API.ArmaduraDiamante.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la espada por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " +  p1Resist);
        attack.setText("ATAQUE: " + p1Atack + " + " + Conexion_API.Espada.getValordePrioridad());
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " +  p1Hp);
        atack = Conexion_API.Espada.getValordePrioridad();
        monedasI = Conexion_API.Espada.getPrecio();
        nombt = Conexion_API.Espada.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item del arco por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " +  p1Resist); 
        attack.setText("ATAQUE: " + p1Atack + " + " + Conexion_API.Arco.getValordePrioridad());
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " +  p1Hp);
        atack = Conexion_API.Arco.getValordePrioridad();
        monedasI = Conexion_API.Arco.getPrecio();
        nombt = Conexion_API.Arco.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item del hacha por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " +  p1Resist);
        attack.setText("ATAQUE: " + p1Atack + " + " + Conexion_API.Hacha.getValordePrioridad());
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " +  p1Hp);
        atack = Conexion_API.Hacha.getValordePrioridad();
        monedasI = Conexion_API.Hacha.getPrecio();
        nombt = Conexion_API.Hacha.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la pocion de vida por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " + p1Resist);
        attack.setText("ATAQUE: " + p1Atack);
        hp.setText("SALUD: " +  p1Hp + " + " + Conexion_API.PosionVida.getAgilidad());
        agi.setText("AGILIDAD: " + p1Agi);
        hps = Conexion_API.PosionVida.getAgilidad();
        monedasI = Conexion_API.PosionVida.getPrecio();
        nombt = Conexion_API.PosionVida.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la pocion de agilidad por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " +  p1Resist);
        attack.setText("ATAQUE: " + p1Atack);
        agi.setText("AGILIDAD: " + p1Agi + " + " + Conexion_API.PosionAgilidad.getAgilidad());
        hp.setText("SALUD: " +  p1Hp);
        agili = Conexion_API.PosionAgilidad.getAgilidad();
        monedasI = Conexion_API.PosionAgilidad.getPrecio();
        nombt = Conexion_API.PosionAgilidad.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        /*codigo de un boton de item de la tienda al hacer click*/
        noOro.setVisible(false);/*las etiquetas que le dicen al usuario que no puede comprar pasan a ser invisibles*/
        inventF.setVisible(false);
        armor = 0;/*se ponen los stats que se pueden modificar a 0 para evitar algun error*/
        atack = 0;
        agili = 0;
        hps = 0;  
        monedasI = 0;
        /*este boton es del item de la pocion secreta por lo tanto solo mostrara el valor que sumara este item*/
        resist.setText("RESISTENCIA: " + p1Resist);
        attack.setText("ATAQUE: " + p1Atack);
        hp.setText("SALUD: " + p1Hp + " + " + Conexion_API.PosionSecreta.getAgilidad());
        agi.setText("AGILIDAD: " + p1Agi + " + " + Conexion_API.PosionSecreta.getAgilidad());
        hps = Conexion_API.PosionSecreta.getAgilidad();
        agili = Conexion_API.PosionSecreta.getAgilidad();
        monedasI = Conexion_API.PosionSecreta.getPrecio();
        nombt = Conexion_API.PosionSecreta.getNombre();
        menosOro.setVisible(true);/*esto muestra el oro que perdera el usuario en caso de compar*/
        oroM.setText(String.valueOf(monedasI));
        oroM.setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked

    private void comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseClicked
        if(p1Monedas - monedasI < 0 ){/*esta condicion se fija si el usuario tiene suficiente oro para compra el item seleccionado*/
            armor = 0;
            atack = 0;
            agili = 0;
            hps = 0;  
            monedasI = 0;
            noOro.setVisible(true);
            compra = 1;
        }
        if(p1I >= 9){/*esta condicion se fija si el usuario tiene suficiente inventario*/
            armor = 0;
            atack = 0;
            agili = 0;
            hps = 0;  
            monedasI = 0;
            inventF.setVisible(true);
            compra = 1;
        }
        /*se igualan los valores a 0 para evitar errores*/
        armor = 0;
        atack = 0;
        agili = 0;
        hps = 0;  
        if(monedasI != 0){/*esto indica que realizo la compra*/
            p1I = p1I + 1;
        }
        p1Monedas = p1Monedas - monedasI;/*se le restan las monedas*/
        monedasI = 0;/*se resetean la variable que guarda las monedas del item*/
        /*los siguientes ifs buscan un hueco en el inventario para mater el item*/
        if(i1.getText() == " " && compra == 0){i1.setText(nombt);}
        else if(i2.getText() == " " && compra == 0){i2.setText(nombt);}
        else if(i3.getText() == " " && compra == 0){i3.setText(nombt);}
        else if(i4.getText() == " " && compra == 0){i4.setText(nombt);}
        else if(i5.getText() == " " && compra == 0){i5.setText(nombt);}
        else if(i6.getText() == " " && compra == 0){i6.setText(nombt);}
        else if(i7.getText() == " " && compra == 0){i7.setText(nombt);}
        else if(i8.getText() == " " && compra == 0){i8.setText(nombt);}
        else if(i9.getText() == " " && compra == 0){i9.setText(nombt);}
        /*se muestra el oro del jugador actualizado*/
        oroPlayer.setText(String.valueOf(p1Monedas));
        /*se actualizan las etiquetas con los stats del jugador*/
        resist.setText("RESISTENCIA: " + p1Resist);
        defense.setText("DEFENSA: " + p1Defensa);
        attack.setText("ATAQUE: " + p1Atack);
        agi.setText("AGILIDAD: " + p1Agi);
        hp.setText("SALUD: " + p1Hp);
        nombt = " ";/*se resetea la variable que cambia el nombre a los botones del inventario*/
        menosOro.setVisible(false);
        oroM.setVisible(false);
    }//GEN-LAST:event_comprarMouseClicked

    private void i1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i1MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i1.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i1.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i1.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i1.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i1.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i1.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i1.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i1.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i1.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        caso = 1;/*este es el primer boton y el caso lo indica*/
        oroV.setText(String.valueOf(venta));/*se muestra el oro que ganaria el jugador en caso de vender el item*/
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        if(equipado1 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado1 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i1MouseClicked

    private void i2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i2MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i2.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i2.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i2.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i2.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i2.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i2.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i2.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i2.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i2.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 2;/*este es el segundo boton y el caso lo indica*/
        if(equipado2 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado2 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i2MouseClicked

    private void i3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i3MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i3.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i3.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i3.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i3.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i3.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i3.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i3.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i3.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i3.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 3;/*este es el tercer boton y el caso lo indica*/
        if(equipado3 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado3 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i3MouseClicked

    private void i4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i4MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i4.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i4.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i4.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i4.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i4.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i4.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i4.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i4.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i4.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 4;/*este es el cuarto boton y el caso lo indica*/
        if(equipado4 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado4 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i4MouseClicked

    private void i5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i5MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i5.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i5.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i5.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i5.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i5.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i5.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i5.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i5.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i5.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 5;/*este es el quinto boton y el caso lo indica*/
        if(equipado5 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado5 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i5MouseClicked

    private void i6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i6MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i6.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i6.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i6.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i6.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i6.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i6.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i6.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i6.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i6.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 6;/*este es el sexto boton y el caso lo indica*/
        if(equipado6 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado6 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i6MouseClicked

    private void i7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i7MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i7.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i7.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i7.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i7.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i7.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i7.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i7.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i7.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i7.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 7;/*este es el septimo boton y el caso lo indica*/
        if(equipado7 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado7 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i7MouseClicked

    private void i8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i8MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i8.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i8.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i8.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i8.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i8.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i8.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i8.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i8.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i8.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 8;/*este es el octavo boton y el caso lo indica*/
        if(equipado8 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado8 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i8MouseClicked

    private void i9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i9MouseClicked
        /*configuracion de un boton del inventario al hacer click*/
        /*los siguientes ifs comparan el nombre del boton con el nombre del item y a partir de esto se sacan las stats y el oro
        por si el jugador quiere equipar el item
        */
        equi.setVisible(true);
        if(i9.getText() == Conexion_API.ArmaduraOro.getNombre()){
            venta = Conexion_API.ArmaduraOro.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraOro.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i9.getText() == Conexion_API.ArmaduraDiamante.getNombre()){
            venta = Conexion_API.ArmaduraDiamante.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraDiamante.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i9.getText() == Conexion_API.ArmaduraPlata.getNombre()){
            venta = Conexion_API.ArmaduraPlata.getPrecio() - 20;
            resResist = Conexion_API.ArmaduraPlata.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resAtack = 0;
        }
        else if(i9.getText() == Conexion_API.Espada.getNombre()){
            venta = Conexion_API.Espada.getPrecio() - 20;
            resAtack = Conexion_API.Espada.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i9.getText() == Conexion_API.Hacha.getNombre()){
            venta = Conexion_API.Hacha.getPrecio() - 20;
            resAtack = Conexion_API.Hacha.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i9.getText() == Conexion_API.Arco.getNombre()){
            venta = Conexion_API.Arco.getPrecio() - 20;
            resAtack = Conexion_API.Arco.getValordePrioridad();
            resAgi = 0;
            resHp = 0;
            resResist = 0;
        }
        else if(i9.getText() == Conexion_API.PosionVida.getNombre()){
            venta = Conexion_API.PosionVida.getPrecio() - 20;
            resHp = Conexion_API.PosionVida.getAgilidad();
            resAtack = 0;
            resAgi = 0;
            resResist = 0;
        }
        else if(i9.getText() == Conexion_API.PosionAgilidad.getNombre()){
            venta = Conexion_API.PosionAgilidad.getPrecio() - 20;
            resAgi = Conexion_API.PosionAgilidad.getAgilidad();
            resHp = 0;
            resAtack = 0;
            resResist = 0;
        }
        else if(i9.getText() == Conexion_API.PosionSecreta.getNombre()){
            venta = Conexion_API.PosionSecreta.getPrecio() - 20;
            resAgi = Conexion_API.PosionSecreta.getAgilidad();
            resHp = Conexion_API.PosionSecreta.getAgilidad();
            resResist = 0;
            resAtack = 0;
        }else{
            venta = 0;
            resAgi = 0;
            resHp = 0;
            resResist = 0;
            resAtack = 0;
            equi.setVisible(false);
        }
        oroV.setText(String.valueOf(venta));
        oroV.setVisible(true);
        oritopapa.setVisible(true);
        caso = 9;/*este es el noveno boton y el caso lo indica*/
        if(equipado9 == 0){/*si esta equipado el item se le indica al jugador*/
            labelEquipado.setVisible(true);
        }else if(equipado9 == 1){/*de lo contrario se muestran los stats que ganaria al equiparlo*/
            labelEquipado.setVisible(false);
            eEResist.setText("RESISTENCIA + " + resResist);
            eEAtack.setText("ATAQUE + " + resAtack);
            eEAgili.setText("AGILIDAd + " + resAgi);
            eEHp.setText("SALUD + " + resHp);
            eEResist.setVisible(true);
            eEAtack.setVisible(true);
            eEAgili.setVisible(true);
            eEHp.setVisible(true);
        }
    }//GEN-LAST:event_i9MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        /*configuracion del boton de venta*/
        p1Monedas = p1Monedas + venta;/*se le suman las monedas del item que vendio*/
       oroPlayer.setText(String.valueOf(p1Monedas));/*se actualiza la etiqueta que contiene el oro del jugador*/
       /*los siguientes if se fijan en el boton que se hizo click y si esta equipado o no, en caso de estarlo, se le restan los 
       stats que se le estaban dando y se borra el item, de lo contrario, solo se borra el item*/
       if(caso == 1 && equipado1 == 0){
           i1.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado1 = 1;
           
       }else if(caso == 1){
           i1.setText(" ");
           
       }
       if(caso == 2 && equipado2 == 0){
           i2.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado2 = 1;
           
       }else if(caso == 2){
           i2.setText(" ");
           
       }
       if(caso == 3 && equipado3 == 0){
           i3.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado3 = 1;
           
       }else if(caso == 3){
           i3.setText(" ");
           
       }
       if(caso == 4 && equipado4 == 0){
           i4.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado4 = 1;
           
       }else if(caso == 4){
           i4.setText(" ");
           
       }
       if(caso == 5 && equipado5 == 0){
           i5.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado5 = 1;
           
       }else if(caso == 5){
           i5.setText(" ");
           
       }
       if(caso == 6 && equipado6 == 0){
           i6.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado6 = 1;
           
       }else if(caso == 6){
           i6.setText(" ");
           
       }
       if(caso == 7 && equipado7 == 0){
           i7.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado7 = 1;
           
       }else if(caso == 7){
           i7.setText(" ");
           
       }
       if(caso == 8 && equipado8 == 0){
           i8.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado8 = 1;
           
       }else if(caso == 8){
           i8.setText(" ");
           
       }
       if(caso == 9 && equipado9 == 0){
           i9.setText(" ");
           p1Resist = p1Resist - resResist;
           p1Atack = p1Atack - resAtack;
           p1Hp = p1Hp - resHp;
           p1Agi = p1Agi - resAgi;
           equipado9 = 1;
           
       }else if(caso == 9){
           i9.setText(" ");
           
       }
       venta = 0;/*se resetea el valor de venta*/
       /*se actualizan las etiquetas que contienen las stats del jugador*/
       resist.setText("RESISTENCIA: " + p1Resist);
       attack.setText("ATAQUE: " + p1Atack);
       agi.setText("AGILIDAD: " + p1Agi);
       hp.setText("SALUD: " + p1Hp);
       nombt = " ";/*se resetea la variable que cambia el nombre a los botones del inventario*/
       oroV.setVisible(false);
       oritopapa.setVisible(false);
       labelEquipado.setVisible(false);
    }//GEN-LAST:event_jButton20MouseClicked
        
    private void equiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiMouseClicked
           /*configuracion del boton de equipado*/
           /*los siguientes ifs buscan el boton sobre el que se hizo click, si el item ya esta equipado, se le restan las stats, ya 
           que mas adelante se le vuelven a sumar, de esta manera no puede equiparlo varias veces, si no esta equipado, se indica que esta
           equipado
           */
            if(caso == 1 && equipado1 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 1){
               equipado1 = 0;
           }
           if(caso == 2 && equipado2 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 2){
               equipado2 = 0;
           }
           if(caso == 3 && equipado3 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 3){
               equipado3 = 0;
           }
           if(caso == 4 && equipado4 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 4){
               equipado4 = 0;
           }
           if(caso == 5 && equipado5 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 5){
               equipado5 = 0;
           }
           if(caso == 6 && equipado6 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 6){
               equipado1 = 0;
           }
           if(caso == 7 && equipado7 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 7){
               equipado7 = 0;
           }
           if(caso == 8 && equipado8 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 8){
               equipado8 = 0;
           }
           if(caso == 9 && equipado9 == 0){
               p1Resist = p1Resist - resResist;
               p1Atack = p1Atack - resAtack;
               p1Hp = p1Hp - resHp;
               p1Agi = p1Agi - resAgi;
           } 
           if(caso == 9){
               equipado9 = 0;
           }
           /*las etiquetas que muestran las stats que recibiria si equipa un item se hacen invisibles*/
           eEResist.setVisible(false);
           eEAtack.setVisible(false);
           eEAgili.setVisible(false);
           eEHp.setVisible(false);
           /*se suman los stats*/
           p1Resist = p1Resist + resResist;
           p1Atack = p1Atack + resAtack;
           p1Hp = p1Hp + resHp;
           p1Agi = p1Agi + resAgi;
           labelEquipado.setVisible(false);
           /*se actualizan las etiquetas que contienen las stats del jugador*/
           resist.setText("RESISTENCIA: " + p1Resist);
           attack.setText("ATAQUE: " + p1Atack);
           agi.setText("AGILIDAD: " + p1Agi);
           hp.setText("SALUD: " + p1Hp);
    }//GEN-LAST:event_equiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agi;
    private javax.swing.JLabel attack;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel defense;
    private javax.swing.JLabel eEAgili;
    private javax.swing.JLabel eEAtack;
    private javax.swing.JLabel eEDefense;
    private javax.swing.JLabel eEHp;
    private javax.swing.JLabel eEResist;
    private javax.swing.JButton equi;
    private javax.swing.JLabel hp;
    private javax.swing.JButton i1;
    private javax.swing.JButton i2;
    private javax.swing.JButton i3;
    private javax.swing.JButton i4;
    private javax.swing.JButton i5;
    private javax.swing.JButton i6;
    private javax.swing.JButton i7;
    private javax.swing.JButton i8;
    private javax.swing.JButton i9;
    private javax.swing.JLabel inventF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelEquipado;
    private javax.swing.JLabel menosOro;
    private javax.swing.JLabel noOro;
    private javax.swing.JLabel oritopapa;
    private javax.swing.JLabel oroM;
    private javax.swing.JLabel oroPlayer;
    private javax.swing.JLabel oroV;
    private javax.swing.JButton plata;
    private javax.swing.JLabel resist;
    // End of variables declaration//GEN-END:variables
}
