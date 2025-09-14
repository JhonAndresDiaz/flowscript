// Generated from FlowScriptFunctions.g4 by ANTLR 4.13.1

package edu.eam.ingesoft.tlf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlowScriptFunctionsParser}.
 */
public interface FlowScriptFunctionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#functionProgram}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProgram(FlowScriptFunctionsParser.FunctionProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#functionProgram}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProgram(FlowScriptFunctionsParser.FunctionProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(FlowScriptFunctionsParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(FlowScriptFunctionsParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(FlowScriptFunctionsParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(FlowScriptFunctionsParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(FlowScriptFunctionsParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(FlowScriptFunctionsParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FlowScriptFunctionsParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FlowScriptFunctionsParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(FlowScriptFunctionsParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(FlowScriptFunctionsParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(FlowScriptFunctionsParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(FlowScriptFunctionsParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoSi}.
	 * @param ctx the parse tree
	 */
	void enterEstadoSi(FlowScriptFunctionsParser.EstadoSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoSi}.
	 * @param ctx the parse tree
	 */
	void exitEstadoSi(FlowScriptFunctionsParser.EstadoSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoMientras}.
	 * @param ctx the parse tree
	 */
	void enterEstadoMientras(FlowScriptFunctionsParser.EstadoMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoMientras}.
	 * @param ctx the parse tree
	 */
	void exitEstadoMientras(FlowScriptFunctionsParser.EstadoMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoParaCada}.
	 * @param ctx the parse tree
	 */
	void enterEstadoParaCada(FlowScriptFunctionsParser.EstadoParaCadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoParaCada}.
	 * @param ctx the parse tree
	 */
	void exitEstadoParaCada(FlowScriptFunctionsParser.EstadoParaCadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoParaRango}.
	 * @param ctx the parse tree
	 */
	void enterEstadoParaRango(FlowScriptFunctionsParser.EstadoParaRangoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoParaRango}.
	 * @param ctx the parse tree
	 */
	void exitEstadoParaRango(FlowScriptFunctionsParser.EstadoParaRangoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoIntentarCapturar}.
	 * @param ctx the parse tree
	 */
	void enterEstadoIntentarCapturar(FlowScriptFunctionsParser.EstadoIntentarCapturarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoIntentarCapturar}.
	 * @param ctx the parse tree
	 */
	void exitEstadoIntentarCapturar(FlowScriptFunctionsParser.EstadoIntentarCapturarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoRetornar}.
	 * @param ctx the parse tree
	 */
	void enterEstadoRetornar(FlowScriptFunctionsParser.EstadoRetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoRetornar}.
	 * @param ctx the parse tree
	 */
	void exitEstadoRetornar(FlowScriptFunctionsParser.EstadoRetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoRomper}.
	 * @param ctx the parse tree
	 */
	void enterEstadoRomper(FlowScriptFunctionsParser.EstadoRomperContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoRomper}.
	 * @param ctx the parse tree
	 */
	void exitEstadoRomper(FlowScriptFunctionsParser.EstadoRomperContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoContinuar}.
	 * @param ctx the parse tree
	 */
	void enterEstadoContinuar(FlowScriptFunctionsParser.EstadoContinuarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoContinuar}.
	 * @param ctx the parse tree
	 */
	void exitEstadoContinuar(FlowScriptFunctionsParser.EstadoContinuarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#estadoLanzar}.
	 * @param ctx the parse tree
	 */
	void enterEstadoLanzar(FlowScriptFunctionsParser.EstadoLanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#estadoLanzar}.
	 * @param ctx the parse tree
	 */
	void exitEstadoLanzar(FlowScriptFunctionsParser.EstadoLanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(FlowScriptFunctionsParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(FlowScriptFunctionsParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAsignacion(FlowScriptFunctionsParser.ExpresionAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAsignacion(FlowScriptFunctionsParser.ExpresionAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionOLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionOLogica(FlowScriptFunctionsParser.ExpresionOLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionOLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionOLogica(FlowScriptFunctionsParser.ExpresionOLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionYLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionYLogica(FlowScriptFunctionsParser.ExpresionYLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionYLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionYLogica(FlowScriptFunctionsParser.ExpresionYLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionIgualdad}.
	 * @param ctx the parse tree
	 */
	void enterExpresionIgualdad(FlowScriptFunctionsParser.ExpresionIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionIgualdad}.
	 * @param ctx the parse tree
	 */
	void exitExpresionIgualdad(FlowScriptFunctionsParser.ExpresionIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(FlowScriptFunctionsParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(FlowScriptFunctionsParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAditiva(FlowScriptFunctionsParser.ExpresionAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAditiva(FlowScriptFunctionsParser.ExpresionAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMultiplicativa(FlowScriptFunctionsParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMultiplicativa(FlowScriptFunctionsParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(FlowScriptFunctionsParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(FlowScriptFunctionsParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionPostfija}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPostfija(FlowScriptFunctionsParser.ExpresionPostfijaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionPostfija}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPostfija(FlowScriptFunctionsParser.ExpresionPostfijaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#accesoPostfijo}.
	 * @param ctx the parse tree
	 */
	void enterAccesoPostfijo(FlowScriptFunctionsParser.AccesoPostfijoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#accesoPostfijo}.
	 * @param ctx the parse tree
	 */
	void exitAccesoPostfijo(FlowScriptFunctionsParser.AccesoPostfijoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPrimaria(FlowScriptFunctionsParser.ExpresionPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPrimaria(FlowScriptFunctionsParser.ExpresionPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#literalLista}.
	 * @param ctx the parse tree
	 */
	void enterLiteralLista(FlowScriptFunctionsParser.LiteralListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#literalLista}.
	 * @param ctx the parse tree
	 */
	void exitLiteralLista(FlowScriptFunctionsParser.LiteralListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#literalObjeto}.
	 * @param ctx the parse tree
	 */
	void enterLiteralObjeto(FlowScriptFunctionsParser.LiteralObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#literalObjeto}.
	 * @param ctx the parse tree
	 */
	void exitLiteralObjeto(FlowScriptFunctionsParser.LiteralObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#propiedad}.
	 * @param ctx the parse tree
	 */
	void enterPropiedad(FlowScriptFunctionsParser.PropiedadContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#propiedad}.
	 * @param ctx the parse tree
	 */
	void exitPropiedad(FlowScriptFunctionsParser.PropiedadContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlowScriptFunctionsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FlowScriptFunctionsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowScriptFunctionsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FlowScriptFunctionsParser.LiteralContext ctx);
}