package med.voll.api.domain.pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPacientes(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @Email(message = "Formato de e-mail inválido")
        @NotBlank(message = "E-mail é obrigatório")
        String email,
        @NotBlank(message = "Cpf é obrigatório")
        @Pattern(regexp = "\\d{11}" , message = "cpf inválido")
        String cpf,
        @NotBlank(message = "Telefone é obrigatório")
        @Pattern(regexp = "\\d{11}" , message = "Telefone inválido")
        String telefone,
        @NotNull(message = "Endereço é obrigatório")
        @Valid
        DadosEndereco endereco) {
}
