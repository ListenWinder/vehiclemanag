package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuHaoiang
 * @date 2018/5/13 9:27
 */
@RestController
public class HelloController {

//    @RequestMapping(value = "/say",method = RequestMethod.GET)
   /* @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return "Hello World";
//        return cupSize + age;
//        return "id:"+ id+ " "+girlProperties.getAge()+girlProperties.getCupSize();
    }*/

    @GetMapping(value = "/say")
    public String say(){
        return "Hello World";
//        return cupSize + age;
//        return "id:"+ id+ " "+girlProperties.getAge()+girlProperties.getCupSize();
    }
}
