/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baillyj;

import javax.swing.*;
        import java.awt.*;

/**
 *
 * @author joris
 */
public class Panneau extends JPanel{
    JPanel main = new JPanel();
      public Panneau(){
        super();
    }
    
    public void paintComponent(Graphics g){
        
        // Calculer centre fenêtre (taille du panneau)
        int x = this.getWidth()/4;
        int y = this.getHeight()/4;

       int [] triX = {200,100,300};
       int [] triY = {200,100,300};



        
        // Dessiner l'ovale rouge plein (inscrit)
        g.setColor(Color.red);
        g.drawOval(x, y, this.getWidth()/2 , this.getHeight()/2);


        // Dessiner carré dans le rond
        g.setColor(Color.blue);
        g.drawRect(this.getWidth()/3 ,this.getHeight()/3 , this.getWidth()/3, this.getHeight()/3);

        // Dessiner le triangle dans le rond

        g.setColor(Color.orange);
        g.drawPolygon(triX ,triY , 3);


    }
}

