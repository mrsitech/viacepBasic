package br.com.mrs.restresources.api.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mrs.restresources.core.port.in.ResourceUseCase;
import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ResourceControllerImp implements ResourceController{

	private final ResourceUseCase resourceUseCase;

	@GetMapping
	public ResponseEntity<CommentResourceResponseDto> getJasonplaceholderComments() {

		ResponseEntity<CommentResourceResponseDto> resourceResponseDtos = resourceUseCase.find();

		return resourceResponseDtos;
	}



}
