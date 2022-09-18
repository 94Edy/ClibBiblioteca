
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalculoFechas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalculoFechas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaPrestamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculoFechas", propOrder = {
    "fechaPrestamo",
    "fechaDevolucion"
})
public class CalculoFechas {

    protected String fechaPrestamo;
    protected String fechaDevolucion;

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

}
