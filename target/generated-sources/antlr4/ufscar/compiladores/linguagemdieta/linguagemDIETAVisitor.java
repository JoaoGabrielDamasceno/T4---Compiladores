// Generated from ufscar\compiladores\linguagemdieta\linguagemDIETA.g4 by ANTLR 4.8
package ufscar.compiladores.linguagemdieta;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link linguagemDIETAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface linguagemDIETAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#ficha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFicha(linguagemDIETAParser.FichaContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#cabeçalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeçalho(linguagemDIETAParser.CabeçalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#rodape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRodape(linguagemDIETAParser.RodapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#profissional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfissional(linguagemDIETAParser.ProfissionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#crn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrn(linguagemDIETAParser.CrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#num_identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_identificador(linguagemDIETAParser.Num_identificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#especialidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecialidade(linguagemDIETAParser.EspecialidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#cliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliente(linguagemDIETAParser.ClienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(linguagemDIETAParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#endereco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndereco(linguagemDIETAParser.EnderecoContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#telefone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTelefone(linguagemDIETAParser.TelefoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#ddd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdd(linguagemDIETAParser.DddContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#dieta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDieta(linguagemDIETAParser.DietaContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(linguagemDIETAParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#refeicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefeicao(linguagemDIETAParser.RefeicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#nome_refeicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_refeicao(linguagemDIETAParser.Nome_refeicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#opcao_alimentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcao_alimentos(linguagemDIETAParser.Opcao_alimentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#alimentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlimentos(linguagemDIETAParser.AlimentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguagemDIETAParser#alimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlimento(linguagemDIETAParser.AlimentoContext ctx);
}