package com.pblgllgs.dto;
/*
 *
 * @author pblgl
 * Created on 10-04-2024
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String ipAddress;
}
