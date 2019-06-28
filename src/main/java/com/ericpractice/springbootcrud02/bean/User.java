package com.ericpractice.springbootcrud02.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * User class
 *
 * @author lighao
 * @date 2019/06/25
 */

@Getter @Setter
public class User {

     /**
      * @param age user age
      */
     private Integer age;

     /**
      * @param id user id
      */
     private Integer id;

     /**
      * @param name user name
      */
     private String name;

}
