package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import logica.Circulo;
import logica.Retangulo;
import logica.Triangulo;

public class ActionCalcularArea extends AbstractAction{
    public enum OpcaoForma{
        CIRCULO,
        RETANGULO,
        TRIANGULO
    }

    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private OpcaoForma opcaoForma;

    public ActionCalcularArea(JTextField txtRaio, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtRaio = txtRaio;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;
    }
    public ActionCalcularArea(JTextField txtBase, JTextField txtAltura, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.opcaoForma) {
            case CIRCULO:
                double raio = Double.parseDouble(txtRaio.getText());
                Circulo circulo = new Circulo(raio);
                double area = circulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;     
                
                case RETANGULO:
                double baseRetangulo = Double.parseDouble(txtBase.getText());
                double alturaRetangulo = Double.parseDouble(txtAltura.getText());
                Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);                
                double areaRetangulo = retangulo.calcularArea();
                txtArea.setText(String.format("%f", areaRetangulo));
                break;

            case TRIANGULO:
                double baseTriangulo = Double.parseDouble(txtBase.getText());
                double alturaTriangulo = Double.parseDouble(txtAltura.getText());
                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);                
                double areaTriangulo = triangulo.calcularArea();
                txtArea.setText(String.format("%f", areaTriangulo));
                break;
            
        }
        
    }

}