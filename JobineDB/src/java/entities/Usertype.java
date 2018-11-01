/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "usertype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usertype.findAll", query = "SELECT u FROM Usertype u")
    , @NamedQuery(name = "Usertype.findByIdUserType", query = "SELECT u FROM Usertype u WHERE u.idUserType = :idUserType")})
public class Usertype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUserType")
    private Integer idUserType;
    @Basic(optional = false)
    @Lob
    @Column(name = "nameUserType")
    private String nameUserType;

    public Usertype() {
    }

    public Usertype(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public Usertype(Integer idUserType, String nameUserType) {
        this.idUserType = idUserType;
        this.nameUserType = nameUserType;
    }

    public Integer getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public String getNameUserType() {
        return nameUserType;
    }

    public void setNameUserType(String nameUserType) {
        this.nameUserType = nameUserType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserType != null ? idUserType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertype)) {
            return false;
        }
        Usertype other = (Usertype) object;
        if ((this.idUserType == null && other.idUserType != null) || (this.idUserType != null && !this.idUserType.equals(other.idUserType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usertype[ idUserType=" + idUserType + " ]";
    }
    
}
