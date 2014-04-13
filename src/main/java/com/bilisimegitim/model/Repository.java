/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.model;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adem
 */
@Entity
@Table(name = "repository")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Repository.findAll", query = "SELECT r FROM Repository r"),
    @NamedQuery(name = "Repository.findByRepoistoryId", query = "SELECT r FROM Repository r WHERE r.repoistoryId = :repoistoryId"),
    @NamedQuery(name = "Repository.findByRepositoryName", query = "SELECT r FROM Repository r WHERE r.repositoryName = :repositoryName"),
    @NamedQuery(name = "Repository.findByRepositoryPath", query = "SELECT r FROM Repository r WHERE r.repositoryPath = :repositoryPath")})
public class Repository implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "repoistory_id")
    private Integer repoistoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "repository_name")
    private String repositoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "repository_path")
    private String repositoryPath;

    public Repository() {
    }

    public Repository(Integer repoistoryId) {
        this.repoistoryId = repoistoryId;
    }

    public Repository(Integer repoistoryId, String repositoryName, String repositoryPath) {
        this.repoistoryId = repoistoryId;
        this.repositoryName = repositoryName;
        this.repositoryPath = repositoryPath;
    }

    public Integer getRepoistoryId() {
        return repoistoryId;
    }

    public void setRepoistoryId(Integer repoistoryId) {
        this.repoistoryId = repoistoryId;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryPath() {
        return repositoryPath;
    }

    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (repoistoryId != null ? repoistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Repository)) {
            return false;
        }
        Repository other = (Repository) object;
        if ((this.repoistoryId == null && other.repoistoryId != null) || (this.repoistoryId != null && !this.repoistoryId.equals(other.repoistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bilisimegitim.model.Repository[ repoistoryId=" + repoistoryId + " ]";
    }
    
}
