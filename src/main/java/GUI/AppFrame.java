/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compression;
import comp_decomp.decompression;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author abhijit
 */
public class AppFrame extends JFrame implements ActionListener {
    
    JButton compressB;
    JButton decompressB;
    
    AppFrame(){
       
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     compressB = new JButton("Compress");  
     compressB.setBounds(20, 100 ,200 , 30);
     compressB.addActionListener(this);
     
     
     
     
     decompressB = new JButton("Decompress");
     decompressB.setBounds(250 , 100 ,200 ,30);
     decompressB.addActionListener(this);
     
     
     this.add(compressB);
     this.add(decompressB);
     
     this.setSize(1000,500);
     
     this.getContentPane().setBackground(Color.red);
     this.setVisible(true);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==compressB){
            
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println("file");
                try{
                    compression.method(file);
                }
                catch(IOException ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        
        if(e.getSource()==decompressB){
            
             JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println("file");
                try{
                    decompression.method(file);
                }
                catch(IOException ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
    
}
