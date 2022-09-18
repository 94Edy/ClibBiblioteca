
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuardarLibro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuardarLibro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edicionM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anioPublicacionM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorialM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registroISBNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroPaginasM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estadoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroEjemplaresM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="incluyeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiempoVigenciaM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuardarLibro", propOrder = {
    "codigoM",
    "autorM",
    "edicionM",
    "anioPublicacionM",
    "tituloM",
    "ciudadM",
    "paisM",
    "editorialM",
    "registroISBNM",
    "nroPaginasM",
    "estadoM",
    "nroEjemplaresM",
    "incluyeCd",
    "tipoM",
    "tiempoVigenciaM"
})
public class GuardarLibro {

    protected String codigoM;
    protected String autorM;
    protected String edicionM;
    protected String anioPublicacionM;
    protected String tituloM;
    protected String ciudadM;
    protected String paisM;
    protected String editorialM;
    protected String registroISBNM;
    protected int nroPaginasM;
    protected String estadoM;
    protected int nroEjemplaresM;
    protected String incluyeCd;
    protected String tipoM;
    protected String tiempoVigenciaM;

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

}
