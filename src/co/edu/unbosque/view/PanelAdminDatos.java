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
	private JPanel panel1D, panel2D;
	private JTextArea txtClientesD;
	private JLabel lblCrearD, lblEliminarD, lblActualizarD, lblMostrarD;
	private JButton btnCrearD, btnEliminarD, btnActualizarD;
	
	public PanelAdminDatos()
	{
		setLayout(new GridLayout(2,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inicializarPanel1();
		inicializarPanel2();
		
		add(panel1D);
		add(panel2D);
		
		setVisible(true);
	}
	public void inicializarPanel1() 
	{
		panel1D = new JPanel();
		panel1D.setLayout(new GridLayout(3,2));
		panel1D.setBackground(Color.green);
		
		
		lblCrearD = new JLabel("Crear un cliente nuevo: ");
		lblCrearD.setOpaque(true);
		lblCrearD.setBackground(Color.green);
		panel1D.add(lblCrearD);
		
		btnCrearD = new JButton("Crear");
		panel1D.add(btnCrearD);
		
		lblEliminarD = new JLabel("Eliminar cliente: ");
		lblEliminarD.setOpaque(true);
		lblEliminarD.setBackground(Color.green);
		panel1D.add(lblEliminarD);
	
		btnEliminarD = new JButton("Eliminar");
		panel1D.add(btnEliminarD);
		
		lblActualizarD = new JLabel("Actulizar datos de algun cliente: ");
		lblActualizarD.setOpaque(true);
		lblActualizarD.setBackground(Color.green);
		panel1D.add(lblActualizarD);
		
		btnActualizarD = new JButton("Actulizar");
		panel1D.add(btnActualizarD);
	}
	
	public void inicializarPanel2()
	{
		panel2D = new JPanel();
		panel2D.setLayout(new GridLayout(2,1));
		panel2D.setBackground(Color.green);
		
		lblMostrarD = new JLabel("Todos los clientes registrados: ");
		lblMostrarD.setOpaque(true);
		lblMostrarD.setBackground(Color.green);
		panel2D.add(lblMostrarD);
		
		txtClientesD = new JTextArea();
		txtClientesD.setEditable(false);
		txtClientesD.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(txtClientesD);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
        panel2D.add(scrollPane);
	}
	

}
