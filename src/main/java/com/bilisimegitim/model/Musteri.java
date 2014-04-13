/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adem
 */
@Entity
@Table(catalog = "adem", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri.findAll", query = "SELECT m FROM Musteri m"),
    @NamedQuery(name = "Musteri.findByMusteriId", query = "SELECT m FROM Musteri m WHERE m.musteriId = :musteriId"),
    @NamedQuery(name = "Musteri.findByMusteriAd", query = "SELECT m FROM Musteri m WHERE m.musteriAd = :musteriAd"),
    @NamedQuery(name = "Musteri.findByMusteriSoyad", query = "SELECT m FROM Musteri m WHERE m.musteriSoyad = :musteriSoyad"),
    @NamedQuery(name = "Musteri.findByCinsiyet", query = "SELECT m FROM Musteri m WHERE m.cinsiyet = :cinsiyet"),
    @NamedQuery(name = "Musteri.findByDogumTarihi", query = "SELECT m FROM Musteri m WHERE m.dogumTarihi = :dogumTarihi"),
    @NamedQuery(name = "Musteri.findByTckn", query = "SELECT m FROM Musteri m WHERE m.tckn = :tckn"),
    @NamedQuery(name = "Musteri.findBySifre", query = "SELECT m FROM Musteri m WHERE m.sifre = :sifre")})
public class Musteri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "musteri_id", nullable = false)
    private Integer musteriId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "musteri_ad", nullable = false, length = 25)
    private String musteriAd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "musteri_soyad", nullable = false, length = 25)
    private String musteriSoyad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(nullable = false, length = 1)
    private String cinsiyet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dogum_tarihi", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dogumTarihi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(nullable = false, length = 11)
    private String tckn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String sifre;

    public Musteri() {
    }

    public Musteri(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public Musteri(Integer musteriId, String musteriAd, String musteriSoyad, String cinsiyet, Date dogumTarihi, String tckn, String sifre) {
        this.musteriId = musteriId;
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        this.tckn = tckn;
        this.sifre = sifre;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musteriId != null ? musteriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteri)) {
            return false;
        }
        Musteri other = (Musteri) object;
        if ((this.musteriId == null && other.musteriId != null) || (this.musteriId != null && !this.musteriId.equals(other.musteriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bilisimegitim.model.Musteri[ musteriId=" + musteriId + " ]";
    }
    
}
