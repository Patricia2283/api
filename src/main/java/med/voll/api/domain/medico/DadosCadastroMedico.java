package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "E-mail é obrigatório")
        @Email(message = "Formato de e-mail inválido")
        String email,
        @NotBlank(message = "Telefone é obrigatório")
        @Pattern(regexp = "\\d{11}" , message = "Telefone inválido")
        String telefone,
        @NotBlank(message = "Crm é obrigatório")
        @Pattern(regexp = "\\d{4,6}" , message = "crm inválido")
        String crm,
        @NotNull(message = "Especialidade é obrigatório")
        Especialidade especialidade,
        @NotNull(message = "Endereço é obrigatório")
        @Valid
        DadosEndereco endereco) {
}
