package br.com.solucionweb.feriavirtual2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solucionweb.feriavirtual2.dto.PaisDto;
import br.com.solucionweb.feriavirtual2.service.PaisService;

@RestController
@RequestMapping("v1/pais")
public class PaisController {

	 @Autowired
	 private PaisService paisService;
	
	    @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping()
		public ResponseEntity<List<PaisDto>> listPais(){
			return ResponseEntity.ok(new PaisDto().convertToList(paisService.listPais()));
		}
	
}
