
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pk_UsuarioId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cedulaU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombresU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidosU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkcarreraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fknivelAcademicoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fkformacionAcademicaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarUsuario", propOrder = {
    "pkUsuarioId",
    "cedulaU",
    "nombresU",
    "apellidosU",
    "correoU",
    "fkcarreraId",
    "fknivelAcademicoId",
    "fkformacionAcademicaId"
})
public class ActualizarUsuario {

    @XmlElement(name = "pk_UsuarioId")
    protected int pkUsuarioId;
    protected int cedulaU;
    protected String nombresU;
    protected String apellidosU;
    protected String correoU;
    protected int fkcarreraId;
    protected int fknivelAcademicoId;
    protected int fkformacionAcademicaId;

    /**
     * Obtiene el valor de la propiedad pkUsuarioId.
     * 
     */
    public int getPkUsuarioId() {
        return pkUsuarioId;
    }

    /**
     * Define el valor de la propiedad pkUsuarioId.
     * 
     */
    public void setPkUsuarioId(int value) {
        this.pkUsuarioId = value;
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
     * Obtiene el valor de la propiedad fkcarreraId.
     * 
     */
    public int getFkcarreraId() {
        return fkcarreraId;
    }

    /**
     * Define el valor de la propiedad fkcarreraId.
     * 
     */
    public void setFkcarreraId(int value) {
        this.fkcarreraId = value;
    }

    /**
     * Obtiene el valor de la propiedad fknivelAcademicoId.
     * 
     */
    public int getFknivelAcademicoId() {
        return fknivelAcademicoId;
    }

    /**
     * Define el valor de la propiedad fknivelAcademicoId.
     * 
     */
    public void setFknivelAcademicoId(int value) {
        this.fknivelAcademicoId = value;
    }

    /**
     * Obtiene el valor de la propiedad fkformacionAcademicaId.
     * 
     */
    public int getFkformacionAcademicaId() {
        return fkformacionAcademicaId;
    }

    /**
     * Define el valor de la propiedad fkformacionAcademicaId.
     * 
     */
    public void setFkformacionAcademicaId(int value) {
        this.fkformacionAcademicaId = value;
    }

}
