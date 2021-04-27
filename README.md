# Create a Simple Java Class with GUI elements.
### Create a Java class to print your name, nationality and biggest dream.
### Requirements:
- You need to display the results on screen using a JFrame;


## Starting the Project
#### Starting Code
 - The objective  here is print on screen a name, nationality and biggest dream.
 - To make this simple project we use  the GUI concepts,  so let's start.
 - We use a basic html to display the informations inside a JLabel, because I am a great dreamer and my dreams has many letters and words to display.
 
 
## Begin Explain source code MySefl.JAVA
- I create the Package named myself

```java
	package myself;
```
- We need import 3 GUI Swing to built the interfaces.

* JLabel - To print the text.
* JPanel - To receive the JLabel components.
* JFrame - A windou to receive JPanel.

```java
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
```
- Now we create a class named MySelf that's gona be our object to start with the GUI .
```java
public class MySelf {}
```
- Now we create a contructor inside and make a reference in a main. 
```java
public class MySelf {
       public MySelf(){

        about();
    }
	    public static void main(String [] args) throws Exception {
        new MySelf();
```
- Following we make a  JPanel and a JLabel, and put the text inside with an html to display, and after this we call a label from panel. 
```java
public void about() {

        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText("<html>Name: Ademir Quirino <br/>From: Brazil<br/>My biggest dream:  Live in a  country more fair, I love my<br/>country for all it is,but lately doesn’t have been a fair place<br/>to live in very ways,Also, I hope to give my family a healthier<br/>and peaceful, providing all of their needs. I hope  everyone in<br/>the world will be more concients about the world problems, too.<br/>I mean the problems we cause to our planet, like the environmental<br/>issues, pollution and climate change.<br/>Professionally, I hope to work at a place who shares the same ideal<br/>with me and provide me the tools to make this real.</html>");

        panel.add(label);
```
- To finish we make a window to receve a JPanel and display the result, here we put some atributes to JFrame, like the size, name and actions.
```java
 JFrame frame = new JFrame("Who Am I");
        frame.add(panel);
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

```
### The entire code.
```java
package myself;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySelf {
    public MySelf() {

        about();
    }

    public void about() {

        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText("<html>Name: Ademir Quirino <br/>From: Brazil<br/>My biggest dream:  Live in a  country more fair, I love my<br/>country for all it is,but lately doesn’t have been a fair place<br/>to live in very ways,Also, I hope to give my family a healthier<br/>and peaceful, providing all of their needs. I hope  everyone in<br/>the world will be more concients about the world problems, too.<br/>I mean the problems we cause to our planet, like the environmental<br/>issues, pollution and climate change.<br/>Professionally, I hope to work at a place who shares the same ideal<br/>with me and provide me the tools to make this real.</html>");

        panel.add(label);

        JFrame frame = new JFrame("Who Am I");
        frame.add(panel);
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new MySelf();
    }

}
```
### The Result

![](https://github.com/ademirqj/javaclass/blob/master/jar/imgresult.png)

### Notes
Also I created a .jar and a .bat to display the app in Windows System.
That is it.

### End

