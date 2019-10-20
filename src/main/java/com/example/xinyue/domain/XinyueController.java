package com.example.xinyue.domain;

import com.example.xinyue.pojo.User;
import com.example.xinyue.service.XinyueService;
import com.example.xinyue.service.XinyueServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: xinyue
 * @Package: com.example.xinyue.domain
 * @ClassName: XinyueController
 * @Author: zht19
 * @Description:
 * @Date: 2019/10/17 15:33
 * @Version: 1.0
 */
@RestController
public class XinyueController {

    @Resource
    private XinyueService xinyueService;

    /**
     * 功能描述: 用户注册
     * @Param: [user]
     * @Return: org.springframework.http.ResponseEntity<java.lang.Void>
     * @Author: zht19
     * @Date: 2019/10/18 13:25
     */
    @PostMapping("/insert/appro")
    public ResponseEntity<Void> insertAppro(@RequestBody  User user){

        this.xinyueService.insertAppro(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
