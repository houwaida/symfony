package com.sung.ess.pojo;
// Generated 7 mars 2015 00:04:14 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


/**
 * Projet generated by hbm2java
 */
@Entity
@Table(name="projet"
    ,schema="dbo"
    ,catalog="gimmoBd"
    , uniqueConstraints = @UniqueConstraint(columnNames="code") 
)
public class Projet  implements java.io.Serializable {
     
     
     private int id;
     private String code;
     private String libelle;
     private String lieuRealisation;
     private Date dateCreation;
     private Date dateFin;
     private String telephone;
     private String fax;
     private float surfaceConstruite;
     private float surfaceParking;
     private String assuranceDecenale;
     private float tauxProrataTva;
     private Integer nbreTranche;

    public Projet() {
    }

	
    public Projet(int id) {
        this.id = id;
    }
    public Projet(int id, String code, String libelle, String lieuRealisation, Date dateCreation, Date dateFin, String telephone, String fax, float surfaceConstruite,float surfaceParking, String assuranceDecenale, float tauxProrataTva, Integer nbreTranche) {
       this.id = id;
       this.code = code;
       this.libelle = libelle;
       this.lieuRealisation = lieuRealisation;
       this.dateCreation = dateCreation;
       this.dateFin = dateFin;
       this.telephone = telephone;
       this.fax = fax;
       this.surfaceConstruite = surfaceConstruite;
       this.surfaceParking = surfaceParking;
       this.assuranceDecenale = assuranceDecenale;
       this.tauxProrataTva = tauxProrataTva;
       this.nbreTranche = nbreTranche;
    }
   
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
   
    public int getId() {
        
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="code", unique=true, length=50)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="libelle", length=50)
    public String getLibelle() {
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    
    @Column(name="lieuRealisation", length=50)
    public String getLieuRealisation() {
        return this.lieuRealisation;
    }
    
    public void setLieuRealisation(String lieuRealisation) {
        this.lieuRealisation = lieuRealisation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateCreation", length=10)
    public Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateFin", length=10)
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    
    @Column(name="telephone", length=50)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
    @Column(name="fax", length=50)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="surfaceConstruite", precision=53, scale=0)
    public float getSurfaceConstruite() {
        return this.surfaceConstruite;
    }
    
    public void setSurfaceConstruite(float surfaceConstruite) {
        this.surfaceConstruite = surfaceConstruite;
    }

    
    @Column(name="surfaceParking", precision=53, scale=0)
    public float getSurfaceParking() {
        return this.surfaceParking;
    }
    
    public void setSurfaceParking(float surfaceParking) {
        this.surfaceParking = surfaceParking;
    }

    
    @Column(name="assuranceDecenale", length=50)
    public String getAssuranceDecenale() {
        return this.assuranceDecenale;
    }
    
    public void setAssuranceDecenale(String assuranceDecenale) {
        this.assuranceDecenale = assuranceDecenale;
    }

    
    @Column(name="tauxProrataTVA", precision=53, scale=0)
    public float getTauxProrataTva() {
        return this.tauxProrataTva;
    }
    
    public void setTauxProrataTva(float tauxProrataTva) {
        this.tauxProrataTva = tauxProrataTva;
    }

    
    @Column(name="nbreTranche")
    public Integer getNbreTranche() {
        return this.nbreTranche;
    }
    
    public void setNbreTranche(Integer nbreTranche) {
        this.nbreTranche = nbreTranche;
    }

    



}

