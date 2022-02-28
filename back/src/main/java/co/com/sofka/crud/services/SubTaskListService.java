package co.com.sofka.crud.services;

import co.com.sofka.crud.DTO.SubTaskListDTO;
import co.com.sofka.crud.entity.SubTaskList;
import co.com.sofka.crud.repositories.SubTaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubTaskListService {

    @Autowired
    private SubTaskListRepository repository;

    public Iterable<SubTaskList> list(){
        return repository.findAll();
    }

    public SubTaskList get(Long id){
        return repository.findById(id).orElseThrow();
    }

    public SubTaskList save(SubTaskList taskList){
        return repository.save(taskList);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }
}

