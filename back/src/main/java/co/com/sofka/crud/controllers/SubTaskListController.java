package co.com.sofka.crud.controllers;

import co.com.sofka.crud.DTO.SubTaskListDTO;
import co.com.sofka.crud.entity.SubTaskList;
import co.com.sofka.crud.services.SubTaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SubTaskListController {

    @Autowired
    private SubTaskListService service;

    @GetMapping(value = "api/tasklist")
    public Iterable<SubTaskList> list(){
        return service.list();
    }

    @PostMapping(value = "api/task")
    public SubTaskList save(@RequestBody SubTaskList taskList){
        return service.save(taskList);
    }


    @PutMapping(value = "api/task")
    public SubTaskList update(@RequestBody SubTaskList taskList){
        if(taskList.getId() != null){
            return service.save(taskList);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/task")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/task")
    public SubTaskList get(@PathVariable("id") Long id){
        return service.get(id);
    }
}
