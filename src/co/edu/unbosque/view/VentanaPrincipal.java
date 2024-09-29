package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private PanelUsuario panelU;
	private PanelCliente panelC;
	private PanelRegistro panelR;
	
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
		
		panelR = new  PanelRegistro();
		getContentPane().add(panelR);
	}

}
