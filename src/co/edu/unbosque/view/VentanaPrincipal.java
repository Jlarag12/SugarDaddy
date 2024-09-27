package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private PanelUsuario panelU;
	
	public VentanaPrincipal()
	{
		setTitle("Sugar APP");
		setSize(500, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.green);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes()
	{
		panelU = new PanelUsuario();
		getContentPane().add(panelU);
		
	}

}
