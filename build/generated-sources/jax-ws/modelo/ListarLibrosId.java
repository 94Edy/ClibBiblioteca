
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListarLibrosId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListarLibrosId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkLibroId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListarLibrosId", propOrder = {
    "pkLibroId"
})
public class ListarLibrosId {

    protected int pkLibroId;

    /**
     * Obtiene el valor de la propiedad pkLibroId.
     * 
     */
    public int getPkLibroId() {
        return pkLibroId;
    }

    /**
     * Define el valor de la propiedad pkLibroId.
     * 
     */
    public void setPkLibroId(int value) {
        this.pkLibroId = value;
    }

}
