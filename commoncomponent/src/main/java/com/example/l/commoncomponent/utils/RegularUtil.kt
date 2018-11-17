package com.example.l.commoncomponent.utils

import java.util.*
import java.util.regex.Pattern

/**
 * @author $汪金龙$
 * @desc 检测手机号码，邮箱等是否有效
 * @date 2018/10/26 14:03
 */
object RegularUtil {
    /**
     * 要更加准确的匹配手机号码只匹配11位数字是不够的，比如说就没有以144开始的号码段，
     * 故先要整清楚现在已经开放了多少个号码段，国家号码段分配如下：
     * 移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
     * 联通：130、131、132、152、155、156、185、186 　　电信：133、153、180、189、（1349卫通）
     */
    fun isPhone(param: String) = {
        val str = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$"
        val p = Pattern.compile(str)
        val m = p.matcher(param)
        m.matches()
    }

    /**
     * 判断email格式是否正确
     */
    fun isEmail(email: String) = {
        val str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"
        val p = Pattern.compile(str)
        val m = p.matcher(email)
        m.matches()
    }
}
