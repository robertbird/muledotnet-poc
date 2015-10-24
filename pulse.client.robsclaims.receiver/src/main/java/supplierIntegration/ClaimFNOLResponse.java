
package supplierIntegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimFNOL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "claimFNOL"
})
@XmlRootElement(name = "ClaimFNOLResponse")
public class ClaimFNOLResponse {

    @XmlElement(name = "ClaimFNOL")
    protected int claimFNOL;

    /**
     * Gets the value of the claimFNOL property.
     * 
     */
    public int getClaimFNOL() {
        return claimFNOL;
    }

    /**
     * Sets the value of the claimFNOL property.
     * 
     */
    public void setClaimFNOL(int value) {
        this.claimFNOL = value;
    }

}
