/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilisimegitim.view;

import com.bilisimegitim.model.Kullanici;
import com.bilisimegitim.service.KullaniciService;
import com.bilisimegitim.util.FacesUtil;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Adem
 */
@ManagedBean(name = "indexBean")
@ViewScoped
public class IndexBean {

    @EJB
    private KullaniciService kullaniciService;
    private Kullanici kullanici;

    public IndexBean() {
        kullanici = new Kullanici();
    }

    public void kaydet() {
        try {
            kullaniciService.kullaniciOlustur(kullanici);
            FacesUtil.createFacesMessage("Bilgi", "Kayıt tamamlandı", FacesMessage.SEVERITY_INFO);
        } catch (Exception ex) {
            ex.printStackTrace();
            FacesUtil.createFacesMessage("Hata oluştu", ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        }
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

}
