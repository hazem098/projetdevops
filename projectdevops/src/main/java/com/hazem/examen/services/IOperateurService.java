package com.hazem.examen.services;

import java.util.List;
import com.hazem.examen.entities.Operateur;


public interface IOperateurService {

	List<Operateur> retrieveAllOperateurs();

	Operateur addOperateur(Operateur o);

	void deleteOperateur(Long id);

	Operateur updateOperateur(Operateur o);

	Operateur retrieveOperateur(Long id);

}
