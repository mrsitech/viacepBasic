package br.com.mrs.restresources.infrastructure.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mrs.restresources.core.port.out.ResourceIntegratorPortOut;
import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;
import br.com.mrs.restresources.infrastructure.rest.resource.feign.ResourceFeign;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResourceIntegrator implements ResourceIntegratorPortOut{
	
	private final ResourceFeign resourceFeign;

	@Override
	public ResponseEntity<CommentResourceResponseDto> getAll() {
		ResponseEntity<CommentResourceResponseDto> response = resourceFeign.getAll();
		
		return response;
	}

}
