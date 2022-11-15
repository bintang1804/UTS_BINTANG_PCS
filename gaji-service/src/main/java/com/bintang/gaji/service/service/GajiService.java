/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.service;

import com.bintang.gaji.service.entity.Gaji;
import com.bintang.gaji.service.repository.GajiRepository;
import com.bintang.gaji.service.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Bintang
 */
public class GajiService {

    @Autowired
    private GajiRepository gajiRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Gaji saveGaji(Gaji gaji) {
        return gajiRepository.save(gaji);
    }

    public ResponseTemplateVO getGaji(Long gajiId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Pegawai pegawai
                = restTemplate.getForObject("http://localhost:8090/pegawai/"
                        + Gaji.getGajiId(), Pegawai.class);
        vo.setGaji(gaji);
        vo.setPegawai(pegawai);
        return vo;
    }
}
