package fr.univtours.polytech.tpnote1.Daos;

import java.util.List;

import fr.univtours.polytech.tpnote1.Models.LivreBean;

public interface LivreDao {
    public List<LivreBean> getAllLivre();
    public LivreBean getOneLivre();

}
