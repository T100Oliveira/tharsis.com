package com.example.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Agenda;
import Repository.AgendaRepository;
@RestController
@RequestMapping("/brasil")
public class AgendaController {

	
	@Autowired AgendaRepository agendaRepository;
	@GetMapping("/agenda")
	public String agendar() {
	
	return"";
	
	}
	@PostMapping("/agendado")
	public ResponseEntity<Agenda> CreateAgenda( @RequestBody Agenda agenda){
		
		
		Agenda salvaAgenda = agendaRepository.save(agenda);
		
		return new ResponseEntity<>(salvaAgenda,HttpStatus.CREATED);
		
	}
	
	
	

 @DeleteMapping("/agendado/{id}")  
 public String  deletaAgenda(@PathVariable long id) {
	   
	  agendaRepository.deleteById(id);
	return "";


	
   
   }
 
 
   @PutMapping("/logado/{id}")  
 
 
 public ResponseEntity<Agenda> UpdateAgenda( @PathVariable long id,@RequestBody Agenda agenda){
	 Optional<Agenda>  updateAgenda = agendaRepository.findById(id);
	   if( updateAgenda.isPresent()){
		   Agenda agenda1 =  updateAgenda.get();
		   agenda1.setNome(agenda1.getNome());
		   agenda1.setEmail(agenda1.getEmail());
		   agenda1.setHorario(agenda1.getHorario());
		   Agenda updateAgenda1 = agendaRepository.save(agenda);
		   return ResponseEntity.ok(updateAgenda1);	     
	   }else {  return ResponseEntity.notFound().build();}
			   

			   
			   
			 
	   
	

 }
 
 
 
 
 
 
 
 
};
