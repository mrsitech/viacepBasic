package br.com.mrs.restresources.infrastructure.rest.resource.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseJasonplaceholderCommentsDto {
	private Integer postId;
	private Integer id;
	private String name;
	private String email;
	private String body;

}
