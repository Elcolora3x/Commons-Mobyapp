package coms.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProjectDTO {
    private String name;
    private String description;
    private String client;
    private LocalDate creationDate;
    private LocalDate closingDate;
    private String state;
}
