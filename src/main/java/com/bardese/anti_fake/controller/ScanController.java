package com.bardese.anti_fake.controller;

import com.bardese.anti_fake.beans.ActivationCode;
import com.bardese.anti_fake.beans.QRCodeCheck;
import com.bardese.anti_fake.mapper.ActivationCodeMapper;
import com.bardese.anti_fake.mapper.QRCodeCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tao
 * @Date 2020/8/19
 * @Time 9:03
 */
@Controller
public class ScanController {

    @Autowired
    private QRCodeCheckMapper checkMapper;

    @Autowired
    private ActivationCodeMapper activationMapper;

    @GetMapping("/")
    public String scan(Model model,
                       @RequestParam(value = "Id") String Id,
                       @RequestParam(value = "AdmCode", required = false) String AdmCode) {
        if (AdmCode != null) {
            Id = Id + "&AdmCode=" + AdmCode;
        }

        QRCodeCheck qrCodeCheck = checkMapper.selectById(Id);
        if (qrCodeCheck == null) {
            return "error";
        }

        ActivationCode activationCode = activationMapper.selectById(Id);
        if(activationCode != null){
            activationCode.setScanCount(activationCode.getScanCount()+1);
            activationMapper.updateById(activationCode);
        }
        qrCodeCheck.setInventory_Id(qrCodeCheck.getInventory_Id());
        model.addAttribute("qrCodeCheck", qrCodeCheck);
        System.out.println(qrCodeCheck);
        return "result";
    }
}
