package com.hazalyarimdunya.appmanagerwithdto.repository;

import com.hazalyarimdunya.appmanagerwithdto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> { //User:Uzerinde calisilacak entity class.Integer:Entitydeki @Id type.
                                                                         //JpaRepository = Hibernet ile geliyor. Crud islemlerini yapan metotlari iceriyor. bu metotlar extend edildi.

    //***JPARepository'e ait ozel metotlar isimizi gormediginde @Query anatasyonu ile kendi ozel metodumuzu yazabiliyoruz.

    // HQL(Hibernet Query Language) => nativeQuery false verilir & Sorgular class ismi ve entitydeki degisken isimleri verilerek yazilir.
    @Query(value = "from Users" , nativeQuery = false)
    List<User> findMyAllUserHql();

    //HQL parametreli
    @Query(value = "from Users u WHERE u.Id =:userId" , nativeQuery = false) // "=:userId" buraya bosluk girmemeli.
   Optional<User> findMyAllUserByIdHql(Integer userId);

    //SQL(Structured Query Language) => nativeQuery true verilir. & Sorgula Db deki sema.tabloAdi ve column name ile yazilir
//    @Query(value = "select * from dtouser.user_info" , nativeQuery = true)
//    List<User> findMyAllUserSql();
//
//    @Query(value = "select * from dtouser.user_info dtoUser where user_id=?" , nativeQuery = true)
//    Optional<User> findMyAllUserByIdSql(Integer userId);


}

