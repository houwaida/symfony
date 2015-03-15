/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sung.ess.DAO;

import com.sung.ess.pojo.Projet;
import java.util.List;

/**
 *
 * @author wess
 */
public interface IProjetDAO {

     public List<Projet> getListProjet() ;
      public void addProject(Projet projet );
      public void deleteProject(Projet projet);
      public void edit(Projet projet);
      
}
