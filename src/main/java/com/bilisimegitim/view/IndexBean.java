/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.view;

import com.bilisimegitim.model.Kullanici;
import com.bilisimegitim.service.KullaniciService;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

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
        kullanici =  new Kullanici();
    }

    public void kaydet(){
        kullaniciService.kullaniciOlustur(kullanici);
    }
    
    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
  
}
