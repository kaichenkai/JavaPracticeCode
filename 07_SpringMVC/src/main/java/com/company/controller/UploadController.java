package com.company.controller;

import com.company.model.UploadImageFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 11:58
 */
@Controller
public class UploadController {
    @RequestMapping("uploadImage")
    public ModelAndView uploadImage(HttpServletRequest request, UploadImageFile image) throws IOException {
        String newFileName = UUID.randomUUID().toString() + ".jpg";
        //根据request.getServletContext().getRealPath 获取到web目录下的image目录，用于存放上传后的文件
        File newImageFile = new File(request.getServletContext().getRealPath("/images"), newFileName);
        //
        if (!newImageFile.getParentFile().exists()) {
            newImageFile.getParentFile().mkdirs();
        }
        //调用file.getImage().transferTo(newFile); 复制文件
        image.getImage().transferTo(newImageFile);
        //
        ModelAndView modelAndView = new ModelAndView("showUploadFile");
        modelAndView.addObject("imageName", newFileName);
        return modelAndView;
    }
}
