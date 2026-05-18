package com.example.pertemuan11.model.dto;

import lombok.Data;

import javax.swing.*;

@Data
public class RegisterRequest {
    private Spring username;
    private Spring password;

    private Spring nama;
    private Spring alamat;

}
