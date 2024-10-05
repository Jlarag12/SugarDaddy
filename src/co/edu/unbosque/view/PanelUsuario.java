package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelUsuario extends JPanel
{
	private JLabel lblTituloU;
	private JButton btnClienteU;
	private JButton btnAdministradorU;
	private JButton btnRegistrarseU;

	
	public PanelUsuario() 
	{
		setLayout(new GridLayout(4,1));
		setBackground(new Color(36, 113, 163));
		setBounds(50, 75, 450, 450);
		inializarComponentes();
		
		setVisible(false);
		
	}
	
	public void inializarComponentes()
	{
		lblTituloU = new JLabel("Sugar APP", SwingConstants.CENTER);
		lblTituloU.setOpaque(true);
		add(lblTituloU);
		
		btnClienteU = new JButton("Cliente");
		add(btnClienteU);
		
		btnAdministradorU = new JButton("Administrador");
		add(btnAdministradorU);
		
		btnRegistrarseU = new JButton("Registrarse");
		add(btnRegistrarseU);
	}

	public JLabel getLblTituloU() {
		return lblTituloU;
	}

	public void setLblTituloU(JLabel lblTituloU) {
		this.lblTituloU = lblTituloU;
	}

	public JButton getBtnClienteU() {
		return btnClienteU;
	}

	public void setBtnClienteU(JButton btnClienteU) {
		this.btnClienteU = btnClienteU;
	}

	public JButton getBtnAdministradorU() {
		return btnAdministradorU;
	}

	public void setBtnAdministradorU(JButton btnAdministradorU) {
		this.btnAdministradorU = btnAdministradorU;
	}

	public JButton getBtnRegistrarseU() {
		return btnRegistrarseU;
	}

	public void setBtnRegistrarseU(JButton btnRegistrarseU) {
		this.btnRegistrarseU = btnRegistrarseU;
	}
	
	

}
