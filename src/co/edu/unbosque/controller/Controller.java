package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.facade.Facade;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	ArchivoLog archivo = new ArchivoLog();
	//Facade facade = new Facade();
	ArchivoClientes archivoClientes = new ArchivoClientes();
	ArchivoParejas arcparejas = new ArchivoParejas();
	VentanaPrincipal ventana;
	
	public Controller() {
		ventana = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana.getPanelU().getBtnClienteU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioCliente();
				
			}
		});
		ventana.getPanelU().getBtnAdministradorU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioAdmin();
				
			}
		});
		ventana.getPanelU().getBtnRegistrarseU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioRegistro();
				
			}
		});
		ventana.getPanelA().getBtnVolverA().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelC().getBtnVolverC().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelR().getBtnVolverR().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelD().getBtnVolverD().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlAdmin();
				
			}
		});
		ventana.getPanelS().getBtnVolverS().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlCliente();
				
			}
		});
		/*
		 * ventana.getPanelC().getBtnIngresarC().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { verificarCliente();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelA().getBtnIngresarA().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { verificarAdmin();
		 * 
		 * } });
		 */ 
		ventana.getPanelR().getBotonRegistroCliente().addActionListener(this);
	}
	
	public void inicioCliente()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelC().setVisible(true);
		System.out.println("Cambio del panel inicial al panel de verificacion de cliente");
	}
	public void inicioAdmin()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelA().setVisible(true);
		System.out.println("Cambio del panel principal al panel de verificación de admin");
	}
	public void inicioRegistro()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelR().setVisible(true);
		System.out.println("Cambio del panel principal al panel de registro de cliente");
	}
	public void volverAlUsuario()
	{
		ventana.getPanelR().setVisible(false);
		ventana.getPanelC().setVisible(false);
		ventana.getPanelA().setVisible(false);
		ventana.getPanelU().setVisible(true);
		System.out.println("Cambio de los paneles al panel usuario");
	}
	public void volverAlAdmin()
	{
		ventana.getPanelD().setVisible(false);
		ventana.getPanelA().setVisible(true);
		System.out.println("Cambio de panel del crud al credenciales del admin");
	}
	public void volverAlCliente()
	{
		ventana.getPanelS().setVisible(false);
		ventana.getPanelC().setVisible(true);
		System.out.println("Cambio de panel manejo del cliente a credenciales del cliente");
	}
	/*public void verificarAdmin()
	{
		try {
			int id = Integer.parseInt(ventana.getPanelA().getTxtIdA().getText());
			String contraseña = ventana.getPanelA().getTxtContraseñaA().getText();
			
			Admin adminLogin = new Admin();
			adminLogin.setId(id);
			adminLogin.setContrasena(contraseña);
			boolean esValido = facade.loginAdmin(adminLogin);
			
			if (esValido) 
			{
			System.out.println("Admin verificado con exito");
			ventana.mostrarMensajeExito("Admin verificado con exito");
			ventana.getPanelA().setVisible(false);
			ventana.getPanelD().setVisible(false);
			}else
			{
				System.out.println("ID o contraseña incorrectos");
				ventana.mostrarMensajeExito("ID o contraseña incorrectos");
			}
			
		} catch (NumberFormatException e) 
		{
			System.out.println("El ID debe ser un numero entero");
			ventana.mostrarMensajeError("El ID debe ser un numero entero");
		}
	}*/
	/*public void verificarCliente()
	{
		try {
			int id = Integer.parseInt(ventana.getPanelC().getTxtIdC().getText());
			String contraseña = ventana.getPanelC().getTxtContraseñaC().getText();
			
			boolean esValido = facade.verificarCliente(id, contraseña);
					
				if (esValido) 
				{
				System.out.println("Cliente verificado con exito");
				ventana.mostrarMensajeExito("Cliente verificado con exito");
				ventana.getPanelC().setVisible(false);
				ventana.getPanelS().setVisible(true);
				}else
				{
					System.out.println("ID o contraseña incorrectos");
				    ventana.mostrarMensajeError("ID o contraseña incorrectos");
				}
		} catch (NumberFormatException e) 
		{
			System.out.println("El ID debe ser un numero entero");
			ventana.mostrarMensajeError("El ID debe ser un numero entero");
		}
	}*/
	
	public void escribirArchivoPlano() {
		archivo.escribirArchivo("Ingresar Texto");
	}
	
	public String leerArchivo() {
		return archivo.leerArchivo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
		String mensaje = ventana.getPanelR().getContraseña();
		
		System.out.println("mensaje: " + mensaje);
	}
	
	/*public void escribirArchivoBinario() {
		
		ArrayList<ClienteDTO> clientes = new ArrayList<>();
		ClienteDTO cliente = new ClienteDTO();
		cliente.setId(1212312312);
		cliente.setNombre("Eduardo");
		
		clientes.add(cliente);
		
		archivoClientes.escribirArchivo(clientes);
	}
	
	public ArrayList<ClienteDTO> devolverListadoClientes(){
		return archivoClientes.leerArchivo();
	}
	
	public void escribirArchivoProp() {
		arcparejas.escribirArchivo("vv", "prueba");
	}
	
	public String leerArchivoProp() throws IOException {
		arcparejas.leerArchivo();
		return arcparejas.getDatos().getProperty("vv");
<<<<<<< HEAD
	}*/
}