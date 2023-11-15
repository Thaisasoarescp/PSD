import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela {
    private JButton arábicosRomanosButton;
    private JPanel Tela;
    private JButton romanosArábicosButton;
    private JTextField textField1;
    private JTextField textField2;

    public Tela() {
        romanosArábicosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Romanos r = new Romanos();
                String algarismo;
                algarismo = textField1.getText();

                String[] algarismos = algarismo.split("");
                for (int i = 0; i < algarismos.length - 3; i++) {
                    if (algarismos[i].equals(algarismos[i + 3])) {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                        System.exit(1);
                    }
                    i = i + 3;
                }
                ;
                int[] numero = new int[21];
                for (int i = 0; i < algarismos.length; i++) {
                    numero[i] = r.Conversao(algarismos[i]);
                }
                ;
                int numfinal = 0;
                for (int i = 0; i < (numero.length - 1); i++) {
                    if (numero[i] >= numero[i + 1]) {
                        numfinal = numfinal + numero[i];
                    } else {
                        numfinal = numfinal - numero[i];
                    }
                }
                JOptionPane.showMessageDialog(null,"Os algarismos digitados equivalem a " + numfinal);


            }
        });
        arábicosRomanosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arabicos a = new Arabicos();
                int numero;
                numero = Integer.parseInt(textField2.getText());
                String algfinal = a.ConversaoDois(numero);
                System.out.println(algfinal);
                JOptionPane.showMessageDialog(null,"Os algarismos digitados equivalem a " + algfinal);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Tela().Tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
