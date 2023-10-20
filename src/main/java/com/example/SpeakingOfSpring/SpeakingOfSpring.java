package com.example.SpeakingOfSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class SpeakingOfSpring {
    @GetMapping("/spring")
            public String spring(){
        List<String>springTodoList=new ArrayList<>();
        String []springTodo={
                "桜餅を食べます",
                "いちご狩りに行きます",
                "お花見に行きます",
                "新生活が始まります",
                "花粉症がしんどいです",
                "入学式があります",
                "菜の花が咲きます",
                "Haruちゃんが生まれた季節です"
        };
        Random r= new Random();
        for (int i = 0; i < 1; i++){
            String Todo=springTodo[r.nextInt(8)];
            springTodoList.add(new String(Todo));
    }
                return "春といえば,"+springTodoList;
            }
        }
