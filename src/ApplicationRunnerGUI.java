import java.awt.*;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.*; 
import java.lang.ProcessBuilder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ApplicationRunnerGUI extends JFrame {
    // JFrame 
    static JFrame f;

    // JButtons and JLabels 
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;
    static JLabel l;

    public static void main(String[] args) {        
        // Create a new frame 
        f = new JFrame("ApplicationRunnerGUI");  

        // Create the centered title label
        String label = "Welcome to the Data Science Toolbox! Please run one of the following applications:";

        l = new JLabel(label);
  
        // Create buttons for applications along with their ActionListener
        b1 = new JButton("RStudio");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("xdg-open http://host.docker.internal:8787");
                    int exitCode = process.waitFor();
                } catch (Exception e1) {
                    System.out.println(e1 + "Could not open RStudio!");
                } 
            }
        }); 

        b2 = new JButton("Spyder");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("docker run --rm -it spyder");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println("Could not open Spyder!");
                } catch (InterruptedException e2) {
                    System.out.println("Could not open Spyder!");
                }
            }
        }); 

        b3 = new JButton("IBM SAS");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("xdg-open https://welcome.oda.sas.com/login");
                    int exitCode = process.waitFor();
                } catch (Exception e1) {
                    System.out.println(e1 + ": Could not open IBM SAS!");
                } 
            }
        }); 

        b4 = new JButton("Git");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("docker run --rm -it git");
                    int exitCode = process.waitFor();
                } catch (IOException e1) {
                    System.out.println(e1 + ": Could not open Git!");
                } catch (InterruptedException e2) {
                    System.out.println(e2 + ": Could not open Git!");
                }
            }
        }); 

        b5 = new JButton("Jupyter Notebook");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("docker run --rm -it jupyter_notebook");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println(e1 + ": Could not open Jupyter Notebook!");
                } catch (InterruptedException e2) {
                    System.out.println(e2 + ": Could not open Jupyter Notebook!");
                }
            }
        }); 

        b6 = new JButton("Orange");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("xdg-open http://host.docker.internal:6901");
                    int exitCode = process.waitFor();
                } catch (Exception e1) {
                    System.out.println(e1 + "Could not open Orange!");
                } 
            }
        }); 

        b7 = new JButton("Visual Studio Code IDE");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("docker run --rm -it vscode");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println(e1 + ": Could not open Visual Studio Code IDE!");
                } catch (InterruptedException e2) {
                    System.out.println(e2 + ": Could not open Visual Studio Code IDE!");
                }
            }
        }); 

        b8 = new JButton("Apache Hadoop");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("docker run --rm -it hadoop");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println(e1 + ": Could not open Apache Hadoop!");
                } catch (InterruptedException e2) {
                    System.out.println(e2 + ": Could not open Apache Hadoop!");
                }
            }
        }); 

        b9 = new JButton("Apache Spark");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("open", "/Applications/Calculator.app");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println(e1 + ": Could not open Apache Spark!");
                } catch (InterruptedException e2) {
                    System.out.println(e2 + ": Could not open Apache Spark!");
                }
            }
        }); 

        b10 = new JButton("Tableau");
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("xdg-open https://sso.online.tableau.com/public/idp/SSO");
                    int exitCode = process.waitFor();
                } catch (Exception e1) {
                    System.out.println(e1 + "Could not open Tableau!");
                } 
            }
        }); 

        b11 = new JButton("SonarQube and SonarScanner binaries");
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("open", "/Applications/Calculator.app");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println("Could not open SonarQube and SonarScanner binaries!");
                } catch (InterruptedException e2) {
                    System.out.println("Could not open SonarQube and SonarScanner binaries!");
                }
            }
        }); 

        b12 = new JButton("TensorFlow");
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("xterm -hold -e /usr/bin/docker run -it --rm tensorflow/tensorflow:latest");
                    int exitCode = process.waitFor();
                } catch (Exception e1) {
                    System.out.println(e1 + "Could not open TensorFlow!");
                } 
            }
        }); 

        b13 = new JButton("Markdown");
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("open", "/Applications/Calculator.app");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println("Could not open Markdown!");
                } catch (InterruptedException e2) {
                    System.out.println("Could not open Markdown!");
                }
            }
        }); 

        b14 = new JButton("Notepad++");
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder pb = new ProcessBuilder("open", "/Applications/Calculator.app");
                    Process p = pb.start();
                    int exitCode = p.waitFor();
                } catch (IOException e1) {
                    System.out.println("Could not open Notepad++!");
                } catch (InterruptedException e2) {
                    System.out.println("Could not open Notepad++!");
                }
            }
        }); 


        // Create a panels for labels, text, empty panels, for the buttons
        JPanel infoPanel = new JPanel();

        JPanel emptyPanel = new JPanel();

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new GridBagLayout());
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new GridBagLayout()); 
        
        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new GridBagLayout()); 
        
        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new GridBagLayout()); 
        
        JPanel buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(new GridBagLayout()); 
        
        JPanel buttonPanel6 = new JPanel();
        buttonPanel6.setLayout(new GridBagLayout()); 
        
        JPanel buttonPanel7 = new JPanel();
        buttonPanel7.setLayout(new GridBagLayout()); 
  
        // Add label to panel 
        infoPanel.add(l);

        // Add buttons to panel
        buttonPanel1.add(b1);
        buttonPanel1.add(b2);
        buttonPanel2.add(b3);
        buttonPanel2.add(b4);
        buttonPanel3.add(b5);
        buttonPanel3.add(b6);
        buttonPanel4.add(b7);
        buttonPanel4.add(b8);
        buttonPanel5.add(b9);
        buttonPanel5.add(b10);
        buttonPanel6.add(b11);
        buttonPanel6.add(b12);
        buttonPanel7.add(b13);
        buttonPanel7.add(b14);

        // Add panels to frame 
        f.setContentPane(infoPanel);
        
        f.add(emptyPanel);

        f.add(buttonPanel1);
        f.add(buttonPanel2);
        f.add(buttonPanel3);
        f.add(buttonPanel4);
        f.add(buttonPanel5);
        f.add(buttonPanel6);
        f.add(buttonPanel7);
  
        // Set the size of frame 
        f.setSize(600, 300); 
        f.show(); 
    }
}