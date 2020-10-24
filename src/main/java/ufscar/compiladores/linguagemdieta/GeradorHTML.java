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
        //Declaração do corpo do HTML, com styles
        saida.append("<!DOCTYPE html>");
        saida.append("<html>");
        saida.append("<style>");
        saida.append("table{font-family:arial,sans-serif;border-collapse:collapse;width:100%;}");
        saida.append("td{border:1px solid #dddddd;text-align:left;padding:8px;}");
        saida.append("center{font-family:arial,sans-serif;text-align:center;}");
        saida.append("biggerFont{font-size:20px;}");
        saida.append("</style>");
        saida.append("<body>");
        
        /*A ficha é composta por cabeçalho, dieta e rodape, nessa ordem.
        então primeiros incluimos cabeçalho, depois dieta e depois rodape*/
        visitCabeçalho(ctx.cabeçalho());
        visitDieta(ctx.dieta());
        visitRodape(ctx.rodape());
        
        //Fim do HTML
        saida.append("</body>");
        saida.append("</html>");
        return null;
    }
    
    @Override
    public Void visitCabeçalho(linguagemDIETAParser.CabeçalhoContext ctx){        
        /*O cabeçalho é composto por nome do profissional, CRN, especialidade, nome do
        cliente e data de emissão da ficha*/
        visitProfissional(ctx.profissional());
        visitCrn(ctx.crn());
        visitEspecialidade(ctx.especialidade());
        visitCliente(ctx.cliente());
        visitData(ctx.data());
        return null;
    }
    
    @Override
    public Void visitProfissional(linguagemDIETAParser.ProfissionalContext ctx){       
        //Inclui o nome do profissional na ficha
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
        //Inclui o CRN do profissional na ficha
        saida.append("<center>CRN-");
        //CRN possui dígito de 1 a 10
        saida.append(ctx.digito.getText());
        saida.append(" ");
        //CRN possui um codigo para cada profissional
        visitNum_identificador(ctx.num_identificador());
        
        return null;
    }
    
    @Override
    public Void visitNum_identificador(linguagemDIETAParser.Num_identificadorContext ctx){
        
        //Inclui o código do profissional na ficha
        saida.append(" ");
        saida.append(ctx.identificador.getText());
        
        return null;
    }
    
    @Override
    public Void visitEspecialidade(linguagemDIETAParser.EspecialidadeContext ctx){
        //Inclui a especialidade do profissional na ficha
        saida.append(" ");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append("</center>");
        
        return null;
    }
    
    @Override
    public Void visitCliente(linguagemDIETAParser.ClienteContext ctx){
        //Inclui o nome do cliente na ficha
        saida.append("<p><b>");
        saida.append("Cliente: ");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append("</b></p>");
        
        return null;
    }
    
    @Override
    public Void visitData(linguagemDIETAParser.DataContext ctx){
        //Inclui a data de emissão da ficha na ficha
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
        //O rodape é composto pelo endereço e telefone
        visitEndereco(ctx.endereco());
        visitTelefone(ctx.telefone());
        return null;
    }
     
    @Override
    public Void visitEndereco(linguagemDIETAParser.EnderecoContext ctx){
        //Inclui o endereço no rodape da ficha
        saida.append("<center><p>");
        saida.append(ctx.cadeia.getText().replace("\"", ""));
        saida.append(" - ");
        return null;
    }
    
    @Override
    public Void visitTelefone(linguagemDIETAParser.TelefoneContext ctx){
        //Inclui o telefone no rodape da ficha
        visitDdd(ctx.ddd());
        saida.append(ctx.digito1.getText());
        saida.append("-");
        saida.append(ctx.digito2.getText());
        saida.append("</p></center>");
        return null;
    }
    @Override
    public Void visitDdd(linguagemDIETAParser.DddContext ctx){
        //Inclui o DDD no telefone da ficha
        saida.append("Tel.(");
        saida.append(ctx.digito3.getText());
        saida.append(") ");
        return null;
    }
    
    @Override
    public Void visitDieta(linguagemDIETAParser.DietaContext ctx){
        //O corpo é composto por refeição
        visitCorpo(ctx.corpo());
        return null;
    }
    
    @Override
    public Void visitRefeicao(linguagemDIETAParser.RefeicaoContext ctx){
        /*Refeicao é composta pelo nome da refeição e seus alimentos.
        E inclui refeição na ficha
        */
        saida.append("<table><td>");
        saida.append(ctx.ident_refeicao.getText().replace("_", " "));
        visitOpcao_alimentos(ctx.opcao_alimentos());
        saida.append("</td></table>");

        return null;
    }
    
    @Override
    public Void visitOpcao_alimentos(linguagemDIETAParser.Opcao_alimentosContext ctx){
        
        //Inclui a primeira opção de dieta da refeição na ficha
        saida.append("<ul><li>");
        saida.append(ctx.a1.getText().replace("\"", "").replace("+", " + ").replace("-"," "));
        saida.append("</li></ul>");
        
        //Inclui as demais opções de dieta da refeição na ficha
        for(linguagemDIETAParser.AlimentosContext alimentosCtx : ctx.outrosA1){
            saida.append("<ul><li>");
            saida.append(alimentosCtx.getText().replace("\"", "").replace("+", " + ").replace("-"," "));
            saida.append("</li></ul>");
        }
        
        return null;
    }

}
