'JsVisitorWithContextImpl' @ [27:18] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [31:21] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'synthetic' @ [31:23] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'isEmpty' @ [32:25] ==> private final fun isEmpty(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [32:33] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'statement' @ [32:35] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'ctx' @ [33:25] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [33:29] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'x' @ [33:39] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'statement' @ [33:41] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'hasChanges' @ [34:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'processStatements' @ [40:17] ==> private final fun processStatements(statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [40:35] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'statements' @ [40:37] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'isEmpty' @ [44:33] ==> private final fun isEmpty(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [44:41] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'thenStatement' @ [44:43] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'x' @ [45:33] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'elseStatement' @ [45:35] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'let' @ [45:50] ==> @InlineOnly public inline fun <T, R> JsStatement.let(block: (JsStatement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement
    <R> -> Boolean

'isEmpty' @ [45:56] ==> private final fun isEmpty(statement: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [45:64] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'when {
                    thenEmpty && elseEmpty -> {
                        hasChanges = true
                        ctx.replaceMe(JsAstUtils.asSyntheticStatement(x.ifExpression))
                    }
                    elseEmpty -> {
                        if (x.elseStatement != null) {
                            hasChanges = true
                            x.elseStatement = null
                        }
                    }
                    thenEmpty -> {
                        hasChanges = true
                        x.thenStatement = x.elseStatement!!
                        x.elseStatement = null
                        x.ifExpression = JsAstUtils.notOptimized(x.ifExpression)
                    }
                }' @ [46:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'thenEmpty' @ [47:21] ==> val thenEmpty: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'elseEmpty' @ [47:34] ==> val elseEmpty: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'hasChanges' @ [48:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'ctx' @ [49:25] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [49:29] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'asSyntheticStatement' @ [49:50] ==> public open fun asSyntheticStatement(@NotNull expression: JsExpression): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [49:71] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'ifExpression' @ [49:73] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'elseEmpty' @ [51:21] ==> val elseEmpty: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'x' @ [52:29] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'elseStatement' @ [52:31] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'hasChanges' @ [53:29] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'x' @ [54:29] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'elseStatement' @ [54:31] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'thenEmpty' @ [57:21] ==> val thenEmpty: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'hasChanges' @ [58:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'x' @ [59:25] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'thenStatement' @ [59:27] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'x' @ [59:43] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'elseStatement' @ [59:45] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'x' @ [60:25] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'elseStatement' @ [60:27] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'x' @ [61:25] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'ifExpression' @ [61:27] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'notOptimized' @ [61:53] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [61:66] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'ifExpression' @ [61:68] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'x' @ [67:36] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'finallyBlock' @ [67:38] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'x' @ [68:21] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'tryBlock' @ [68:23] ==> public final var JsTry.tryBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'isEmpty' @ [68:32] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'hasChanges' @ [69:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'ctx' @ [70:21] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [70:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsNode..JsNode?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsNode..org.jetbrains.kotlin.js.backend.ast.JsNode?)

'finallyBlock' @ [70:35] ==> val finallyBlock: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'JsEmpty' @ [70:51] ==> public object JsEmpty : SourceInfoAwareJsNode, JsStatement defined in org.jetbrains.kotlin.js.backend.ast[FakeCallableDescriptorForObject]

'x' @ [75:30] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'cases' @ [75:32] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'processStatements' @ [76:21] ==> private final fun processStatements(statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'case' @ [76:39] ==> val case: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'statements' @ [76:44] ==> public final val JsSwitchMember.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'x' @ [78:21] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'cases' @ [78:23] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'dropLast' @ [78:29] ==> public fun <T> List<(JsSwitchMember..JsSwitchMember?)>.dropLast(n: Int): List<(JsSwitchMember..JsSwitchMember?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'none' @ [78:41] ==> public inline fun <T> Iterable<(JsSwitchMember..JsSwitchMember?)>.none(predicate: ((JsSwitchMember..JsSwitchMember?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'it' @ [78:48] ==> value-parameter it: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [78:69] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'cases' @ [78:71] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'dropLast' @ [78:77] ==> public fun <T> List<(JsSwitchMember..JsSwitchMember?)>.dropLast(n: Int): List<(JsSwitchMember..JsSwitchMember?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'all' @ [78:89] ==> public inline fun <T> Iterable<(JsSwitchMember..JsSwitchMember?)>.all(predicate: ((JsSwitchMember..JsSwitchMember?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'it' @ [78:95] ==> value-parameter it: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [78:98] ==> public final val JsSwitchMember.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'isEmpty' @ [78:109] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'hasChanges' @ [79:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'asSyntheticStatement' @ [80:57] ==> public open fun asSyntheticStatement(@NotNull expression: JsExpression): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [80:78] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'expression' @ [80:80] ==> public final var JsSwitch.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'ctx' @ [81:21] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [81:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsBlock..JsBlock?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsBlock..org.jetbrains.kotlin.js.backend.ast.JsBlock?)

'JsBlock' @ [81:35] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'listOf' @ [81:43] ==> public fun <T> listOf(element: (JsStatement..JsStatement?)): List<(JsStatement..JsStatement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'conditionStatement' @ [81:50] ==> val conditionStatement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[LocalVariableDescriptor]

'x' @ [81:72] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'cases' @ [81:74] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'last' @ [81:80] ==> public fun <T> List<(JsSwitchMember..JsSwitchMember?)>.last(): (JsSwitchMember..JsSwitchMember?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'statements' @ [81:87] ==> public final val JsSwitchMember.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'component1' @ [86:23] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [86:30] ==> public final operator fun component2(): JsStatement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'statements' @ [86:44] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[ValueParameterDescriptorImpl]

'withIndex' @ [86:55] ==> public fun <T> Iterable<JsStatement>.withIndex(): Iterable<IndexedValue<JsStatement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'reversed' @ [86:67] ==> public fun <T> Iterable<IndexedValue<JsStatement>>.reversed(): List<IndexedValue<JsStatement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<JsStatement>

'if (statement is JsEmpty) {
                        statements.removeAt(index)
                        hasChanges = true
                    }
                    else if (statement is JsBlock) {
                        statements.removeAt(index)
                        statements.addAll(index, statement.statements)
                    }' @ [87:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statement' @ [87:25] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'statements' @ [88:25] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[ValueParameterDescriptorImpl]

'removeAt' @ [88:36] ==> public abstract fun removeAt(index: Int): JsStatement defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [88:45] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'hasChanges' @ [89:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'statement' @ [91:30] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'statements' @ [92:25] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[ValueParameterDescriptorImpl]

'removeAt' @ [92:36] ==> public abstract fun removeAt(index: Int): JsStatement defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [92:45] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'statements' @ [93:25] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[ValueParameterDescriptorImpl]

'addAll' @ [93:36] ==> public abstract fun addAll(index: Int, elements: Collection<JsStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [93:43] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'statement' @ [93:50] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.processStatements[LocalVariableDescriptor]

'statements' @ [93:60] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statement' @ [98:59] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.isEmpty[ValueParameterDescriptorImpl]

'statement' @ [98:83] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.isEmpty[ValueParameterDescriptorImpl]

'isEmpty' @ [98:93] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'statement' @ [98:104] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>.isEmpty[ValueParameterDescriptorImpl]

'accept' @ [99:11] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination.apply.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'root' @ [99:18] ==> private final val root: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

'hasChanges' @ [100:16] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.EmptyStatementElimination[PropertyDescriptorImpl]

