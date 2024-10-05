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

	private JLabel lblIdC;
	private JLabel lblContraseñaC;
	private JTextArea txtIdC;
	private JTextArea txtContraseñaC;
	private JButton btnIngresarC;
	private JButton btnVolverC;
	
	public PanelCliente() 
	{
		setLayout(new GridLayout(6,1));
		setBackground(new Color(36, 113, 163));
		setBounds(30, 60, 500, 470);
		inicializarComponentes();
		
		setVisible(false);
	}
	
	public void inicializarComponentes()
	{
		
		
		lblIdC = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdC.setOpaque(true);
		lblIdC.setBackground(new Color(36, 113, 163));
		add(lblIdC);
		
		txtIdC = new JTextArea();
		add(txtIdC);
		
		lblContraseñaC = new JLabel("Ingrese si Contraseña:", SwingConstants.CENTER);
		lblContraseñaC.setOpaque(true);
		lblContraseñaC.setBackground(new Color(36, 113, 163));
		add(lblContraseñaC);
		
		txtContraseñaC = new JTextArea();
		add(txtContraseñaC);
		
		btnIngresarC = new JButton("Ingresar");
		add(btnIngresarC);
		
		btnVolverC = new JButton("Volver");
		btnVolverC.setOpaque(true);
		btnVolverC.setBackground(Color.LIGHT_GRAY);
		add(btnVolverC);
		
	}

	public JLabel getLblIdC() {
		return lblIdC;
	}

	public void setLblIdC(JLabel lblIdC) {
		this.lblIdC = lblIdC;
	}

	public JLabel getLblContraseñaC() {
		return lblContraseñaC;
	}

	public void setLblContraseñaC(JLabel lblContraseñaC) {
		this.lblContraseñaC = lblContraseñaC;
	}

	public JTextArea getTxtIdC() {
		return txtIdC;
	}

	public void setTxtIdC(JTextArea txtIdC) {
		this.txtIdC = txtIdC;
	}

	public JTextArea getTxtContraseñaC() {
		return txtContraseñaC;
	}

	public void setTxtContraseñaC(JTextArea txtContraseñaC) {
		this.txtContraseñaC = txtContraseñaC;
	}

	public JButton getBtnIngresarC() {
		return btnIngresarC;
	}

	public void setBtnIngresarC(JButton btnIngresarC) {
		this.btnIngresarC = btnIngresarC;
	}

	public JButton getBtnVolverC() {
		return btnVolverC;
	}

	public void setBtnVolverC(JButton btnVolverC) {
		this.btnVolverC = btnVolverC;
	}
	
	
}
