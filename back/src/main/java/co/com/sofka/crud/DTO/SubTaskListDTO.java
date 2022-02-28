package co.com.sofka.crud.DTO;

import co.com.sofka.crud.entity.SubTaskList;
import org.springframework.beans.factory.annotation.Autowired;


public class SubTaskListDTO {

    @Autowired
    private SubTaskList subTaskList;

    public Long getIdList() {
         return subTaskList.getId();
    }

    public String getNameList(){
        return subTaskList.getName();
    }

    public void setIdList(Long id) {
        subTaskList.setId(id);
    }

    public void setNameList(String name){
        subTaskList.setName(name);
    }



}
