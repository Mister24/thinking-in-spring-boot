/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.entity.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 注解
 *
 * @author mr.24
 * @version Id: WorkOverTime, v 1.0 2019-04-11 23:06 Exp $$
 */
@Constraint(validatedBy = WorkOverTimeValidator.class)
@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkOverTime {

    String message()
            default "加班时长不能超过{max}小时";

    int max()
            default 4;

    Class<?>[] groups()
            default {};

    Class<? extends Payload>[] payload()
            default {};
}
