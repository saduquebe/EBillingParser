import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class App {
    public static void main(String[] args) throws IOException {
        File input = new File(args[0]);
        String out = "";
        BufferedReader in = new BufferedReader(new FileReader(input));
        String line = in.readLine();
        int option = 0;
        if(!args[1].isEmpty()){
            option = Integer.parseInt(args[1]);
        }
        while (line != null) {
            BufferedReader lineBuffer = new BufferedReader(new StringReader(line));
            System.out.println(option);
            if(option != 0){
                out = addLine(line, lineBuffer, option);
                if (!out.equals("error")){
                    break;
                }
            }
            else{
                out += addLine(line, lineBuffer, 0);
            }
            line = in.readLine();
        }
        WriteOutput(out);
    }

    public static String addLine(String line, BufferedReader lineBuffer, int option) throws IOException{
        switch (option){
            case 1:
            if (line.startsWith("01")) {
                return headerOutput(lineBuffer);
            }
            break;
            case 2:
            if (line.startsWith("02")) {
                return taxOutput(lineBuffer);
            }
            break;
            case 3:
            if (line.startsWith("03")) {
                return expirationOutput(lineBuffer);
            }
            break;
            case 4:
            if (line.startsWith("04")) {
                return detailOutput(lineBuffer);
            }
            break;
            case 5:
            if (line.startsWith("05")) {
                return resumeOutput(lineBuffer);
            }
            break;
            case 6:
            if (line.startsWith("06")) {
                return documentOutput(lineBuffer);
            }
            break;
            case 7:
            if (line.startsWith("07")) {
                return bodyOutput(lineBuffer);
            }
            case 0:
            if (line.startsWith("01")) {
                return headerOutput(lineBuffer);
            } else if (line.startsWith("02")) {
                return taxOutput(lineBuffer);
            } else if (line.startsWith("03")) {
                return expirationOutput(lineBuffer);
            } else if (line.startsWith("04")) {
                return detailOutput(lineBuffer);
            } else if (line.startsWith("05")) {
                return resumeOutput(lineBuffer);
            } else if (line.startsWith("06")) {
                return documentOutput(lineBuffer);
            } else if (line.startsWith("07")) {
                return bodyOutput(lineBuffer);
            }else{
                return "";
            }
        }
        return "error";
    }

    private static String headerOutput(BufferedReader lineBuffer) throws IOException {
        String out = getHeaderColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseHeader(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String taxOutput(BufferedReader lineBuffer) throws IOException {
        String out = getTaxColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseTaxes(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String expirationOutput(BufferedReader lineBuffer) throws IOException {
        String out = getExpirationColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseExpiration(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String detailOutput(BufferedReader lineBuffer) throws IOException {
        String out = getDetailColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseDetail(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String resumeOutput(BufferedReader lineBuffer) throws IOException {
        String out = getResumeColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseResume(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String documentOutput(BufferedReader lineBuffer) throws IOException {
        String out = getDocumentColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseDocuments(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }
    private static String bodyOutput(BufferedReader lineBuffer) throws IOException {
        String out = getBodyColumns();
        out += "\n";
        ArrayList<String> arr = ParserUtils.parseBody(lineBuffer);
        for (String value : arr) {
            out += value;
        }
        out += "\n";
        return out;
    }

    public static void WriteOutput(String content) {
        OutputStreamWriter osw;
        try {
            osw = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(content);
            bw.close();
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getHeaderColumns() {
        ArrayList<String> temp = new ArrayList<String>();
        StringBuffer out = new StringBuffer();
        // header Output columns
        temp.add("tipoReg");
        temp.add("empresa");
        temp.add("factura");
        temp.add("serieFactura");
        temp.add("claseDoc");
        temp.add("fechaFac");
        temp.add("fechaIni");
        temp.add("fechaFin");
        temp.add("moneda");
        temp.add("tipoCambio");
        temp.add("fechCambio");
        temp.add("idioma");
        temp.add("firmaFact");
        temp.add("totalBruto");
        temp.add("totalDes");
        temp.add("totalCargos");
        temp.add("baseImp");
        temp.add("impreper");
        temp.add("imprete");
        temp.add("totFac");
        temp.add("totFaceur");
        temp.add("totAnticip");
        temp.add("totalPagar");
        temp.add("totalPagareur");
        temp.add("motivReten");
        temp.add("porcreten");
        temp.add("impreten");
        temp.add("totalGastFi");
        temp.add("totalEje");
        temp.add("totalEjeeur");
        temp.add("tipPeref");
        temp.add("tipResef");
        temp.add("paiseF2l");
        temp.add("nifEf");
        temp.add("nomEf");
        temp.add("apellEf");
        temp.add("direccEf");
        temp.add("cpEf");
        temp.add("ciudadEf");
        temp.add("provEf");
        temp.add("paisEf");
        temp.add("libroEf");
        temp.add("rmercEf");
        temp.add("hojaEf");
        temp.add("folioEf");
        temp.add("seccionEf");
        temp.add("tomoEf");
        temp.add("telfEf");
        temp.add("faxEf");
        temp.add("emailEmisorFact");
        temp.add("perscontEf");
        temp.add("tipperRf");
        temp.add("tipresRf");
        temp.add("paisRf2l");
        temp.add("nifRf");
        temp.add("nomRf");
        temp.add("apellRf");
        temp.add("direccRf");
        temp.add("cpRf");
        temp.add("ciudadRf");
        temp.add("provRf");
        temp.add("paisRf");
        temp.add("codRecep");
        temp.add("descRecep");
        temp.add("direccRecep");
        temp.add("cpRecep");
        temp.add("ciudadRecep");
        temp.add("provRecep");
        temp.add("paisRecep");
        temp.add("nomRecep");
        temp.add("apellRecep");
        temp.add("codCmp");
        temp.add("descCmp");
        temp.add("direccCmp");
        temp.add("cpCmp");
        temp.add("ciudadCmp");
        temp.add("provCmp");
        temp.add("paisCmp");
        temp.add("nomCmp");
        temp.add("apellCmp");
        temp.add("numFacRec");
        temp.add("serieFacRec");
        temp.add("codMotivo");
        temp.add("descMotivo");
        temp.add("codMotRec");
        temp.add("descMotRec");
        temp.add("fechIniRec");
        temp.add("fechFinRec");
        temp.add("tipperFact");
        temp.add("tipresFact");
        temp.add("nifFact");
        temp.add("nombreFact");
        temp.add("apellFact");
        temp.add("direccFact");
        temp.add("cpFact");
        temp.add("ciudadFact");
        temp.add("provFact");
        temp.add("paisFact");
        temp.add("textclauFact");
        temp.add("nombreNota");
        temp.add("nombreNoto");
        temp.add("anyo");
        temp.add("numprot");
        temp.add("ambitaplii");
        temp.add("pedido");
        temp.add("refpago");
        temp.add("retraso");
        temp.add("procesado");
        temp.add("pctrepcli");
        temp.add("actividad");
        temp.add("delegco");
        temp.add("desdeleg");
        temp.add("dirdeleg");
        temp.add("teldeleg");
        temp.add("faxdeleg");
        temp.add("division");
        temp.add("desDivision");
        temp.add("cliente");
        temp.add("ptoServicio");
        temp.add("proveedor");
        temp.add("desdSe");
        temp.add("rmercant");
        temp.add("indautoFac");
        temp.add("tipori");
        temp.add("tipoFac");
        temp.add("codMedCobro");
        temp.add("desMedCobro");
        temp.add("lugarPago");
        temp.add("codForCobro");
        temp.add("desForCobro");
        temp.add("contrato");
        temp.add("delcrea");
        temp.add("anexo");
        temp.add("contratoCli");
        temp.add("codBanco");
        temp.add("codSucursal");
        temp.add("digControl");
        temp.add("codCuenta");
        temp.add("iban");
        temp.add("swift");
        temp.add("indRecibo");
        temp.add("ficPdf");
        temp.add("ficDetalle");
        temp.add("capitalSocial");
        temp.add("eanProsegur");
        temp.add("hash");
        temp.add("numCertificado");
        temp.add("ofContable");
        temp.add("orgGestor");
        temp.add("udtTramitadora");
        temp.add("orgProponente");
        temp.add("siretef");
        temp.add("siretrf");
        temp.add("fecemorig");
        temp.add("medCobroFra");
        temp.add("comentario");
        temp.add("orgEjecutante");
        temp.add("codSirenef");
        temp.add("baseimpCargo");
        temp.add("siretEfDeleg");
        temp.add("tipoClienteTr");
        temp.add("tipoCambioOrig");
        temp.add("espEnBlanco");
        temp.add("orgCode");
        temp.add("conRef");
        temp.add("recCode");
        temp.add("codDest");
        temp.add("taxSystem");
        temp.add("pecDestinatario");
        temp.add("formato");
        temp.add("proginivio");
        temp.add("cabimento");
        temp.add("compromisso");
        temp.add("atcud");
        for (String val : temp) {
            out.append(val);
            out.append(";");
        }
        return out.toString();
    }

    public static String getTaxColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("tipoimpi");
		temp.add("desimpui");
		temp.add("porcenimp");
		temp.add("baseimpi");
		temp.add("baseimpieur");
		temp.add("cuotai");
		temp.add("cuotaieur");
		temp.add("importetotali");
		temp.add("desexeni");
		temp.add("codexeni");
		temp.add("codimpui");
		temp.add("porcencargo");
		temp.add("importecargo");
		temp.add("importcargeur");
		temp.add("destasa");
		temp.add("baseimpuesto");
		temp.add("blancos");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String getExpirationColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("fechVen");
		temp.add("importeVen");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String getBodyColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("linCuerpoFact");
		temp.add("desCuerpoFact");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String getDetailColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("codArt");
		temp.add("contEmis");
		temp.add("delEmis");
		temp.add("anexEmis");
		temp.add("fcontEmis");
		temp.add("refopEmis");
		temp.add("frefopEmis");
		temp.add("contRecep");
		temp.add("fcontRecep");
		temp.add("refopRecep");
		temp.add("frefopRecep");
		temp.add("expediente");
		temp.add("fExpediente");
		temp.add("numAlb1");
		temp.add("numAlb2");
		temp.add("numAlb3");
		temp.add("numAlb4");
		temp.add("numAlb5");
		temp.add("descriplt");
		temp.add("cant");
		temp.add("umedida");
		temp.add("descuMedida");
		temp.add("precioUni");
		temp.add("costeTotal");
		temp.add("fechaInil");
		temp.add("fechaFinl");
		temp.add("fechaExac");
		temp.add("caldTol");
		temp.add("pctDescTol");
		temp.add("impDescTol");
		temp.add("tipoImpl");
		temp.add("codImpl");
		temp.add("desImpl");
		temp.add("porcenImpl");
		temp.add("baseImpl");
		temp.add("baseImpleur");
		temp.add("cuotal");
		temp.add("cuotaleur");
		temp.add("importelTotal");
		temp.add("codExel");
		temp.add("desExel");
		temp.add("ofiCoste");
		temp.add("codAjeno");
		temp.add("concFact");
		temp.add("desconcFact");
		temp.add("numlinFac");
		temp.add("conceptoAgrupador");
		temp.add("descripconcepAgrupa");
		temp.add("concepDimensionProducto");
		temp.add("descripconcepDimensionProducto");
		temp.add("numFactFija");
		temp.add("numLineaOrg");
		temp.add("codCliCargo");
		temp.add("nomCliCargo");
		temp.add("codigoIncurrido");
		temp.add("numLineaIncurrido");
		temp.add("tipoLinea");
		temp.add("iniPeriodo");
		temp.add("finPeriodo");
		temp.add("codigoZona");
		temp.add("descripZona");
		temp.add("codigoSubZona");
		temp.add("descripSubZona");
		temp.add("codigoSubCliCargo");
		temp.add("nombreSubCliCargo");
		temp.add("codigoPSCargo");
		temp.add("nombrePSCargo");
		temp.add("codDivision");
		temp.add("descripDivision");
		temp.add("fechaIniServicio");
		temp.add("horaIni");
		temp.add("fechaFin");
		temp.add("horaFin");
		temp.add("tiposervicio");
		temp.add("codigotarifa");
		temp.add("lineaTarifa");
		temp.add("lineaTarifaPadre");
		temp.add("factOriginal");
		temp.add("lineaFactOriginal");
		temp.add("tipoParada");
		temp.add("tipoMercancia");
		temp.add("descripMercancia");
		temp.add("paisSubCliCargo");
		temp.add("localSubCliCargo");
		temp.add("codigoCliOrigen");
		temp.add("nombreCliOrigen");
		temp.add("codigoSubCliOrigen");
		temp.add("nombreSubCliOrigen");
		temp.add("paisSubCliOrigen");
		temp.add("localSubCliOrigen");
		temp.add("codigoCliDestino");
		temp.add("nombreCliDestino");
		temp.add("codsubCliDestino");
		temp.add("nombresubCliDestino");
		temp.add("paissubCliDestino");
		temp.add("localsubCliDestino");
		temp.add("tipoDia");
		temp.add("descripServicio");
		temp.add("tipoHorario");
		temp.add("nomEmpleado");
		temp.add("codProvinciaSubCliCargo");
		temp.add("nombreProvinciaSubCliCargo");
		temp.add("codDelegacionOp");
		temp.add("nomDelegacionOp");
		temp.add("obsConceptoDetalle");
		temp.add("desProducto");
		temp.add("porcEncargo");
		temp.add("importeEncargo");
		temp.add("precioUnit");
		temp.add("tipoPtoServ");
		temp.add("operativa");
		temp.add("baseImpuestoL");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String getResumeColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("facLibre");
		temp.add("numReg");
		temp.add("detConcepto");
		temp.add("cant");
		temp.add("precioUnidad");
		temp.add("baseImponi");
		temp.add("tipoImpu");
		temp.add("codImpu");
		temp.add("descImpu");
		temp.add("porcenImpu");
		temp.add("cuota");
		temp.add("baseImpoEur");
		temp.add("cuotaEur");
		temp.add("importeTotal");
		temp.add("codProducto");
		temp.add("desProducto");
		temp.add("porcenCargo");
		temp.add("importeCargo");
		temp.add("precioUnitario");
		temp.add("baseImpuestoR");
		temp.add("baseCargo");
		temp.add("blancos");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String getDocumentColumns() {
		ArrayList<String> temp = new ArrayList<>();
		StringBuffer out = new StringBuffer();
		temp.add("tipoReg");
		temp.add("empresa");
		temp.add("factura");
		temp.add("nomFicAnexo");
		temp.add("blancos");
		for (String val : temp) {
			out.append(val);
			out.append(";");
		}
		return out.toString();
	}

    public static String readByLen(int len, BufferedReader in) throws IOException {
        char[] res = new char[len];
        in.read(res, 0, len);
        return String.valueOf(res);
    }
}
