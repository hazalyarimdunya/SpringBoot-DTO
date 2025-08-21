package com.hazalyarimdunya.appmanagerwithdto.services.impl;

import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUser;
import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUserIU;
import com.hazalyarimdunya.appmanagerwithdto.entity.User;
import com.hazalyarimdunya.appmanagerwithdto.repository.IUserRepository;
import com.hazalyarimdunya.appmanagerwithdto.services.interfaces.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public DtoUser saveUser(DtoUserIU dtoUserIU) {
        User user = new User();
        DtoUser response = new DtoUser();
        BeanUtils.copyProperties(dtoUserIU, user);
        User savedUser = iUserRepository.save(user);
        BeanUtils.copyProperties(savedUser, response);
        return response; // user db ye kaydedildi. save() metodu JpaRepository icinden alindi
    }

    @Override
    public List<DtoUser> getAllUsers() {
            //Tum userlari tek tek for ile bir listede toplayip donuyoruz.
            List<DtoUser> dtoUserList = new ArrayList<>(); //bos listemiz
            List<User> userList = iUserRepository.findAll(); //user listemiz
            for (User user : userList){
                DtoUser dtoUser = new DtoUser(); //bos dto lu user nesnesi.
                BeanUtils.copyProperties(user, dtoUser);
                dtoUserList.add(dtoUser);
            }
            return dtoUserList;
        }

//    @Override
//    public User getUserById(Integer userId) {
//        Optional<User> optional = iUserRepository.findById(userId);
//        if (optional.isPresent()){
//            return optional.get();
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteUserById(Integer id) {
//        User user = getUserById(id); //once kullaniciyi al
//        if (user!=null){
//            iUserRepository.delete(user); //sil
//        }
//    }
//
//    @Override
//    public User updateUser(Integer userId, User updatedUser) {
//        User user  = getUserById(userId);
//        if (user!=null){
//            user.setName(updatedUser.getName());
//            user.setSurname(updatedUser.getSurname());
//            user.setEmail(updatedUser.getEmail());
//           return iUserRepository.save(user);
//        }
//        return null;
//    }
}
