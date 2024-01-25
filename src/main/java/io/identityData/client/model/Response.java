package io.identityData.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    @SerializedName("code")
    private Integer code = null;

    @SerializedName("message")
    private String message = null;

    @SerializedName("datetime")
    private String datetime = null;

    @SerializedName("requestId")
    private UUID requestId = null;

    @SerializedName("data")
    private String data = null;

    @SerializedName("estatus")
    private String estatus = null;

    @SerializedName("mensaje")
    private String mensaje = null;

    @SerializedName("codigoValidacion")
    private String codigoValidacion = null;

    @SerializedName("claveMensaje")
    private String claveMensaje = null;

    @SerializedName("claveElector")
    private String claveElector = null;

    @SerializedName("numeroEmision")
    private String numeroEmision = null;

    @SerializedName("anioRegistro")
    private String anioRegistro = null;

    @SerializedName("anioEmision")
    private String anioEmision = null;

    @SerializedName("vigencia")
    private String vigencia = null;

    @SerializedName("ocr")
    private String ocr = null;

    @SerializedName("cic")
    private String cic = null;

    @SerializedName("distritoFederal")
    private String distritoFederal = null;

    @SerializedName("informacionAdicional")
    private String informacionAdicional = null;

    @SerializedName("cedulas")
    private List<Cedulas> cedulas = new ArrayList<Cedulas>();

    @SerializedName("códigoValidacion")
    private String cdigoValidacion = null;

    @SerializedName("códigoMensaje")
    private String cdigoMensaje = null;

    @SerializedName("codigoRespuesta")
    private String codigoRespuesta = null;

    @SerializedName("descripcionRespuesta")
    private String descripcionRespuesta = null;

    @SerializedName("referencia")
    private String referencia = null;

    @SerializedName("respuestaRENAPO")
    private RespuestaRENAPO respuestaRENAPO = null;

    public Response() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(String codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    public String getClaveMensaje() {
        return claveMensaje;
    }

    public void setClaveMensaje(String claveMensaje) {
        this.claveMensaje = claveMensaje;
    }

    public String getClaveElector() {
        return claveElector;
    }

    public void setClaveElector(String claveElector) {
        this.claveElector = claveElector;
    }

    public String getNumeroEmision() {
        return numeroEmision;
    }

    public void setNumeroEmision(String numeroEmision) {
        this.numeroEmision = numeroEmision;
    }

    public String getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(String anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getAnioEmision() {
        return anioEmision;
    }

    public void setAnioEmision(String anioEmision) {
        this.anioEmision = anioEmision;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getOcr() {
        return ocr;
    }

    public void setOcr(String ocr) {
        this.ocr = ocr;
    }

    public String getCic() {
        return cic;
    }

    public void setCic(String cic) {
        this.cic = cic;
    }

    public String getDistritoFederal() {
        return distritoFederal;
    }

    public void setDistritoFederal(String distritoFederal) {
        this.distritoFederal = distritoFederal;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public List<Cedulas> getCedulas() {
        return cedulas;
    }

    public void setCedulas(List<Cedulas> cedulas) {
        this.cedulas = cedulas;
    }

    public String getCdigoValidacion() {
        return cdigoValidacion;
    }

    public void setCdigoValidacion(String cdigoValidacion) {
        this.cdigoValidacion = cdigoValidacion;
    }

    public String getCdigoMensaje() {
        return cdigoMensaje;
    }

    public void setCdigoMensaje(String cdigoMensaje) {
        this.cdigoMensaje = cdigoMensaje;
    }

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    public void setDescripcionRespuesta(String descripcionRespuesta) {
        this.descripcionRespuesta = descripcionRespuesta;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public RespuestaRENAPO getRespuestaRENAPO() {
        return respuestaRENAPO;
    }

    public void setRespuestaRENAPO(RespuestaRENAPO respuestaRENAPO) {
        this.respuestaRENAPO = respuestaRENAPO;
    }
}
