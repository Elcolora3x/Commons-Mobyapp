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
    private Boolean asset;

    private LocalDate dateOfBirth;

    private String province;
    private String locality;

    private TechnologyDTO currentTech;
    private UserDTO referent;
    private UserDTO talentPartner;

    private LocalDate dateEntered;
    private String signatureUrl;

    // Projects related
    private List<ProjectDTO> projects;
}
