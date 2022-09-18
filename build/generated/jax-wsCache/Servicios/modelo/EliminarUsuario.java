
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EliminarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EliminarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pk_UsuarioId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarUsuario", propOrder = {
    "pkUsuarioId"
})
public class EliminarUsuario {

    @XmlElement(name = "pk_UsuarioId")
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
