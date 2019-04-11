/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * 文件上传controller
 *
 * @author mr.24
 * @version Id: FileUploadController, v 1.0 2019-04-11 16:41 Exp $$
 */
@Controller
public class FileUploadController {

    /**
     * 单个文件上传
     *
     * @param name 文件名
     * @param file 文件
     *
     * @return     结果
     * */
    @PostMapping("post")
    @ResponseBody
    public String handleFileUpload(String name, MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            InputStream inputStream = file.getInputStream();

            return "true";
        }

        return "false";
    }
}
