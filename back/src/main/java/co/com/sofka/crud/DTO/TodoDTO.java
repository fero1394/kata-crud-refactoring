package co.com.sofka.crud.DTO;

import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class TodoDTO {

    @Autowired
    private Todo todo;

    public Long getId() {
        return todo.getId();
    }

    public String getName(){
        return todo.getName();
    }

    public boolean getIsCompleted(){
        return todo.isCompleted();
    }

    public Long getIdList(){
        return todo.getIdList();
    }

    public void setId(Long id) {
        todo.setId(id);
    }

    public void setName(String name){
      todo.setName(name);
    }

    public void setIsCompleted(boolean completed){
        todo.setCompleted(completed);
    }

    public void setIdList(Long idL){
        todo.setIdList(idL);
    }

}
