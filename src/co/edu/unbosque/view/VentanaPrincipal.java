package co.edu.unbosque.view;


import java.awt.Color;

import javax.swing.JFrame;

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
		setSize(500, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.green);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
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

}
