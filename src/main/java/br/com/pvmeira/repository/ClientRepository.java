package br.com.pvmeira.repository;

import br.com.pvmeira.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pvcir on 23/02/2017.
 */
public interface ClientRepository extends JpaRepository<Client,Long> {
	
	Client findByNameIgnoreCase(String name);
	Client findByEmailContainingIgnoreCase(String name);
}
