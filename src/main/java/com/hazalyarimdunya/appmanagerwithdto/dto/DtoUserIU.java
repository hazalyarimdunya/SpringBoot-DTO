package com.hazalyarimdunya.appmanagerwithdto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DtoUserIU { //Insert ve update islemleri ici
    private String name;
    private String surname;
    private String email;
}
