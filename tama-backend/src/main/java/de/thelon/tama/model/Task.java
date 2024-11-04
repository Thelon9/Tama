package de.thelon.tama.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private String status;
    private String detail;
    private String duration;
    private String prio;
    private String group;
    private String area;
    private String owner;
    private String delegate;

}
