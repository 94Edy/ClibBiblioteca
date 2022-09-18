
package modelo;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://Modelo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param pkUsuarioId
     * @return
     *     returns modelo.User
     */
    @WebMethod(operationName = "ListarPrestamosId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarPrestamosId", targetNamespace = "http://Modelo/", className = "modelo.ListarPrestamosId")
    @ResponseWrapper(localName = "ListarPrestamosIdResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarPrestamosIdResponse")
    @Action(input = "http://Modelo/Servicios/ListarPrestamosIdRequest", output = "http://Modelo/Servicios/ListarPrestamosIdResponse")
    public User listarPrestamosId(
        @WebParam(name = "pkUsuarioId", targetNamespace = "")
        int pkUsuarioId);

    /**
     * 
     * @param correoU
     * @param fkcarreraId
     * @param nombresU
     * @param cedulaU
     * @param fknivelAcademicoId
     * @param fkformacionAcademicaId
     * @param pkUsuarioId
     * @param apellidosU
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarUsuario", targetNamespace = "http://Modelo/", className = "modelo.ActualizarUsuario")
    @ResponseWrapper(localName = "ActualizarUsuarioResponse", targetNamespace = "http://Modelo/", className = "modelo.ActualizarUsuarioResponse")
    @Action(input = "http://Modelo/Servicios/ActualizarUsuarioRequest", output = "http://Modelo/Servicios/ActualizarUsuarioResponse")
    public String actualizarUsuario(
        @WebParam(name = "pk_UsuarioId", targetNamespace = "")
        int pkUsuarioId,
        @WebParam(name = "cedulaU", targetNamespace = "")
        int cedulaU,
        @WebParam(name = "nombresU", targetNamespace = "")
        String nombresU,
        @WebParam(name = "apellidosU", targetNamespace = "")
        String apellidosU,
        @WebParam(name = "correoU", targetNamespace = "")
        String correoU,
        @WebParam(name = "fkcarreraId", targetNamespace = "")
        int fkcarreraId,
        @WebParam(name = "fknivelAcademicoId", targetNamespace = "")
        int fknivelAcademicoId,
        @WebParam(name = "fkformacionAcademicaId", targetNamespace = "")
        int fkformacionAcademicaId);

    /**
     * 
     * @param fechaDevolucion
     * @param fkPrestamoId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GuardarDevolucion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GuardarDevolucion", targetNamespace = "http://Modelo/", className = "modelo.GuardarDevolucion")
    @ResponseWrapper(localName = "GuardarDevolucionResponse", targetNamespace = "http://Modelo/", className = "modelo.GuardarDevolucionResponse")
    @Action(input = "http://Modelo/Servicios/GuardarDevolucionRequest", output = "http://Modelo/Servicios/GuardarDevolucionResponse")
    public String guardarDevolucion(
        @WebParam(name = "fechaDevolucion", targetNamespace = "")
        String fechaDevolucion,
        @WebParam(name = "fkPrestamoId", targetNamespace = "")
        int fkPrestamoId);

    /**
     * 
     * @return
     *     returns java.util.List<modelo.User>
     */
    @WebMethod(operationName = "ListarDevoluciones")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarDevoluciones", targetNamespace = "http://Modelo/", className = "modelo.ListarDevoluciones")
    @ResponseWrapper(localName = "ListarDevolucionesResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarDevolucionesResponse")
    @Action(input = "http://Modelo/Servicios/ListarDevolucionesRequest", output = "http://Modelo/Servicios/ListarDevolucionesResponse")
    public List<User> listarDevoluciones();

    /**
     * 
     * @param cedula
     * @param contrasenia
     * @param cargo
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Validar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Validar", targetNamespace = "http://Modelo/", className = "modelo.Validar")
    @ResponseWrapper(localName = "ValidarResponse", targetNamespace = "http://Modelo/", className = "modelo.ValidarResponse")
    @Action(input = "http://Modelo/Servicios/ValidarRequest", output = "http://Modelo/Servicios/ValidarResponse")
    public int validar(
        @WebParam(name = "cedula", targetNamespace = "")
        int cedula,
        @WebParam(name = "contrasenia", targetNamespace = "")
        String contrasenia,
        @WebParam(name = "cargo", targetNamespace = "")
        String cargo);

    /**
     * 
     * @param pkUsuarioId
     * @return
     *     returns modelo.User
     */
    @WebMethod(operationName = "EliminarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarUsuario", targetNamespace = "http://Modelo/", className = "modelo.EliminarUsuario")
    @ResponseWrapper(localName = "EliminarUsuarioResponse", targetNamespace = "http://Modelo/", className = "modelo.EliminarUsuarioResponse")
    @Action(input = "http://Modelo/Servicios/EliminarUsuarioRequest", output = "http://Modelo/Servicios/EliminarUsuarioResponse")
    public User eliminarUsuario(
        @WebParam(name = "pk_UsuarioId", targetNamespace = "")
        int pkUsuarioId);

    /**
     * 
     * @param ciudadM
     * @param editorialM
     * @param incluyeCd
     * @param paisM
     * @param estadoM
     * @param autorM
     * @param edicionM
     * @param anioPublicacionM
     * @param tituloM
     * @param tipoM
     * @param registroISBNM
     * @param nroEjemplaresM
     * @param codigoM
     * @param nroPaginasM
     * @param tiempoVigenciaM
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GuardarLibro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GuardarLibro", targetNamespace = "http://Modelo/", className = "modelo.GuardarLibro")
    @ResponseWrapper(localName = "GuardarLibroResponse", targetNamespace = "http://Modelo/", className = "modelo.GuardarLibroResponse")
    @Action(input = "http://Modelo/Servicios/GuardarLibroRequest", output = "http://Modelo/Servicios/GuardarLibroResponse")
    public String guardarLibro(
        @WebParam(name = "codigoM", targetNamespace = "")
        String codigoM,
        @WebParam(name = "autorM", targetNamespace = "")
        String autorM,
        @WebParam(name = "edicionM", targetNamespace = "")
        String edicionM,
        @WebParam(name = "anioPublicacionM", targetNamespace = "")
        String anioPublicacionM,
        @WebParam(name = "tituloM", targetNamespace = "")
        String tituloM,
        @WebParam(name = "ciudadM", targetNamespace = "")
        String ciudadM,
        @WebParam(name = "paisM", targetNamespace = "")
        String paisM,
        @WebParam(name = "editorialM", targetNamespace = "")
        String editorialM,
        @WebParam(name = "registroISBNM", targetNamespace = "")
        String registroISBNM,
        @WebParam(name = "nroPaginasM", targetNamespace = "")
        int nroPaginasM,
        @WebParam(name = "estadoM", targetNamespace = "")
        String estadoM,
        @WebParam(name = "nroEjemplaresM", targetNamespace = "")
        int nroEjemplaresM,
        @WebParam(name = "incluyeCd", targetNamespace = "")
        String incluyeCd,
        @WebParam(name = "tipoM", targetNamespace = "")
        String tipoM,
        @WebParam(name = "tiempoVigenciaM", targetNamespace = "")
        String tiempoVigenciaM);

    /**
     * 
     * @param pkLibroId
     * @return
     *     returns modelo.User
     */
    @WebMethod(operationName = "EliminarLibro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarLibro", targetNamespace = "http://Modelo/", className = "modelo.EliminarLibro")
    @ResponseWrapper(localName = "EliminarLibroResponse", targetNamespace = "http://Modelo/", className = "modelo.EliminarLibroResponse")
    @Action(input = "http://Modelo/Servicios/EliminarLibroRequest", output = "http://Modelo/Servicios/EliminarLibroResponse")
    public User eliminarLibro(
        @WebParam(name = "pk_LibroId", targetNamespace = "")
        int pkLibroId);

    /**
     * 
     * @return
     *     returns java.util.List<modelo.User>
     */
    @WebMethod(operationName = "ListarPrestamos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarPrestamos", targetNamespace = "http://Modelo/", className = "modelo.ListarPrestamos")
    @ResponseWrapper(localName = "ListarPrestamosResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarPrestamosResponse")
    @Action(input = "http://Modelo/Servicios/ListarPrestamosRequest", output = "http://Modelo/Servicios/ListarPrestamosResponse")
    public List<User> listarPrestamos();

    /**
     * 
     * @param correoU
     * @param fkCarreraId
     * @param fkNivelAcademicoId
     * @param nombresU
     * @param cedulaU
     * @param fkFormacionAcademicaId
     * @param apellidosU
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GuardarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GuardarUsuario", targetNamespace = "http://Modelo/", className = "modelo.GuardarUsuario")
    @ResponseWrapper(localName = "GuardarUsuarioResponse", targetNamespace = "http://Modelo/", className = "modelo.GuardarUsuarioResponse")
    @Action(input = "http://Modelo/Servicios/GuardarUsuarioRequest", output = "http://Modelo/Servicios/GuardarUsuarioResponse")
    public String guardarUsuario(
        @WebParam(name = "cedulaU", targetNamespace = "")
        int cedulaU,
        @WebParam(name = "nombresU", targetNamespace = "")
        String nombresU,
        @WebParam(name = "apellidosU", targetNamespace = "")
        String apellidosU,
        @WebParam(name = "correoU", targetNamespace = "")
        String correoU,
        @WebParam(name = "fk_carreraId", targetNamespace = "")
        int fkCarreraId,
        @WebParam(name = "fk_nivelAcademicoId", targetNamespace = "")
        int fkNivelAcademicoId,
        @WebParam(name = "fk_formacionAcademicaId", targetNamespace = "")
        int fkFormacionAcademicaId);

    /**
     * 
     * @param pkLibroId
     * @return
     *     returns modelo.User
     */
    @WebMethod(operationName = "ListarLibrosId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarLibrosId", targetNamespace = "http://Modelo/", className = "modelo.ListarLibrosId")
    @ResponseWrapper(localName = "ListarLibrosIdResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarLibrosIdResponse")
    @Action(input = "http://Modelo/Servicios/ListarLibrosIdRequest", output = "http://Modelo/Servicios/ListarLibrosIdResponse")
    public User listarLibrosId(
        @WebParam(name = "pkLibroId", targetNamespace = "")
        int pkLibroId);

    /**
     * 
     * @param fechaDevolucion
     * @param fechaPrestamo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CalculoFechas")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalculoFechas", targetNamespace = "http://Modelo/", className = "modelo.CalculoFechas")
    @ResponseWrapper(localName = "CalculoFechasResponse", targetNamespace = "http://Modelo/", className = "modelo.CalculoFechasResponse")
    @Action(input = "http://Modelo/Servicios/CalculoFechasRequest", output = "http://Modelo/Servicios/CalculoFechasResponse")
    public String calculoFechas(
        @WebParam(name = "fechaPrestamo", targetNamespace = "")
        String fechaPrestamo,
        @WebParam(name = "fechaDevolucion", targetNamespace = "")
        String fechaDevolucion);

    /**
     * 
     * @param pkUsuarioId
     * @return
     *     returns modelo.User
     */
    @WebMethod(operationName = "ListarUsuariosId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarUsuariosId", targetNamespace = "http://Modelo/", className = "modelo.ListarUsuariosId")
    @ResponseWrapper(localName = "ListarUsuariosIdResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarUsuariosIdResponse")
    @Action(input = "http://Modelo/Servicios/ListarUsuariosIdRequest", output = "http://Modelo/Servicios/ListarUsuariosIdResponse")
    public User listarUsuariosId(
        @WebParam(name = "pk_UsuarioId", targetNamespace = "")
        int pkUsuarioId);

    /**
     * 
     * @param cedula
     * @param contrasenia
     * @param cargo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Guardarlogin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Guardarlogin", targetNamespace = "http://Modelo/", className = "modelo.Guardarlogin")
    @ResponseWrapper(localName = "GuardarloginResponse", targetNamespace = "http://Modelo/", className = "modelo.GuardarloginResponse")
    @Action(input = "http://Modelo/Servicios/GuardarloginRequest", output = "http://Modelo/Servicios/GuardarloginResponse")
    public String guardarlogin(
        @WebParam(name = "cedula", targetNamespace = "")
        int cedula,
        @WebParam(name = "contrasenia", targetNamespace = "")
        String contrasenia,
        @WebParam(name = "cargo", targetNamespace = "")
        String cargo);

    /**
     * 
     * @param ciudadM
     * @param editorialM
     * @param incluyeCd
     * @param paisM
     * @param estadoM
     * @param autorM
     * @param edicionM
     * @param anioPublicacionM
     * @param tituloM
     * @param tipoM
     * @param registroISBNM
     * @param nroEjemplaresM
     * @param codigoM
     * @param nroPaginasM
     * @param tiempoVigenciaM
     * @param pkLibrosId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarLibro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarLibro", targetNamespace = "http://Modelo/", className = "modelo.ActualizarLibro")
    @ResponseWrapper(localName = "ActualizarLibroResponse", targetNamespace = "http://Modelo/", className = "modelo.ActualizarLibroResponse")
    @Action(input = "http://Modelo/Servicios/ActualizarLibroRequest", output = "http://Modelo/Servicios/ActualizarLibroResponse")
    public String actualizarLibro(
        @WebParam(name = "pk_librosId", targetNamespace = "")
        int pkLibrosId,
        @WebParam(name = "codigoM", targetNamespace = "")
        String codigoM,
        @WebParam(name = "autorM", targetNamespace = "")
        String autorM,
        @WebParam(name = "edicionM", targetNamespace = "")
        String edicionM,
        @WebParam(name = "anioPublicacionM", targetNamespace = "")
        String anioPublicacionM,
        @WebParam(name = "tituloM", targetNamespace = "")
        String tituloM,
        @WebParam(name = "ciudadM", targetNamespace = "")
        String ciudadM,
        @WebParam(name = "paisM", targetNamespace = "")
        String paisM,
        @WebParam(name = "editorialM", targetNamespace = "")
        String editorialM,
        @WebParam(name = "registroISBNM", targetNamespace = "")
        String registroISBNM,
        @WebParam(name = "nroPaginasM", targetNamespace = "")
        int nroPaginasM,
        @WebParam(name = "estadoM", targetNamespace = "")
        String estadoM,
        @WebParam(name = "nroEjemplaresM", targetNamespace = "")
        int nroEjemplaresM,
        @WebParam(name = "incluyeCd", targetNamespace = "")
        String incluyeCd,
        @WebParam(name = "tipoM", targetNamespace = "")
        String tipoM,
        @WebParam(name = "tiempoVigenciaM", targetNamespace = "")
        String tiempoVigenciaM);

    /**
     * 
     * @return
     *     returns java.util.List<modelo.User>
     */
    @WebMethod(operationName = "ListarUsuarios")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarUsuarios", targetNamespace = "http://Modelo/", className = "modelo.ListarUsuarios")
    @ResponseWrapper(localName = "ListarUsuariosResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarUsuariosResponse")
    @Action(input = "http://Modelo/Servicios/ListarUsuariosRequest", output = "http://Modelo/Servicios/ListarUsuariosResponse")
    public List<User> listarUsuarios();

    /**
     * 
     * @return
     *     returns java.util.List<modelo.User>
     */
    @WebMethod(operationName = "ListarLibros")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarLibros", targetNamespace = "http://Modelo/", className = "modelo.ListarLibros")
    @ResponseWrapper(localName = "ListarLibrosResponse", targetNamespace = "http://Modelo/", className = "modelo.ListarLibrosResponse")
    @Action(input = "http://Modelo/Servicios/ListarLibrosRequest", output = "http://Modelo/Servicios/ListarLibrosResponse")
    public List<User> listarLibros();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Modelo/", className = "modelo.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Modelo/", className = "modelo.HelloResponse")
    @Action(input = "http://Modelo/Servicios/helloRequest", output = "http://Modelo/Servicios/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param fklibroId
     * @param fechaPrestamo
     * @param fkUsuarioId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GuardarPrestamo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GuardarPrestamo", targetNamespace = "http://Modelo/", className = "modelo.GuardarPrestamo")
    @ResponseWrapper(localName = "GuardarPrestamoResponse", targetNamespace = "http://Modelo/", className = "modelo.GuardarPrestamoResponse")
    @Action(input = "http://Modelo/Servicios/GuardarPrestamoRequest", output = "http://Modelo/Servicios/GuardarPrestamoResponse")
    public String guardarPrestamo(
        @WebParam(name = "fechaPrestamo", targetNamespace = "")
        String fechaPrestamo,
        @WebParam(name = "fkUsuarioId", targetNamespace = "")
        int fkUsuarioId,
        @WebParam(name = "fklibroId", targetNamespace = "")
        int fklibroId);

}