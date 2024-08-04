package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import main.Consultar;
import main.Usuario;
import main.Zona;
import main.Serializable;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsuarioAdministrador extends Usuario {
    protected Consultar consultar; // Supongo que Consultar es una clase que gestiona consultas
    protected String nombreUsuario;
    protected String contrasena;
    public ArrayList<UsuarioEmpleado> lista = new ArrayList<>();
    private BD sistemaState;
    private Consultar consultaDelitos;
    private Consultar consultaSucursales;
    private Consultar consultaBanco;
    private Consultar consultaContrato;
    private Consultar consultaDelincuente;

    

    public UsuarioAdministrador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public void CambioPaswordAdmin() {
        Scanner copia = new Scanner(System.in);

        boolean seCambioContraseña ;
        do {
            System.out.println("Ingrese la nueva contraseña: ");
            String nuevaContrasena =copia.nextLine();
	    seCambioContraseña = nuevaContrasena.equals("adminPass");
            System.out.println(seCambioContraseña);
			
            if (!seCambioContraseña) {
                this.contrasena = nuevaContrasena; // Actualiza la contraseña solo si es diferente
                System.out.println("Contraseña cambiada exitosamente.");
		
            }else{
                System.out.println("La nueva contraseña no puede ser igual a la actual. Intente nuevamente.");
            }			
        } while (contrasena.equals("adminPass")); // Continúa mientras la contraseña actual sea "adminPass"
        
        System.out.println("Contraseña cambiada .");

    }
  
    public Consultar getConsultar() {
        return consultar;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void serializarDatos() {
        // Implementación de la serialización de datos
    }

    public void agregarSocio() {
        // Implementación de agregar socio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Su Nombre: ");
        String nombre=scanner.nextLine();
        System.out.println("Ingrese Su Direccion: ");
        String direccion=scanner.nextLine();
        System.out.println("Ingrese Su Dni: ");
        String dni=scanner.nextLine();
        System.out.println("Ingrese Su Telefono: ");
        String telefono=scanner.nextLine();
        System.out.println("Ingrese la fecha de asignación del garage (YYYY-MM-DD): ");
        LocalDate fechaAsignacionGarage = LocalDate.parse(scanner.nextLine());
        
        UsuarioSocio socio = new UsuarioSocio();
        socio.setNombreUsuario(nombreUsuario);
        socio.setDireccion(direccion);
        socio.setDni(dni);
        socio.setFecha(fechaAsignacionGarage);
        socio.setTelefono(telefono);
        
        //Serializable.listaSocios.add(socio);
        
        System.out.println("Socio agregado exitosamente:");
        System.out.println("Nombre Usuario: " + socio.getNombreUsuario());
        System.out.println("Dni: " + socio.getDni());
        System.out.println("Telefono: " + socio.getTelefono());
        System.out.println("Direccion: " + socio.getDireccion());
        System.out.println("Fecha de asignación del garage: " + socio.getFechaIngreso());
        
    }

    public void quitarSocio() {
        // Implementación de quitar socio
    }

    public void modificarSocio() {
        // Implementación de modificar socio
    }
    
    public void agregarEmpleado() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String especialidad = scanner.nextLine();
        
        UsuarioEmpleado nuevoEmpleado = new UsuarioEmpleado(nombreEmpleado);
        lista.add(new UsuarioEmpleado(nombreEmpleado, direccion, telefono, especialidad));;
        for (UsuarioEmpleado empleado : lista) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("DNI: " + empleado.getDni());
            System.out.println("Dirección: " + empleado.getDireccion());
            System.out.println("Contraseña: " + empleado.getContrasena());
            System.out.println();
        }
       
        
    }
    public void quitarEmpleado() {
        // Implementación de quitar empleado
    }

    public void modificarEmpleado() {
        // Implementación de modificar empleado
    }

    public void agregarVehiculo() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la matrícula del vehículo: ");
    String matricula = scanner.nextLine();
    System.out.println("Ingrese el nombre del vehículo: ");
    String nombre = scanner.nextLine();
    System.out.println("Ingrese el tipo de vehículo: ");
    String tipo = scanner.nextLine();
    System.out.println("Ingrese las dimensiones del vehículo: ");
    int dimensiones = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    System.out.println("Ingrese la fecha de asignación del garage (YYYY-MM-DD): ");
    LocalDate fechaAsignacionGarage = LocalDate.parse(scanner.nextLine());

    Vehiculo vehiculo = new Vehiculo();
    vehiculo.setMatricula(matricula);
    vehiculo.setNombre(nombre);
    vehiculo.setTipo(tipo);
    vehiculo.setDimensiones(dimensiones);
    vehiculo.setFecha(fechaAsignacionGarage);

    // Agregar vehículo directamente a la lista estática en Serializable
    //Serializable.listaVehi.add(vehiculo);

    // Serializar los datos después de agregar el vehículo
    //Serializable.serializar();

    System.out.println("Vehículo agregado exitosamente:");
    System.out.println("Matrícula: " + vehiculo.getMatricula());
    System.out.println("Nombre: " + vehiculo.getNombre());
    System.out.println("Tipo: " + vehiculo.getTipo());
    System.out.println("Dimensiones: " + vehiculo.getDimensiones());
    System.out.println("Fecha de asignación del garage: " + vehiculo.getFechaAsignacionGarage());
}


    public void quitarVehiculo() {
        // Implementación de quitar vehículo
    }

    public void modificarVehiculo() {
        // Implementación de modificar vehículo
    }

    public void agregarZona() {
        // Implementación de agregar zona
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el caracter Caracteristico: ");
        char letra=scanner.next().charAt(0);
        System.out.println("Ingrese el tipo de vehiculo: ");
        String tipoVehiculo=scanner.nextLine();
        System.out.println("Ingrese la cantidad de autos que puede haber: ");
        int cantVehiculos=scanner.nextInt();
        System.out.println("Ingrese la profundidad de la zona: ");
        double profundidad=scanner.nextInt();
        System.out.println("Ingrese el ancho de la zona: ");
        double ancho=scanner.nextInt();
        
        Zona zon1=new Zona();
        zon1.setLetra(letra);
        zon1.setTipoVehiculo(tipoVehiculo);
        zon1.setNumVehiculo(cantVehiculos);
        zon1.setProfundidad(profundidad);
        zon1.setAncho(ancho);
        //Serializable.listaZona.add(zon1);
        
        System.out.println("Zona agregado exitosamente:");
        System.out.println("Tipo Vehiculo: " + zon1.getTipoVehiculos());
        System.out.println("Cant vehiculos: " + zon1.getNumeroVehiculos());
        System.out.println("Profundidad: " + zon1.getProfundidad());
        System.out.println("Ancho: " + zon1.getAncho());
        System.out.println("Letra: " + zon1.getLetra());
        
        
    }

    public void quitarZona() {
        // Implementación de quitar zona
    }

    public void modificarZona() {
        // Implementación de modificar zona
    }

    @Override
    public String toString() {
        return "UsuarioAdministrador{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
    public void serializar(String path) {
        try {
            sistemaState.serializar(path);
        } catch (IOException ex) {
            EntradaSalida.mostrarError(ex.getMessage());
        }
    }

    @Override
    public int GetMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //---------------------------------------------------------------------------------------------------------------
    public class Menu {
        /*
        public void mostrarMenuPrincipal() {
            boolean continuarOperando = true;
            int opcion;

            do {
                opcion = mostrar("1- Consultar información\n2- Crear\n3- Modificar información\n4- Eliminar información\n0- Salir", "Error. Ingrese una opción válida", 0, 4, 3);

                switch (opcion) {
                    case 1:
                        consultarInformacion();
                        break;
                    case 2:
                        crear();
                        break;
                    case 3:
                        modificarInformacion();
                        break;
                    case 4:
                        eliminarInformacion();
                        break;
                    case 0:
                        continuarOperando = false;
                        break;
                }
            } while (continuarOperando);
        }
        */
        public void consultarInformacion() {
            int opcionConsulta;
            boolean menuAnterior = false;

            do {
                opcionConsulta = mostrar("1- Consultar Socio (por DNI)\n2- Consultar Empleados (por DNI)\n3- Consultar Vehículo (por Patente)\n4- Consultar Garage (por Numero)\n5- Consultar Zona (por Letra)\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 5, 3);

                switch (opcionConsulta) {
                    case 1:
                        // método para consultar socio por DNI
                        break;
                    case 2:
                        // método para consultar empleados por DNI
                        break;
                    case 3:
                        // método para consultar vehículo por Patente
                        break;
                    case 4:
                        consultarGarage();
                        break;
                    case 5:
                        // método para consultar zona por Letra
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public void consultarGarage() {
            int opcionGarage;
            boolean menuAnterior = false;

            do {
                opcionGarage = mostrar("1- Modificar Garage\n2- Liberar Garage\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 2, 3);

                switch (opcionGarage) {
                    case 1:
                        // método para modificar garage
                        break;
                    case 2:
                        // método para liberar garage
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public void crear() {
            int opcionCrear;
            boolean menuAnterior = false;

            do {
                opcionCrear = mostrar("1- Crear Socio\n2- Crear Empleados\n3- Crear Vehículo\n4- Crear Garage\n5- Crear Zona\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 5, 3);

                switch (opcionCrear) {
                    case 1:
                        // método para crear socio
                        break;
                    case 2:
                        // método para crear empleados
                        break;
                    case 3:
                        // método para crear vehículo
                        break;
                    case 4:
                        // método para crear garage
                        break;
                    case 5:
                        // método para crear zona
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public void modificarInformacion() {
            int opcionModificar;
            boolean menuAnterior = false;

            do {
                opcionModificar = mostrar("1- Modificar Socio (por DNI)\n2- Modificar Empleados (por DNI)\n3- Modificar Vehículo (por Patente)\n4- Modificar Garage (por Numero)\n5- Modificar Zona (por Letra)\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 5, 3);

                switch (opcionModificar) {
                    case 1:
                        // método para modificar socio por DNI
                        break;
                    case 2:
                        // método para modificar empleados por DNI
                        break;
                    case 3:
                        // método para modificar vehículo por Patente
                        break;
                    case 4:
                        modificarGarage();
                        break;
                    case 5:
                        // método para modificar zona por Letra
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public void modificarGarage() {
            int opcionModificarGarage;
            boolean menuAnterior = false;

            do {
                opcionModificarGarage = mostrar("1- Modificar Garage\n2- Liberar Garage\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 2, 3);

                switch (opcionModificarGarage) {
                    case 1:
                        // método para modificar garage
                        break;
                    case 2:
                        // método para liberar garage
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public void eliminarInformacion() {
            int opcionEliminar;
            boolean menuAnterior = false;

            do {
                opcionEliminar = mostrar("1- Eliminar Socio (por DNI)\n2- Eliminar Empleados (por DNI)\n3- Eliminar Vehículo (por Patente)\n4- Eliminar Zona (por Letra)\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 4, 3);

                switch (opcionEliminar) {
                    case 1:
                        // método para eliminar socio por DNI
                        break;
                    case 2:
                        // método para eliminar empleados por DNI
                        break;
                    case 3:
                        // método para eliminar vehículo por Patente
                        break;
                    case 4:
                        // método para eliminar zona por Letra
                        break;
                    case 0:
                        menuAnterior = true;
                        break;
                }
            } while (!menuAnterior);
        }

        public int mostrar(String opciones, String error, int desde, int hasta, int cantidad) {
            int opcion = 0;
            return opcion;
            }
        }

    public ArrayList<UsuarioEmpleado> getLista() {
        return lista;
    }

    public BD getSistemaState() {
        return sistemaState;
    }

    public Consultar getConsultaDelitos() {
        return consultaDelitos;
    }

    public Consultar getConsultaSucursales() {
        return consultaSucursales;
    }

    public Consultar getConsultaBanco() {
        return consultaBanco;
    }

    public Consultar getConsultaContrato() {
        return consultaContrato;
    }

    public Consultar getConsultaDelincuente() {
        return consultaDelincuente;
    }

    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setLista(ArrayList<UsuarioEmpleado> lista) {
        this.lista = lista;
    }

    public void setSistemaState(BD sistemaState) {
        this.sistemaState = sistemaState;
    }

    public void setConsultaDelitos(Consultar consultaDelitos) {
        this.consultaDelitos = consultaDelitos;
    }

    public void setConsultaSucursales(Consultar consultaSucursales) {
        this.consultaSucursales = consultaSucursales;
    }

    public void setConsultaBanco(Consultar consultaBanco) {
        this.consultaBanco = consultaBanco;
    }

    public void setConsultaContrato(Consultar consultaContrato) {
        this.consultaContrato = consultaContrato;
    }

    public void setConsultaDelincuente(Consultar consultaDelincuente) {
        this.consultaDelincuente = consultaDelincuente;
    }
    
    /*
    public static Usuario nuevoUsuario(String u, String p, BD sist) {
        UsuarioAdministrador user = new UsuarioAdmin(sist);
        user.setContrasena(p);
        user.setNombreUsuario(u);
        return user;
    }
    */
}