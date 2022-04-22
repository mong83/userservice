package com.skcc.tes.userservice.vo;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestUser {


    @NotNull
    private String email;
    private String name;
    private String pwd;
}
