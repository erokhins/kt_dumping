'JsExpressionVisitor' @ [57:5] ==> public constructor JsExpressionVisitor() defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[ClassConstructorDescriptorImpl]

'SmartList' @ [59:66] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsStatement

'JvmStatic' @ [62:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'with' @ [63:30] ==> @InlineOnly public inline fun <T, R> with(receiver: JsStatement, block: JsStatement.() -> ExpressionDecomposer): ExpressionDecomposer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement
    <R> -> ExpressionDecomposer

'statement' @ [63:36] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder[ValueParameterDescriptorImpl]

'match' @ [64:35] ==> private fun JsNode.match(predicate: (JsNode) -> Boolean): Set<JsNode> defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'canBeExtractedByInliner' @ [64:41] ==> value-parameter canBeExtractedByInliner: (JsNode) -> Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder[ValueParameterDescriptorImpl]

'withParentsOfNodes' @ [65:43] ==> private fun JsNode.withParentsOfNodes(nodes: Set<JsNode>): Set<JsNode> defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'extractable' @ [65:62] ==> val extractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder.<anonymous>[LocalVariableDescriptor]

'match' @ [66:43] ==> private fun JsNode.match(predicate: (JsNode) -> Boolean): Set<JsNode> defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'it' @ [66:51] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withParentsOfNodes' @ [67:50] ==> private fun JsNode.withParentsOfNodes(nodes: Set<JsNode>): Set<JsNode> defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'nodesWithSideEffect' @ [67:69] ==> val nodesWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder.<anonymous>[LocalVariableDescriptor]

'ExpressionDecomposer' @ [69:17] ==> private constructor ExpressionDecomposer(containsExtractable: Set<JsNode>, containsNodeWithSideEffect: Set<JsNode>) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[ClassConstructorDescriptorImpl]

'containsExtractable' @ [69:38] ==> val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder.<anonymous>[LocalVariableDescriptor]

'containsNodeWithSideEffect' @ [69:59] ==> val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder.<anonymous>[LocalVariableDescriptor]

'decomposer' @ [72:13] ==> val decomposer: ExpressionDecomposer defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder[LocalVariableDescriptor]

'accept' @ [72:24] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'statement' @ [72:31] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder[ValueParameterDescriptorImpl]

'decomposer' @ [73:20] ==> val decomposer: ExpressionDecomposer defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Companion.preserveEvaluationOrder[LocalVariableDescriptor]

'additionalStatements' @ [73:31] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'x' @ [79:20] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'vars' @ [79:22] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'SmartList' @ [80:24] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsVar

'vars' @ [82:23] ==> val vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'jsVar' @ [83:17] ==> val jsVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'containsExtractable' @ [83:26] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'prevVars' @ [83:49] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'isNotEmpty' @ [83:58] ==> @InlineOnly public inline fun <T> Collection<(JsVars.JsVar..JsVars.JsVar?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'addStatement' @ [84:17] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'JsVars' @ [84:30] ==> public constructor JsVars(p0: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?), p1: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaClassConstructorDescriptor]

'prevVars' @ [84:37] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'x' @ [84:47] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'isMultiline' @ [84:49] ==> public final var JsVars.isMultiline: Boolean[MyPropertyDescriptor]

'apply' @ [84:62] ==> @InlineOnly public inline fun <T> JsVars.apply(block: JsVars.() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'source' @ [84:70] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'prevVars' @ [84:79] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'first' @ [84:88] ==> public fun <T> List<(JsVars.JsVar..JsVars.JsVar?)>.first(): (JsVars.JsVar..JsVars.JsVar?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'source' @ [84:96] ==> public final var JsVars.JsVar.source: (Any..Any?)[MyPropertyDescriptor]

'prevVars' @ [85:17] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'SmartList' @ [85:28] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsVar

'jsVar' @ [88:13] ==> val jsVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'initExpression' @ [88:19] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [88:36] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'jsVar' @ [88:43] ==> val jsVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'initExpression' @ [88:49] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'prevVars' @ [89:13] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'add' @ [89:22] ==> public open fun add(element: (JsVars.JsVar..JsVars.JsVar?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'jsVar' @ [89:26] ==> val jsVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'vars' @ [92:13] ==> val vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'size' @ [92:18] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'prevVars' @ [92:26] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'size' @ [92:35] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'vars' @ [93:13] ==> val vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'clear' @ [93:18] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'vars' @ [94:13] ==> val vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'addAll' @ [94:18] ==> public abstract fun addAll(elements: Collection<(JsVars.JsVar..JsVars.JsVar?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'prevVars' @ [94:25] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'x' @ [95:13] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'source' @ [95:15] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'prevVars' @ [95:24] ==> var prevVars: SmartList<JsVars.JsVar> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'first' @ [95:33] ==> public fun <T> List<(JsVars.JsVar..JsVars.JsVar?)>.first(): (JsVars.JsVar..JsVars.JsVar?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'source' @ [95:41] ==> public final var JsVars.JsVar.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [101:25] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'statement' @ [101:27] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'when (statement) {
            is JsDoWhile -> statement.process(false, x.name)
            is JsWhile -> statement.process(true, x.name)
        }' @ [102:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'statement' @ [102:15] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'statement' @ [103:29] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'process' @ [103:39] ==> private final fun JsWhile.process(addBreakToBegin: Boolean, loopLabel: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'x' @ [103:54] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'name' @ [103:56] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'statement' @ [104:27] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'process' @ [104:37] ==> private final fun JsWhile.process(addBreakToBegin: Boolean, loopLabel: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'x' @ [104:51] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'name' @ [104:53] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'x' @ [110:9] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [110:11] ==> private final fun JsWhile.process(addBreakToBegin: Boolean, loopLabel: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'x' @ [115:9] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [115:11] ==> private final fun JsWhile.process(addBreakToBegin: Boolean, loopLabel: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'test' @ [120:13] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'containsExtractable' @ [120:22] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'withNewAdditionalStatements' @ [122:9] ==> private final inline fun <T> withNewAdditionalStatements(fn: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'test' @ [123:13] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [123:20] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'test' @ [123:27] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'JsIf' @ [124:34] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'not' @ [124:39] ==> @NotNull public open fun not(@NotNull expression: JsExpression): JsPrefixOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'test' @ [124:43] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'JsBreak' @ [124:50] ==> public constructor JsBreak() defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'flattenStatement' @ [127:34] ==> @NotNull public open fun flattenStatement(@NotNull statement: JsStatement): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'body' @ [127:51] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'if (addBreakToBegin) {
                addStatement(breakIfNotTest)
                addStatements(bodyStatements)
            }
            else {
                // See KT-12275
                val guardName = JsScope.declareTemporaryName("guard\$${(loopLabel?.ident.orEmpty())}")
                val label = JsLabel(guardName).apply { synthetic = true }
                label.statement = JsBlock(bodyStatements)
                addStatements(0, listOf(label))
                ContinueReplacingVisitor(loopLabel, guardName).acceptList(bodyStatements)

                addStatement(breakIfNotTest)
            }' @ [129:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'addBreakToBegin' @ [129:17] ==> value-parameter addBreakToBegin: Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[ValueParameterDescriptorImpl]

'addStatement' @ [130:17] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'breakIfNotTest' @ [130:30] ==> val breakIfNotTest: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'addStatements' @ [131:17] ==> private final fun addStatements(statements: List<JsStatement>): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'bodyStatements' @ [131:31] ==> val bodyStatements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'declareTemporaryName' @ [135:41] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'loopLabel' @ [135:73] ==> value-parameter loopLabel: JsName? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[ValueParameterDescriptorImpl]

'ident' @ [135:84] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'orEmpty' @ [135:90] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JsLabel' @ [136:29] ==> public constructor JsLabel(p0: (JsName..JsName?)) defined in org.jetbrains.kotlin.js.backend.ast.JsLabel[JavaClassConstructorDescriptor]

'guardName' @ [136:37] ==> val guardName: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'apply' @ [136:48] ==> @InlineOnly public inline fun <T> JsLabel.apply(block: JsLabel.() -> Unit): JsLabel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLabel

'synthetic' @ [136:56] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'label' @ [137:17] ==> val label: JsLabel defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'statement' @ [137:23] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'JsBlock' @ [137:35] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'bodyStatements' @ [137:43] ==> val bodyStatements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'addStatements' @ [138:17] ==> private final fun addStatements(index: Int, statements: List<JsStatement>): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'listOf' @ [138:34] ==> public fun <T> listOf(element: JsLabel): List<JsLabel> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLabel

'label' @ [138:41] ==> val label: JsLabel defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'ContinueReplacingVisitor' @ [139:17] ==> public constructor ContinueReplacingVisitor(loopLabelName: JsName?, guardLabelName: JsName) defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[ClassConstructorDescriptorImpl]

'loopLabel' @ [139:42] ==> value-parameter loopLabel: JsName? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[ValueParameterDescriptorImpl]

'guardName' @ [139:53] ==> val guardName: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'acceptList' @ [139:64] ==> public final fun <T : (JsNode..JsNode?)> acceptList(p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)): Unit defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'bodyStatements' @ [139:75] ==> val bodyStatements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'addStatement' @ [141:17] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'breakIfNotTest' @ [141:30] ==> val breakIfNotTest: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[LocalVariableDescriptor]

'body' @ [144:13] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'additionalStatements' @ [144:20] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'toStatement' @ [144:41] ==> private fun List<JsStatement>.toStatement(): JsStatement defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'test' @ [145:13] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'JsBooleanLiteral' @ [145:20] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'x' @ [151:9] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'arg1' @ [151:11] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [151:18] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'x' @ [151:25] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'arg1' @ [151:27] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'when (x.operator) {
            JsBinaryOperator.AND,
            JsBinaryOperator.OR -> x.processOrAnd(ctx)
            else -> x.process()
        }' @ [153:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'x' @ [153:15] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'operator' @ [153:17] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'AND' @ [154:30] ==> enum entry AND defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'OR' @ [155:30] ==> enum entry OR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'x' @ [155:36] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'processOrAnd' @ [155:38] ==> private final fun JsBinaryOperation.processOrAnd(ctx: JsContext<JsNode>): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'ctx' @ [155:51] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'x' @ [156:21] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [156:23] ==> private final fun JsBinaryOperation.process(): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'arg2' @ [163:13] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'containsExtractable' @ [163:22] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'Temporary' @ [165:19] ==> public constructor Temporary(value: JsExpression? = ..., sourceInfo: Any? = ...) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[ClassConstructorDescriptorImpl]

'arg1' @ [165:29] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'addStatement' @ [166:9] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [166:22] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'variable' @ [166:26] ==> public final val variable: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'if (operator == JsBinaryOperator.OR) not(tmp.nameRef) else tmp.nameRef' @ [167:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'operator' @ [167:24] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'OR' @ [167:53] ==> enum entry OR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'not' @ [167:57] ==> @NotNull public open fun not(@NotNull expression: JsExpression): JsPrefixOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'tmp' @ [167:61] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'nameRef' @ [167:65] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'tmp' @ [167:79] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'nameRef' @ [167:83] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'withNewAdditionalStatements' @ [168:24] ==> private final inline fun <T> withNewAdditionalStatements(fn: () -> JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsStatement

'arg2' @ [169:13] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [169:20] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'arg2' @ [169:27] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'addStatement' @ [170:13] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [170:26] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'assign' @ [170:30] ==> public final fun assign(value: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[SimpleFunctionDescriptorImpl]

'arg2' @ [170:37] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'additionalStatements' @ [171:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'toStatement' @ [171:34] ==> private fun List<JsStatement>.toStatement(): JsStatement defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'addStatement' @ [174:9] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'JsIf' @ [174:22] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'test' @ [174:27] ==> val test: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'arg2Eval' @ [174:33] ==> val arg2Eval: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'also' @ [174:43] ==> @InlineOnly @SinceKotlin public inline fun <T> JsIf.also(block: (JsIf) -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'it' @ [174:50] ==> value-parameter it: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [174:53] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'source' @ [174:62] ==> public final var JsBinaryOperation.source: (Any..Any?)[MyPropertyDescriptor]

'ctx' @ [175:9] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[ValueParameterDescriptorImpl]

'replaceMe' @ [175:13] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsExpression

'tmp' @ [175:23] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processOrAnd[LocalVariableDescriptor]

'nameRef' @ [175:27] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'arg1' @ [179:13] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'containsNodeWithSideEffect' @ [179:22] ==> private final val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'arg2' @ [179:52] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'containsExtractable' @ [179:61] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'arg2' @ [183:13] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [183:20] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'arg2' @ [183:27] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'if (operator.isAssignment) {
            val lhs = arg1
            when (lhs) {
                is JsNameRef -> {
                    lhs.qualifier = lhs.qualifier?.extractToTemporary()
                }
                is JsArrayAccess -> {
                    lhs.array = lhs.array.extractToTemporary()
                }
                else -> {
                    error("Valid JavaScript left-hand side must be either JsNameRef or JsArrayAccess, got: $this")
                }
            }
        }
        else {
            arg1 = arg1.extractToTemporary()
        }' @ [187:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'operator' @ [187:13] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'isAssignment' @ [187:22] ==> public final val JsBinaryOperator.isAssignment: Boolean[MyPropertyDescriptor]

'arg1' @ [188:23] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'when (lhs) {
                is JsNameRef -> {
                    lhs.qualifier = lhs.qualifier?.extractToTemporary()
                }
                is JsArrayAccess -> {
                    lhs.array = lhs.array.extractToTemporary()
                }
                else -> {
                    error("Valid JavaScript left-hand side must be either JsNameRef or JsArrayAccess, got: $this")
                }
            }' @ [189:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'lhs' @ [189:19] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'lhs' @ [191:21] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'qualifier' @ [191:25] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'lhs' @ [191:37] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'qualifier' @ [191:41] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'extractToTemporary' @ [191:52] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'lhs' @ [194:21] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'array' @ [194:25] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'lhs' @ [194:33] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'array' @ [194:37] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'extractToTemporary' @ [194:43] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'error' @ [197:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [197:109] ==> <this> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[ReceiverParameterDescriptorImpl]

'arg1' @ [202:13] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'arg1' @ [202:20] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'extractToTemporary' @ [202:25] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'arg2' @ [205:9] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'accept' @ [205:16] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'arg2' @ [205:23] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [209:24] ==> value-parameter x: JsArrayLiteral defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'expressions' @ [209:26] ==> public final val JsArrayLiteral.expressions: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'processByIndices' @ [210:9] ==> private final fun processByIndices(elements: MutableList<JsExpression>, matchedIndices: List<Int>): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'elements' @ [210:26] ==> val elements: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'elements' @ [210:36] ==> val elements: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[LocalVariableDescriptor]

'indicesOfExtractable' @ [210:45] ==> private final val List<JsNode>.indicesOfExtractable: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'x' @ [215:9] ==> value-parameter x: JsArrayAccess defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [215:11] ==> private final fun JsArrayAccess.process(): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'array' @ [220:9] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [220:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'array' @ [220:24] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'array' @ [222:13] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'containsNodeWithSideEffect' @ [222:22] ==> private final val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'index' @ [222:52] ==> public var JsArrayAccess.index: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'containsExtractable' @ [222:61] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'array' @ [223:13] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'array' @ [223:21] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'extractToTemporary' @ [223:27] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'index' @ [226:9] ==> public var JsArrayAccess.index: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [226:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'index' @ [226:24] ==> public var JsArrayAccess.index: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'x' @ [230:9] ==> value-parameter x: JsConditional defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [230:11] ==> private final fun JsConditional.process(ctx: JsContext<JsNode>): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'ctx' @ [230:19] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'test' @ [235:9] ==> public var JsConditional.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [235:16] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'test' @ [235:23] ==> public var JsConditional.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'then' @ [236:13] ==> public var JsConditional.then: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'containsExtractable' @ [236:22] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'otherwise' @ [236:45] ==> public var JsConditional.otherwise: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'containsExtractable' @ [236:59] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'Temporary' @ [238:19] ==> public constructor Temporary(value: JsExpression? = ..., sourceInfo: Any? = ...) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[ClassConstructorDescriptorImpl]

'source' @ [238:42] ==> public final var JsConditional.source: (Any..Any?)[MyPropertyDescriptor]

'addStatement' @ [239:9] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [239:22] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'variable' @ [239:26] ==> public final val variable: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'withNewAdditionalStatements' @ [241:25] ==> private final inline fun <T> withNewAdditionalStatements(fn: () -> JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsStatement

'then' @ [242:13] ==> public var JsConditional.then: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [242:20] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'then' @ [242:27] ==> public var JsConditional.then: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'addStatement' @ [243:13] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [243:26] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'assign' @ [243:30] ==> public final fun assign(value: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[SimpleFunctionDescriptorImpl]

'then' @ [243:37] ==> public var JsConditional.then: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'additionalStatements' @ [244:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'toStatement' @ [244:34] ==> private fun List<JsStatement>.toStatement(): JsStatement defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'withNewAdditionalStatements' @ [247:25] ==> private final inline fun <T> withNewAdditionalStatements(fn: () -> JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsStatement

'otherwise' @ [248:13] ==> public var JsConditional.otherwise: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [248:25] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'otherwise' @ [248:32] ==> public var JsConditional.otherwise: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'addStatement' @ [249:13] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [249:26] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'assign' @ [249:30] ==> public final fun assign(value: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[SimpleFunctionDescriptorImpl]

'otherwise' @ [249:37] ==> public var JsConditional.otherwise: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'additionalStatements' @ [250:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'toStatement' @ [250:34] ==> private fun List<JsStatement>.toStatement(): JsStatement defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'JsIf' @ [253:24] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'test' @ [253:29] ==> public var JsConditional.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'thenBlock' @ [253:35] ==> val thenBlock: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'elseBlock' @ [253:46] ==> val elseBlock: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'lazyEval' @ [254:9] ==> val lazyEval: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'source' @ [254:18] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'source' @ [254:27] ==> public final var JsConditional.source: (Any..Any?)[MyPropertyDescriptor]

'lazyEval' @ [255:9] ==> val lazyEval: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'synthetic' @ [255:18] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'addStatement' @ [256:9] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'lazyEval' @ [256:22] ==> val lazyEval: JsIf defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'ctx' @ [257:9] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[ValueParameterDescriptorImpl]

'replaceMe' @ [257:13] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsExpression

'tmp' @ [257:23] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'nameRef' @ [257:27] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'CallableInvocationAdapter' @ [261:9] ==> public constructor CallableInvocationAdapter(invocation: JsInvocation) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableInvocationAdapter[ClassConstructorDescriptorImpl]

'x' @ [261:35] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [261:38] ==> private final fun ExpressionDecomposer.Callable.process(): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'CallableNewAdapter' @ [266:9] ==> public constructor CallableNewAdapter(jsnew: JsNew) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableNewAdapter[ClassConstructorDescriptorImpl]

'x' @ [266:28] ==> value-parameter x: JsNew defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.visit[ValueParameterDescriptorImpl]

'process' @ [266:31] ==> private final fun ExpressionDecomposer.Callable.process(): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'hasArguments' @ [273:25] ==> value-parameter hasArguments: HasArguments defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable.<init>[ValueParameterDescriptorImpl]

'arguments' @ [273:38] ==> public final val HasArguments.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'Callable' @ [276:77] ==> public constructor Callable(hasArguments: HasArguments) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[ClassConstructorDescriptorImpl]

'invocation' @ [276:86] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableInvocationAdapter.<init>[ValueParameterDescriptorImpl]

'invocation' @ [278:21] ==> public final val invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableInvocationAdapter[PropertyDescriptorImpl]

'qualifier' @ [278:32] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'invocation' @ [279:26] ==> public final val invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableInvocationAdapter[PropertyDescriptorImpl]

'qualifier' @ [279:37] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'value' @ [279:49] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableInvocationAdapter.<set-qualifier>[ValueParameterDescriptorImpl]

'Callable' @ [283:58] ==> public constructor Callable(hasArguments: HasArguments) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[ClassConstructorDescriptorImpl]

'jsnew' @ [283:67] ==> value-parameter jsnew: JsNew defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableNewAdapter.<init>[ValueParameterDescriptorImpl]

'jsnew' @ [285:21] ==> public final val jsnew: JsNew defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableNewAdapter[PropertyDescriptorImpl]

'constructorExpression' @ [285:27] ==> public final var JsNew.constructorExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'jsnew' @ [286:26] ==> public final val jsnew: JsNew defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableNewAdapter[PropertyDescriptorImpl]

'constructorExpression' @ [286:32] ==> public final var JsNew.constructorExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [286:56] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.CallableNewAdapter.<set-qualifier>[ValueParameterDescriptorImpl]

'qualifier' @ [291:9] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'accept' @ [291:21] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'qualifier' @ [291:28] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'arguments' @ [292:30] ==> public final val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'indicesOfExtractable' @ [292:40] ==> private final val List<JsNode>.indicesOfExtractable: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'matchedIndices' @ [293:13] ==> var matchedIndices: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'isEmpty' @ [293:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'qualifier' @ [295:13] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'containsNodeWithSideEffect' @ [295:26] ==> private final val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'qualifier' @ [296:26] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'callee' @ [297:28] ==> val callee: JsNameRef? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'qualifier' @ [297:36] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'if (qualifier.sideEffects == SideEffectKind.PURE && callee != null && receiver != null &&
                receiver in containsNodeWithSideEffect
            ) {
                val receiverTmp = receiver.extractToTemporary()
                callee.qualifier = receiverTmp
            }
            else {
                if (receiver != null && applyBindIfNecessary) {
                    val receiverTmp = receiver.extractToTemporary()
                    val fqn = JsNameRef(callee.ident, receiverTmp).apply {
                        synthetic = true
                        callee.name?.let { sideEffects = it.sideEffects }
                    }
                    qualifier = fqn.extractToTemporary()
                    qualifier = Namer.getFunctionCallRef(qualifier)
                    arguments.add(0, receiverTmp)
                    matchedIndices = matchedIndices.map { it + 1 }
                }
                else {
                    qualifier = qualifier.extractToTemporary()
                }
            }' @ [302:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'qualifier' @ [302:17] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'sideEffects' @ [302:27] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [302:57] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'callee' @ [302:65] ==> val callee: JsNameRef? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'receiver' @ [302:83] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'receiver' @ [303:17] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'containsNodeWithSideEffect' @ [303:29] ==> private final val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'receiver' @ [305:35] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'extractToTemporary' @ [305:44] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'callee' @ [306:17] ==> val callee: JsNameRef? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'qualifier' @ [306:24] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'receiverTmp' @ [306:36] ==> val receiverTmp: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'if (receiver != null && applyBindIfNecessary) {
                    val receiverTmp = receiver.extractToTemporary()
                    val fqn = JsNameRef(callee.ident, receiverTmp).apply {
                        synthetic = true
                        callee.name?.let { sideEffects = it.sideEffects }
                    }
                    qualifier = fqn.extractToTemporary()
                    qualifier = Namer.getFunctionCallRef(qualifier)
                    arguments.add(0, receiverTmp)
                    matchedIndices = matchedIndices.map { it + 1 }
                }
                else {
                    qualifier = qualifier.extractToTemporary()
                }' @ [309:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiver' @ [309:21] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'applyBindIfNecessary' @ [309:41] ==> public abstract val applyBindIfNecessary: Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'receiver' @ [310:39] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'extractToTemporary' @ [310:48] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'JsNameRef' @ [311:31] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'callee' @ [311:41] ==> val callee: JsNameRef? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'ident' @ [311:48] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'receiverTmp' @ [311:55] ==> val receiverTmp: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'apply' @ [311:68] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'synthetic' @ [312:25] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'callee' @ [313:25] ==> val callee: JsNameRef? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'name' @ [313:32] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [313:38] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'sideEffects' @ [313:44] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'it' @ [313:58] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sideEffects' @ [313:61] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'qualifier' @ [315:21] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'fqn' @ [315:33] ==> val fqn: JsNameRef defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'extractToTemporary' @ [315:37] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'qualifier' @ [316:21] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'getFunctionCallRef' @ [316:39] ==> @NotNull public open fun getFunctionCallRef(@NotNull functionExpression: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'qualifier' @ [316:58] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'arguments' @ [317:21] ==> public final val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'add' @ [317:31] ==> public abstract fun add(index: Int, element: (JsExpression..JsExpression?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'receiverTmp' @ [317:38] ==> val receiverTmp: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'matchedIndices' @ [318:21] ==> var matchedIndices: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'matchedIndices' @ [318:38] ==> var matchedIndices: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'map' @ [318:53] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'it' @ [318:59] ==> value-parameter it: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [321:21] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'qualifier' @ [321:33] ==> public abstract var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'extractToTemporary' @ [321:43] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'processByIndices' @ [326:9] ==> private final fun processByIndices(elements: MutableList<JsExpression>, matchedIndices: List<Int>): Unit defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'arguments' @ [326:26] ==> public final val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Callable[PropertyDescriptorImpl]

'matchedIndices' @ [326:37] ==> var matchedIndices: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.process[LocalVariableDescriptor]

'matchedIndices' @ [331:22] ==> value-parameter matchedIndices: List<Int> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[ValueParameterDescriptorImpl]

'prev' @ [332:23] ==> var prev: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'curr' @ [332:29] ==> val curr: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'elements' @ [333:27] ==> value-parameter elements: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[ValueParameterDescriptorImpl]

'i' @ [333:36] ==> val i: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'arg' @ [334:21] ==> val arg: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'containsNodeWithSideEffect' @ [334:29] ==> private final val containsNodeWithSideEffect: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'elements' @ [336:17] ==> value-parameter elements: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[ValueParameterDescriptorImpl]

'i' @ [336:26] ==> val i: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'arg' @ [336:31] ==> val arg: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'extractToTemporary' @ [336:35] ==> private final fun JsExpression.extractToTemporary(): JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'elements' @ [339:13] ==> value-parameter elements: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[ValueParameterDescriptorImpl]

'curr' @ [339:22] ==> val curr: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'accept' @ [339:30] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'elements' @ [339:37] ==> value-parameter elements: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[ValueParameterDescriptorImpl]

'curr' @ [339:46] ==> val curr: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'prev' @ [340:13] ==> var prev: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'curr' @ [340:20] ==> val curr: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.processByIndices[LocalVariableDescriptor]

'additionalStatements' @ [346:22] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'additionalStatements' @ [347:9] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'SmartList' @ [347:32] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsStatement

'invoke' @ [348:22] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'additionalStatements' @ [349:9] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'backup' @ [349:32] ==> val backup: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.withNewAdditionalStatements[LocalVariableDescriptor]

'result' @ [350:16] ==> val result: T defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.withNewAdditionalStatements[LocalVariableDescriptor]

'additionalStatements' @ [354:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'add' @ [354:34] ==> public abstract fun add(element: JsStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [354:38] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.addStatement[ValueParameterDescriptorImpl]

'additionalStatements' @ [357:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'addAll' @ [357:34] ==> public abstract fun addAll(elements: Collection<JsStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [357:41] ==> value-parameter statements: List<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.addStatements[ValueParameterDescriptorImpl]

'additionalStatements' @ [360:13] ==> private final var additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'addAll' @ [360:34] ==> public abstract fun addAll(index: Int, elements: Collection<JsStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [360:41] ==> value-parameter index: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.addStatements[ValueParameterDescriptorImpl]

'statements' @ [360:48] ==> value-parameter statements: List<JsStatement> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.addStatements[ValueParameterDescriptorImpl]

'Temporary' @ [363:19] ==> public constructor Temporary(value: JsExpression? = ..., sourceInfo: Any? = ...) defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[ClassConstructorDescriptorImpl]

'this' @ [363:29] ==> <this> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.extractToTemporary[ReceiverParameterDescriptorImpl]

'addStatement' @ [364:9] ==> private final fun addStatement(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[SimpleFunctionDescriptorImpl]

'tmp' @ [364:22] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.extractToTemporary[LocalVariableDescriptor]

'variable' @ [364:26] ==> public final val variable: JsVars defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'tmp' @ [365:16] ==> val tmp: ExpressionDecomposer.Temporary defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.extractToTemporary[LocalVariableDescriptor]

'nameRef' @ [365:20] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'declareTemporary' @ [369:36] ==> @NotNull public open fun declareTemporary(): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'newVar' @ [371:32] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'name' @ [371:39] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'value' @ [371:45] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'apply' @ [371:52] ==> @InlineOnly public inline fun <T> JsVars.apply(block: JsVars.() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'synthetic' @ [372:13] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'name' @ [373:13] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'staticRef' @ [373:18] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'value' @ [373:30] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'source' @ [374:13] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'sourceInfo' @ [374:22] ==> public final val sourceInfo: Any? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'value' @ [374:36] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'source' @ [374:43] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'name' @ [378:21] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'makeRef' @ [378:26] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsExpressionStatement' @ [381:20] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [381:42] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'nameRef' @ [381:53] ==> public final val nameRef: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'value' @ [381:62] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary.assign[ValueParameterDescriptorImpl]

'apply' @ [381:70] ==> @InlineOnly public inline fun <T> JsExpressionStatement.apply(block: JsExpressionStatement.() -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'synthetic' @ [382:17] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'expression' @ [383:17] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [383:28] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'sourceInfo' @ [383:37] ==> public final val sourceInfo: Any? defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary[PropertyDescriptorImpl]

'value' @ [383:51] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.Temporary.assign[ValueParameterDescriptorImpl]

'source' @ [383:57] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'indices' @ [389:17] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'filter' @ [389:25] ==> public inline fun <T> Iterable<Int>.filter(predicate: (Int) -> Boolean): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'get' @ [389:34] ==> public abstract operator fun get(index: Int): JsNode defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [389:38] ==> value-parameter it: Int defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer.<get-indicesOfExtractable>.<anonymous>[ValueParameterDescriptorImpl]

'containsExtractable' @ [389:45] ==> private final val containsExtractable: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.ExpressionDecomposer[PropertyDescriptorImpl]

'JsVisitorWithContextImpl' @ [398:45] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [432:20] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'ifExpression' @ [432:22] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'x' @ [433:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'ifExpression' @ [433:11] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'accept' @ [433:26] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'test' @ [433:33] ==> val test: JsExpression defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[LocalVariableDescriptor]

'x' @ [438:9] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'test' @ [438:11] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [438:18] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'x' @ [438:25] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'test' @ [438:27] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'x' @ [443:9] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'test' @ [443:11] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'accept' @ [443:18] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'x' @ [443:25] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'test' @ [443:27] ==> public var JsWhile.test: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[PropertyDescriptorImpl]

'x' @ [448:9] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'statement' @ [448:11] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [448:23] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'x' @ [448:30] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor.visit[ValueParameterDescriptorImpl]

'statement' @ [448:32] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'JsExpressionVisitor' @ [472:28] ==> public constructor JsExpressionVisitor() defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[ClassConstructorDescriptorImpl]

'IdentitySet' @ [473:23] ==> public fun <T> IdentitySet(): MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsNode

'super' @ [476:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.match.<no name provided>[LazyClassReceiverParameterDescriptor]

'doTraverse' @ [476:19] ==> protected/*protected and package*/ open fun <T : (JsNode..JsNode?)> doTraverse(p0: (R..R?), p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>?)): Unit defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> R

'node' @ [476:30] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.match.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'ctx' @ [476:36] ==> value-parameter ctx: JsContext<JsNode>? defined in org.jetbrains.kotlin.js.inline.match.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'node' @ [478:17] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.match.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'matched' @ [478:26] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.match.<no name provided>[PropertyDescriptorImpl]

'invoke' @ [478:37] ==> public abstract operator fun invoke(p1: JsNode): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'node' @ [478:47] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.match.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'matched' @ [479:17] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.match.<no name provided>[PropertyDescriptorImpl]

'add' @ [479:25] ==> public abstract fun add(element: JsNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'node' @ [479:29] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.match.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'visitor' @ [484:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.match[LocalVariableDescriptor]

'accept' @ [484:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.match.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'this' @ [484:20] ==> <this> defined in org.jetbrains.kotlin.js.inline.match[ReceiverParameterDescriptorImpl]

'visitor' @ [485:12] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.match[LocalVariableDescriptor]

'matched' @ [485:20] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.match.<no name provided>[PropertyDescriptorImpl]

'JsExpressionVisitor' @ [492:28] ==> public constructor JsExpressionVisitor() defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[ClassConstructorDescriptorImpl]

'SmartList' @ [493:29] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsNode

'IdentitySet' @ [494:23] ==> public fun <T> IdentitySet(): MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsNode

'stack' @ [497:13] ==> private final val stack: SmartList<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'add' @ [497:19] ==> public open fun add(element: (JsNode..JsNode?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'node' @ [497:23] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'super' @ [498:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[LazyClassReceiverParameterDescriptor]

'doTraverse' @ [498:19] ==> protected/*protected and package*/ open fun <T : (JsNode..JsNode?)> doTraverse(p0: (R..R?), p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>?)): Unit defined in org.jetbrains.kotlin.js.inline.JsExpressionVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> R

'node' @ [498:30] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'ctx' @ [498:36] ==> value-parameter ctx: JsContext<JsNode>? defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'node' @ [500:17] ==> value-parameter node: R defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.doTraverse[ValueParameterDescriptorImpl]

'nodes' @ [500:25] ==> value-parameter nodes: Set<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes[ValueParameterDescriptorImpl]

'addAllUntilMatchedOrStatement' @ [501:17] ==> public final fun addAllUntilMatchedOrStatement(nodesOnStack: List<JsNode>): Unit defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[SimpleFunctionDescriptorImpl]

'stack' @ [501:47] ==> private final val stack: SmartList<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'stack' @ [504:13] ==> private final val stack: SmartList<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'removeAt' @ [504:19] ==> public open fun removeAt(p0: Int): (JsNode..JsNode?) defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'stack' @ [504:28] ==> private final val stack: SmartList<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'lastIndex' @ [504:34] ==> public val <T> List<(JsNode..JsNode?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsNode..org.jetbrains.kotlin.js.backend.ast.JsNode?)

'nodesOnStack' @ [508:23] ==> value-parameter nodesOnStack: List<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[ValueParameterDescriptorImpl]

'lastIndex' @ [508:36] ==> public val <T> List<JsNode>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JsNode

'nodesOnStack' @ [509:35] ==> value-parameter nodesOnStack: List<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[ValueParameterDescriptorImpl]

'i' @ [509:48] ==> val i: Int defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[LocalVariableDescriptor]

'currentNode' @ [510:21] ==> val currentNode: JsNode defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[LocalVariableDescriptor]

'matched' @ [510:36] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'matched' @ [512:17] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'add' @ [512:25] ==> public abstract fun add(element: JsNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'currentNode' @ [512:29] ==> val currentNode: JsNode defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[LocalVariableDescriptor]

'currentNode' @ [513:21] ==> val currentNode: JsNode defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>.addAllUntilMatchedOrStatement[LocalVariableDescriptor]

'visitor' @ [518:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes[LocalVariableDescriptor]

'accept' @ [518:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'this' @ [518:20] ==> <this> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes[ReceiverParameterDescriptorImpl]

'visitor' @ [519:12] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes[LocalVariableDescriptor]

'matched' @ [519:20] ==> public final val matched: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.inline.withParentsOfNodes.<no name provided>[PropertyDescriptorImpl]

'when (size) {
            0 -> JsEmpty
            1 -> get(0)
            else -> JsBlock(this)
        }' @ [523:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement, entry2: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'size' @ [523:15] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'JsEmpty' @ [524:18] ==> public object JsEmpty : SourceInfoAwareJsNode, JsStatement defined in org.jetbrains.kotlin.js.backend.ast[FakeCallableDescriptorForObject]

'get' @ [525:18] ==> public abstract operator fun get(index: Int): JsStatement defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'JsBlock' @ [526:21] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'this' @ [526:29] ==> <this> defined in org.jetbrains.kotlin.js.inline.toStatement[ReceiverParameterDescriptorImpl]

