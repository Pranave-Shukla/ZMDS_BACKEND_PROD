/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.zoetis.zdms.api.rest;

import com.zoetis.zdms.api.dto.AuthenticatedUserResponseDto;
import com.zoetis.zdms.api.dto.ErrorDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-22T09:15:08.643330200-04:00[America/New_York]")
@Validated
@Api(value = "User", description = "the User API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/users/me : Authenticated user details
     *
     * @return Authenticated user details (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */

    @ApiOperation(value = "Authenticated user details", nickname = "getAuthenticatedUser", notes = "", response = AuthenticatedUserResponseDto.class, tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "Authenticated user details", response = AuthenticatedUserResponseDto.class),

        @ApiResponse(code = 400, message = "Bad request", response = ErrorDto.class),

        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),

        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),

        @ApiResponse(code = 404, message = "Not Found", response = ErrorDto.class),

        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/users/me",
        produces = { "application/json" }
    )
    default ResponseEntity<AuthenticatedUserResponseDto> getAuthenticatedUser() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailAddress\" : \"emailAddress\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
