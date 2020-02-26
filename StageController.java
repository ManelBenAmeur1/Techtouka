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

import isetch.run.tn.Programme5ademni.model.MessageReponse;
import isetch.run.tn.Programme5ademni.model.Stage;
import isetch.run.tn.Programme5ademni.service.StageService;

@CrossOrigin("*")
@RestController
@RequestMapping("/stage")
public class StageController {

	
	@Autowired
	private  StageService stageService ;
	
	@PostMapping("/add")
	private MessageReponse AjouterStage (@RequestBody Stage stage) {
		return stageService.AjouterStage(stage);
	}
	
  @GetMapping("/get")
  private List<Stage> getallStage()
  {
	  return stageService.getAllStage();
  }
  

@PutMapping("/update")
private MessageReponse ModifierStage (@RequestBody Stage stage ) {
	return stageService.ModifierStage(stage) ;
	
}


@DeleteMapping("{id}")
private MessageReponse SupprimerStage (@PathVariable("id") int id) {
	return stageService.SupprimerStage(id) ;
	
}
	
} 
