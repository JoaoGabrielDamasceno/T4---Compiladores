package ufscar.compiladores.linguagemdieta;

import ufscar.compiladores.linguagemdieta.linguagemDIETABaseVisitor;
import ufscar.compiladores.linguagemdieta.linguagemDIETAParser;

public class GeradorHTML extends linguagemDIETABaseVisitor<Object>{
    StringBuilder saida;
    
    public GeradorHTML(){
        saida = new StringBuilder();
    }
    
    @Override
    public Void visitFicha(linguagemDIETAParser.FichaContext ctx) {
        
        saida.append("<!DOCTYPE html>");
        saida.append("<html>");
        saida.append("<style>");
        saida.append("table{font-family:arial,sans-serif;border-collapse:collapse;width:100%;}");
        saida.append("td{border:1px solid #dddddd;text-align:left;padding:8px;}");
        saida.append("center{font-family:arial,sans-serif;text-align:center;}");
        saida.append("biggerFont{font-size:20px;}");
        saida.append("</style>");
        saida.append("<body>");
        
        visitCabeçalho(ctx.cabeçalho());
        visitDieta(ctx.dieta());
        visitRodape(ctx.rodape());
        
        saida.append("</body>");
        saida.append("</html>");
        return null;
    }
    
    @Override
    public Void visitCabeçalho(linguagemDIETAParser.CabeçalhoContext ctx){
        visitProfissional(ctx.profissional());
        visitCrn(ctx.crn());
        visitEspecialidade(ctx.especialidade());
        visitCliente(ctx.cliente());
        visitData(ctx.data());
        return null;
    }
    
    @Override
    public Void visitProfissional(linguagemDIETAParser.ProfissionalContext ctx){
        saida.append("<biggerFont>");
        saida.append("<b>");
        saida.append("<center>");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append("</center>");
        saida.append("</b>");
        saida.append("</biggerFont>");
        
        return null;
    }
    
    @Override
    public Void visitCrn(linguagemDIETAParser.CrnContext ctx){
        saida.append("<center>CRN-");
        saida.append(ctx.digito.getText());
        saida.append(" ");
        visitNum_identificador(ctx.num_identificador());
        return null;
    }
    
    @Override
    public Void visitNum_identificador(linguagemDIETAParser.Num_identificadorContext ctx){
        saida.append(" ");
        saida.append(ctx.identificador.getText());
        return null;
    }
    
    @Override
    public Void visitEspecialidade(linguagemDIETAParser.EspecialidadeContext ctx){
        saida.append(" ");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append("</center>");
        return null;
    }
    
    @Override
    public Void visitCliente(linguagemDIETAParser.ClienteContext ctx){
        saida.append("<p><b>");
        saida.append("Cliente: ");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append("</b></p>");
        return null;
    }
    
    @Override
    public Void visitData(linguagemDIETAParser.DataContext ctx){
        saida.append("<p><b>Data: ");
        saida.append(ctx.dia.getText());
        saida.append("/");
        saida.append(ctx.mes.getText());
        saida.append("/");
        saida.append(ctx.ano.getText());
        saida.append("</b></p>");
        return null;
    }
    
    @Override
    public Void visitRodape(linguagemDIETAParser.RodapeContext ctx){
        visitEndereco(ctx.endereco());
        visitTelefone(ctx.telefone());
        return null;
    }
     
    @Override
    public Void visitEndereco(linguagemDIETAParser.EnderecoContext ctx){
        saida.append("<center><p>");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append(" - ");
        return null;
    }
    
    @Override
    public Void visitTelefone(linguagemDIETAParser.TelefoneContext ctx){
        visitDdd(ctx.ddd());
        saida.append(ctx.digito1.getText());
        saida.append("-");
        saida.append(ctx.digito2.getText());
        saida.append("</p></center>");
        return null;
    }
    @Override
    public Void visitDdd(linguagemDIETAParser.DddContext ctx){
        saida.append("Tel.(");
        saida.append(ctx.digito3.getText());
        saida.append(") ");
        return null;
    }
    
    @Override
    public Void visitDieta(linguagemDIETAParser.DietaContext ctx){
        visitCorpo(ctx.corpo());
        return null;
    }
    
    @Override
    public Void visitRefeicao(linguagemDIETAParser.RefeicaoContext ctx){

        saida.append("<table><td>");
        saida.append(ctx.ident_refeicao.getText().replace("_", " "));
        visitOpcao_alimentos(ctx.opcao_alimentos());
        saida.append("</td></table>");

        return null;
    }
    
    @Override
    public Void visitOpcao_alimentos(linguagemDIETAParser.Opcao_alimentosContext ctx){
        
        saida.append("<ul><li>");
        saida.append(ctx.a1.getText().replace("\"", "").replace("+", " + ").replace("-"," "));
        saida.append("</li></ul>");
        
        for(linguagemDIETAParser.AlimentosContext alimentosCtx : ctx.outrosA1){
            saida.append("<ul><li>");
            saida.append(alimentosCtx.getText().replace("\"", "").replace("+", " + ").replace("-"," "));
            saida.append("</li></ul>");
        }
        
        return null;
    }

}
