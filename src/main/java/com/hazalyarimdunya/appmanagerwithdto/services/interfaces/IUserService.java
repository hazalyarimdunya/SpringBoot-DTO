package com.hazalyarimdunya.appmanagerwithdto.services.interfaces;

import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUser;
import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUserIU;
import com.hazalyarimdunya.appmanagerwithdto.entity.User;

import java.util.List;

public interface IUserService {
    public DtoUser saveUser(DtoUserIU user); //Save isleminde DtoUserIU ggonderilir. DtoUser olarak responseta dondurulur.
    public List<DtoUser> getAllUsers();
    public DtoUser getUserById(Integer userId);
//    public void deleteUserById(Integer id);
//    public User updateUser(Integer userId,User updatedUser);
}