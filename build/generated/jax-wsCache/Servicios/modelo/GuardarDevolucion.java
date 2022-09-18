
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuardarDevolucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuardarDevolucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkPrestamoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuardarDevolucion", propOrder = {
    "fechaDevolucion",
    "fkPrestamoId"
})
public class GuardarDevolucion {

    protected String fechaDevolucion;
    protected int fkPrestamoId;

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
     * Obtiene el valor de la propiedad fkPrestamoId.
     * 
     */
    public int getFkPrestamoId() {
        return fkPrestamoId;
    }

    /**
     * Define el valor de la propiedad fkPrestamoId.
     * 
     */
    public void setFkPrestamoId(int value) {
        this.fkPrestamoId = value;
    }

}
