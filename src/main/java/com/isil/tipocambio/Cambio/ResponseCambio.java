package com.isil.tipocambio.Cambio;

import lombok.Data;

import java.util.List;

@Data
public class ResponseCambio {
    private CambioResponseDetail query;
    private CambioInfo info;
}
