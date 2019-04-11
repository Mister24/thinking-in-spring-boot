/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.entity.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 验证器
 *
 * @author mr.24
 * @version Id: WorkOverTimeValidator, v 1.0 2019-04-11 23:47 Exp $$
 */
public class WorkOverTimeValidator implements ConstraintValidator<WorkOverTime, Integer> {

    WorkOverTime workOverTime;

    int          max;

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        if (null == integer) {
            return true;
        }
        return integer < max;
    }

    @Override
    public void initialize(WorkOverTime constraintAnnotation) {
        this.workOverTime = workOverTime;
        this.max = workOverTime.max();
    }
}
