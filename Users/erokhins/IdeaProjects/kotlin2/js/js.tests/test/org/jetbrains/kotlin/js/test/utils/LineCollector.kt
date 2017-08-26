'RecursiveJsVisitor' @ [22:23] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableListOf' @ [23:17] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Int?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?

'mutableMapOf' @ [25:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsStatement, MutableList<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsStatement
    <V> -> MutableList<Int>

'mutableSetOf' @ [26:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'handleNodeLocation' @ [29:9] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'node' @ [29:28] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitElement[ValueParameterDescriptorImpl]

'super' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitElement' @ [30:15] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [30:28] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitElement[ValueParameterDescriptorImpl]

'node' @ [34:22] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[ValueParameterDescriptorImpl]

'source' @ [34:27] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'when (source) {
            is PsiElement -> {
                val file = source.containingFile
                val offset = source.node.startOffset
                val document = file.viewProvider.document!!
                document.getLineNumber(offset)
            }
            is JsLocationWithSource -> {
                source.startLine
            }
            else -> null
        }' @ [35:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'source' @ [35:26] ==> val source: (Any..Any?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'source' @ [37:28] ==> val source: (Any..Any?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'containingFile' @ [37:35] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'source' @ [38:30] ==> val source: (Any..Any?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'node' @ [38:37] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'startOffset' @ [38:42] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'file' @ [39:32] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'viewProvider' @ [39:37] ==> public final val PsiFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'document' @ [39:50] ==> public final val FileViewProvider.document: Document?[MyPropertyDescriptor]

'document' @ [40:17] ==> val document: Document defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'getLineNumber' @ [40:26] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [40:40] ==> val offset: Int defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'source' @ [43:17] ==> val source: (Any..Any?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'startLine' @ [43:24] ==> public abstract val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocationWithSource[DeserializedPropertyDescriptor]

'line' @ [48:13] ==> val line: Int? defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'currentStatement' @ [49:13] ==> private final var currentStatement: JsStatement? defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'let' @ [49:31] ==> @InlineOnly public inline fun <T, R> JsStatement.let(block: (JsStatement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement
    <R> -> Unit

'lineNumbersByStatement' @ [50:40] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'getOrPut' @ [50:63] ==> public inline fun <K, V> MutableMap<JsStatement, MutableList<Int>>.getOrPut(key: JsStatement, defaultValue: () -> MutableList<Int>): MutableList<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsStatement
    <V> -> MutableList<Int>

'it' @ [50:72] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation.<anonymous>[ValueParameterDescriptorImpl]

'mutableListOf' @ [50:78] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<???> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@68166b68

'linesByStatement' @ [51:21] ==> val linesByStatement: MutableList<Int> defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation.<anonymous>[LocalVariableDescriptor]

'lastOrNull' @ [51:38] ==> public fun <T> List<Int>.lastOrNull(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'line' @ [51:54] ==> val line: Int? defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'linesByStatement' @ [52:21] ==> val linesByStatement: MutableList<Int> defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation.<anonymous>[LocalVariableDescriptor]

'line' @ [52:41] ==> val line: Int? defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'lines' @ [53:21] ==> public final val lines: MutableList<Int?> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'line' @ [53:30] ==> val line: Int? defined in org.jetbrains.kotlin.js.test.utils.LineCollector.handleNodeLocation[LocalVariableDescriptor]

'withStatement' @ [60:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [60:23] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitExpressionStatement[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [61:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [61:32] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [61:34] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'lineNumbersByStatement' @ [62:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [62:36] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitExpressionStatement[ValueParameterDescriptorImpl]

'add' @ [62:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [62:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [63:13] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [63:15] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'acceptChildren' @ [63:26] ==> public open fun acceptChildren(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [63:41] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'withStatement' @ [68:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [68:23] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [69:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [69:32] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [70:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [70:36] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'add' @ [70:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [70:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [71:13] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'ifExpression' @ [71:15] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'accept' @ [71:28] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [71:35] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [73:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'thenStatement' @ [73:11] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'accept' @ [73:25] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [73:32] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [74:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitIf[ValueParameterDescriptorImpl]

'elseStatement' @ [74:11] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'accept' @ [74:26] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [74:33] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'withStatement' @ [78:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [78:23] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitWhile[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [79:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [79:32] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitWhile[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [80:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [80:36] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitWhile[ValueParameterDescriptorImpl]

'add' @ [80:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [80:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [81:13] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitWhile[ValueParameterDescriptorImpl]

'condition' @ [81:15] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [81:25] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [81:32] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [83:9] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitWhile[ValueParameterDescriptorImpl]

'body' @ [83:11] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [83:16] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [83:23] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'withStatement' @ [87:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [87:23] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitDoWhile[ValueParameterDescriptorImpl]

'x' @ [88:13] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitDoWhile[ValueParameterDescriptorImpl]

'body' @ [88:15] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [88:20] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [88:27] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [89:13] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitDoWhile[ValueParameterDescriptorImpl]

'condition' @ [89:15] ==> public final var JsDoWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [89:25] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [89:32] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'withStatement' @ [94:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [94:23] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [95:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [95:32] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [96:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [96:36] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'add' @ [96:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [96:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [97:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'initExpression' @ [97:15] ==> public final val JsFor.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [97:31] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [97:38] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [98:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'initVars' @ [98:15] ==> public final val JsFor.initVars: (JsVars..JsVars?)[MyPropertyDescriptor]

'accept' @ [98:25] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaMethodDescriptor]

'this' @ [98:32] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [99:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'condition' @ [99:15] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [99:26] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [99:33] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [100:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'incrementExpression' @ [100:15] ==> public final val JsFor.incrementExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [100:36] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [100:43] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [102:9] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitFor[ValueParameterDescriptorImpl]

'body' @ [102:11] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [102:17] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [102:24] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'withStatement' @ [106:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [106:23] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitBreak[ValueParameterDescriptorImpl]

'super' @ [107:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitBreak' @ [107:19] ==> public open fun visitBreak(x: JsBreak): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [107:30] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitBreak[ValueParameterDescriptorImpl]

'withStatement' @ [112:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [112:23] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitContinue[ValueParameterDescriptorImpl]

'super' @ [113:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitContinue' @ [113:19] ==> public open fun visitContinue(x: JsContinue): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [113:33] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitContinue[ValueParameterDescriptorImpl]

'withStatement' @ [118:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [118:23] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitReturn[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [119:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [119:32] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitReturn[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [120:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [120:36] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitReturn[ValueParameterDescriptorImpl]

'add' @ [120:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [120:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'super' @ [121:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [121:19] ==> public open fun visitReturn(x: JsReturn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [121:31] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitReturn[ValueParameterDescriptorImpl]

'withStatement' @ [126:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [126:23] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitVars[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [127:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [127:32] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitVars[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [128:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [128:36] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitVars[ValueParameterDescriptorImpl]

'add' @ [128:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [128:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'super' @ [129:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitVars' @ [129:19] ==> public open fun visitVars(x: JsVars): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [129:29] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitVars[ValueParameterDescriptorImpl]

'withStatement' @ [134:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [134:23] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [135:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [135:32] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [136:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [136:36] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit[ValueParameterDescriptorImpl]

'add' @ [136:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [136:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [137:13] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit[ValueParameterDescriptorImpl]

'expression' @ [137:15] ==> public final var JsSwitch.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [137:26] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [137:33] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [138:13] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit[ValueParameterDescriptorImpl]

'cases' @ [138:15] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'forEach' @ [138:21] ==> @HidesMembers public inline fun <T> Iterable<(JsSwitchMember..JsSwitchMember?)>.forEach(action: ((JsSwitchMember..JsSwitchMember?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'accept' @ [138:31] ==> public open fun <T : JsNode?> accept(node: (JsSwitchMember..JsSwitchMember?)): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'it' @ [138:38] ==> value-parameter it: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visit.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withStatement' @ [143:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [143:23] ==> value-parameter x: JsThrow defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitThrow[ValueParameterDescriptorImpl]

'handleNodeLocation' @ [144:13] ==> private final fun handleNodeLocation(node: JsNode): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [144:32] ==> value-parameter x: JsThrow defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitThrow[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [145:13] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'x' @ [145:36] ==> value-parameter x: JsThrow defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitThrow[ValueParameterDescriptorImpl]

'add' @ [145:40] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'-' @ [145:44] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'super' @ [146:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'visitThrow' @ [146:19] ==> public open fun visitThrow(x: JsThrow): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [146:30] ==> value-parameter x: JsThrow defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitThrow[ValueParameterDescriptorImpl]

'withStatement' @ [151:9] ==> private final fun withStatement(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[SimpleFunctionDescriptorImpl]

'x' @ [151:23] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitTry[ValueParameterDescriptorImpl]

'x' @ [152:13] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitTry[ValueParameterDescriptorImpl]

'tryBlock' @ [152:15] ==> public final var JsTry.tryBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'acceptChildren' @ [152:24] ==> public open fun acceptChildren(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'this' @ [152:39] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'x' @ [153:13] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitTry[ValueParameterDescriptorImpl]

'catches' @ [153:15] ==> public final val JsTry.catches: (MutableList<(JsCatch..JsCatch?)>..List<(JsCatch..JsCatch?)>?)[MyPropertyDescriptor]

'forEach' @ [153:24] ==> @HidesMembers public inline fun <T> Iterable<(JsCatch..JsCatch?)>.forEach(action: ((JsCatch..JsCatch?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsCatch..org.jetbrains.kotlin.js.backend.ast.JsCatch?)

'accept' @ [153:34] ==> public open fun <T : JsNode?> accept(node: (JsCatch..JsCatch?)): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsCatch..org.jetbrains.kotlin.js.backend.ast.JsCatch?)

'it' @ [153:41] ==> value-parameter it: (JsCatch..JsCatch?) defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitTry.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [154:13] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.test.utils.LineCollector.visitTry[ValueParameterDescriptorImpl]

'finallyBlock' @ [154:15] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'acceptChildren' @ [154:29] ==> public open fun acceptChildren(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'this' @ [154:44] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[LazyClassReceiverParameterDescriptor]

'currentStatement' @ [159:28] ==> private final var currentStatement: JsStatement? defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'currentStatement' @ [160:9] ==> private final var currentStatement: JsStatement? defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'statement' @ [160:28] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.withStatement[ValueParameterDescriptorImpl]

'invoke' @ [162:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'statement' @ [164:13] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.withStatement[ValueParameterDescriptorImpl]

'lineNumbersByStatement' @ [164:27] ==> public final val lineNumbersByStatement: MutableMap<JsStatement, MutableList<Int>> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'lines' @ [164:53] ==> public final val lines: MutableList<Int?> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'lastOrNull' @ [164:59] ==> public fun <T> List<Int?>.lastOrNull(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?

'lines' @ [165:13] ==> public final val lines: MutableList<Int?> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'add' @ [165:19] ==> public abstract fun add(element: Int?): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statementsWithoutLineNumbers' @ [166:13] ==> public final val statementsWithoutLineNumbers: MutableSet<JsStatement> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'statement' @ [166:45] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.test.utils.LineCollector.withStatement[ValueParameterDescriptorImpl]

'currentStatement' @ [168:9] ==> private final var currentStatement: JsStatement? defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'oldStatement' @ [168:28] ==> val oldStatement: JsStatement? defined in org.jetbrains.kotlin.js.test.utils.LineCollector.withStatement[LocalVariableDescriptor]

