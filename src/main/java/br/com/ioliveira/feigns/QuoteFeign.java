package br.com.ioliveira.feigns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ioliveira.domains.Quote;

@FeignClient(name = "mensagens", url = "https://gturnquist-quoters.cfapps.io/api/")
public interface QuoteFeign {
	
	@GetMapping(value = "/random")
	Quote getQuote();
	
	@GetMapping()
	List<Quote> getListQuote();

}
