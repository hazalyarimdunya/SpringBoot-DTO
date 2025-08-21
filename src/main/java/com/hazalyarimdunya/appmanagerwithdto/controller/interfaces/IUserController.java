package com.hazalyarimdunya.appmanagerwithdto.controller.interfaces;

import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUser;
import com.hazalyarimdunya.appmanagerwithdto.dto.DtoUserIU;
import com.hazalyarimdunya.appmanagerwithdto.entity.User;

import java.util.List;

public interface IUserController {
    public DtoUser saveUser(DtoUserIU dtoUserIU); //Dışarıdan bir User alıyor (yeni kayıt edilmek istenen kullanıcı bilgileriyle).Onu DB’ye kaydedip, responseta geri User nesnesi döndürüyor (genellikle id veya createdAt gibi ek bilgilerle).
    public List<DtoUser> getAllUsers();
//    public User getUserById(Integer userId);
//    public void deleteUserById(Integer id);
//    public User updateUser(Integer userId , User updatedUser);
}
