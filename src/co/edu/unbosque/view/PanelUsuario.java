package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelUsuario extends JPanel
{
	private JLabel lblTitulo;
	private JButton btnCliente;
	private JButton btnAdministrador;
	private JButton btnRegistrarse;
	
	public PanelUsuario() 
	{
		setLayout(new GridLayout(4,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inializarComponentes();
		
		setVisible(true);
		
	}
	
	public void inializarComponentes()
	{
		lblTitulo = new JLabel("Sugar APP");
		add(lblTitulo);
		
		btnCliente = new JButton("Cliente");
		add(btnCliente);
		
		btnAdministrador = new JButton("Administrador");
		add(btnAdministrador);
		
		btnRegistrarse = new JButton("Registrarse");
		add(btnRegistrarse);
	}

}
