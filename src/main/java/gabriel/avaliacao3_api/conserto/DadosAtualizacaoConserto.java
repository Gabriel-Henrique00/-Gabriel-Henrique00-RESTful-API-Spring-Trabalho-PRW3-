package gabriel.avaliacao3_api.conserto;

import jakarta.validation.constraints.NotNull;
import gabriel.avaliacao3_api.mecanico.DadosMecanico;
import gabriel.avaliacao3_api.veiculo.DadosVeiculo;

public record DadosAtualizacaoConserto(
        @NotNull Long id,
        String saida,
        DadosMecanico mecanico,
        DadosVeiculo veiculo) {
}
