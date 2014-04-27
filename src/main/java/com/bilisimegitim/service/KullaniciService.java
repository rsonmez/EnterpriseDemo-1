/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilisimegitim.service;

import com.bilisimegitim.dao.KullaniciFacade;
import com.bilisimegitim.dao.MusteriFacade;
import com.bilisimegitim.model.Kullanici;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.LockModeType;

/**
 *
 * @author Adem
 */
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@Stateless
public class KullaniciService {

    @EJB
    private KullaniciFacade kullaniciFacade;
    @EJB
    private MusteriFacade musteriFacade;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void kullaniciOlustur(Kullanici kullanici) throws Exception {
        kullaniciFacade.create(kullanici);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public List<Kullanici> tumKullanicilariGetir() {
        return kullaniciFacade.findAll();
    }

    public Kullanici signInKontrol(Kullanici kullanici) throws Exception {
        Map params = new HashMap();
        params.put("email", kullanici.getEmail());
        try {
            Kullanici tempKullanici = kullaniciFacade.findByNamedQuery("Kullanici.findByEmail", params, null);
            if(tempKullanici != null){
                if(tempKullanici.getSifre().equals(kullanici.getSifre())){
                    return tempKullanici;
                } else {
                    return tempKullanici;
                }
            }
        } catch (Exception ex) {
            throw new Exception("İşlem sırasında hata oluştu");
        }
        return null;
    }

    public void kullaniciPasiflestir() {

    }

    public void kullaniciAktiflestir() {

    }

    public void kullaniciGuncelle() {

    }

}
