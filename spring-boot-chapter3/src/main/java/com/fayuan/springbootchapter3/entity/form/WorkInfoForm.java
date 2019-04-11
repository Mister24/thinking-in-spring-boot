/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.entity.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * 工作信息
 *
 * @author mr.24
 * @version Id: WorkInfoForm, v 1.0 2019-04-11 22:50 Exp $$
 */
@Data
public class WorkInfoForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 6471681897396182083L;

    public interface Update{}

    public interface Add{}


    /** id */
    @NotNull(groups = {Update.class})
    @Null(groups = {Add.class})
    Long   id;

    /** 名称 */
    String name;

    /** 邮箱 */
    @Email
    String email;

    @WorkOverTime(max=5)
    Integer workTime;
}
