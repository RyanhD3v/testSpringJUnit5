package org.nhbc.test.springboot.app.sevices;

import org.nhbc.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface CuentaService {

    List<Cuenta> findAll();

    Cuenta findById (Long id);

    Cuenta save(Cuenta cuenta);

    void deleteById(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo (Long cuentaId);

    void tranferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId );

}
