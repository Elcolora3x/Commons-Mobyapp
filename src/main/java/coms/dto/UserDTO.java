package coms.dto;


import java.time.LocalDate;
import java.util.List;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDTO {

    private String name;
    private String lastName;

    private String email;
    private String profilePicture;

    private String province;
    private String locality;

    private String currentTech;
    private UserDTO referent; //nullable
    private UserDTO talentPartner; //nullable

    private LocalDate dateEntered;
    private String signatureUrl;

    // Projects related
    private List<String> projects;
}
