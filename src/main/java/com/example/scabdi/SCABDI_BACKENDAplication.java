package com.example.scabdi;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.Categoria;
import com.example.scabdi.entity.Cliente;
import com.example.scabdi.entity.DetalleVenta;
import com.example.scabdi.entity.Empleado;
import com.example.scabdi.entity.Producto;
import com.example.scabdi.entity.Rol;
import com.example.scabdi.entity.Usuario;
import com.example.scabdi.entity.Venta;
import com.example.scabdi.repository.CategoriaRepository;
import com.example.scabdi.repository.ClienteRepository;
import com.example.scabdi.repository.DetalleVentaRepositoy;
import com.example.scabdi.repository.EmpleadoRepository;
import com.example.scabdi.repository.ProductoRepository;
import com.example.scabdi.repository.RolRepository;
import com.example.scabdi.repository.UsuarioRepository;
import com.example.scabdi.repository.VentaRepository;

@SpringBootApplication
public class SpringJpa2Application implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private DetalleVentaRepositoy detalleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		//Registrar empleado
		Empleado emp = new Empleado();
		emp.setNombres("Jonas");
		emp.setCargo("Gerente");
		//empleadoRepository.save(emp);
		//registrar Rol
		Rol r = new Rol();
		r.setNomrol("Adminstrador");
		//rolRepository.save(r);
		//registrar Cliente
		Cliente cl = new Cliente();
		cl.setNombres("Ruperto");
		cl.setApellidos("Marcos");
		cl.setDireccion("La era");
		cl.setTelefono("989102");
		//clienteRepository.save(emp);
		List<Rol> roles = rolRepository.findAll();
		Empleado empl = empleadoRepository.findById(1).get();
		Usuario u = new Usuario();
		u.setUsername("jonas123");
		u.setPassword("1234567");
		u.setRoles(roles);
		u.setEmpleado(empl);
		u.setEstado(1);
		//usuarioRepository.save(u);
		//e1 = empleadoRepository.findById(1).get();
		Usuario u1 = usuarioRepository.findById(7).get();
		Cliente c1 = clienteRepository.findById(1).get();
		Venta venta = new Venta();
		venta.setFecha(new Date(119, 6, 18));
		venta.setCliente(c1);
		venta.setUsuario(u1);
		//Categoria
		Categoria cat = new Categoria();
		cat.setNomcat("Lacteos");
		//categoriaRepository.save(cat);
		//ventaRepository.save(venta);
		Categoria cat1 = categoriaRepository.findById(1).get();
		Producto prod = new Producto();
		prod.setNombre("Leche Gloria");
		prod.setPrecio(3.5);
		prod.setStock(20);
		prod.setCategoria(cat1);
		//productoRepository.save(prod);
		Venta v1 = ventaRepository.findById(2).get();
		Producto p1 = productoRepository.findById(1).get();
		DetalleVenta dv = new DetalleVenta();
		dv.setPrecio(p1.getPrecio());
		dv.setCantidad(10);
		dv.setVenta(v1);
		dv.setProducto(p1);
		//detalleRepository.save(dv);
		
		
		
	}

}
