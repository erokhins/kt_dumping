'visitor' @ [27:9] ==> public final val visitor: JsVisitorWithContextImpl defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'accept' @ [27:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'root' @ [27:24] ==> private final val root: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'hasChanges' @ [29:16] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'JsVisitorWithContextImpl' @ [32:28] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [34:36] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'thenStatement' @ [34:38] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'x' @ [35:36] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'elseStatement' @ [35:38] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'x' @ [36:17] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'synthetic' @ [36:19] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'elseStatementRaw' @ [36:32] ==> val elseStatementRaw: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'extractSingleStatement' @ [37:37] ==> private final fun extractSingleStatement(statement: JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'thenStatementRaw' @ [37:60] ==> val thenStatementRaw: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'extractSingleStatement' @ [38:37] ==> private final fun extractSingleStatement(statement: JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'elseStatementRaw' @ [38:60] ==> val elseStatementRaw: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'if (thenStatement is JsExpressionStatement && elseStatement is JsExpressionStatement) {
                    val thenAssignment = JsAstUtils.decomposeAssignment(thenStatement.expression)
                    val elseAssignment = JsAstUtils.decomposeAssignment(elseStatement.expression)
                    if (thenAssignment != null && elseAssignment != null) {
                        val (thenTarget, thenValue) = thenAssignment
                        val (elseTarget, elseValue) = elseAssignment
                        if (lhsEqual(thenTarget, elseTarget)) {
                            hasChanges = true
                            val ternary = JsConditional(x.ifExpression, thenValue, elseValue)
                            val replacement = JsExpressionStatement(JsAstUtils.assignment(thenTarget, ternary))
                            replacement.synthetic = thenStatement.synthetic && elseStatement.synthetic
                            ctx.replaceMe(replacement)
                            accept(replacement)
                            return false
                        }
                    }
                }
                else if (thenStatement is JsVars && elseStatement is JsVars) {
                    if (thenStatement.vars.size == 1 && elseStatement.vars.size == 1) {
                        val thenVar = thenStatement.vars[0]
                        val elseVar = elseStatement.vars[0]
                        val thenValue = thenVar.initExpression
                        val elseValue = elseVar.initExpression
                        if (thenVar.name == elseVar.name && thenValue != null && elseValue != null) {
                            hasChanges = true
                            val ternary = JsConditional(x.ifExpression, thenValue, elseValue)
                            val replacement = JsAstUtils.newVar(thenVar.name, ternary)
                            replacement.synthetic = thenStatement.synthetic && elseStatement.synthetic
                            ctx.replaceMe(replacement)
                            accept(replacement)
                            return false
                        }
                    }
                }
                else if (thenStatement is JsReturn && elseStatement is JsReturn) {
                    val thenValue = thenStatement.expression
                    val elseValue = elseStatement.expression
                    if (thenValue != null && elseValue != null) {
                        hasChanges = true
                        val ternary = JsConditional(x.ifExpression, thenValue, elseValue)
                        val replacement = JsReturn(ternary)
                        accept(replacement)
                        ctx.replaceMe(replacement)
                        return false
                    }
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thenStatement' @ [40:21] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseStatement' @ [40:63] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'decomposeAssignment' @ [41:53] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thenStatement' @ [41:73] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'expression' @ [41:87] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'decomposeAssignment' @ [42:53] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'elseStatement' @ [42:73] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'expression' @ [42:87] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'thenAssignment' @ [43:25] ==> val thenAssignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseAssignment' @ [43:51] ==> val elseAssignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'component1' @ [44:30] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [44:42] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'thenAssignment' @ [44:55] ==> val thenAssignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'component1' @ [45:30] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [45:42] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'elseAssignment' @ [45:55] ==> val elseAssignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'lhsEqual' @ [46:29] ==> private final fun lhsEqual(a: JsExpression?, b: JsExpression?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'thenTarget' @ [46:38] ==> val thenTarget: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseTarget' @ [46:50] ==> val elseTarget: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'hasChanges' @ [47:29] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'JsConditional' @ [48:43] ==> public constructor JsConditional(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsConditional[JavaClassConstructorDescriptor]

'x' @ [48:57] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'ifExpression' @ [48:59] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'thenValue' @ [48:73] ==> val thenValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseValue' @ [48:84] ==> val elseValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'JsExpressionStatement' @ [49:47] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [49:80] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thenTarget' @ [49:91] ==> val thenTarget: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'ternary' @ [49:103] ==> val ternary: JsConditional defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'replacement' @ [50:29] ==> val replacement: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [50:41] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'thenStatement' @ [50:53] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [50:67] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'elseStatement' @ [50:80] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [50:94] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'ctx' @ [51:29] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [51:33] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpressionStatement..JsExpressionStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsExpressionStatement

'replacement' @ [51:43] ==> val replacement: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [52:29] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpressionStatement..JsExpressionStatement?)): (JsExpressionStatement..JsExpressionStatement?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpressionStatement

'replacement' @ [52:36] ==> val replacement: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'if (thenStatement is JsVars && elseStatement is JsVars) {
                    if (thenStatement.vars.size == 1 && elseStatement.vars.size == 1) {
                        val thenVar = thenStatement.vars[0]
                        val elseVar = elseStatement.vars[0]
                        val thenValue = thenVar.initExpression
                        val elseValue = elseVar.initExpression
                        if (thenVar.name == elseVar.name && thenValue != null && elseValue != null) {
                            hasChanges = true
                            val ternary = JsConditional(x.ifExpression, thenValue, elseValue)
                            val replacement = JsAstUtils.newVar(thenVar.name, ternary)
                            replacement.synthetic = thenStatement.synthetic && elseStatement.synthetic
                            ctx.replaceMe(replacement)
                            accept(replacement)
                            return false
                        }
                    }
                }
                else if (thenStatement is JsReturn && elseStatement is JsReturn) {
                    val thenValue = thenStatement.expression
                    val elseValue = elseStatement.expression
                    if (thenValue != null && elseValue != null) {
                        hasChanges = true
                        val ternary = JsConditional(x.ifExpression, thenValue, elseValue)
                        val replacement = JsReturn(ternary)
                        accept(replacement)
                        ctx.replaceMe(replacement)
                        return false
                    }
                }' @ [57:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thenStatement' @ [57:26] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseStatement' @ [57:53] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'thenStatement' @ [58:25] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'vars' @ [58:39] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'size' @ [58:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'elseStatement' @ [58:57] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'vars' @ [58:71] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'size' @ [58:76] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'thenStatement' @ [59:39] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'vars' @ [59:53] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'elseStatement' @ [60:39] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'vars' @ [60:53] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'thenVar' @ [61:41] ==> val thenVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'initExpression' @ [61:49] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'elseVar' @ [62:41] ==> val elseVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'initExpression' @ [62:49] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'thenVar' @ [63:29] ==> val thenVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'name' @ [63:37] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'elseVar' @ [63:45] ==> val elseVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'name' @ [63:53] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'thenValue' @ [63:61] ==> val thenValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseValue' @ [63:82] ==> val elseValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'hasChanges' @ [64:29] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'JsConditional' @ [65:43] ==> public constructor JsConditional(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsConditional[JavaClassConstructorDescriptor]

'x' @ [65:57] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'ifExpression' @ [65:59] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'thenValue' @ [65:73] ==> val thenValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseValue' @ [65:84] ==> val elseValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'newVar' @ [66:58] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thenVar' @ [66:65] ==> val thenVar: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'name' @ [66:73] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'ternary' @ [66:79] ==> val ternary: JsConditional defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'replacement' @ [67:29] ==> val replacement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [67:41] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'thenStatement' @ [67:53] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [67:67] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'elseStatement' @ [67:80] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [67:94] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'ctx' @ [68:29] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [68:33] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsVars..JsVars?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsVars

'replacement' @ [68:43] ==> val replacement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [69:29] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsVars..JsVars?)): (JsVars..JsVars?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsVars

'replacement' @ [69:36] ==> val replacement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'thenStatement' @ [74:26] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseStatement' @ [74:55] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'thenStatement' @ [75:37] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'expression' @ [75:51] ==> public final var JsReturn.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'elseStatement' @ [76:37] ==> val elseStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'expression' @ [76:51] ==> public final var JsReturn.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'thenValue' @ [77:25] ==> val thenValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseValue' @ [77:46] ==> val elseValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'hasChanges' @ [78:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[PropertyDescriptorImpl]

'JsConditional' @ [79:39] ==> public constructor JsConditional(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsConditional[JavaClassConstructorDescriptor]

'x' @ [79:53] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'ifExpression' @ [79:55] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'thenValue' @ [79:69] ==> val thenValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'elseValue' @ [79:80] ==> val elseValue: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'JsReturn' @ [80:43] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'ternary' @ [80:52] ==> val ternary: JsConditional defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [81:25] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsReturn..JsReturn?)): (JsReturn..JsReturn?) defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsReturn

'replacement' @ [81:32] ==> val replacement: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'ctx' @ [82:25] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [82:29] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsReturn..JsReturn?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsReturn

'replacement' @ [82:39] ==> val replacement: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[LocalVariableDescriptor]

'super' @ [87:20] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [87:26] ==> public open fun visit(@NotNull p0: JsIf, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [87:32] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'ctx' @ [87:35] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.visitor.<no name provided>.visit[ValueParameterDescriptorImpl]

'statement' @ [92:22] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[ValueParameterDescriptorImpl]

'result' @ [93:16] ==> var result: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[LocalVariableDescriptor]

'result' @ [93:37] ==> var result: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[LocalVariableDescriptor]

'statements' @ [93:44] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'size' @ [93:55] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'result' @ [94:13] ==> var result: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[LocalVariableDescriptor]

'result' @ [94:22] ==> var result: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[LocalVariableDescriptor]

'statements' @ [94:29] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'result' @ [97:16] ==> var result: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.extractSingleStatement[LocalVariableDescriptor]

'when {
        a == null && b == null -> true
        a is JsNameRef && b is JsNameRef -> a.name == b.name && lhsEqual(a.qualifier, b.qualifier)
        a is JsArrayAccess && b is JsArrayAccess -> lhsEqual(a.arrayExpression, b.arrayExpression) &&
                                                    lhsEqual(a.indexExpression, b.indexExpression)
        else -> false
    }' @ [100:73] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'a' @ [101:9] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'b' @ [101:22] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'a' @ [102:9] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'b' @ [102:27] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'a' @ [102:45] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'name' @ [102:47] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'b' @ [102:55] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'name' @ [102:57] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'lhsEqual' @ [102:65] ==> private final fun lhsEqual(a: JsExpression?, b: JsExpression?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'a' @ [102:74] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'qualifier' @ [102:76] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'b' @ [102:87] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'qualifier' @ [102:89] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'a' @ [103:9] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'b' @ [103:31] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'lhsEqual' @ [103:53] ==> private final fun lhsEqual(a: JsExpression?, b: JsExpression?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'a' @ [103:62] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'arrayExpression' @ [103:64] ==> public final var JsArrayAccess.arrayExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'b' @ [103:81] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'arrayExpression' @ [103:83] ==> public final var JsArrayAccess.arrayExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'lhsEqual' @ [104:53] ==> private final fun lhsEqual(a: JsExpression?, b: JsExpression?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction[SimpleFunctionDescriptorImpl]

'a' @ [104:62] ==> value-parameter a: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'indexExpression' @ [104:64] ==> public final var JsArrayAccess.indexExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'b' @ [104:81] ==> value-parameter b: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.IfStatementReduction.lhsEqual[ValueParameterDescriptorImpl]

'indexExpression' @ [104:83] ==> public final var JsArrayAccess.indexExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

