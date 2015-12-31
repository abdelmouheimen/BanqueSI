package org.trabelsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trabelsi.metier.OperationMetier;

@RestController
public class OperationRestService {
	@Autowired
	private OperationMetier operationMetier;
	@RequestMapping(value="/versement",method=RequestMethod.PUT)
	public boolean verser(@RequestParam String code,
						  @RequestParam double solde, 
						  @RequestParam Long codeEmp) {
		return operationMetier.verser(code, solde, codeEmp);
	}
	@RequestMapping(value="/retrait",method=RequestMethod.PUT)
	public boolean retrait(@RequestParam String code,
			  @RequestParam double solde, 
			  @RequestParam Long codeEmp) {
		return operationMetier.retrait(code, solde, codeEmp);
	}
	@RequestMapping(value="/virement",method=RequestMethod.PUT)
	public boolean virement( @RequestParam String code1,  @RequestParam String code2, @RequestParam  double solde,
			 @RequestParam Long codeEmp) {
		return operationMetier.virement(code1, code2, solde, codeEmp);
	}
	
}
