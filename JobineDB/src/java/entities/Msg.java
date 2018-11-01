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
@Table(name = "msg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Msg.findAll", query = "SELECT m FROM Msg m")
    , @NamedQuery(name = "Msg.findByIdMsg", query = "SELECT m FROM Msg m WHERE m.idMsg = :idMsg")
    , @NamedQuery(name = "Msg.findByDateMsg", query = "SELECT m FROM Msg m WHERE m.dateMsg = :dateMsg")
    , @NamedQuery(name = "Msg.findByIdUser", query = "SELECT m FROM Msg m WHERE m.idUser = :idUser")
    , @NamedQuery(name = "Msg.findByIdOffer", query = "SELECT m FROM Msg m WHERE m.idOffer = :idOffer")})
public class Msg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMsg")
    private Integer idMsg;
    @Basic(optional = false)
    @Lob
    @Column(name = "contentMsg")
    private String contentMsg;
    @Basic(optional = false)
    @Column(name = "dateMsg")
    @Temporal(TemporalType.DATE)
    private Date dateMsg;
    @Basic(optional = false)
    @Column(name = "idUser")
    private int idUser;
    @Basic(optional = false)
    @Column(name = "idOffer")
    private int idOffer;

    public Msg() {
    }

    public Msg(Integer idMsg) {
        this.idMsg = idMsg;
    }

    public Msg(Integer idMsg, String contentMsg, Date dateMsg, int idUser, int idOffer) {
        this.idMsg = idMsg;
        this.contentMsg = contentMsg;
        this.dateMsg = dateMsg;
        this.idUser = idUser;
        this.idOffer = idOffer;
    }

    public Integer getIdMsg() {
        return idMsg;
    }

    public void setIdMsg(Integer idMsg) {
        this.idMsg = idMsg;
    }

    public String getContentMsg() {
        return contentMsg;
    }

    public void setContentMsg(String contentMsg) {
        this.contentMsg = contentMsg;
    }

    public Date getDateMsg() {
        return dateMsg;
    }

    public void setDateMsg(Date dateMsg) {
        this.dateMsg = dateMsg;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(int idOffer) {
        this.idOffer = idOffer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMsg != null ? idMsg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Msg)) {
            return false;
        }
        Msg other = (Msg) object;
        if ((this.idMsg == null && other.idMsg != null) || (this.idMsg != null && !this.idMsg.equals(other.idMsg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Msg[ idMsg=" + idMsg + " ]";
    }
    
}
