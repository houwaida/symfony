/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

import com.sung.ess.DAO.IProjetDAO;
import com.sung.ess.pojo.Projet;
import com.sung.ess.service.ProjetService;
import java.util.List;


/**
 *
 * @author wess
 */
public class Test {
    public static void main(String args[])
    {
        ProjetService service=new ProjetService();
        IProjetDAO projets= service.getProjetdao();
        List<Projet> proj=projets.getListProjet();
       
    }
    
}
