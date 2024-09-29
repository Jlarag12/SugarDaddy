package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelCliente extends JPanel
{

	private JLabel lblTituloC;
	private JLabel lblInstruccionC;
	private JTextArea txtIdentidadC;
	private JButton btnIngresarC;
	
	public PanelCliente() 
	{
		setLayout(new GridLayout(4,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inicialiarComponentes();
		
		setVisible(true);
	}
	
	public void inicialiarComponentes()
	{
		lblTituloC = new JLabel("Cliente", SwingConstants.CENTER);
		//lblTituloC.setOpaque(true);
		//lblTituloC.setBackground(Color.green);
		add(lblTituloC);
		
		lblInstruccionC = new JLabel("Ingrese su numero de identidad: ", SwingConstants.CENTER);
		//lblInstruccionC.setOpaque(true);
		//lblInstruccionC.setBackground(Color.green);
		add(lblInstruccionC);
		
		txtIdentidadC = new JTextArea();
		add(txtIdentidadC);
		
		btnIngresarC = new JButton("Ingresar");
		add(btnIngresarC);
		
	}
}
