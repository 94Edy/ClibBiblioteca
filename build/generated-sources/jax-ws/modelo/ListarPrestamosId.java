
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListarPrestamosId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListarPrestamosId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkUsuarioId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListarPrestamosId", propOrder = {
    "pkUsuarioId"
})
public class ListarPrestamosId {

    protected int pkUsuarioId;

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

}
