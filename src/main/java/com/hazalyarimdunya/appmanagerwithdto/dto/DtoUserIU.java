package com.hazalyarimdunya.appmanagerwithdto.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DtoUserIU { //Insert ve update islemleri icin

    /*
    ---SPRING BOOT VALIDATION--
    //Validasyonun calismasi icin controller classimizda DtoUserIU save islemi icin  @Valid anatasyonu verilmeli

        NotEmpty,NotNull,NotBlank,Size,Email,Min,Max etc....

        NotEmpty => String name = "";
        NotNull => String name = null;
        NotBlank => String name;
    */
    @NotEmpty(message = "Name field cannot pass empty")
    @Size(min = 3 , max = 30 , message = "Name field should be between 5-15 characters")
    private String name;

    @Size(min = 3 , max = 30 , message = "Name field should be between 5-15 characters")
    private String surname;

    @Email(message = "Wrong email format")
    private String email;
}
