package me.leo.java8.streamAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Progress {
    private Duration studyDuration;
    private boolean finished; // 강의 수료를 했는지
}
