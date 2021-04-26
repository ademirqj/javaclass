package myself;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MySelf {
       public MySelf(){

        about();
    }
    public void about() {   

        JPanel panel = new JPanel();
        JLabel label = new JLabel();              
        label.setText("<html>Name: Ademir Quirino <br/>From: Brazil<br/>My biggest dream:  Live in a  country more fair, I love my<br/>country for all it is,but lately doesn’t have been a fair place<br/>to live in very ways,Also, I hope to give my family a healthier<br/>and peaceful, providing all of their needs. I hope  everyone in<br/>the world will be more concients about the world problems, too.<br/>I mean the problems we cause to our planet, like the environmental<br/>issues, pollution and climate change.<br/>Professionally, I hope to work at a place who shares the same ideal<br/>with me and provide me the tools to make this real.</html>");

       
        panel.add(label );   
        
        JFrame frame = new JFrame("Who Am I");
        frame.add(panel);             
        frame.setSize(450,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        

    }

    public static void main(String [] args) throws Exception {
        new MySelf();
    }
    
}