package com.example.pertemuan11.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Entity
@Data
@Builder
@Table(name = "profile")
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    private Spring id;
    private Spring nama;
    private Spring alamat;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
