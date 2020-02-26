package isetch.run.tn.Programme5ademni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import isetch.run.tn.Programme5ademni.service.KhademniService;
import isetch.run.tn.Programme5ademni.model.MessageReponse;
import isetch.run.tn.Programme5ademni.model.khademni;
@CrossOrigin("*")
@RestController
@RequestMapping("/khademni")
public class khademniController {
	@Autowired
	private  KhademniService KhademniService ;
	
	@PostMapping("/add")
	private MessageReponse AjouterKhademni (@RequestBody khademni Khademni) {
		return KhademniService.Ajouterkhademni(Khademni);
	}
	
  @GetMapping("/get")
  private List<khademni> getallkhademni()
  {
	  return KhademniService.getAllkhademni();
  }
  

@PutMapping("/update")
private MessageReponse Modifierkhademni (@RequestBody khademni khademni ) {
	return KhademniService.Modifierkhademni(khademni) ;
	
}


@DeleteMapping("{id}")
private MessageReponse Supprimerkhademni (@PathVariable("id") int id) {
	return KhademniService.Supprimerkhademni(id) ;
	
}
	
}
