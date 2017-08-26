'mutableSetOf' @ [36:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'mutableMapOf' @ [38:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsDoWhile, JsLabel> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsDoWhile
    <V> -> JsLabel

'mutableMapOf' @ [39:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, JsName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsName?

'analyze' @ [42:9] ==> private final fun analyze(): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[SimpleFunctionDescriptorImpl]

'perform' @ [43:9] ==> private final fun perform(): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[SimpleFunctionDescriptorImpl]

'hasChanges' @ [44:16] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'RecursiveJsVisitor' @ [48:18] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [50:33] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [50:35] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'if (statement is JsDoWhile) {
                    processDoWhile(statement, x.name)
                }
                else {
                    super.visitLabel(x)
                }' @ [51:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statement' @ [51:21] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitLabel[LocalVariableDescriptor]

'processDoWhile' @ [52:21] ==> private final fun processDoWhile(x: JsDoWhile, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>[SimpleFunctionDescriptorImpl]

'statement' @ [52:36] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitLabel[LocalVariableDescriptor]

'x' @ [52:47] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [52:49] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'super' @ [55:21] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLabel' @ [55:27] ==> public open fun visitLabel(x: JsLabel): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [55:38] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'processDoWhile' @ [59:55] ==> private final fun processDoWhile(x: JsDoWhile, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [59:70] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'x' @ [62:28] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[ValueParameterDescriptorImpl]

'body' @ [62:30] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'when (body) {
                    is JsBlock -> {
                        val firstStatement = body.statements.firstOrNull()
                        if (firstStatement is JsLabel && body.statements.size == 1) {
                            firstStatement
                        }
                        else {
                            null
                        }
                    }
                    is JsLabel -> body
                    else -> null
                }' @ [63:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsLabel?, entry1: JsLabel?, entry2: JsLabel?): JsLabel?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsLabel?

'body' @ [63:35] ==> val body: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'body' @ [65:46] ==> val body: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'statements' @ [65:51] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [65:62] ==> public fun <T> List<(JsStatement..JsStatement?)>.firstOrNull(): JsStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'if (firstStatement is JsLabel && body.statements.size == 1) {
                            firstStatement
                        }
                        else {
                            null
                        }' @ [66:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsLabel?, elseBranch: JsLabel?): JsLabel?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsLabel?

'firstStatement' @ [66:29] ==> val firstStatement: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'body' @ [66:58] ==> val body: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'statements' @ [66:63] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'size' @ [66:74] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'firstStatement' @ [67:29] ==> val firstStatement: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'body' @ [73:35] ==> val body: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'guard' @ [77:21] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'label' @ [98:25] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[ValueParameterDescriptorImpl]

'!' @ [98:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'findBreakInNestedLoop' @ [98:43] ==> private final fun findBreakInNestedLoop(statement: JsStatement, name: JsName): Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[SimpleFunctionDescriptorImpl]

'guard' @ [98:65] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'guard' @ [98:72] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'name' @ [98:78] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'guardLabels' @ [99:25] ==> private final val guardLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'guard' @ [99:40] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'name' @ [99:46] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'loopGuardMap' @ [100:25] ==> private final val loopGuardMap: MutableMap<JsDoWhile, JsLabel> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'x' @ [100:38] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[ValueParameterDescriptorImpl]

'guard' @ [100:43] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'guardToLoopLabel' @ [101:25] ==> private final val guardToLoopLabel: MutableMap<JsName, JsName?> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'guard' @ [101:42] ==> val guard: JsLabel? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'name' @ [101:48] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'label' @ [101:56] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[ValueParameterDescriptorImpl]

'body' @ [105:17] ==> val body: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>.processDoWhile[LocalVariableDescriptor]

'accept' @ [105:22] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [105:29] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>[LazyClassReceiverParameterDescriptor]

'accept' @ [109:11] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'root' @ [109:18] ==> private final val root: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'statement' @ [114:9] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop[ValueParameterDescriptorImpl]

'accept' @ [114:19] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [114:35] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [118:34] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'label' @ [118:36] ==> public final val JsBreak.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [118:43] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'guardLabel' @ [119:21] ==> val guardLabel: JsName defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitBreak[LocalVariableDescriptor]

'name' @ [119:35] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop[ValueParameterDescriptorImpl]

'isInLoop' @ [119:43] ==> private final fun isInLoop(): Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[SimpleFunctionDescriptorImpl]

'result' @ [120:21] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop[LocalVariableDescriptor]

'loopLevel' @ [124:38] ==> private final var loopLevel: Int defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[PropertyDescriptorImpl]

'enterLoop' @ [126:55] ==> private final inline fun enterLoop(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [126:67] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDoWhile' @ [126:73] ==> public open fun visitDoWhile(x: JsDoWhile): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [126:86] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'enterLoop' @ [128:51] ==> private final inline fun enterLoop(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [128:63] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitWhile' @ [128:69] ==> public open fun visitWhile(x: JsWhile): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [128:80] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitWhile[ValueParameterDescriptorImpl]

'enterLoop' @ [130:47] ==> private final inline fun enterLoop(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [130:59] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFor' @ [130:65] ==> public open fun visitFor(x: JsFor): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [130:74] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'enterLoop' @ [132:51] ==> private final inline fun enterLoop(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [132:63] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitForIn' @ [132:69] ==> public open fun visitForIn(x: JsForIn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [132:80] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitForIn[ValueParameterDescriptorImpl]

'loopLevel' @ [135:17] ==> private final var loopLevel: Int defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[PropertyDescriptorImpl]

'invoke' @ [136:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'loopLevel' @ [137:17] ==> private final var loopLevel: Int defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[PropertyDescriptorImpl]

'!' @ [143:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [143:22] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop[LocalVariableDescriptor]

'super' @ [144:21] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [144:27] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [144:40] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'result' @ [148:16] ==> var result: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.findBreakInNestedLoop[LocalVariableDescriptor]

'JsVisitorWithContextImpl' @ [152:18] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'loopGuardMap' @ [154:17] ==> private final val loopGuardMap: MutableMap<JsDoWhile, JsLabel> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'x' @ [154:30] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'let' @ [154:34] ==> @InlineOnly public inline fun <T, R> JsLabel.let(block: (JsLabel) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLabel
    <R> -> Unit

'guard' @ [155:25] ==> value-parameter guard: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [155:31] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'guardLabels' @ [155:39] ==> private final val guardLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'x' @ [156:25] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'body' @ [156:27] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [156:34] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'guard' @ [156:41] ==> value-parameter guard: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [156:47] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'hasChanges' @ [157:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'super' @ [161:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [161:30] ==> public open fun visit(@NotNull p0: JsDoWhile, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [161:36] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'ctx' @ [161:39] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'x' @ [165:28] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'label' @ [165:30] ==> public final val JsBreak.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [165:37] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [166:21] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[LocalVariableDescriptor]

'guardLabels' @ [166:29] ==> private final val guardLabels: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'guardToLoopLabel' @ [167:34] ==> private final val guardToLoopLabel: MutableMap<JsName, JsName?> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'name' @ [167:51] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[LocalVariableDescriptor]

'ctx' @ [168:21] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [168:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsContinue..JsContinue?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsContinue

'JsContinue' @ [168:35] ==> public constructor JsContinue(@Nullable p0: JsNameRef?) defined in org.jetbrains.kotlin.js.backend.ast.JsContinue[JavaClassConstructorDescriptor]

'target' @ [168:46] ==> val target: JsName? defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>.visit[LocalVariableDescriptor]

'makeRef' @ [168:54] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'hasChanges' @ [169:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

'accept' @ [173:11] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsStatement..JsStatement?)): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination.perform.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsStatement

'root' @ [173:18] ==> private final val root: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.DoWhileGuardElimination[PropertyDescriptorImpl]

