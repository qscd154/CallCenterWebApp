package com.kst.csr.controller;

import com.kst.csr.dto.TaskDto;
import com.kst.csr.service.TaskInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class TaskInfController {

    @Autowired
    private TaskInfService taskInfService;


    @GetMapping("/tasks")
    public String getTasks(
            @RequestParam(value = "regDt", required = false) String regDt,
            @RequestParam(value = "reqNm", required = false) String reqNm,
            @RequestParam(value = "state", required = false) String state,
            @RequestParam(value = "head", required = false) String head,
            Model model) {

        List<TaskDto> tasks;
        if (regDt != null || reqNm != null || state != null
         || head != null) {


            tasks = taskInfService.searchTasks(regDt, reqNm, state, head);
            model.addAttribute("tasks", tasks);

        } else {
            tasks = taskInfService.getAllTasks();
            model.addAttribute("tasks", tasks);

        }

        return "tasks";

    }

    @GetMapping("/tasks/clear")
    public String clearSearchParams() {
        // 모든 파라미터를 제거하고 전체 조회 페이지로 리다이렉트
        return "redirect:/tasks";
    }
}
