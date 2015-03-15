package com.sung.ess.service;

import com.sung.ess.DAO.IProjetDAO;
import com.sung.ess.pojo.Projet;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wess
 */
public class ProjetService implements IProjetService{

    IProjetDAO projetdao;

    public IProjetDAO getProjetdao() {
        return projetdao;
    }

    public void setProjetdao(IProjetDAO projetdao) {
        this.projetdao = projetdao;
    }
    
    @Override
    @Transactional(readOnly = false)
    public List<Projet> getProjet() {
        return getProjetdao().getListProjet();
     }    
    

    @Override
    @Transactional(readOnly = false)
    public void addProject(Projet projet) {
        getProjetdao().addProject(projet);
    }

    @Override
    @Transactional(readOnly = false )
    public void deleteProject(Projet projet) {
        
        getProjetdao().deleteProject(projet);
    }

    @Override
    public void update(Projet projet) {
        getProjetdao().edit(projet);
    }
}
