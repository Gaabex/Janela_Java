
package newpackage;

import javax.swing.*;

public class JanelaPersonalizada extends JFrame{
        public JanelaPersonalizada (String mensagem, String nome, int largura, int altura){
           super (nome);
           JLabel texto = new JLabel (mensagem);
           this.add(texto);

           setSize(largura,altura);
           setVisible(true);

           setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
}
