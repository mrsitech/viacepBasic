package br.com.mrs.restresources.infrastructure.rest.resource.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;

@FeignClient(name = "resource", url = "http://viacep.com.br/ws/01001000/json/")
public interface ResourceFeign {
//	log.error("passo3");

	@GetMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<CommentResourceResponseDto> getAll();

	

}
