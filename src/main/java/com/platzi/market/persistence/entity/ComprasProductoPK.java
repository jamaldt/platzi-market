package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable
{
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra()
    {
        return idCompra;
    }

    public Integer getIdProducto()
    {
        return idProducto;
    }

    public void setIdProducto( Integer idProducto )
    {
        idProducto = idProducto;
    }

    public void setIdCompra( Integer idCompra )
    {
        idCompra = idCompra;
    }
}

