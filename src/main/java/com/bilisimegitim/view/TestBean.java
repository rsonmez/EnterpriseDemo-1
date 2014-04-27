/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.view;

import com.bilisimegitim.model.Kullanici;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Adem
 */
@ManagedBean(name = "testBean")
@ViewScoped
public class TestBean implements Serializable{

    @ManagedProperty("#{indexBean}")
    private IndexBean indexBean;
    
    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {
    }
    
    @PostConstruct
    private void postConstructMethod(){
        for(Kullanici kullanici : indexBean.getKullaniciListesi()){
            System.out.println(kullanici.getKullaniciAd());
        }
    }
    
    public void bosIs(){
        System.out.println("Giriş yaptık");
    }

    public IndexBean getIndexBean() {
        return indexBean;
    }

    public void setIndexBean(IndexBean indexBean) {
        this.indexBean = indexBean;
    }
    
}
