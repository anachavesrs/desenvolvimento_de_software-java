package grafica;

import java.awt.*;
import javax.swing.*;

import grafica.ActionCalcularArea.OpcaoForma;

public class FrmCalculadoraGeometrica extends JFrame {

    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;

    public FrmCalculadoraGeometrica(){

        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));


        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Raio:"));
        txtCircunferenciaRaio = new JTextField(10);
        pnl.add(txtCircunferenciaRaio);
        btnCircunferenciaCalcularArea = new JButton("Calcular");
        pnl.add(btnCircunferenciaCalcularArea);
        pnl.add(new JLabel("Area:"));
        txtCircunferenciaArea = new JTextField(10);
        pnl.add(txtCircunferenciaArea);

               
        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Base:"));
        txtRetanguloBase = new JTextField(10);
        pnl.add(txtRetanguloBase);
        pnl.add(new JLabel("Altura:"));
        txtRetanguloAltura = new JTextField(10);
        pnl.add(txtRetanguloAltura);
        btnRetanguloCalcularArea = new JButton("Calcular");
        pnl.add(btnRetanguloCalcularArea);
        pnl.add(new JLabel("Area:"));
        txtRetanguloArea = new JTextField(10);
        pnl.add(txtRetanguloArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triangulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Base:"));
        txtTrianguloBase = new JTextField(10);
        pnl.add(txtTrianguloBase);
        pnl.add(new JLabel("Altura:"));
        txtTrianguloAltura = new JTextField(10);
        pnl.add(txtTrianguloAltura);
        btnTrianguloCalcularArea = new JButton("Calcular");
        pnl.add(btnTrianguloCalcularArea);
        pnl.add(new JLabel("Area:"));
        txtTrianguloArea = new JTextField(10);
        pnl.add(txtTrianguloArea);

        pack();

        ActionCalcularArea action = new ActionCalcularArea(txtCircunferenciaRaio, OpcaoForma.CIRCULO, txtCircunferenciaArea);
        btnCircunferenciaCalcularArea.addActionListener(action);

        ActionCalcularArea action1 = new ActionCalcularArea(txtRetanguloBase, txtRetanguloAltura, OpcaoForma.RETANGULO, txtRetanguloArea);
        btnRetanguloCalcularArea.addActionListener(action1);

        ActionCalcularArea action2 = new ActionCalcularArea(txtTrianguloBase, txtTrianguloAltura, OpcaoForma.TRIANGULO, txtTrianguloArea);
        btnTrianguloCalcularArea.addActionListener(action2);
    }
}