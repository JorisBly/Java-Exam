package Baillyj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    // Panneau de contenu
    private JPanel main = new JPanel();
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();
   private Panneau monPan = new Panneau();
    private JButton reset = new JButton("RESET");
    private JComboBox comboCol = new JComboBox();
    private ButtonGroup bgroup = new ButtonGroup();
    private JRadioButton forme1, forme2, forme3;
    private JLabel label = new JLabel("Taille :");
    private final JTextField dimx,dimy; 

    public Fenetre() {

        super();

        // Fenetre
        this.setTitle("Examen POO - Année 2021-22");
        this.setSize(794, 791);
         this.setMinimumSize(new Dimension (593,539));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(new Panneau());


        main.setBackground(Color.white);
        main.setLayout(new BorderLayout());
       
        // Selection Couleur
        comboCol.setPreferredSize(new Dimension(200, 20));

        comboCol.addItem("Gris");
        comboCol.addItem("Blanc");
        comboCol.addItem("Jaune");
        comboCol.addItem("Vert");

        comboCol.addActionListener(new stateListener());

        //  Radio bouton 1
        forme1 = new JRadioButton("Carré");
        bgroup.add(forme1);
        bottom.add(forme1);
        forme1.addActionListener(new radioListener());


        // Radio bouton 2
        forme2 = new JRadioButton("Triangle");
        bgroup.add(forme2);
        bottom.add(forme2);
        forme2.addActionListener(new radioListener());


        // Radio bouton 3
        forme3 = new JRadioButton("Pentagone");
        
        bgroup.add(forme3);
        
        bottom.add(forme3);
        
        forme3.addActionListener(new radioListener());
        
        // Bouton RESET

    // action listener qui ne fonctionne pas comme prévu !!!!
 //    reset.addActionListener(new ResetListener());

 
 
      // Récupérer la taille de la fenêtre
      
     Dimension frameSize = this.getSize();
       

        // Paramètre des JTextField
        
        dimx = new JTextField();
        dimx.setPreferredSize(new Dimension(50,20));
        dimx.setEditable(false);
        dimx.setBackground (Color.LIGHT_GRAY) ;
        
        // Mettre le ComponentListener au Premier JTextField

         
        
          dimy = new JTextField();
        dimy.setPreferredSize(new Dimension(50,20));
        dimy.setEditable(false);
        dimy.setBackground (Color.LIGHT_GRAY) ;
       

        // Ajouter les panneaux à la fenetre 
       
        main.add(top, BorderLayout.NORTH);

        main.add(bottom, BorderLayout.SOUTH);
        
        main.add(monPan, BorderLayout.CENTER);
        
        
        
        // Ajout des composants au Différents panneau
        monPan.setBackground(Color.lightGray);
        bottom.add(reset);
        top.add(comboCol);
        top.add(label);
        top.add(dimx);
        top.add(dimy);



       this.setContentPane(main);
       
        this.setVisible(true);

        // récupérer la Taille de la frame

        this.addComponentListener(new ComponentAdapter() {


            public void componentResized(ComponentEvent e) {
               Component sizeOfFrame = e.getComponent();
               int height = sizeOfFrame.getHeight();
                int width = sizeOfFrame.getWidth();
                 dimx.setText(String.valueOf(width));
                 dimy.setText(String.valueOf(height));


            }


        })


    ;}


     


     
     
     

    // Action Radio (Forme)
    class radioListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (forme1.isSelected()) {
                main.setBackground(Color.RED);

            } else if (forme2.isSelected()){
                main.setBackground(Color.BLUE);

            } else {
                main.setBackground(Color.GREEN);
            }
        }
    }

    // Action ComboBox (Couleur)
    class stateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (comboCol.getSelectedIndex() == 0) {
                main.setBackground(Color.gray);
            } else if (comboCol.getSelectedIndex() == 1) {
                main.setBackground(Color.white);
            } else if (comboCol.getSelectedIndex() == 2) {
                main.setBackground(Color.yellow);
            } else if (comboCol.getSelectedIndex() == 3) {
                main.setBackground(Color.green);
            }
        }

        class ResetListener implements ActionListener {

            public void actionPerformed(ActionEvent arg0) {

                main.setBackground(Color.gray);
                comboCol.setSelectedItem(false);
            }
        }
    }
}
    
 
