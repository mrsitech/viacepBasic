package br.com.mrs.restresources.core.port.in;

import org.springframework.http.ResponseEntity;

import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;

public interface ResourceUseCase {
	
	ResponseEntity<CommentResourceResponseDto> find();
	

}
