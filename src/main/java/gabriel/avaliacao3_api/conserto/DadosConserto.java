package gabriel.avaliacao3_api.conserto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import gabriel.avaliacao3_api.mecanico.DadosMecanico;
import gabriel.avaliacao3_api.veiculo.DadosVeiculo;

public record DadosConserto(
        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        String entrada,
        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        String saida,
        @NotNull
        @Valid
        DadosVeiculo veiculo,
        @NotNull
        @Valid
        DadosMecanico mecanico) {

}
