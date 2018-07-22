package com.zoro.zorothymeleaf;

import java.lang.annotation.*;

/**
 * Demo class
 *
 * @author dubber
 * @date 2018/7/22
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(value = UserTags.class)  //必须java8
public @interface UserTag {

    String id();
}
