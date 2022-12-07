package com.isil.tipocambio.Cambio;

import lombok.Data;

@Data
public class CambioTotal {
    private CambioResponseDetail query;
    private CambioInfo info;
    private Float result;
}
