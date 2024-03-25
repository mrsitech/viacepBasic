package br.com.mrs.restresources.core.port.out;

import org.springframework.http.ResponseEntity;

import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;

public interface ResourceIntegratorPortOut {
	ResponseEntity<CommentResourceResponseDto> getAll();
}
