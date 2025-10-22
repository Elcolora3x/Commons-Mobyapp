package coms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

//TODO: Crear simil para la clase ProjectDTO (AirtableProjectRecord)
//TODO: Revisar que no coincide con los atributos de UserDTO

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableUserRecord {

    @JsonProperty("Nombre")
    private String name;

    @JsonProperty("Apellido")
    private String lastName;

    @JsonProperty("Correo Moby")
    private String correoMoby;

    @JsonProperty("Fecha de Alta")
    private String entryDate;

    @JsonProperty("Foto de Perfil URL")
    private String profilePicture;

    @JsonProperty("Es Referente?")
    private Boolean isReferent;

    @JsonProperty("Es Talent Partner?")
    private Boolean isTalentPartner;

    @JsonProperty("Firma URL")
    private String signatureURL;

    @JsonProperty("Localidad")
    private String locality;

    @JsonProperty("Provincia")
    private String province;

    @JsonProperty("Proyectos")
    private List<String> projects;

    @JsonProperty("Referente")
    private String referent;

    @JsonProperty("Tecnologia Actual")
    private String currentTech;
}
