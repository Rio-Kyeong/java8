package me.leo.java8.streamAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OnlineClass {
    private Integer id;
    private String title;
    private boolean closed;
}
