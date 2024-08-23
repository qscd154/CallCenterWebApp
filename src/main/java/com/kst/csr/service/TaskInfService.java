package com.kst.csr.service;

import com.kst.csr.dto.TaskDto;
import com.kst.csr.model.Task;
import com.kst.csr.repository.TaskInfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskInfService {


    @Autowired
    private TaskInfRepository taskInfRepository;

    public List<TaskDto> getAllTasks() {
        List<Task> tasks = taskInfRepository.findAll();
                return tasks.stream()
                        .map(this::convertToDto)
                        .collect(Collectors.toList());
    }


    public List<TaskDto> searchTasks(String regDt, String reqNm, String state, String head) {

        regDt = (regDt != null && !regDt.trim().isEmpty()) ? regDt : null;
        reqNm = (reqNm != null && !reqNm.trim().isEmpty()) ? reqNm : null;
        state = (state != null && !state.trim().isEmpty()) ? state : null;
        head = (head != null && !head.trim().isEmpty()) ? head : null;

        List<Task> tasks = taskInfRepository.searchTasks(regDt, reqNm, state, head);

        return tasks.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    //엔티티를 DTO로 변환
    private TaskDto convertToDto(Task task) {
        TaskDto taskDto = new TaskDto();

        taskDto.setTaskId(task.getTaskId());
        taskDto.setRegDt(task.getRegDt());
        taskDto.setState(task.getState());
        taskDto.setReqNm(task.getReqNm());
        taskDto.setHead(task.getHead());

        return taskDto;
    }

}
