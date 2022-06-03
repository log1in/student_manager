package com.xyha;

import com.xyha.student_manager.service.IAcademyService;
import com.xyha.student_manager.service.IAdminService;
import com.xyha.student_manager.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagerApplicationTests {

    @Autowired
    IUserService userService;
    @Autowired
    IAdminService service;
    @Test
    void contextLoads() {
        System.out.println(userService.getById(1));
    }

    @Test
    void test(){
        System.out.println(service.getById(1));
    }

}
