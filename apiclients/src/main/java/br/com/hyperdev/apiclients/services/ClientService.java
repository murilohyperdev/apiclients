package br.com.hyperdev.apiclients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.hyperdev.apiclients.dto.ClientDTO;
import br.com.hyperdev.apiclients.entities.Client;
import br.com.hyperdev.apiclients.repositories.ClientRepository;


@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(client -> new ClientDTO(client));
	}
	
	
}
