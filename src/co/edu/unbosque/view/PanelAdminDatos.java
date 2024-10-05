package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelAdminDatos extends JPanel
{
	private JPanel panel1D; 
	private JPanel panel2D;
	private JTextArea txtClientesD;
	private JLabel lblCrearD;  
	private JLabel lblEliminarD;
	private JLabel lblActualizarD;
	private JLabel lblMostrarD;
	private JLabel lblBorrarD;
	private JButton btnCrearD;
	private JButton btnEliminarD;
	private JButton btnActualizarD;
	private JButton btnBorrarD;
	private JButton btnVolverD;
	
	public PanelAdminDatos()
	{
		setLayout(new GridLayout(2,1));
		setBackground(new Color(36, 113, 163));
		setBounds(30, 60, 500, 470);
		inicializarPanel1();
		inicializarPanel2();
		
		add(panel1D);
		add(panel2D);
		
		setVisible(false);
	}
	public void inicializarPanel1() 
	{
		panel1D = new JPanel();
		panel1D.setLayout(new GridLayout(4,2));
		panel1D.setBackground(new Color(36, 113, 163));
		
		
		lblCrearD = new JLabel("Crear un cliente nuevo: ");
		lblCrearD.setOpaque(true);
		lblCrearD.setBackground(new Color(36, 113, 163));
		panel1D.add(lblCrearD);
		
		btnCrearD = new JButton("Crear");
		panel1D.add(btnCrearD);
		
		lblEliminarD = new JLabel("Eliminar cliente: ");
		lblEliminarD.setOpaque(true);
		lblEliminarD.setBackground(new Color(36, 113, 163));
		panel1D.add(lblEliminarD);
	
		btnEliminarD = new JButton("Eliminar");
		panel1D.add(btnEliminarD);
		
		lblActualizarD = new JLabel("Actulizar datos de algun cliente: ");
		lblActualizarD.setOpaque(true);
		lblActualizarD.setBackground(new Color(36, 113, 163));
		panel1D.add(lblActualizarD);
		
		btnActualizarD = new JButton("Actualizar");
		panel1D.add(btnActualizarD);
		
		lblEliminarD = new JLabel("Eliminar todas las parejas");
		lblEliminarD.setOpaque(true);
		lblEliminarD.setBackground(new Color(36, 113, 163));
		panel1D.add(lblEliminarD);
		
		btnBorrarD = new JButton("Borrar"); 
		panel1D.add(btnBorrarD);
	}
	
	public void inicializarPanel2()
	{
		panel2D = new JPanel();
		panel2D.setLayout(new GridLayout(3,1));
		panel2D.setBackground(new Color(36, 113, 163));
		
		lblMostrarD = new JLabel("Todos los clientes registrados: ");
		lblMostrarD.setOpaque(true);
		lblMostrarD.setBackground(new Color(36, 113, 163));
		panel2D.add(lblMostrarD);
		
		txtClientesD = new JTextArea();
		txtClientesD.setEditable(false);
		txtClientesD.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(txtClientesD);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
        panel2D.add(scrollPane);
        
        btnVolverD = new JButton("Volver a las credenciales");
        btnVolverD.setOpaque(true);
        btnVolverD.setBackground(Color.LIGHT_GRAY);
        panel2D.add(btnVolverD);
	}
	public JPanel getPanel1D() {
		return panel1D;
	}
	public void setPanel1D(JPanel panel1d) {
		panel1D = panel1d;
	}
	public JPanel getPanel2D() {
		return panel2D;
	}
	public void setPanel2D(JPanel panel2d) {
		panel2D = panel2d;
	}
	public JTextArea getTxtClientesD() {
		return txtClientesD;
	}
	public void setTxtClientesD(JTextArea txtClientesD) {
		this.txtClientesD = txtClientesD;
	}
	public JLabel getLblCrearD() {
		return lblCrearD;
	}
	public void setLblCrearD(JLabel lblCrearD) {
		this.lblCrearD = lblCrearD;
	}
	public JLabel getLblEliminarD() {
		return lblEliminarD;
	}
	public void setLblEliminarD(JLabel lblEliminarD) {
		this.lblEliminarD = lblEliminarD;
	}
	public JLabel getLblActualizarD() {
		return lblActualizarD;
	}
	public void setLblActualizarD(JLabel lblActualizarD) {
		this.lblActualizarD = lblActualizarD;
	}
	public JLabel getLblMostrarD() {
		return lblMostrarD;
	}
	public void setLblMostrarD(JLabel lblMostrarD) {
		this.lblMostrarD = lblMostrarD;
	}
	public JLabel getLblBorrarD() {
		return lblBorrarD;
	}
	public void setLblBorrarD(JLabel lblBorrarD) {
		this.lblBorrarD = lblBorrarD;
	}
	public JButton getBtnCrearD() {
		return btnCrearD;
	}
	public void setBtnCrearD(JButton btnCrearD) {
		this.btnCrearD = btnCrearD;
	}
	public JButton getBtnEliminarD() {
		return btnEliminarD;
	}
	public void setBtnEliminarD(JButton btnEliminarD) {
		this.btnEliminarD = btnEliminarD;
	}
	public JButton getBtnActualizarD() {
		return btnActualizarD;
	}
	public void setBtnActualizarD(JButton btnActualizarD) {
		this.btnActualizarD = btnActualizarD;
	}
	public JButton getBtnBorrarD() {
		return btnBorrarD;
	}
	public void setBtnBorrarD(JButton btnBorrarD) {
		this.btnBorrarD = btnBorrarD;
	}
	public JButton getBtnVolverD() {
		return btnVolverD;
	}
	public void setBtnVolverD(JButton btnVolverD) {
		this.btnVolverD = btnVolverD;
	}
	
}
