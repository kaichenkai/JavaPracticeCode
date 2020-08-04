package com.company.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 11:57
 */
public class UploadImageFile {
    private MultipartFile image;

    /*
    getter and setter
     */
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
