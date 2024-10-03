package co.edu.unbosque.view;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {
	
	private PanelUsuario panelU;
	private PanelCliente panelC;
	private PanelClienteSugar PanelS;
	private PanelRegistro panelR;
	private PanelAdmin PanelA;
	private PanelAdminDatos PanelD;
	
	public VentanaPrincipal()
	{
		setTitle("Sugar APP");
		setSize(570, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.green);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(true);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes()
	{
		panelU = new PanelUsuario();
		getContentPane().add(panelU);
		
		panelC = new PanelCliente();
		getContentPane().add(panelC);
		
		PanelS = new PanelClienteSugar();
		getContentPane().add(PanelS);
		
		panelR = new  PanelRegistro();
		getContentPane().add(panelR);
		
		PanelA = new PanelAdmin();
		getContentPane().add(PanelA);
		
		PanelD = new PanelAdminDatos();
		getContentPane().add(PanelD);
	}
	
	public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

	public PanelUsuario getPanelU() {
		return panelU;
	}

	public void setPanelU(PanelUsuario panelU) {
		this.panelU = panelU;
	}

	public PanelCliente getPanelC() {
		return panelC;
	}

	public void setPanelC(PanelCliente panelC) {
		this.panelC = panelC;
	}

	public PanelClienteSugar getPanelS() {
		return PanelS;
	}

	public void setPanelS(PanelClienteSugar panelS) {
		PanelS = panelS;
	}

	public PanelRegistro getPanelR() {
		return panelR;
	}

	public void setPanelR(PanelRegistro panelR) {
		this.panelR = panelR;
	}

	public PanelAdmin getPanelA() {
		return PanelA;
	}

	public void setPanelA(PanelAdmin panelA) {
		PanelA = panelA;
	}

	public PanelAdminDatos getPanelD() {
		return PanelD;
	}

	public void setPanelD(PanelAdminDatos panelD) {
		PanelD = panelD;
	}

	
}
