package com.example.learningspring.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomId;

    @Column(name="NAME")
    private String roomName;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BED_INFO")
    private String bedInfo;
}
