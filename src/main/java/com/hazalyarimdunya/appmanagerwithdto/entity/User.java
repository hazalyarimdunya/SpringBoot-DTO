package com.hazalyarimdunya.appmanagerwithdto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "Users") //Bu sınıfın bir JPA entity (veritabanı tablosuna karşılık gelen sınıf) olduğunu belirtir.Yani entity’nin JPA tarafındaki adıdır.
@Table(name = "userInfo") //tablo ismi
public class User {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto inc
    @Column(name = "user_id") // colon ismi
    private Integer Id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_email")
    private String email;

    @CreationTimestamp //otomatik olarak tarih ve zamanını atar.
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at; //Eğer @Column eklemezsen JPA/Hibernate varsayılan olarak field adını kolon adı olarak kullanır.
}