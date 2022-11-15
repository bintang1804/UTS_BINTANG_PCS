/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bintang
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PegawaiService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pegawaiId;
    private Long pegawaiNip;
    private String pegawaiNama;
    private String pegawaiAlamat;

}
