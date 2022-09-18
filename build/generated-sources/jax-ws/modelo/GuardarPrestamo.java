
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuardarPrestamo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuardarPrestamo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaPrestamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkUsuarioId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fklibroId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuardarPrestamo", propOrder = {
    "fechaPrestamo",
    "fkUsuarioId",
    "fklibroId"
})
public class GuardarPrestamo {

    protected String fechaPrestamo;
    protected int fkUsuarioId;
    protected int fklibroId;

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
     * Obtiene el valor de la propiedad fkUsuarioId.
     * 
     */
    public int getFkUsuarioId() {
        return fkUsuarioId;
    }

    /**
     * Define el valor de la propiedad fkUsuarioId.
     * 
     */
    public void setFkUsuarioId(int value) {
        this.fkUsuarioId = value;
    }

    /**
     * Obtiene el valor de la propiedad fklibroId.
     * 
     */
    public int getFklibroId() {
        return fklibroId;
    }

    /**
     * Define el valor de la propiedad fklibroId.
     * 
     */
    public void setFklibroId(int value) {
        this.fklibroId = value;
    }

}
