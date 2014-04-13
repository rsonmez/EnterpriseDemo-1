/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.service;

import com.bilisimegitim.dao.KullaniciFacade;
import com.bilisimegitim.dao.MusteriFacade;
import com.bilisimegitim.model.Kullanici;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

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
    public void kullaniciOlustur(Kullanici kullanici){
        kullaniciFacade.create(kullanici);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void mailKaydet(){
        
    }
    
    public void kullaniciSil(){
        
    }
    
    public void kullaniciPasiflestir(){
        
    }

    public void kullaniciAktiflestir(){
        
    }
    
    public void kullaniciGuncelle(){
        
    }
    
}
