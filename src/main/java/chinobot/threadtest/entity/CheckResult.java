package chinobot.threadtest.entity;

import lombok.Data;

import java.util.List;

@Data
public class CheckResult {

    private List origialResult;
    private String message;
    private boolean ifOk;


}
