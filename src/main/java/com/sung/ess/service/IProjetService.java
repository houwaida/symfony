/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sung.ess.service;

import com.sung.ess.pojo.Projet;
import java.util.List;

/**
 *
 * @author wess
 */
public interface IProjetService {
    
    public List<Projet>getProjet();
    public void addProject(Projet projet);
    public void deleteProject(Projet projet);
    public void update (Projet projet);
}
