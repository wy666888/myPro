package com.test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.pojo.IbEquipmentExport;  
  
@Controller    
public class FreemarkerController {    
        
    @RequestMapping("/hi")    
    public String sayHello(ModelMap map){    
        System.out.println("say hi ……");
    
        map.put("name", "kimi");    
        map.put("cars", "<select>"+
        		"<option value =\"volvo\">Volvo</option>"+
        		"<option value =\"saab\" selected>Saab</option>"+
        		"<option value=\"opel\">Opel</option>"+
        		"<option value=\"audi\">Audi</option>"+
        		"</select>");    
        map.put("fruit", "<select>"+
        		"<option value =\"volvo\">苹果</option>"+
        		"<option value =\"saab\" selected>香蕉</option>"+
        		"<option value=\"opel\">橘子</option>"+
        		"<option value=\"audi\">花生</option>"+
        		"</select>");    
    
        return "/hi.ftl";    
    }    
    @RequestMapping("/toUpper")    
    public String toUpper(ModelMap map){    
    	
//    	map.put("name", "kimi");    
//    	map.put("cars", "<select>"+
//    			"<option value =\"volvo\">Volvo</option>"+
//    			"<option value =\"saab\" selected>Saab</option>"+
//    			"<option value=\"opel\">Opel</option>"+
//    			"<option value=\"audi\">Audi</option>"+
//    			"</select>");    
//    	map.put("fruit", "<select>"+
//    			"<option value =\"volvo\">苹果</option>"+
//    			"<option value =\"saab\" selected>香蕉</option>"+
//    			"<option value=\"opel\">橘子</option>"+
//    			"<option value=\"audi\">花生</option>"+
//    			"</select>");    
    	return "/upper.ftl";    
    }    
    @RequestMapping("/repeat")    
    public String repeat(ModelMap map){    
    	
//    	map.put("name", "kimi");    
//    	map.put("cars", "<select>"+
//    			"<option value =\"volvo\">Volvo</option>"+
//    			"<option value =\"saab\" selected>Saab</option>"+
//    			"<option value=\"opel\">Opel</option>"+
//    			"<option value=\"audi\">Audi</option>"+
//    			"</select>");    
//    	map.put("fruit", "<select>"+
//    			"<option value =\"volvo\">苹果</option>"+
//    			"<option value =\"saab\" selected>香蕉</option>"+
//    			"<option value=\"opel\">橘子</option>"+
//    			"<option value=\"audi\">花生</option>"+
//    			"</select>");    
    	return "/repeat.ftl";    
    }    
    @RequestMapping("/auth")    
    public String auth(ModelMap map){    
    	
    	IbEquipmentExport export = new IbEquipmentExport();
    	export.setGroupname("groupname");
    	export.setOverview("overview");
    	export.setEquipname("equipname");
    	export.setExporter("exporter");
    	export.setManufacturer("manufacturer");
    	export.setProductiondate("productiondate");
    	export.setUsestate("usestate");
    	export.setInvestmentamount("investmentamount");
    	export.setCapacityscale("capacityscale");
    	map.put("ibEquipmentExport", export);
    	return "/auth.ftl";    
    }
    
}    