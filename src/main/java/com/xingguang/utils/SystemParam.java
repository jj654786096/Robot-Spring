package com.xingguang.utils;

import com.xingguang.model.BotModel;
import com.xingguang.service.BotService;
import com.xingguang.service.SystemParamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个系统参数工具类
 **/
public class SystemParam {

    /**
     * 系统超级管理员
     */
    public static String master;

    /**
     * 骰子开关状态(存放处于开启状态的骰娘QQ和QQ群)
     */
    public static List<BotModel> botList;

    /**
     * 当前登录的人员的QQ
     */
    public static String strCurrentQQ;

    /**
     * 当前登录的人员的QQname
     */
    public static String strCurrentQQName;

    /**
     * 异常提示语句
     */
    public static String errorMsg = "!无法识别的指令,行光已记录,master上线后会及时处理,";




}
