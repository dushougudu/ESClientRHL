package org.zxp.esclientrhl.annotation;

import java.lang.annotation.*;

/**
 * @program: esdemo
 * @description: ES entity 标识ID的注解,在es entity field上添加
 * @author: X-Pacific zhang
 * @create: 2019-01-18 16:09
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface ESID {
}
