package ru.taskmanagment.payload.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.taskmanagment.payload.rs.RegisterLoginRs;
import ru.taskmanagment.payload.rs.UserRs;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebRs<T> {
    private int code;
    private String message;
    private T data;

    public WebRs(RegisterLoginRs registerLoginRs) {
        this.code = 200;
        this.message = "Success";
        this.data = (T) registerLoginRs;
    }

    public WebRs(UserRs userRs) {
    }

    public WebRs(String s) {
    }
}