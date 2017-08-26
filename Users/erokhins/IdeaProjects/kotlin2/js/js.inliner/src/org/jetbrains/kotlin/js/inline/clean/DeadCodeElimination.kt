'EliminationVisitor' @ [25:9] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [25:30] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'root' @ [25:37] ==> private final val root: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination[PropertyDescriptorImpl]

'hasChanges' @ [26:16] ==> public final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination[PropertyDescriptorImpl]

'RecursiveJsVisitor' @ [29:38] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableSetOf' @ [30:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'x' @ [35:24] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitBreak[ValueParameterDescriptorImpl]

'label' @ [35:26] ==> public final val JsBreak.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [35:33] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'if (name != null) {
                breakLabels.add(name)
            }
            else {
                localBreakExists = true
            }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'name' @ [36:17] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitBreak[LocalVariableDescriptor]

'breakLabels' @ [37:17] ==> public final var breakLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'add' @ [37:29] ==> public abstract fun add(element: JsName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'name' @ [37:33] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitBreak[LocalVariableDescriptor]

'localBreakExists' @ [40:17] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [42:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [46:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'accept' @ [50:13] ==> public open fun <T : JsNode?> accept(node: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'x' @ [50:20] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [50:22] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'!' @ [51:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canContinue' @ [51:18] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'x' @ [51:33] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLabel[ValueParameterDescriptorImpl]

'name' @ [51:35] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'breakLabels' @ [51:43] ==> public final var breakLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [52:17] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'breakLabels' @ [54:13] ==> public final var breakLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'remove' @ [54:25] ==> public abstract fun remove(element: JsName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'x' @ [54:32] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLabel[ValueParameterDescriptorImpl]

'name' @ [54:34] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'canContinue' @ [58:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'visitStatements' @ [59:13] ==> private final fun visitStatements(statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'x' @ [59:29] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitBlock[ValueParameterDescriptorImpl]

'statements' @ [59:31] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'component1' @ [63:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [63:26] ==> public final operator fun component2(): JsStatement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'statements' @ [63:40] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[ValueParameterDescriptorImpl]

'withIndex' @ [63:51] ==> public fun <T> Iterable<JsStatement>.withIndex(): Iterable<IndexedValue<JsStatement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'accept' @ [64:17] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'statement' @ [64:24] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[LocalVariableDescriptor]

'!' @ [65:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canContinue' @ [65:22] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'statements' @ [66:45] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[ValueParameterDescriptorImpl]

'subList' @ [66:56] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<JsStatement> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [66:64] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[LocalVariableDescriptor]

'statements' @ [66:75] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[ValueParameterDescriptorImpl]

'size' @ [66:86] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'removedStatements' @ [67:25] ==> val removedStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[LocalVariableDescriptor]

'isNotEmpty' @ [67:43] ==> @InlineOnly public inline fun <T> Collection<JsStatement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'hasChanges' @ [68:25] ==> public final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination[PropertyDescriptorImpl]

'removedStatements' @ [69:25] ==> val removedStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitStatements[LocalVariableDescriptor]

'clear' @ [69:43] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'EliminationVisitor' @ [77:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [77:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [77:41] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitWhile[ValueParameterDescriptorImpl]

'condition' @ [77:43] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'visitLoop' @ [79:13] ==> private final fun visitLoop(body: JsStatement?, additionalExitCondition: () -> Boolean): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'x' @ [79:23] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitWhile[ValueParameterDescriptorImpl]

'body' @ [79:25] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'x' @ [80:33] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitWhile[ValueParameterDescriptorImpl]

'condition' @ [80:35] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'condition' @ [81:17] ==> val condition: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitWhile.<anonymous>[LocalVariableDescriptor]

'!' @ [81:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'condition' @ [81:52] ==> val condition: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitWhile.<anonymous>[LocalVariableDescriptor]

'value' @ [81:62] ==> public final val JsBooleanLiteral.value: Boolean[MyPropertyDescriptor]

'visitWhile' @ [85:51] ==> public open fun visitWhile(x: JsWhile): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'x' @ [85:62] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitDoWhile[ValueParameterDescriptorImpl]

'EliminationVisitor' @ [88:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [88:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [88:41] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitFor[ValueParameterDescriptorImpl]

'condition' @ [88:43] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'EliminationVisitor' @ [89:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [89:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [89:41] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitFor[ValueParameterDescriptorImpl]

'initExpression' @ [89:43] ==> public final val JsFor.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'EliminationVisitor' @ [90:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [90:34] ==> public open fun <T : JsNode?> accept(node: (JsVars..JsVars?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsVars..org.jetbrains.kotlin.js.backend.ast.JsVars?)

'x' @ [90:41] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitFor[ValueParameterDescriptorImpl]

'initVars' @ [90:43] ==> public final val JsFor.initVars: (JsVars..JsVars?)[MyPropertyDescriptor]

'EliminationVisitor' @ [91:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [91:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [91:41] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitFor[ValueParameterDescriptorImpl]

'incrementExpression' @ [91:43] ==> public final val JsFor.incrementExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'visitLoop' @ [95:13] ==> private final fun visitLoop(body: JsStatement?, additionalExitCondition: () -> Boolean): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'x' @ [95:23] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitFor[ValueParameterDescriptorImpl]

'body' @ [95:25] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'EliminationVisitor' @ [99:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [99:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [99:41] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitForIn[ValueParameterDescriptorImpl]

'iterExpression' @ [99:43] ==> public final var JsForIn.iterExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'visitLoop' @ [100:13] ==> private final fun visitLoop(body: JsStatement?, additionalExitCondition: () -> Boolean): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'x' @ [100:23] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitForIn[ValueParameterDescriptorImpl]

'body' @ [100:25] ==> public final var JsForIn.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'localBreakExists' @ [104:42] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'localBreakExists' @ [106:13] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'body' @ [107:17] ==> value-parameter body: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLoop[ValueParameterDescriptorImpl]

'accept' @ [108:17] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'body' @ [108:24] ==> value-parameter body: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLoop[ValueParameterDescriptorImpl]

'!' @ [110:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canContinue' @ [110:18] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [111:17] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'invoke' @ [111:31] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'localBreakExists' @ [111:60] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'localBreakExists' @ [114:13] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'localBreakExistsBackup' @ [114:32] ==> val localBreakExistsBackup: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitLoop[LocalVariableDescriptor]

'EliminationVisitor' @ [118:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [118:34] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'x' @ [118:41] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[ValueParameterDescriptorImpl]

'ifExpression' @ [118:43] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'accept' @ [122:13] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'x' @ [122:20] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[ValueParameterDescriptorImpl]

'thenStatement' @ [122:22] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'canContinue' @ [123:17] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [124:17] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[LocalVariableDescriptor]

'x' @ [127:33] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[ValueParameterDescriptorImpl]

'elseStatement' @ [127:35] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'if (elseStatement != null) {
                accept(x.elseStatement)
                if (canContinue) {
                    result = true
                }
            }
            else {
                result = true
            }' @ [128:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'elseStatement' @ [128:17] ==> val elseStatement: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[LocalVariableDescriptor]

'accept' @ [129:17] ==> public open fun <T : JsNode?> accept(node: JsStatement?): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement?

'x' @ [129:24] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[ValueParameterDescriptorImpl]

'elseStatement' @ [129:26] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'canContinue' @ [130:21] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [131:21] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[LocalVariableDescriptor]

'result' @ [135:17] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[LocalVariableDescriptor]

'canContinue' @ [138:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [138:27] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitIf[LocalVariableDescriptor]

'accept' @ [144:13] ==> public open fun <T : JsNode?> accept(node: (JsBlock..JsBlock?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsBlock..org.jetbrains.kotlin.js.backend.ast.JsBlock?)

'x' @ [144:20] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[ValueParameterDescriptorImpl]

'tryBlock' @ [144:22] ==> public final var JsTry.tryBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'canContinue' @ [145:17] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [146:17] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'x' @ [149:32] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[ValueParameterDescriptorImpl]

'catches' @ [149:34] ==> public final val JsTry.catches: (MutableList<(JsCatch..JsCatch?)>..List<(JsCatch..JsCatch?)>?)[MyPropertyDescriptor]

'accept' @ [150:17] ==> public open fun <T : JsNode?> accept(node: (JsBlock..JsBlock?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsBlock..org.jetbrains.kotlin.js.backend.ast.JsBlock?)

'catchBlock' @ [150:24] ==> val catchBlock: (JsCatch..JsCatch?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'body' @ [150:35] ==> public final var JsCatch.body: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'canContinue' @ [151:21] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [152:21] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'x' @ [156:32] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[ValueParameterDescriptorImpl]

'finallyBlock' @ [156:34] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'finallyBlock' @ [157:17] ==> val finallyBlock: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'accept' @ [158:17] ==> public open fun <T : JsNode?> accept(node: (JsBlock..JsBlock?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsBlock..org.jetbrains.kotlin.js.backend.ast.JsBlock?)

'finallyBlock' @ [158:24] ==> val finallyBlock: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'!' @ [159:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canContinue' @ [159:22] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [160:21] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'canContinue' @ [164:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'result' @ [164:27] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitTry[LocalVariableDescriptor]

'EliminationVisitor' @ [168:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [168:34] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'x' @ [168:41] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [168:43] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'canContinue' @ [169:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'EliminationVisitor' @ [173:13] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [173:34] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [173:41] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[ValueParameterDescriptorImpl]

'expression' @ [173:43] ==> public final var JsSwitch.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'localBreakExists' @ [174:42] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'x' @ [179:31] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[ValueParameterDescriptorImpl]

'cases' @ [179:33] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'canContinue' @ [180:17] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'visitStatements' @ [181:17] ==> private final fun visitStatements(statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[SimpleFunctionDescriptorImpl]

'caseBlock' @ [181:33] ==> val caseBlock: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'statements' @ [181:43] ==> public final val JsSwitchMember.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'!' @ [183:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canContinue' @ [183:22] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'localBreakExists' @ [183:37] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [184:21] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'if (caseBlock is JsDefault) {
                    defaultCanContinue = canContinue
                }
                else if (allCasesCantContinue && canContinue) {
                    allCasesCantContinue = false
                }' @ [187:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'caseBlock' @ [187:21] ==> val caseBlock: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'defaultCanContinue' @ [188:21] ==> var defaultCanContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'canContinue' @ [188:42] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'allCasesCantContinue' @ [190:26] ==> var allCasesCantContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'canContinue' @ [190:50] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'allCasesCantContinue' @ [191:21] ==> var allCasesCantContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'canContinue' @ [195:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'!' @ [195:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allCasesCantContinue' @ [195:28] ==> var allCasesCantContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'defaultCanContinue' @ [195:52] ==> var defaultCanContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'localBreakExists' @ [196:13] ==> public final var localBreakExists: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'localBreakExistsBackup' @ [196:32] ==> val localBreakExistsBackup: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visit[LocalVariableDescriptor]

'canContinue' @ [200:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'canContinue' @ [204:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

'x' @ [208:13] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitVars[ValueParameterDescriptorImpl]

'vars' @ [208:15] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'forEach' @ [208:20] ==> @HidesMembers public inline fun <T> Iterable<(JsVars.JsVar..JsVars.JsVar?)>.forEach(action: ((JsVars.JsVar..JsVars.JsVar?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'EliminationVisitor' @ [208:30] ==> public constructor EliminationVisitor() defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[ClassConstructorDescriptorImpl]

'accept' @ [208:51] ==> public open fun <T : JsNode?> accept(node: (JsVars.JsVar..JsVars.JsVar?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'it' @ [208:58] ==> value-parameter it: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor.visitVars.<anonymous>[ValueParameterDescriptorImpl]

'canContinue' @ [209:13] ==> public final var canContinue: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DeadCodeElimination.EliminationVisitor[PropertyDescriptorImpl]

