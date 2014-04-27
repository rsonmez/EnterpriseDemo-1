/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilisimegitim.view;

import com.bilisimegitim.model.Kullanici;
import com.bilisimegitim.service.KullaniciService;
import com.bilisimegitim.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Adem
 */
@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean implements Serializable{

    @EJB
    private KullaniciService kullaniciService;
    private Kullanici kullanici;
    private Kullanici yeniKullanici;
    private List<Kullanici> kullaniciListesi;

    public IndexBean() {
        kullanici = new Kullanici();
        yeniKullanici = new Kullanici();
    }

    public void kaydet() {
        try {
            kullaniciService.kullaniciOlustur(kullanici);
            kullanici = new Kullanici();
            FacesUtil.createFacesMessage("Bilgi", "Kayıt tamamlandı", FacesMessage.SEVERITY_INFO);
        } catch (Exception ex) {
            FacesUtil.createFacesMessage("Hata oluştu", ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        }
    }

    public void kullaniciListesiniGetir(){
        try {
            kullaniciListesi = kullaniciService.tumKullanicilariGetir();
            FacesUtil.createFacesMessage("Bilgi", "Kayıt getirildi", FacesMessage.SEVERITY_INFO);
        } catch (Exception ex) {
            FacesUtil.createFacesMessage("Hata oluştu", ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        } 
    }
    
    public void signIn(){
        try {
            Kullanici tempKullanici = kullaniciService.signInKontrol(yeniKullanici);
            if(tempKullanici != null){
                yeniKullanici = tempKullanici;
                /*HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
                HttpServletResponse res = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
                req.getRequestDispatcher("/test.jsf").forward(req, res);    
                res.sendRedirect("test.jsf");
                 */
                FacesUtil.createFacesMessage("Bilgi", "Giriş onaylandı", FacesMessage.SEVERITY_INFO);
                        
            } else {
                FacesUtil.createFacesMessage("Bilgi", "Girilen bilgilerden birisi geçersiz.", FacesMessage.SEVERITY_INFO);
            }
        } catch (Exception ex) {
            FacesUtil.createFacesMessage("Bilgi", ex.getMessage(), FacesMessage.SEVERITY_INFO);
        }
    }
    
    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public List<Kullanici> getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void setKullaniciListesi(List<Kullanici> kullaniciListesi) {
        this.kullaniciListesi = kullaniciListesi;
    }

    public Kullanici getYeniKullanici() {
        return yeniKullanici;
    }

    public void setYeniKullanici(Kullanici yeniKullanici) {
        this.yeniKullanici = yeniKullanici;
    }

}
