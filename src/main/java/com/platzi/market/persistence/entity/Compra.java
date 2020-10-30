package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private  Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Integer getIdCompra()
    {
        return idCompra;
    }

    public void setIdCompra( Integer idCompra )
    {
        idCompra = idCompra;
    }

    public String getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente( String idCliente )
    {
        idCliente = idCliente;
    }

    public LocalDateTime getFecha()
    {
        return fecha;
    }

    public void setFecha( LocalDateTime fecha )
    {
        fecha = fecha;
    }

    public String getMedioPago()
    {
        return medioPago;
    }

    public void setMedioPago( String medioPago )
    {
        medioPago = medioPago;
    }

    public String getComentario()
    {
        return comentario;
    }

    public void setComentario( String comentario )
    {
        comentario = comentario;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        estado = estado;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente( Cliente cliente )
    {
        cliente = cliente;
    }

    public List<ComprasProducto> getProductos()
    {
        return productos;
    }

    public void setProductos( List<ComprasProducto> productos )
    {
        productos = productos;
    }
}
