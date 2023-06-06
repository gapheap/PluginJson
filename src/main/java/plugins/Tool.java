package plugins;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Tool {
    public static List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("Format Json, 1, format");
        list.add("Compress Json, 1, compress");
        list.add("About, 2, about");
        return list;
    }

    public static String format(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        return JSON.toJSONString(jsonObject, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
    }

    public static String compress(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        return JSON.toJSONString(jsonObject, SerializerFeature.BrowserCompatible, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
    }

    public static String about() {
        return "Author: stone\r\nVersion: 1.0.1\r\nLicense: GPL\r\nHome: \r\n";
    }

}
