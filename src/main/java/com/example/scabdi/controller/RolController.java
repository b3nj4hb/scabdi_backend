package com.example.scabdi.controller;
import java.util.ArrayList;
import java.util.List;
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
import com.example.scabdi.entity.Rol;
import com.example.scabdi.serviceImpl.RolServiceImpl;

@RestController
@RequestMapping("/api/rol")
public class RolController {
	@Autowired
	private RolServiceImpl rolService;
	@PostMapping("/create")
	public ResponseEntity<Rol> save(@RequestBody Rol rol){
		try {
			Rol rl = rolService.create(rol);
			return new ResponseEntity<>(rl, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/all")
	public ResponseEntity<List<Rol>> getRoles(){
		try {
			List<Rol> list = new ArrayList<>();
			list = rolService.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/read/{id}")
	public ResponseEntity<Rol> getUser(@PathVariable("id") int id){
		Rol paciente = rolService.read(id);
			if(paciente.getId()>0) {
				return new ResponseEntity<>(paciente, HttpStatus.OK);
			}else {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} 
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
		try {
			rolService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Rol> update(@RequestBody Rol rl, @PathVariable("id") int id){
		try {
			Rol rll = rolService.read(id);
			if(rll.getId()>0) {
				rll.setNo_rol(rl.getNo_rol());
				return new ResponseEntity<>(rolService.create(rll),HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}			

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
