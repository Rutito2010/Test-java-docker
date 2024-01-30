package com.palasoft.msmasteraccount.controllers;




import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/master-account/prueba")
public class PruebaController {

    @GetMapping(value = "/saludar/")//primer argumento define subRutas, segundo argumento define el tipo de respuesta(json, stream etc), tercer argumento(consumes) define el tipo de informacion(json, pdf, etc)
    // en caso de no responder o recibir podemos solo poner produces o consumes
    String saludar(){
        return "Hola";
    }

  /*  @GetMapping(value = "/despedir",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "papita", notes = "descripcion del endpoint", response = String.class)// el response es el tipo de objeto puede ser dto u otro
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para despedir", responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))), })
    String despedir(){
        return "chau";
    }
*/

}
