package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelUsuario extends JPanel
{
	private JLabel lblTitulo;
	private JButton btnCliente;
	private JButton btnAdministrador;
	private JButton btnRegistarse;
	
	public PanelUsuario() 
	{
		setLayout(new FlowLayout());
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		
		setVisible(true);
		
	}
	
	public void inializarComponentes()
	{
		//lblTitulo
	}

}
