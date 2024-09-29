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

	private JLabel lblIdC,lblContraseñaC;
	private JTextArea txtIdC,txtContraseñaC;
	private JButton btnIngresarC;
	
	public PanelCliente() 
	{
		setLayout(new GridLayout(5,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inicialiarComponentes();
		
		setVisible(false);
	}
	
	public void inicialiarComponentes()
	{
		
		
		lblIdC = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdC.setOpaque(true);
		lblIdC.setBackground(Color.green);
		add(lblIdC);
		
		txtIdC = new JTextArea();
		add(txtIdC);
		
		lblContraseñaC = new JLabel("Ingrese si Contraseña:", SwingConstants.CENTER);
		lblContraseñaC.setOpaque(true);
		lblContraseñaC.setBackground(Color.green);
		add(lblContraseñaC);
		
		txtContraseñaC = new JTextArea();
		add(txtContraseñaC);
		
		btnIngresarC = new JButton("Ingresar");
		add(btnIngresarC);
		
	}
}
