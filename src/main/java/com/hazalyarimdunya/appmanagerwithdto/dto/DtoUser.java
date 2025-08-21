package com.hazalyarimdunya.appmanagerwithdto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//get islemleri icin DtoUser. Insert ve update islemleri icin DtoUserIU siniflari kullanilacak.
public class DtoUser {
    private String name;
    private String surname;
}
