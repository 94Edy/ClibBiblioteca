
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioPublicacionM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidosU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carreraId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cedulaU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ciudadM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contasenia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edicionM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorialM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPrestamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fk_carreraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fk_formacionAcademicaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fk_nivelAcademicoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formacionAcademicaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incluyeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelAcademicoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombresU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroEjemplaresM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nroPaginasM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paisM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pk_devolucionesId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pk_librosId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pk_prestamosId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pk_usuariosId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="registroISBNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiempoVigenciaM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "anioPublicacionM",
    "apellidosU",
    "autorM",
    "cargo",
    "carreraId",
    "cedula",
    "cedulaU",
    "ciudadM",
    "codigoM",
    "contasenia",
    "correoU",
    "edicionM",
    "editorialM",
    "estadoM",
    "fechaDevolucion",
    "fechaPrestamo",
    "fkCarreraId",
    "fkFormacionAcademicaId",
    "fkNivelAcademicoId",
    "formacionAcademicaId",
    "incluyeCd",
    "nivelAcademicoId",
    "nombresU",
    "nroEjemplaresM",
    "nroPaginasM",
    "paisM",
    "pkDevolucionesId",
    "pkLibrosId",
    "pkPrestamosId",
    "pkUsuariosId",
    "registroISBNM",
    "tiempoVigenciaM",
    "tipoM",
    "tituloM"
})
public class User {

    protected String anioPublicacionM;
    protected String apellidosU;
    protected String autorM;
    protected String cargo;
    protected String carreraId;
    protected int cedula;
    protected int cedulaU;
    protected String ciudadM;
    protected String codigoM;
    protected String contasenia;
    protected String correoU;
    protected String edicionM;
    protected String editorialM;
    protected String estadoM;
    protected String fechaDevolucion;
    protected String fechaPrestamo;
    @XmlElement(name = "fk_carreraId")
    protected int fkCarreraId;
    @XmlElement(name = "fk_formacionAcademicaId")
    protected int fkFormacionAcademicaId;
    @XmlElement(name = "fk_nivelAcademicoId")
    protected int fkNivelAcademicoId;
    protected String formacionAcademicaId;
    protected String incluyeCd;
    protected String nivelAcademicoId;
    protected String nombresU;
    protected int nroEjemplaresM;
    protected int nroPaginasM;
    protected String paisM;
    @XmlElement(name = "pk_devolucionesId")
    protected int pkDevolucionesId;
    @XmlElement(name = "pk_librosId")
    protected int pkLibrosId;
    @XmlElement(name = "pk_prestamosId")
    protected int pkPrestamosId;
    @XmlElement(name = "pk_usuariosId")
    protected int pkUsuariosId;
    protected String registroISBNM;
    protected String tiempoVigenciaM;
    protected String tipoM;
    protected String tituloM;

    /**
     * Obtiene el valor de la propiedad anioPublicacionM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioPublicacionM() {
        return anioPublicacionM;
    }

    /**
     * Define el valor de la propiedad anioPublicacionM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioPublicacionM(String value) {
        this.anioPublicacionM = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidosU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidosU() {
        return apellidosU;
    }

    /**
     * Define el valor de la propiedad apellidosU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidosU(String value) {
        this.apellidosU = value;
    }

    /**
     * Obtiene el valor de la propiedad autorM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorM() {
        return autorM;
    }

    /**
     * Define el valor de la propiedad autorM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorM(String value) {
        this.autorM = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad carreraId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarreraId() {
        return carreraId;
    }

    /**
     * Define el valor de la propiedad carreraId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarreraId(String value) {
        this.carreraId = value;
    }

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     */
    public void setCedula(int value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaU.
     * 
     */
    public int getCedulaU() {
        return cedulaU;
    }

    /**
     * Define el valor de la propiedad cedulaU.
     * 
     */
    public void setCedulaU(int value) {
        this.cedulaU = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadM() {
        return ciudadM;
    }

    /**
     * Define el valor de la propiedad ciudadM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadM(String value) {
        this.ciudadM = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoM() {
        return codigoM;
    }

    /**
     * Define el valor de la propiedad codigoM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoM(String value) {
        this.codigoM = value;
    }

    /**
     * Obtiene el valor de la propiedad contasenia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContasenia() {
        return contasenia;
    }

    /**
     * Define el valor de la propiedad contasenia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContasenia(String value) {
        this.contasenia = value;
    }

    /**
     * Obtiene el valor de la propiedad correoU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoU() {
        return correoU;
    }

    /**
     * Define el valor de la propiedad correoU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoU(String value) {
        this.correoU = value;
    }

    /**
     * Obtiene el valor de la propiedad edicionM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdicionM() {
        return edicionM;
    }

    /**
     * Define el valor de la propiedad edicionM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdicionM(String value) {
        this.edicionM = value;
    }

    /**
     * Obtiene el valor de la propiedad editorialM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorialM() {
        return editorialM;
    }

    /**
     * Define el valor de la propiedad editorialM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorialM(String value) {
        this.editorialM = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoM() {
        return estadoM;
    }

    /**
     * Define el valor de la propiedad estadoM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoM(String value) {
        this.estadoM = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Define el valor de la propiedad fechaDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDevolucion(String value) {
        this.fechaDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Define el valor de la propiedad fechaPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPrestamo(String value) {
        this.fechaPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad fkCarreraId.
     * 
     */
    public int getFkCarreraId() {
        return fkCarreraId;
    }

    /**
     * Define el valor de la propiedad fkCarreraId.
     * 
     */
    public void setFkCarreraId(int value) {
        this.fkCarreraId = value;
    }

    /**
     * Obtiene el valor de la propiedad fkFormacionAcademicaId.
     * 
     */
    public int getFkFormacionAcademicaId() {
        return fkFormacionAcademicaId;
    }

    /**
     * Define el valor de la propiedad fkFormacionAcademicaId.
     * 
     */
    public void setFkFormacionAcademicaId(int value) {
        this.fkFormacionAcademicaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fkNivelAcademicoId.
     * 
     */
    public int getFkNivelAcademicoId() {
        return fkNivelAcademicoId;
    }

    /**
     * Define el valor de la propiedad fkNivelAcademicoId.
     * 
     */
    public void setFkNivelAcademicoId(int value) {
        this.fkNivelAcademicoId = value;
    }

    /**
     * Obtiene el valor de la propiedad formacionAcademicaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormacionAcademicaId() {
        return formacionAcademicaId;
    }

    /**
     * Define el valor de la propiedad formacionAcademicaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormacionAcademicaId(String value) {
        this.formacionAcademicaId = value;
    }

    /**
     * Obtiene el valor de la propiedad incluyeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncluyeCd() {
        return incluyeCd;
    }

    /**
     * Define el valor de la propiedad incluyeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncluyeCd(String value) {
        this.incluyeCd = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelAcademicoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelAcademicoId() {
        return nivelAcademicoId;
    }

    /**
     * Define el valor de la propiedad nivelAcademicoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelAcademicoId(String value) {
        this.nivelAcademicoId = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombresU() {
        return nombresU;
    }

    /**
     * Define el valor de la propiedad nombresU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombresU(String value) {
        this.nombresU = value;
    }

    /**
     * Obtiene el valor de la propiedad nroEjemplaresM.
     * 
     */
    public int getNroEjemplaresM() {
        return nroEjemplaresM;
    }

    /**
     * Define el valor de la propiedad nroEjemplaresM.
     * 
     */
    public void setNroEjemplaresM(int value) {
        this.nroEjemplaresM = value;
    }

    /**
     * Obtiene el valor de la propiedad nroPaginasM.
     * 
     */
    public int getNroPaginasM() {
        return nroPaginasM;
    }

    /**
     * Define el valor de la propiedad nroPaginasM.
     * 
     */
    public void setNroPaginasM(int value) {
        this.nroPaginasM = value;
    }

    /**
     * Obtiene el valor de la propiedad paisM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisM() {
        return paisM;
    }

    /**
     * Define el valor de la propiedad paisM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisM(String value) {
        this.paisM = value;
    }

    /**
     * Obtiene el valor de la propiedad pkDevolucionesId.
     * 
     */
    public int getPkDevolucionesId() {
        return pkDevolucionesId;
    }

    /**
     * Define el valor de la propiedad pkDevolucionesId.
     * 
     */
    public void setPkDevolucionesId(int value) {
        this.pkDevolucionesId = value;
    }

    /**
     * Obtiene el valor de la propiedad pkLibrosId.
     * 
     */
    public int getPkLibrosId() {
        return pkLibrosId;
    }

    /**
     * Define el valor de la propiedad pkLibrosId.
     * 
     */
    public void setPkLibrosId(int value) {
        this.pkLibrosId = value;
    }

    /**
     * Obtiene el valor de la propiedad pkPrestamosId.
     * 
     */
    public int getPkPrestamosId() {
        return pkPrestamosId;
    }

    /**
     * Define el valor de la propiedad pkPrestamosId.
     * 
     */
    public void setPkPrestamosId(int value) {
        this.pkPrestamosId = value;
    }

    /**
     * Obtiene el valor de la propiedad pkUsuariosId.
     * 
     */
    public int getPkUsuariosId() {
        return pkUsuariosId;
    }

    /**
     * Define el valor de la propiedad pkUsuariosId.
     * 
     */
    public void setPkUsuariosId(int value) {
        this.pkUsuariosId = value;
    }

    /**
     * Obtiene el valor de la propiedad registroISBNM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroISBNM() {
        return registroISBNM;
    }

    /**
     * Define el valor de la propiedad registroISBNM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroISBNM(String value) {
        this.registroISBNM = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoVigenciaM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoVigenciaM() {
        return tiempoVigenciaM;
    }

    /**
     * Define el valor de la propiedad tiempoVigenciaM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoVigenciaM(String value) {
        this.tiempoVigenciaM = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoM() {
        return tipoM;
    }

    /**
     * Define el valor de la propiedad tipoM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoM(String value) {
        this.tipoM = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloM() {
        return tituloM;
    }

    /**
     * Define el valor de la propiedad tituloM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloM(String value) {
        this.tituloM = value;
    }

}
