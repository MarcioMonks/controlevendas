package br.com.monks_store.model;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {
    
    public void LimpaTela(JPanel container) {
        Component components[] = container.getComponents();
        for(Component component : components) {
            if(component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }
        
}
