package libreriaWEB.artifactId.controladores;

import java.util.Iterator;
import java.util.List;
import libreriaWEB.artifactId.entidades.Libro;
import libreriaWEB.artifactId.repositorios.AutorRepositorio;
import libreriaWEB.artifactId.servicios.ErrorServicio;
import libreriaWEB.artifactId.servicios.LibroServicio;
import libreriaWEB.artifactId.servicios.AutorServicio;
import libreriaWEB.artifactId.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LibroControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @Autowired
    LibroServicio libroServicio;

    @Autowired
    AutorServicio autorServicio;

    @Autowired
    AutorRepositorio autorRepositorio;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro.html";
    }

    @PostMapping("/registro")
    public String crear(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String domicilio, @RequestParam String clave) throws ErrorServicio {
        usuarioServicio.crearUsuario(nombre, apellido, domicilio, clave);

        return "login.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
    @GetMapping("/inicio")
    public String inicio(){
        return "inicio.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
    @GetMapping("/listar")
    public String listarAdmin(ModelMap modelo) {
        String boton;
        List<Libro> libros = libroServicio.listarLibros();

        modelo.addAttribute("libros", libros);

        for (Iterator<Libro> iterator = libros.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            if (next.isAlta()) {
                boton = "Disable";
                modelo.addAttribute("boton", boton);

            } else {
                boton = "Enable";
                modelo.addAttribute("boton", boton);
            }
        }

        return "listado.html";
    }

    @GetMapping("/crear-libro")
    public String crear() {
        return "formulario-crear-libro.html";
    }

    @PostMapping("/crear-libro")
    public String crearL(@RequestParam String titulo, @RequestParam int anio, @RequestParam int ejemplares, @RequestParam String nombreAutor, @RequestParam String apellidoAutor, String nombreEditorial) throws ErrorServicio {
        libroServicio.crear(titulo, anio, ejemplares, nombreAutor, apellidoAutor, nombreEditorial);
        return "redirect:/listar";
    }

    @GetMapping("/modificar-libro")
    public String modificar() {
        return "modificar-libro.html";
    }
/////////////////////////////////Crear libro a autor///////////////////////////////////////////

    @GetMapping("/crear-libro-a-autor")
    public String crearLaA() {
        return "anadir-libro.html";
    }

    @PostMapping("/crear-libro-a-autor")
    public String anadir(@RequestParam Long id, @RequestParam String titulo, @RequestParam int anio, @RequestParam int ejemplares, @RequestParam String nombreEditorial) throws ErrorServicio {
        autorServicio.anadirLibro(id, titulo, anio, ejemplares, nombreEditorial);
        return "redirect:/listado-autores";
    }

    @GetMapping("/listado-autor-libros/{id}")
    public String listadoLibros(ModelMap modelo, @PathVariable("id") Long id) {
        List<Libro> libros = autorRepositorio.getById(id).getLibros();
        modelo.addAttribute("libros", libros);
        return "listado-autor-libros.html";
    }

    @PostMapping("listado-autor-libros/{id}")
    public String listadoL(ModelMap modelo, @PathVariable("id") Long id) {
        /*    List<Libro> libros = autorRepositorio.getById(id).getLibros();
        modelo.addAttribute("libros", libros);*/
        return "redirect:/listado-autor-libros.html";
    }

    @PostMapping("/modificar-libro")
    public String modificarL(@RequestParam Long isbn, @RequestParam String titulo, @RequestParam int anio, @RequestParam int ejemplares, @RequestParam String nombreAutor, @RequestParam String apellidoAutor, String nombreEditorial) throws ErrorServicio {
        libroServicio.modificarLibro(isbn, titulo, anio, ejemplares, nombreAutor, apellidoAutor, nombreEditorial);

        return "redirect:/listar";
    }

    @GetMapping("/eliminar-libro/{id}")
    public String eliminarL(@PathVariable("id") Long id) throws ErrorServicio {
        libroServicio.eliminar(id);
        return "redirect:/listar";
    }

    @GetMapping("/habilitar-libro/{id}")
    public String habilitarL(ModelMap modelo, @PathVariable("id") Long id) throws ErrorServicio {

        Libro libro = libroServicio.buscarXisbn(id);
        if (libro.isAlta()) {
            libroServicio.baja(id);
        } else {
            libroServicio.alta(id);
        }
        return "redirect:/listar";
    }


    
    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
    @GetMapping("/prestamo/{id}")
    public String prestamo(@PathVariable("id") Long id) throws ErrorServicio {
        Libro libro = libroServicio.buscarXisbn(id);
        if (libro.isAlta()) {
            libroServicio.baja(id);
        } else {
            libroServicio.alta(id);
        }
        return "redirect:/usuario/listarU";
    }
    
    
    ////////////////////////////////////////////////////////////////////////
    
  
    
}
