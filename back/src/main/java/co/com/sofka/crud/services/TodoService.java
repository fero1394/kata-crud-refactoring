package co.com.sofka.crud.services;

import co.com.sofka.crud.repositories.TodoRepository;
import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo get(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }
}

