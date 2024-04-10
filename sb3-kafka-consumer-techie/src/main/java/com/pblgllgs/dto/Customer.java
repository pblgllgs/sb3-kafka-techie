package com.pblgllgs.dto;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;
}
