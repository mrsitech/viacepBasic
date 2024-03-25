package br.com.mrs.restresources.api.rest.resource;

import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mrs.restresources.core.port.out.dto.CommentResourceResponseDto;
import br.com.mrs.restresources.core.port.out.dto.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = ResourceController.ID_GENERATOR_TAG, description = "Everything about Rest apply from JsonPLACEHOLDER Free Fake REST API - //jsonplaceholder.typicode.com/")
public interface ResourceController {

	public static final String ID_GENERATOR_TAG = "ID Generator API";

	@Operation(summary = "API to jsonplaceholder", tags = ResourceController.ID_GENERATOR_TAG)
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "403", description = "Not Found", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "503", description = "MS is not available", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }),
			@ApiResponse(responseCode = "504", description = "Timeout", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProblemDetail.class)) }) })

	@GetMapping
	public ResponseEntity<CommentResourceResponseDto> getJasonplaceholderComments(
			//@RequestParam String comments
			);

}
