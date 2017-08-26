'scope' @ [30:26] ==> value-parameter scope: JsScope defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'parse' @ [31:16] ==> private inline fun parse(code: String, startPosition: CodePosition, offset: Int, reporter: ErrorReporter, insideFunction: Boolean, parseAction: Parser.(TokenStream) -> Any): Node defined in org.jetbrains.kotlin.js.parser[SimpleFunctionDescriptorImpl]

'code' @ [31:22] ==> value-parameter code: String defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'CodePosition' @ [31:28] ==> public constructor CodePosition(line: Int, offset: Int) defined in com.google.gwt.dev.js.rhino.CodePosition[ClassConstructorDescriptorImpl]

'reporter' @ [31:51] ==> value-parameter reporter: ErrorReporter defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'insideFunction' @ [31:61] ==> val insideFunction: Boolean defined in org.jetbrains.kotlin.js.parser.parse[LocalVariableDescriptor]

'Parser' @ [31:77] ==> public constructor Parser(nf: (IRFactory..IRFactory?), insideFunction: Boolean) defined in com.google.gwt.dev.js.rhino.Parser[JavaClassConstructorDescriptor]

'node' @ [32:12] ==> val node: Node defined in org.jetbrains.kotlin.js.parser.parse[LocalVariableDescriptor]

'toJsAst' @ [32:17] ==> private inline fun <T> Node.toJsAst(scope: JsScope, fileName: String, mapAction: JsAstMapper.(Node) -> (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?) defined in org.jetbrains.kotlin.js.parser[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>..kotlin.collections.List<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>?)

'scope' @ [32:25] ==> value-parameter scope: JsScope defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'fileName' @ [32:32] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'mapStatements' @ [33:9] ==> public open fun mapStatements(nodeStmts: (Node..Node?)): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?) defined in com.google.gwt.dev.js.JsAstMapper[JavaMethodDescriptor]

'it' @ [33:23] ==> value-parameter it: Node defined in org.jetbrains.kotlin.js.parser.parse.<anonymous>[ValueParameterDescriptorImpl]

'parse' @ [38:9] ==> private inline fun parse(code: String, startPosition: CodePosition, offset: Int, reporter: ErrorReporter, insideFunction: Boolean, parseAction: Parser.(TokenStream) -> Any): Node defined in org.jetbrains.kotlin.js.parser[SimpleFunctionDescriptorImpl]

'code' @ [38:15] ==> value-parameter code: String defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'position' @ [38:21] ==> value-parameter position: CodePosition defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'offset' @ [38:31] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'reporter' @ [38:39] ==> value-parameter reporter: ErrorReporter defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'addObserver' @ [39:13] ==> public open fun addObserver(p0: (Observer..Observer?)): Unit defined in com.google.gwt.dev.js.rhino.Parser[JavaMethodDescriptor]

'FunctionParsingObserver' @ [39:25] ==> public constructor FunctionParsingObserver() defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver[ClassConstructorDescriptorImpl]

'primaryExpr' @ [40:13] ==> public open fun primaryExpr(ts: (TokenStream..TokenStream?)): (Node..Node?) defined in com.google.gwt.dev.js.rhino.Parser[JavaMethodDescriptor]

'it' @ [40:25] ==> value-parameter it: TokenStream defined in org.jetbrains.kotlin.js.parser.parseFunction.<anonymous>[ValueParameterDescriptorImpl]

'toJsAst' @ [41:11] ==> private inline fun <T> Node.toJsAst(scope: JsScope, fileName: String, mapAction: JsAstMapper.(Node) -> (JsFunction..JsFunction?)): (JsFunction..JsFunction?) defined in org.jetbrains.kotlin.js.parser[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsFunction..org.jetbrains.kotlin.js.backend.ast.JsFunction?)

'scope' @ [41:19] ==> value-parameter scope: JsScope defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'fileName' @ [41:26] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.parser.parseFunction[ValueParameterDescriptorImpl]

'JsAstMapper' @ [41:36] ==> public constructor JsAstMapper(@NotNull scope: JsScope, @NotNull fileName: String) defined in com.google.gwt.dev.js.JsAstMapper[JavaClassConstructorDescriptor]

'when (arg) {
            is ParserEvents.OnFunctionParsingStart -> {
                functionsStarted++
            }
            is ParserEvents.OnFunctionParsingEnd -> {
                functionsStarted--

                if (functionsStarted == 0) {
                    arg.tokenStream.ungetToken(TokenStream.EOF)
                }
            }
        }' @ [47:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'arg' @ [47:15] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver.update[ValueParameterDescriptorImpl]

'functionsStarted' @ [49:17] ==> public final var functionsStarted: Int defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver[PropertyDescriptorImpl]

'functionsStarted' @ [52:17] ==> public final var functionsStarted: Int defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver[PropertyDescriptorImpl]

'functionsStarted' @ [54:21] ==> public final var functionsStarted: Int defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver[PropertyDescriptorImpl]

'arg' @ [55:21] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.js.parser.FunctionParsingObserver.update[ValueParameterDescriptorImpl]

'tokenStream' @ [55:25] ==> public final val tokenStream: TokenStream defined in org.jetbrains.kotlin.js.parser.ParserEvents.OnFunctionParsingEnd[PropertyDescriptorImpl]

'ungetToken' @ [55:37] ==> public open fun ungetToken(tt: Int): Unit defined in com.google.gwt.dev.js.rhino.TokenStream[JavaMethodDescriptor]

'EOF' @ [55:60] ==> public const final val EOF: Int defined in com.google.gwt.dev.js.rhino.TokenStream[JavaPropertyDescriptor]

'enter' @ [71:13] ==> public open fun enter(): (Context..Context?) defined in com.google.gwt.dev.js.rhino.Context[JavaMethodDescriptor]

'errorReporter' @ [71:21] ==> public final var Context.errorReporter: (ErrorReporter..ErrorReporter?)[MyPropertyDescriptor]

'reporter' @ [71:37] ==> value-parameter reporter: ErrorReporter defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'TokenStream' @ [74:18] ==> public constructor TokenStream(`in`: (Reader..Reader?), sourceName: (String..String?), position: (CodePosition..CodePosition?)) defined in com.google.gwt.dev.js.rhino.TokenStream[JavaClassConstructorDescriptor]

'StringReader' @ [74:30] ==> private fun StringReader(string: String, offset: Int): Reader defined in org.jetbrains.kotlin.js.parser in file parserUtils.kt[SimpleFunctionDescriptorImpl]

'code' @ [74:43] ==> value-parameter code: String defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'offset' @ [74:49] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'startPosition' @ [74:70] ==> value-parameter startPosition: CodePosition defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'Parser' @ [75:22] ==> public constructor Parser(nf: (IRFactory..IRFactory?), insideFunction: Boolean) defined in com.google.gwt.dev.js.rhino.Parser[JavaClassConstructorDescriptor]

'IRFactory' @ [75:29] ==> public constructor IRFactory(ts: (TokenStream..TokenStream?)) defined in com.google.gwt.dev.js.rhino.IRFactory[JavaClassConstructorDescriptor]

'ts' @ [75:39] ==> val ts: TokenStream defined in org.jetbrains.kotlin.js.parser.parse[LocalVariableDescriptor]

'insideFunction' @ [75:44] ==> value-parameter insideFunction: Boolean defined in org.jetbrains.kotlin.js.parser.parse[ValueParameterDescriptorImpl]

'parser' @ [76:16] ==> val parser: Parser defined in org.jetbrains.kotlin.js.parser.parse[LocalVariableDescriptor]

'invoke' @ [76:23] ==> public abstract operator fun Parser.invoke(p2: TokenStream): Any defined in kotlin.Function2[FunctionInvokeDescriptor]

'ts' @ [76:35] ==> val ts: TokenStream defined in org.jetbrains.kotlin.js.parser.parse[LocalVariableDescriptor]

'exit' @ [78:17] ==> public open fun exit(): Unit defined in com.google.gwt.dev.js.rhino.Context[JavaMethodDescriptor]

'JsAstMapper' @ [84:9] ==> public constructor JsAstMapper(@NotNull scope: JsScope, @NotNull fileName: String) defined in com.google.gwt.dev.js.JsAstMapper[JavaClassConstructorDescriptor]

'scope' @ [84:21] ==> value-parameter scope: JsScope defined in org.jetbrains.kotlin.js.parser.toJsAst[ValueParameterDescriptorImpl]

'fileName' @ [84:28] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.parser.toJsAst[ValueParameterDescriptorImpl]

'invoke' @ [84:38] ==> public abstract operator fun JsAstMapper.invoke(p2: Node): T defined in kotlin.Function2[FunctionInvokeDescriptor]

'this' @ [84:48] ==> <this> defined in org.jetbrains.kotlin.js.parser.toJsAst[ReceiverParameterDescriptorImpl]

'StringReader' @ [87:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'string' @ [87:31] ==> value-parameter string: String defined in org.jetbrains.kotlin.js.parser.StringReader[ValueParameterDescriptorImpl]

'reader' @ [88:5] ==> val reader: StringReader defined in org.jetbrains.kotlin.js.parser.StringReader[LocalVariableDescriptor]

'skip' @ [88:12] ==> public open fun skip(p0: Long): Long defined in java.io.StringReader[JavaMethodDescriptor]

'offset' @ [88:17] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.parser.StringReader[ValueParameterDescriptorImpl]

'toLong' @ [88:24] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reader' @ [89:12] ==> val reader: StringReader defined in org.jetbrains.kotlin.js.parser.StringReader[LocalVariableDescriptor]

