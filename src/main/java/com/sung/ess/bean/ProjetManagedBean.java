package com.sung.ess.bean;

import com.sung.ess.pojo.Projet;
import com.sung.ess.service.IProjetService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name="projetMB")
@SessionScoped

public class ProjetManagedBean {
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
     private List<Projet> projets1;

    @ManagedProperty(value="#{ProjetService}")
    private IProjetService projetService;
  
    @PostConstruct
    public void init()
    {
      projets1=projetService.getProjet();
 }
  public List<Projet> createProj()
  {
    List<Projet> projlist=getProjetList();
    for(int i=0;i<projlist.size();i++)
    {
     projets1.add(projlist.get(i));
     System.out.println(projets1.get(i).getLieuRealisation());
  }
    return projets1;
  }
  
 
    public IProjetService getProjetService() {
        return projetService;
    }
    public void setProjetService(IProjetService projetService) {
        this.projetService = projetService;
    }
    public int getId() {
        return id;
    }
    public ProjetManagedBean()
    {
    
    }
    public ProjetManagedBean(String code, String libelle, String lieuRealisation, Date dateCreation, Date dateFin, String telephone, String fax, float surfaceConstruite, float surfaceParking, String assuranceDecenale, float tauxProrataTva, Integer nbreTranche) {
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

    public String getCode() {
        return code;
    }
    

    public String getLibelle() {
        return libelle;
    }
      public void setProjets1(List<Projet> projets1) {
        this.projets1 = projets1;
    }

    public List<Projet> getProjets1() {
        return projets1;
    }

    public String getLieuRealisation() {
        return lieuRealisation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public float getSurfaceConstruite() {
        return surfaceConstruite;
    }

    public float getSurfaceParking() {
        return surfaceParking;
    }

    public String getAssuranceDecenale() {
        return assuranceDecenale;
    }

    public float getTauxProrataTva() {
        return tauxProrataTva;
    }

    public Integer getNbreTranche() {
        return nbreTranche;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setLieuRealisation(String lieuRealisation) {
        this.lieuRealisation = lieuRealisation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setSurfaceConstruite(float surfaceConstruite) {
        this.surfaceConstruite = surfaceConstruite;
    }

    public void setSurfaceParking(float surfaceParking) {
        this.surfaceParking = surfaceParking;
    }

    public void setAssuranceDecenale(String assuranceDecenale) {
        this.assuranceDecenale = assuranceDecenale;
    }

    public void setTauxProrataTva(float tauxProrataTva) {
        this.tauxProrataTva = tauxProrataTva;
    }

    public void setNbreTranche(Integer nbreTranche) {
        this.nbreTranche = nbreTranche;
    }

  private List projetList;
 public List<Projet> getProjetList() {
          projetList = new ArrayList<Projet>();
        projetList.addAll(getProjetService().getProjet());
        return projetList;
    }

    public void setProjetList(List projetList) {
        this.projetList = projetList;
    }
    
    public String addProjet()
    {
        Projet projet =new Projet();
        projet.setLibelle(libelle);
        projet.setLieuRealisation(lieuRealisation);
        projet.setDateCreation(dateCreation);
        projet.setTelephone(telephone);
        projet.setAssuranceDecenale(assuranceDecenale);
        projet.setNbreTranche(nbreTranche);
        projet.setTelephone(telephone);
        projet.setFax(fax);
        projet.setDateFin(dateFin);
        projet.setCode(code);
   
        projet.setSurfaceParking(surfaceParking);
        projet.setTauxProrataTva(tauxProrataTva);
       getProjetService().addProject(projet);
       return "liste";
    }
   
    public String deleteProjet(Projet projet)
    {
     getProjetService().deleteProject(projet);
      return "liste";
    }
    public void update(Projet projet)
    { 
           projetService.update(projet);
    }
     public void onRowEdit(RowEditEvent event ) {
     
         FacesMessage msg;
         msg = new FacesMessage("projet Edited", ((Projet)event.getObject()).getCode());
         
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
       
        
        FacesMessage msg = new FacesMessage("Edit Cancelled", ( (Projet)event.getObject()).getCode());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
}
}