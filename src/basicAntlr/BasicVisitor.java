// Generated from D:/Workspace/IntelliJ/basicInterpreter\Basic.g4 by ANTLR 4.7
package basicAntlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BasicParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BasicParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(BasicParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(BasicParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(BasicParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(BasicParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(BasicParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BasicParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#forOpening}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOpening(BasicParser.ForOpeningContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#forClosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClosing(BasicParser.ForClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BasicParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatement(BasicParser.DefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#remStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemStatement(BasicParser.RemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#stopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatement(BasicParser.StopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#endStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(BasicParser.EndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#printSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSeparator(BasicParser.PrintSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#printArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgument(BasicParser.PrintArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BasicParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(BasicParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BasicParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#multiplyDivideOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideOp(BasicParser.MultiplyDivideOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#addSubtractOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubtractOp(BasicParser.AddSubtractOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(BasicParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#builtInFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunction(BasicParser.BuiltInFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#lineNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineNumber(BasicParser.LineNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BasicParser.NumberContext ctx);
}