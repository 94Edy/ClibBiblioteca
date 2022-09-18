
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuardarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuardarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cedulaU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombresU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidosU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fk_carreraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fk_nivelAcademicoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fk_formacionAcademicaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuardarUsuario", propOrder = {
    "cedulaU",
    "nombresU",
    "apellidosU",
    "correoU",
    "fkCarreraId",
    "fkNivelAcademicoId",
    "fkFormacionAcademicaId"
})
public class GuardarUsuario {

    protected int cedulaU;
    protected String nombresU;
    protected String apellidosU;
    protected String correoU;
    @XmlElement(name = "fk_carreraId")
    protected int fkCarreraId;
    @XmlElement(name = "fk_nivelAcademicoId")
    protected int fkNivelAcademicoId;
    @XmlElement(name = "fk_formacionAcademicaId")
    protected int fkFormacionAcademicaId;

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

}
