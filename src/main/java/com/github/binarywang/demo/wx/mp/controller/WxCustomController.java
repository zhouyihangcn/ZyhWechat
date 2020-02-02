package com.github.binarywang.demo.wx.mp.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zyh.wx.mp.utils.JsonUtils;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;


@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/wx/info")
public class WxCustomController {
    private final WxMpService wxService;

    @GetMapping(produces = "text/plain;charset=utf-8")
    public WxMpConfigStorage info() {

    	WxMpConfigStorage configs = wxService.getWxMpConfigStorage();
		log.info("\n new info request..." + JsonUtils.toJson(configs ));
        
        return configs;
    }

}
