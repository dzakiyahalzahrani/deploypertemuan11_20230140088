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
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Spring id;
    private Spring username;
    private Spring password;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private User profile;
}
