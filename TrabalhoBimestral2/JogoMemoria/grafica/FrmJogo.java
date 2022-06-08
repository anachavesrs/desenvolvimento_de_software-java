package grafica;
import javax.swing.JFrame;

public class FrmJogo extends JFrame {
    public FrmJogo () {
        super("Jogo da memória");
        this.setBounds(250, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
