package br.com.ioliveira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ioliveira.feigns.QuoteFeign;
import br.com.ioliveira.domains.Quote;

@RestController
public class SimpleRestController {
	
	@Autowired
	private QuoteFeign quoteFeign;
	
	@GetMapping(path = "/message")
	public ResponseEntity<Quote> getQuote(){

		Quote quote = quoteFeign.getQuote();
		return ResponseEntity.ok().body(quote);
		
	}
	
	@GetMapping(path = "/messages")
	public ResponseEntity<List<Quote>> getListQuote(){

		List<Quote> listQuote = quoteFeign.getListQuote();
		return ResponseEntity.ok().body(listQuote);
		
	}
	
}
