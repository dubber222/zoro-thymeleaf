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
public @interface UserTags {
    UserTag[] value();
}
