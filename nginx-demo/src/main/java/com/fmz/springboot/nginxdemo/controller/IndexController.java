package com.fmz.springboot.nginxdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    public static final String result = "{ \"type\": \"success\", \"value\": [ { \"id\": 478, \"joke\": \"Chuck Norris can instantiate an abstract class.\", \"categories\": [ \"nerdy\" ] }, { \"id\": 589, \"joke\": \"Dark spots on the Moon are the result of Chuck Norris' shooting practice.\", \"categories\": [] }, { \"id\": 151, \"joke\": \"Chuck Norris doesn't step on toes. Chuck Norris steps on necks.\", \"categories\": [] }, { \"id\": 415, \"joke\": \"When Chuck Norris wants an egg, he cracks open a chicken.\", \"categories\": [] }, { \"id\": 233, \"joke\": \"When Bruce Banner gets mad, he turns into the Hulk. When the Hulk gets mad, he turns into Chuck Norris.\", \"categories\": [] }, { \"id\": 76, \"joke\": \"If tapped, a Chuck Norris roundhouse kick could power the country of Australia for 44 minutes.\", \"categories\": [] }, { \"id\": 512, \"joke\": \"Chuck Norris does not need to type-cast. The Chuck-Norris Compiler (CNC) sees through things. All way down. Always.\", \"categories\": [ \"nerdy\" ] }, { \"id\": 336, \"joke\": \"Chuck Norris uses tabasco sauce instead of visine.\", \"categories\": [] }, { \"id\": 108, \"joke\": \"The show Survivor had the original premise of putting people on an island with Chuck Norris. There were no survivors, and nobody is brave enough to go to the island to retrieve the footage.\", \"categories\": [] }, { \"id\": 543, \"joke\": \"Chuck Norris's programs can pass the Turing Test by staring at the interrogator.\", \"categories\": [ \"nerdy\" ] }, { \"id\": 250, \"joke\": \"The truth will set you free. Unless Chuck Norris has you, in which case, forget it buddy!\", \"categories\": [] }, { \"id\": 236, \"joke\": \"Sticks and stones may break your bones, but a Chuck Norris glare will liquefy your kidneys.\", \"categories\": [] }, { \"id\": 353, \"joke\": \"Chuck Norris is the only person who can simultaneously hold and fire FIVE Uzis: One in each hand, one in each foot -- and the 5th one he roundhouse-kicks into the air, so that it sprays bullets.\", \"categories\": [] }, { \"id\": 561, \"joke\": \"Chuck Norris doesn't need an account. He just logs in.\", \"categories\": [] }, { \"id\": 201, \"joke\": \"Chuck Norris was what Willis was talkin' about.\", \"categories\": [] }, { \"id\": 222, \"joke\": \"Industrial logging isn't the cause of deforestation. Chuck Norris needs toothpicks.\", \"categories\": [] }, { \"id\": 209, \"joke\": \"That's not Chuck Norris doing push-ups -- that's Chuck Norris moving the Earth away from the path of a deadly asteroid.\", \"categories\": [] }, { \"id\": 208, \"joke\": \"Chuck Norris shot the sheriff, but he round house kicked the deputy.\", \"categories\": [] }, { \"id\": 85, \"joke\": \"When Steven Seagal kills a ninja, he only takes its hide. When Chuck Norris kills a ninja, he uses every part.\", \"categories\": [] }, { \"id\": 98, \"joke\": \"In the beginning there was nothing...then Chuck Norris Roundhouse kicked that nothing in the face and said &quot;Get a job&quot;. That is the story of the universe.\", \"categories\": [] } ] }";

    @RequestMapping("/student/{id}")
    //@CrossOrigin
    public Object student(@PathVariable("id") String id) {

        /*
        Map<String, String> rs = new HashMap<>();
        rs.put("id", id);
        rs.put("name", "学生");
        */
        return result;
    }

    @RequestMapping("/teacher/{id}")
    public Object teacher(@PathVariable("id") String id) {

        Map<String, String> rs = new HashMap<>();
        rs.put("id", id);
        rs.put("name", "老师");
        return rs;
    }
}
