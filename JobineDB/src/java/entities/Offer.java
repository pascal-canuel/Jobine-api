/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "offer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offer.findAll", query = "SELECT o FROM Offer o")
    , @NamedQuery(name = "Offer.findByIdOffer", query = "SELECT o FROM Offer o WHERE o.idOffer = :idOffer")
    , @NamedQuery(name = "Offer.findByDateOffer", query = "SELECT o FROM Offer o WHERE o.dateOffer = :dateOffer")
    , @NamedQuery(name = "Offer.findByIdUser", query = "SELECT o FROM Offer o WHERE o.idUser = :idUser")})
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOffer")
    private Integer idOffer;
    @Basic(optional = false)
    @Lob
    @Column(name = "titleOffer")
    private String titleOffer;
    @Basic(optional = false)
    @Column(name = "dateOffer")
    @Temporal(TemporalType.DATE)
    private Date dateOffer;
    @Basic(optional = false)
    @Lob
    @Column(name = "addressOffer")
    private String addressOffer;
    @Basic(optional = false)
    @Column(name = "idUser")
    private int idUser;

    public Offer() {
    }

    public Offer(Integer idOffer) {
        this.idOffer = idOffer;
    }

    public Offer(Integer idOffer, String titleOffer, Date dateOffer, String addressOffer, int idUser) {
        this.idOffer = idOffer;
        this.titleOffer = titleOffer;
        this.dateOffer = dateOffer;
        this.addressOffer = addressOffer;
        this.idUser = idUser;
    }

    public Integer getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(Integer idOffer) {
        this.idOffer = idOffer;
    }

    public String getTitleOffer() {
        return titleOffer;
    }

    public void setTitleOffer(String titleOffer) {
        this.titleOffer = titleOffer;
    }

    public Date getDateOffer() {
        return dateOffer;
    }

    public void setDateOffer(Date dateOffer) {
        this.dateOffer = dateOffer;
    }

    public String getAddressOffer() {
        return addressOffer;
    }

    public void setAddressOffer(String addressOffer) {
        this.addressOffer = addressOffer;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOffer != null ? idOffer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offer)) {
            return false;
        }
        Offer other = (Offer) object;
        if ((this.idOffer == null && other.idOffer != null) || (this.idOffer != null && !this.idOffer.equals(other.idOffer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Offer[ idOffer=" + idOffer + " ]";
    }
    
}
