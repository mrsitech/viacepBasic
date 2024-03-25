package br.com.mrs.restresources.core.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mrs.restresources.core.port.in.ResourceUseCase;
import br.com.mrs.restresources.core.port.out.ResourceIntegratorPortOut;
import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ResourceService implements ResourceUseCase{
	@Autowired
	private ResourceIntegratorPortOut resourceIntegratorPortOut;

	@Override
	public ResponseEntity<CommentResourceResponseDto> find() {
	
			return resourceIntegratorPortOut.getAll();
	
		
	
	}

}
