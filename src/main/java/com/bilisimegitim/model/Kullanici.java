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
    @NamedQuery(name = "Kullanici.findAll", query = "SELECT k FROM Kullanici k"),
    @NamedQuery(name = "Kullanici.findByKullaniciId", query = "SELECT k FROM Kullanici k WHERE k.kullaniciId = :kullaniciId"),
    @NamedQuery(name = "Kullanici.findByKullaniciAd", query = "SELECT k FROM Kullanici k WHERE k.kullaniciAd = :kullaniciAd"),
    @NamedQuery(name = "Kullanici.findByKullaniciSoyad", query = "SELECT k FROM Kullanici k WHERE k.kullaniciSoyad = :kullaniciSoyad"),
    @NamedQuery(name = "Kullanici.findByCinsiyet", query = "SELECT k FROM Kullanici k WHERE k.cinsiyet = :cinsiyet"),
    @NamedQuery(name = "Kullanici.findByDogumTarihi", query = "SELECT k FROM Kullanici k WHERE k.dogumTarihi = :dogumTarihi"),
    @NamedQuery(name = "Kullanici.findBySifre", query = "SELECT k FROM Kullanici k WHERE k.sifre = :sifre"),
    @NamedQuery(name = "Kullanici.findByEmail", query = "SELECT k FROM Kullanici k WHERE k.email = :email")})
public class Kullanici implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kullanici_id", nullable = false)
    private Integer kullaniciId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "kullanici_ad", nullable = false, length = 25)
    private String kullaniciAd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "kullanici_soyad", nullable = false, length = 25)
    private String kullaniciSoyad;
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
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String sifre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(length = 50)
    private String email;

    public Kullanici() {
    }

    public Kullanici(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Kullanici(Integer kullaniciId, String kullaniciAd, String kullaniciSoyad, String cinsiyet, Date dogumTarihi, String sifre) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAd = kullaniciAd;
        this.kullaniciSoyad = kullaniciSoyad;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        this.sifre = sifre;
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciSoyad() {
        return kullaniciSoyad;
    }

    public void setKullaniciSoyad(String kullaniciSoyad) {
        this.kullaniciSoyad = kullaniciSoyad;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kullaniciId != null ? kullaniciId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanici)) {
            return false;
        }
        Kullanici other = (Kullanici) object;
        if ((this.kullaniciId == null && other.kullaniciId != null) || (this.kullaniciId != null && !this.kullaniciId.equals(other.kullaniciId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bilisimegitim.model.Kullanici[ kullaniciId=" + kullaniciId + " ]";
    }
    
}
