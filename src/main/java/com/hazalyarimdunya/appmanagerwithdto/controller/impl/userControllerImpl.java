package com.hazalyarimdunya.appmanagerwithdto.controller.impl;

import com.hazalyarimdunya.appmanagerwithdto.controller.interfaces.IUserController;
import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUser;
import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUserIU;
import com.hazalyarimdunya.appmanagerwithdto.entity.User;
import com.hazalyarimdunya.appmanagerwithdto.repository.IUserRepository;
import com.hazalyarimdunya.appmanagerwithdto.services.interfaces.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/user") //root url
public class userControllerImpl implements IUserController { //requesti ilk karsilayan class ve ilgili servise yonlendirir.
    //servisteki metodlar oldugu gibi yazilmaz. once interfaces icinde tanimlanir sonra impl de implemente edilir.

    @Autowired
    private IUserService iUserService; // servis katmani baglandi.Servise inerken impl class ile baglanilabilir.
    @Autowired
    private IUserRepository iUserRepository;

    @PostMapping(path = "/save")
    @Override
    public DtoUser saveUser(@RequestBody @Valid DtoUserIU dtoUserIU){
        //“HTTP request body’den gelen JSON’u al, otomatik olarak DtoUser nesnesine çevir ve bana parametre olarak ver.”
        return iUserService.saveUser(dtoUserIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoUser> getAllUsers() {
        return iUserService.getAllUsers();
    }

    @GetMapping(path = "/list/{id}" )
    @Override
    public DtoUser getUserById(@PathVariable(name = "id", required = true) Integer userId) {
        return iUserService.getUserById(userId);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteUserById(@PathVariable(name = "id", required = true) Integer id) {
        iUserService.deleteUserById(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DtoUser updateUser(@PathVariable(name = "id") Integer userId,@RequestBody DtoUserIU dtoUserIU) {
        return iUserService.updateUser(userId, dtoUserIU);
    }


}
