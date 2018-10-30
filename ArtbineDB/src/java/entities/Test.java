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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t")
    , @NamedQuery(name = "Test.findByIndexJobine", query = "SELECT t FROM Test t WHERE t.indexJobine = :indexJobine")
    , @NamedQuery(name = "Test.findByCountJobine", query = "SELECT t FROM Test t WHERE t.countJobine = :countJobine")})
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_Jobine")
    private Integer indexJobine;
    @Basic(optional = false)
    @Column(name = "count_Jobine")
    private int countJobine;

    public Test() {
    }

    public Test(Integer indexJobine) {
        this.indexJobine = indexJobine;
    }

    public Test(Integer indexJobine, int countJobine) {
        this.indexJobine = indexJobine;
        this.countJobine = countJobine;
    }

    public Integer getIndexJobine() {
        return indexJobine;
    }

    public void setIndexJobine(Integer indexJobine) {
        this.indexJobine = indexJobine;
    }

    public int getCountJobine() {
        return countJobine;
    }

    public void setCountJobine(int countJobine) {
        this.countJobine = countJobine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexJobine != null ? indexJobine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.indexJobine == null && other.indexJobine != null) || (this.indexJobine != null && !this.indexJobine.equals(other.indexJobine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Test[ indexJobine=" + indexJobine + " ]";
    }
    
}
