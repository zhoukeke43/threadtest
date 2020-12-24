package chinobot.threadtest.entity;


import lombok.Data;

@Data
public class Person {

    private int id;
    private String idCard;
    private String name;

    public Person(int id,String idCard,String name){
        this.id=id;
        this.idCard=idCard;
        this.name=name;


    }

}
