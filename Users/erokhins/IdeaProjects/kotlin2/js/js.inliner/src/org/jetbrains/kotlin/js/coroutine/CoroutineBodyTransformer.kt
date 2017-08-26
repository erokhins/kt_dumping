'RecursiveJsVisitor' @ [28:87] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'context' @ [29:30] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'entryBlock' @ [29:38] ==> public final val entryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'context' @ [30:36] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'globalCatchBlock' @ [30:44] ==> public final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'entryBlock' @ [31:32] ==> private final val entryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'currentBlock' @ [33:17] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statements' @ [33:30] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'mutableMapOf' @ [34:49] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsContinue, JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsContinue
    <V> -> JsStatement

'mutableMapOf' @ [35:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsStatement
    <V> -> JumpTarget

'mutableMapOf' @ [36:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsStatement
    <V> -> JumpTarget

'mutableSetOf' @ [37:36] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'globalCatchBlock' @ [39:37] ==> private final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'mutableListOf' @ [40:28] ==> public fun <T> mutableListOf(vararg elements: CoroutineBodyTransformer.TryBlock): MutableList<CoroutineBodyTransformer.TryBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TryBlock

'TryBlock' @ [40:42] ==> public constructor TryBlock(catchBlock: CoroutineBlock, finallyBlock: CoroutineBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.TryBlock[ClassConstructorDescriptorImpl]

'globalCatchBlock' @ [40:51] ==> private final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'tryStack' @ [47:17] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'lastIndex' @ [47:26] ==> public val <T> List<CoroutineBodyTransformer.TryBlock>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TryBlock

'breakContinueTargetStatements' @ [50:9] ==> private final val breakContinueTargetStatements: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'node' @ [50:42] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.preProcess[ValueParameterDescriptorImpl]

'collectBreakContinueTargets' @ [50:47] ==> public fun JsNode.collectBreakContinueTargets(): Map<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'nodesToSplit' @ [51:9] ==> private final lateinit var nodesToSplit: Set<JsNode> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'node' @ [51:24] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.preProcess[ValueParameterDescriptorImpl]

'collectNodesToSplit' @ [51:29] ==> public fun JsNode.collectNodesToSplit(breakContinueTargets: Map<JsContinue, JsStatement>): Set<JsNode> defined in org.jetbrains.kotlin.js.coroutine in file CoroutinePasses.kt[SimpleFunctionDescriptorImpl]

'breakContinueTargetStatements' @ [51:49] ==> private final val breakContinueTargetStatements: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'currentBlock' @ [55:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statements' @ [55:22] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'JsReturn' @ [55:36] ==> public constructor JsReturn() defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'entryBlock' @ [56:21] ==> private final val entryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'buildGraph' @ [56:32] ==> public fun CoroutineBlock.buildGraph(globalCatchBlock: CoroutineBlock?): Map<CoroutineBlock, Set<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine in file CoroutinePasses.kt[SimpleFunctionDescriptorImpl]

'globalCatchBlock' @ [56:43] ==> private final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'topologicalOrder' @ [57:33] ==> public final fun <N : (Any..Any?)> topologicalOrder(@NotNull p0: (MutableIterable<(CoroutineBlock..CoroutineBlock?)>..Iterable<(CoroutineBlock..CoroutineBlock?)>), @NotNull p1: ((CoroutineBlock..CoroutineBlock?)) -> (MutableIterable<(CoroutineBlock..CoroutineBlock?)>..Iterable<(CoroutineBlock..CoroutineBlock?)>)): (MutableList<(CoroutineBlock..CoroutineBlock?)>..List<(CoroutineBlock..CoroutineBlock?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.js.coroutine.CoroutineBlock..org.jetbrains.kotlin.js.coroutine.CoroutineBlock?)

'listOf' @ [57:50] ==> public fun <T> listOf(element: CoroutineBlock): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'entryBlock' @ [57:57] ==> private final val entryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'graph' @ [57:72] ==> val graph: Map<CoroutineBlock, Set<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.postProcess[LocalVariableDescriptor]

'it' @ [57:78] ==> value-parameter it: (CoroutineBlock..CoroutineBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [57:82] ==> @InlineOnly public inline fun <T> Set<CoroutineBlock>?.orEmpty(): Set<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'orderedBlocks' @ [58:9] ==> val orderedBlocks: (MutableList<(CoroutineBlock..CoroutineBlock?)>..List<(CoroutineBlock..CoroutineBlock?)>?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.postProcess[LocalVariableDescriptor]

'replaceCoroutineFlowStatements' @ [58:23] ==> public fun List<CoroutineBlock>.replaceCoroutineFlowStatements(context: CoroutineTransformationContext): Unit defined in org.jetbrains.kotlin.js.coroutine in file CoroutinePasses.kt[SimpleFunctionDescriptorImpl]

'context' @ [58:54] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'orderedBlocks' @ [59:16] ==> val orderedBlocks: (MutableList<(CoroutineBlock..CoroutineBlock?)>..List<(CoroutineBlock..CoroutineBlock?)>?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.postProcess[LocalVariableDescriptor]

'splitIfNecessary' @ [62:43] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [62:60] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBlock[ValueParameterDescriptorImpl]

'x' @ [63:27] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBlock[ValueParameterDescriptorImpl]

'statements' @ [63:29] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statement' @ [64:13] ==> val statement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBlock.<anonymous>[LocalVariableDescriptor]

'accept' @ [64:23] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [64:30] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'splitIfNecessary' @ [68:37] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [68:54] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'currentBlock' @ [69:23] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'CoroutineBlock' @ [71:30] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentBlock' @ [72:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'thenEntryBlock' @ [72:24] ==> val thenEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'x' @ [73:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'thenStatement' @ [73:11] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'accept' @ [73:25] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [73:32] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentBlock' @ [74:29] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'CoroutineBlock' @ [76:30] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentBlock' @ [77:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'elseEntryBlock' @ [77:24] ==> val elseEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'x' @ [78:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'elseStatement' @ [78:11] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'accept' @ [78:26] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [78:33] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentBlock' @ [79:29] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [81:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'thenStatement' @ [81:11] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'JsBlock' @ [81:27] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'thenEntryBlock' @ [81:35] ==> val thenEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'statements' @ [81:50] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'x' @ [82:9] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'elseStatement' @ [82:11] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'JsBlock' @ [82:27] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'elseEntryBlock' @ [82:35] ==> val elseEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'statements' @ [82:50] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'ifBlock' @ [83:9] ==> val ifBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'statements' @ [83:17] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'x' @ [83:31] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'CoroutineBlock' @ [85:26] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'thenExitBlock' @ [86:9] ==> val thenExitBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'statements' @ [86:23] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'stateAndJump' @ [86:37] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'jointBlock' @ [86:50] ==> val jointBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'x' @ [86:62] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'elseExitBlock' @ [87:9] ==> val elseExitBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'statements' @ [87:23] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'stateAndJump' @ [87:37] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'jointBlock' @ [87:50] ==> val jointBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'x' @ [87:62] ==> value-parameter x: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf[ValueParameterDescriptorImpl]

'currentBlock' @ [88:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'jointBlock' @ [88:24] ==> val jointBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitIf.<anonymous>[LocalVariableDescriptor]

'x' @ [92:21] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [92:23] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'when (inner) {
            is JsWhile,
            is JsDoWhile,
            is JsFor -> {
                if (x in nodesToSplit) {
                    inner.accept(this)
                }
                else {
                    currentStatements += x
                }
            }

            else -> splitIfNecessary(x) {
                val successor = CoroutineBlock()
                withBreakAndContinue(x.statement, successor, null) {
                    accept(inner)
                }
                if (successor in referencedBlocks) {
                    currentBlock.statements += stateAndJump(successor, x)
                    currentBlock = successor
                }
            }
        }' @ [93:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'inner' @ [93:15] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[LocalVariableDescriptor]

'if (x in nodesToSplit) {
                    inner.accept(this)
                }
                else {
                    currentStatements += x
                }' @ [97:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'x' @ [97:21] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'nodesToSplit' @ [97:26] ==> private final lateinit var nodesToSplit: Set<JsNode> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'inner' @ [98:21] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[LocalVariableDescriptor]

'accept' @ [98:27] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [98:34] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentStatements' @ [101:21] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [101:42] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'splitIfNecessary' @ [105:21] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [105:38] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'CoroutineBlock' @ [106:33] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'withBreakAndContinue' @ [107:17] ==> private final fun withBreakAndContinue(statement: JsStatement, breakBlock: CoroutineBlock, continueBlock: CoroutineBlock? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [107:38] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [107:40] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'successor' @ [107:51] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel.<anonymous>[LocalVariableDescriptor]

'accept' @ [108:21] ==> public open fun <T : JsNode?> accept(node: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'inner' @ [108:28] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[LocalVariableDescriptor]

'successor' @ [110:21] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel.<anonymous>[LocalVariableDescriptor]

'referencedBlocks' @ [110:34] ==> private final val referencedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'currentBlock' @ [111:21] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statements' @ [111:34] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'stateAndJump' @ [111:48] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [111:61] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel.<anonymous>[LocalVariableDescriptor]

'x' @ [111:72] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel[ValueParameterDescriptorImpl]

'currentBlock' @ [112:21] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'successor' @ [112:36] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitLabel.<anonymous>[LocalVariableDescriptor]

'splitIfNecessary' @ [118:43] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [118:60] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'CoroutineBlock' @ [119:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [120:30] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentStatements' @ [121:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [121:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [121:43] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [121:59] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'currentBlock' @ [123:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'bodyEntryBlock' @ [123:24] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'!' @ [124:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTrue' @ [124:31] ==> public open fun isTrue(@NotNull p0: JsExpression): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'x' @ [124:38] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'condition' @ [124:40] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'currentStatements' @ [125:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'JsIf' @ [125:34] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'notOptimized' @ [125:50] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [125:63] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'condition' @ [125:65] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsBlock' @ [125:77] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'stateAndJump' @ [125:85] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [125:98] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [125:109] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'apply' @ [125:114] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [125:122] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [125:131] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'source' @ [125:133] ==> public final var JsWhile.source: (Any..Any?)[MyPropertyDescriptor]

'withBreakAndContinue' @ [128:9] ==> private final fun withBreakAndContinue(statement: JsStatement, breakBlock: CoroutineBlock, continueBlock: CoroutineBlock? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [128:30] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'successor' @ [128:33] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'bodyEntryBlock' @ [128:44] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [129:13] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'body' @ [129:15] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [129:20] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [129:27] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentStatements' @ [132:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [132:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [132:43] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [132:59] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile[ValueParameterDescriptorImpl]

'currentBlock' @ [133:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'successor' @ [133:24] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitWhile.<anonymous>[LocalVariableDescriptor]

'splitIfNecessary' @ [136:47] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [136:64] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'CoroutineBlock' @ [137:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [138:30] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentStatements' @ [139:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [139:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [139:43] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [139:59] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'currentBlock' @ [141:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'bodyEntryBlock' @ [141:24] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'withBreakAndContinue' @ [142:9] ==> private final fun withBreakAndContinue(statement: JsStatement, breakBlock: CoroutineBlock, continueBlock: CoroutineBlock? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [142:30] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'successor' @ [142:33] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'bodyEntryBlock' @ [142:44] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [143:13] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'body' @ [143:15] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [143:20] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [143:27] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'!' @ [146:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTrue' @ [146:31] ==> public open fun isTrue(@NotNull p0: JsExpression): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'x' @ [146:38] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'condition' @ [146:40] ==> public final var JsDoWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsIf' @ [147:24] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'notOptimized' @ [147:40] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [147:53] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'condition' @ [147:55] ==> public final var JsDoWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsBlock' @ [147:67] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'stateAndJump' @ [147:75] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [147:88] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [147:99] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'apply' @ [147:104] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [147:112] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [147:121] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'source' @ [147:123] ==> public final var JsDoWhile.source: (Any..Any?)[MyPropertyDescriptor]

'currentStatements' @ [148:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'add' @ [148:31] ==> public abstract fun add(element: JsStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'jsIf' @ [148:35] ==> val jsIf: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'currentBlock' @ [150:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statements' @ [150:22] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'stateAndJump' @ [150:36] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [150:49] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'x' @ [150:65] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile[ValueParameterDescriptorImpl]

'currentBlock' @ [152:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'successor' @ [152:24] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitDoWhile.<anonymous>[LocalVariableDescriptor]

'splitIfNecessary' @ [155:39] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [155:56] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'x' @ [156:9] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'initExpression' @ [156:11] ==> public final val JsFor.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [156:27] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'JsExpressionStatement' @ [157:13] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'it' @ [157:35] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [157:39] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaMethodDescriptor]

'this' @ [157:46] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'x' @ [159:9] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'initVars' @ [159:11] ==> public final val JsFor.initVars: (JsVars..JsVars?)[MyPropertyDescriptor]

'let' @ [159:21] ==> @InlineOnly public inline fun <T, R> JsVars.let(block: (JsVars) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars
    <R> -> Unit

'initVars' @ [160:17] ==> value-parameter initVars: JsVars defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [160:26] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'isNotEmpty' @ [160:31] ==> @InlineOnly public inline fun <T> Collection<(JsVars.JsVar..JsVars.JsVar?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'initVars' @ [161:17] ==> value-parameter initVars: JsVars defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [161:26] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaMethodDescriptor]

'this' @ [161:33] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'CoroutineBlock' @ [165:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [166:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [167:30] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentStatements' @ [168:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [168:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [168:43] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [168:59] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'currentBlock' @ [170:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'bodyEntryBlock' @ [170:24] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [171:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'condition' @ [171:15] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'!' @ [171:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTrue' @ [171:54] ==> public open fun isTrue(@NotNull p0: JsExpression): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'x' @ [171:61] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'condition' @ [171:63] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'currentStatements' @ [172:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'JsIf' @ [172:34] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'notOptimized' @ [172:50] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [172:63] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'condition' @ [172:65] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsBlock' @ [172:77] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'stateAndJump' @ [172:85] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [172:98] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [172:109] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'apply' @ [172:114] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [172:122] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [172:131] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'source' @ [172:133] ==> public final var JsFor.source: (Any..Any?)[MyPropertyDescriptor]

'withBreakAndContinue' @ [175:9] ==> private final fun withBreakAndContinue(statement: JsStatement, breakBlock: CoroutineBlock, continueBlock: CoroutineBlock? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [175:30] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'successor' @ [175:33] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'increment' @ [175:44] ==> val increment: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [176:13] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'body' @ [176:15] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [176:20] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [176:27] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentStatements' @ [179:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [179:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'increment' @ [179:43] ==> val increment: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [179:54] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'currentBlock' @ [180:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'increment' @ [180:24] ==> val increment: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [182:9] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'incrementExpression' @ [182:11] ==> public final val JsFor.incrementExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [182:32] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'JsExpressionStatement' @ [182:38] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'it' @ [182:60] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [182:64] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaMethodDescriptor]

'this' @ [182:71] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentStatements' @ [183:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [183:30] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'bodyEntryBlock' @ [183:43] ==> val bodyEntryBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'x' @ [183:59] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor[ValueParameterDescriptorImpl]

'currentBlock' @ [185:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'successor' @ [185:24] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitFor.<anonymous>[LocalVariableDescriptor]

'breakContinueTargetStatements' @ [189:31] ==> private final val breakContinueTargetStatements: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [189:61] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[ValueParameterDescriptorImpl]

'component1' @ [190:14] ==> public final operator fun component1(): CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[SimpleFunctionDescriptorImpl]

'component2' @ [190:27] ==> public final operator fun component2(): Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[SimpleFunctionDescriptorImpl]

'breakTargets' @ [190:45] ==> private final val breakTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'targetStatement' @ [190:58] ==> val targetStatement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[LocalVariableDescriptor]

'referencedBlocks' @ [191:9] ==> private final val referencedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'targetBlock' @ [191:29] ==> val targetBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[LocalVariableDescriptor]

'jumpWithFinally' @ [192:9] ==> private final fun jumpWithFinally(targetTryDepth: Int, successor: CoroutineBlock, fromNode: JsNode): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'targetTryDepth' @ [192:25] ==> val targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[LocalVariableDescriptor]

'targetBlock' @ [192:45] ==> val targetBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[LocalVariableDescriptor]

'x' @ [192:58] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitBreak[ValueParameterDescriptorImpl]

'currentStatements' @ [193:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'jump' @ [193:30] ==> private final fun jump(): JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'breakContinueTargetStatements' @ [197:31] ==> private final val breakContinueTargetStatements: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [197:61] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[ValueParameterDescriptorImpl]

'component1' @ [198:14] ==> public final operator fun component1(): CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[SimpleFunctionDescriptorImpl]

'component2' @ [198:27] ==> public final operator fun component2(): Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[SimpleFunctionDescriptorImpl]

'continueTargets' @ [198:45] ==> private final val continueTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'targetStatement' @ [198:61] ==> val targetStatement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[LocalVariableDescriptor]

'referencedBlocks' @ [199:9] ==> private final val referencedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'targetBlock' @ [199:29] ==> val targetBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[LocalVariableDescriptor]

'jumpWithFinally' @ [200:9] ==> private final fun jumpWithFinally(targetTryDepth: Int, successor: CoroutineBlock, fromNode: JsNode): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'targetTryDepth' @ [200:25] ==> val targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[LocalVariableDescriptor]

'targetBlock' @ [200:45] ==> val targetBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[LocalVariableDescriptor]

'x' @ [200:58] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitContinue[ValueParameterDescriptorImpl]

'currentStatements' @ [201:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'jump' @ [201:30] ==> private final fun jump(): JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'targetTryDepth' @ [209:13] ==> value-parameter targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'tryStack' @ [209:30] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'size' @ [209:39] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'tryStack' @ [210:28] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'targetTryDepth' @ [210:37] ==> value-parameter targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'currentStatements' @ [211:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'exceptionState' @ [211:34] ==> private final fun exceptionState(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'tryBlock' @ [211:49] ==> val tryBlock: CoroutineBodyTransformer.TryBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[LocalVariableDescriptor]

'catchBlock' @ [211:58] ==> public final val catchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.TryBlock[PropertyDescriptorImpl]

'fromNode' @ [211:70] ==> value-parameter fromNode: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'relativeFinallyPath' @ [214:35] ==> private final fun relativeFinallyPath(targetTryDepth: Int): List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'targetTryDepth' @ [214:55] ==> value-parameter targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'relativeFinallyPath' @ [215:24] ==> val relativeFinallyPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[LocalVariableDescriptor]

'successor' @ [215:46] ==> value-parameter successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'fullPath' @ [216:13] ==> val fullPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[LocalVariableDescriptor]

'size' @ [216:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'currentStatements' @ [217:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'updateFinallyPath' @ [217:34] ==> private final fun updateFinallyPath(path: List<CoroutineBlock>): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'fullPath' @ [217:52] ==> val fullPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[LocalVariableDescriptor]

'drop' @ [217:61] ==> public fun <T> Iterable<CoroutineBlock>.drop(n: Int): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'currentStatements' @ [219:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'state' @ [219:30] ==> private final fun state(target: CoroutineBlock, fromExpression: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'fullPath' @ [219:36] ==> val fullPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[LocalVariableDescriptor]

'fromNode' @ [219:49] ==> value-parameter fromNode: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.jumpWithFinally[ValueParameterDescriptorImpl]

'splitIfNecessary' @ [222:39] ==> private final inline fun splitIfNecessary(statement: JsStatement, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [222:56] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'x' @ [223:25] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'catches' @ [223:27] ==> public final val JsTry.catches: (MutableList<(JsCatch..JsCatch?)>..List<(JsCatch..JsCatch?)>?)[MyPropertyDescriptor]

'firstOrNull' @ [223:35] ==> public fun <T> List<(JsCatch..JsCatch?)>.firstOrNull(): JsCatch? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsCatch..org.jetbrains.kotlin.js.backend.ast.JsCatch?)

'x' @ [224:27] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'finallyBlock' @ [224:29] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'CoroutineBlock' @ [225:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [227:26] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'CoroutineBlock' @ [228:28] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'tryStack' @ [230:9] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'TryBlock' @ [230:21] ==> public constructor TryBlock(catchBlock: CoroutineBlock, finallyBlock: CoroutineBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.TryBlock[ClassConstructorDescriptorImpl]

'catchBlock' @ [230:30] ==> val catchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'if (finallyNode != null) finallyBlock else null' @ [230:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoroutineBlock?, elseBranch: CoroutineBlock?): CoroutineBlock?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoroutineBlock?

'finallyNode' @ [230:46] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'finallyBlock' @ [230:67] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentCatchBlock' @ [232:29] ==> private final var currentCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'currentCatchBlock' @ [233:9] ==> private final var currentCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'catchBlock' @ [233:29] ==> val catchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [234:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'exceptionState' @ [234:30] ==> private final fun exceptionState(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'catchBlock' @ [234:45] ==> val catchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [234:57] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'x' @ [236:9] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'tryBlock' @ [236:11] ==> public final var JsTry.tryBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'statements' @ [236:20] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'forEach' @ [236:31] ==> @HidesMembers public inline fun <T> Iterable<(JsStatement..JsStatement?)>.forEach(action: ((JsStatement..JsStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [236:41] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [236:44] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [236:51] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'currentStatements' @ [238:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'exceptionState' @ [238:30] ==> private final fun exceptionState(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'oldCatchBlock' @ [238:45] ==> val oldCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [238:60] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'currentCatchBlock' @ [239:9] ==> private final var currentCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'oldCatchBlock' @ [239:29] ==> val oldCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'if (finallyNode != null) {
            currentStatements += updateFinallyPath(listOf(successor))
            currentStatements += stateAndJump(finallyBlock, x)
        }
        else {
            currentStatements += stateAndJump(successor, x)
        }' @ [241:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'finallyNode' @ [241:13] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [242:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'updateFinallyPath' @ [242:34] ==> private final fun updateFinallyPath(path: List<CoroutineBlock>): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'listOf' @ [242:52] ==> public fun <T> listOf(element: CoroutineBlock): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'successor' @ [242:59] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [243:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [243:34] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'finallyBlock' @ [243:47] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [243:61] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'currentStatements' @ [246:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [246:34] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [246:47] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [246:58] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'currentBlock' @ [250:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'catchBlock' @ [250:24] ==> val catchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'if (finallyNode != null) {
            currentStatements += updateFinallyPath(listOf(oldCatchBlock))
            currentStatements += if (catchNode != null) exceptionState(finallyBlock, x) else stateAndJump(finallyBlock, x)
        }
        else {
            currentStatements += if (catchNode != null) exceptionState(oldCatchBlock, x) else stateAndJump(oldCatchBlock, x)
        }' @ [252:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'finallyNode' @ [252:13] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [253:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'updateFinallyPath' @ [253:34] ==> private final fun updateFinallyPath(path: List<CoroutineBlock>): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'listOf' @ [253:52] ==> public fun <T> listOf(element: CoroutineBlock): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'oldCatchBlock' @ [253:59] ==> val oldCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [254:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'if (catchNode != null) exceptionState(finallyBlock, x) else stateAndJump(finallyBlock, x)' @ [254:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<JsStatement>, elseBranch: List<JsStatement>): List<JsStatement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<JsStatement>

'catchNode' @ [254:38] ==> val catchNode: JsCatch? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'exceptionState' @ [254:57] ==> private final fun exceptionState(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'finallyBlock' @ [254:72] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [254:86] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'stateAndJump' @ [254:94] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'finallyBlock' @ [254:107] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [254:121] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'currentStatements' @ [257:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'if (catchNode != null) exceptionState(oldCatchBlock, x) else stateAndJump(oldCatchBlock, x)' @ [257:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<JsStatement>, elseBranch: List<JsStatement>): List<JsStatement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<JsStatement>

'catchNode' @ [257:38] ==> val catchNode: JsCatch? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'exceptionState' @ [257:57] ==> private final fun exceptionState(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'oldCatchBlock' @ [257:72] ==> val oldCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [257:87] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'stateAndJump' @ [257:95] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'oldCatchBlock' @ [257:108] ==> val oldCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [257:123] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'catchNode' @ [260:13] ==> val catchNode: JsCatch? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [261:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'newVar' @ [261:45] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'catchNode' @ [261:52] ==> val catchNode: JsCatch? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'parameter' @ [261:62] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [261:72] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'JsNameRef' @ [261:78] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [262:21] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [262:29] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionName' @ [262:38] ==> public final val exceptionName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [262:64] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'catchNode' @ [263:13] ==> val catchNode: JsCatch? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'body' @ [263:23] ==> public final var JsCatch.body: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'statements' @ [263:28] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'forEach' @ [263:39] ==> @HidesMembers public inline fun <T> Iterable<(JsStatement..JsStatement?)>.forEach(action: ((JsStatement..JsStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [263:49] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [263:52] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [263:59] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'if (finallyNode == null) {
                currentStatements += stateAndJump(successor, x)
            }
            else {
                currentStatements += updateFinallyPath(listOf(successor))
                currentStatements += stateAndJump(finallyBlock, x)
            }' @ [265:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'finallyNode' @ [265:17] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [266:17] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [266:38] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'successor' @ [266:51] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [266:62] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'currentStatements' @ [269:17] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'updateFinallyPath' @ [269:38] ==> private final fun updateFinallyPath(path: List<CoroutineBlock>): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'listOf' @ [269:56] ==> public fun <T> listOf(element: CoroutineBlock): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'successor' @ [269:63] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentStatements' @ [270:17] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'stateAndJump' @ [270:38] ==> private final fun stateAndJump(target: CoroutineBlock, fromNode: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'finallyBlock' @ [270:51] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'x' @ [270:65] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry[ValueParameterDescriptorImpl]

'finallyNode' @ [275:13] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'currentBlock' @ [276:13] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'finallyBlock' @ [276:28] ==> val finallyBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'finallyNode' @ [277:13] ==> val finallyNode: (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'statements' @ [277:25] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'forEach' @ [277:36] ==> @HidesMembers public inline fun <T> Iterable<(JsStatement..JsStatement?)>.forEach(action: ((JsStatement..JsStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [277:46] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [277:49] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [277:56] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[LazyClassReceiverParameterDescriptor]

'generateFinallyExit' @ [278:13] ==> private final fun generateFinallyExit(): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'hasFinallyBlocks' @ [279:13] ==> public final var hasFinallyBlocks: Boolean defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'tryStack' @ [282:9] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'removeAt' @ [282:18] ==> public abstract fun removeAt(index: Int): CoroutineBodyTransformer.TryBlock defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tryStack' @ [282:27] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'lastIndex' @ [282:36] ==> public val <T> List<CoroutineBodyTransformer.TryBlock>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TryBlock

'currentBlock' @ [284:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'successor' @ [284:24] ==> val successor: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitTry.<anonymous>[LocalVariableDescriptor]

'JsNameRef' @ [291:30] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [291:40] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [291:48] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'finallyPathName' @ [291:57] ==> public final val finallyPathName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [291:85] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [292:24] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [292:34] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [292:42] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'stateName' @ [292:51] ==> public final val stateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [292:73] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsInvocation' @ [293:25] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'JsNameRef' @ [293:38] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'finallyPathRef' @ [293:57] ==> val finallyPathRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.generateFinallyExit[LocalVariableDescriptor]

'currentStatements' @ [294:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'assignment' @ [294:41] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'stateRef' @ [294:52] ==> val stateRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.generateFinallyExit[LocalVariableDescriptor]

'nextState' @ [294:62] ==> val nextState: JsInvocation defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.generateFinallyExit[LocalVariableDescriptor]

'makeStmt' @ [294:73] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'currentStatements' @ [295:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'jump' @ [295:30] ==> private final fun jump(): JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'x' @ [299:26] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [299:28] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'handleExpression' @ [300:31] ==> private final fun handleExpression(expression: JsExpression): JsExpression? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [300:48] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[LocalVariableDescriptor]

'if (splitExpression == expression) {
            currentStatements += x
        }
        else if (splitExpression != null) {
            currentStatements += JsExpressionStatement(splitExpression).apply { synthetic = true }
        }' @ [301:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'splitExpression' @ [301:13] ==> val splitExpression: JsExpression? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[LocalVariableDescriptor]

'expression' @ [301:32] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[LocalVariableDescriptor]

'currentStatements' @ [302:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [302:34] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[ValueParameterDescriptorImpl]

'splitExpression' @ [304:18] ==> val splitExpression: JsExpression? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[LocalVariableDescriptor]

'currentStatements' @ [305:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'JsExpressionStatement' @ [305:34] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'splitExpression' @ [305:56] ==> val splitExpression: JsExpression? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitExpressionStatement[LocalVariableDescriptor]

'apply' @ [305:73] ==> @InlineOnly public inline fun <T> JsExpressionStatement.apply(block: JsExpressionStatement.() -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'synthetic' @ [305:81] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'currentStatements' @ [310:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [310:30] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitVars[ValueParameterDescriptorImpl]

'hasEnclosingFinallyBlock' @ [314:27] ==> private final fun hasEnclosingFinallyBlock(): Boolean defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'if (isInFinally) {
            val returnBlock = CoroutineBlock()
            jumpWithFinally(0, returnBlock, x)
            val returnExpression = x.expression
            val returnFieldRef = if (returnExpression != null) {
                val ref = JsNameRef(context.returnValueFieldName, JsAstUtils.stateMachineReceiver())
                currentStatements += JsAstUtils.assignment(ref, x.expression).makeStmt()
                ref
            }
            else {
                null
            }
            currentStatements += jump()

            currentBlock = returnBlock
            currentStatements += JsReturn(returnFieldRef?.deepCopy())
        }
        else {
            currentStatements += x
        }' @ [315:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isInFinally' @ [315:13] ==> val isInFinally: Boolean defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'CoroutineBlock' @ [316:31] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'jumpWithFinally' @ [317:13] ==> private final fun jumpWithFinally(targetTryDepth: Int, successor: CoroutineBlock, fromNode: JsNode): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'returnBlock' @ [317:32] ==> val returnBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'x' @ [317:45] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[ValueParameterDescriptorImpl]

'x' @ [318:36] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[ValueParameterDescriptorImpl]

'expression' @ [318:38] ==> public final var JsReturn.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'if (returnExpression != null) {
                val ref = JsNameRef(context.returnValueFieldName, JsAstUtils.stateMachineReceiver())
                currentStatements += JsAstUtils.assignment(ref, x.expression).makeStmt()
                ref
            }
            else {
                null
            }' @ [319:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef?, elseBranch: JsNameRef?): JsNameRef?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef?

'returnExpression' @ [319:38] ==> val returnExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'JsNameRef' @ [320:27] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [320:37] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'returnValueFieldName' @ [320:45] ==> public final val returnValueFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'stateMachineReceiver' @ [320:78] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'currentStatements' @ [321:17] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'assignment' @ [321:49] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'ref' @ [321:60] ==> val ref: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'x' @ [321:65] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[ValueParameterDescriptorImpl]

'expression' @ [321:67] ==> public final var JsReturn.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'makeStmt' @ [321:79] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'ref' @ [322:17] ==> val ref: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'currentStatements' @ [327:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'jump' @ [327:34] ==> private final fun jump(): JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'currentBlock' @ [329:13] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'returnBlock' @ [329:28] ==> val returnBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'currentStatements' @ [330:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'JsReturn' @ [330:34] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'returnFieldRef' @ [330:43] ==> val returnFieldRef: JsNameRef? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[LocalVariableDescriptor]

'deepCopy' @ [330:59] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'currentStatements' @ [333:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [333:34] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitReturn[ValueParameterDescriptorImpl]

'currentStatements' @ [338:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'x' @ [338:30] ==> value-parameter x: JsThrow defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.visitThrow[ValueParameterDescriptorImpl]

'decomposeAssignment' @ [342:37] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'expression' @ [342:57] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'if (assignment != null) {
            val rhs = assignment.second
            if (rhs.isSuspend) {
                handleSuspend(expression, rhs)
                return null
            }
        }
        else if (expression.isSuspend) {
            handleSuspend(expression, expression)
            return null
        }' @ [343:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'assignment' @ [343:13] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[LocalVariableDescriptor]

'assignment' @ [344:23] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[LocalVariableDescriptor]

'second' @ [344:34] ==> public final val second: (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'rhs' @ [345:17] ==> val rhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[LocalVariableDescriptor]

'isSuspend' @ [345:21] ==> public var JsExpression.isSuspend: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'handleSuspend' @ [346:17] ==> private final fun handleSuspend(invocation: JsExpression, sourceNode: JsExpression): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [346:31] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'rhs' @ [346:43] ==> val rhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[LocalVariableDescriptor]

'expression' @ [350:18] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'isSuspend' @ [350:29] ==> public var JsExpression.isSuspend: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'handleSuspend' @ [351:13] ==> private final fun handleSuspend(invocation: JsExpression, sourceNode: JsExpression): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [351:27] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'expression' @ [351:39] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'expression' @ [354:16] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleExpression[ValueParameterDescriptorImpl]

'sourceNode' @ [358:19] ==> value-parameter sourceNode: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[ValueParameterDescriptorImpl]

'source' @ [358:30] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'invocation' @ [358:40] ==> value-parameter invocation: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[ValueParameterDescriptorImpl]

'source' @ [358:51] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'CoroutineBlock' @ [360:25] ==> public constructor CoroutineBlock() defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[ClassConstructorDescriptorImpl]

'currentStatements' @ [361:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'state' @ [361:30] ==> private final fun state(target: CoroutineBlock, fromExpression: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'nextBlock' @ [361:36] ==> val nextBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'invocation' @ [361:47] ==> value-parameter invocation: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[ValueParameterDescriptorImpl]

'JsNameRef' @ [363:25] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [363:35] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [363:43] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'resultName' @ [363:52] ==> public final val resultName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [363:75] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'apply' @ [363:99] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'sideEffects' @ [364:13] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'DEPENDS_ON_STATE' @ [364:42] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'assignment' @ [366:46] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'resultRef' @ [366:57] ==> val resultRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'invocation' @ [366:68] ==> value-parameter invocation: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[ValueParameterDescriptorImpl]

'makeStmt' @ [366:80] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'equality' @ [367:43] ==> @NotNull public open fun equality(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'resultRef' @ [367:52] ==> val resultRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'deepCopy' @ [367:62] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'context' @ [367:74] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [367:82] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'suspendObjectRef' @ [367:91] ==> public final val suspendObjectRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'deepCopy' @ [367:108] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'source' @ [367:120] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'psi' @ [367:127] ==> val psi: (Any..Any?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'JsIf' @ [368:31] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'suspendCondition' @ [368:36] ==> val suspendCondition: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'JsReturn' @ [368:54] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'context' @ [368:63] ==> private final val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'metadata' @ [368:71] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'suspendObjectRef' @ [368:80] ==> public final val suspendObjectRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'deepCopy' @ [368:97] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'source' @ [368:108] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'psi' @ [368:115] ==> val psi: (Any..Any?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'currentStatements' @ [369:9] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'listOf' @ [369:30] ==> public fun <T> listOf(vararg elements: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'invocationStatement' @ [369:37] ==> val invocationStatement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'suspendIfNeeded' @ [369:58] ==> val suspendIfNeeded: JsIf defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'JsBreak' @ [369:75] ==> public constructor JsBreak() defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'apply' @ [369:85] ==> @InlineOnly public inline fun <T> JsBreak.apply(block: JsBreak.() -> Unit): JsBreak defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsBreak

'source' @ [369:93] ==> public final var JsBreak.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [369:102] ==> val psi: (Any..Any?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'currentBlock' @ [370:9] ==> private final var currentBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'nextBlock' @ [370:24] ==> val nextBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.handleSuspend[LocalVariableDescriptor]

'JsDebugger' @ [374:27] ==> public constructor JsDebugger() defined in org.jetbrains.kotlin.js.backend.ast.JsDebugger[JavaClassConstructorDescriptor]

'placeholder' @ [375:9] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.state[LocalVariableDescriptor]

'targetBlock' @ [375:21] ==> public var JsDebugger.targetBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'target' @ [375:35] ==> value-parameter target: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.state[ValueParameterDescriptorImpl]

'placeholder' @ [376:9] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.state[LocalVariableDescriptor]

'source' @ [376:21] ==> public final var JsDebugger.source: (Any..Any?)[MyPropertyDescriptor]

'fromExpression' @ [376:30] ==> value-parameter fromExpression: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.state[ValueParameterDescriptorImpl]

'source' @ [376:45] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'listOf' @ [378:16] ==> public fun <T> listOf(element: JsDebugger): List<JsDebugger> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsDebugger

'placeholder' @ [378:23] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.state[LocalVariableDescriptor]

'JsContinue' @ [381:26] ==> public constructor JsContinue() defined in org.jetbrains.kotlin.js.backend.ast.JsContinue[JavaClassConstructorDescriptor]

'state' @ [384:16] ==> private final fun state(target: CoroutineBlock, fromExpression: JsNode): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'target' @ [384:22] ==> value-parameter target: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.stateAndJump[ValueParameterDescriptorImpl]

'fromNode' @ [384:30] ==> value-parameter fromNode: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.stateAndJump[ValueParameterDescriptorImpl]

'jump' @ [384:42] ==> private final fun jump(): JsContinue defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'JsDebugger' @ [388:27] ==> public constructor JsDebugger() defined in org.jetbrains.kotlin.js.backend.ast.JsDebugger[JavaClassConstructorDescriptor]

'placeholder' @ [389:9] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.exceptionState[LocalVariableDescriptor]

'targetExceptionBlock' @ [389:21] ==> public var JsDebugger.targetExceptionBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'target' @ [389:44] ==> value-parameter target: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.exceptionState[ValueParameterDescriptorImpl]

'placeholder' @ [390:9] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.exceptionState[LocalVariableDescriptor]

'source' @ [390:21] ==> public final var JsDebugger.source: (Any..Any?)[MyPropertyDescriptor]

'fromNode' @ [390:30] ==> value-parameter fromNode: JsNode defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.exceptionState[ValueParameterDescriptorImpl]

'listOf' @ [392:16] ==> public fun <T> listOf(element: JsDebugger): List<JsDebugger> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsDebugger

'placeholder' @ [392:23] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.exceptionState[LocalVariableDescriptor]

'JsDebugger' @ [396:27] ==> public constructor JsDebugger() defined in org.jetbrains.kotlin.js.backend.ast.JsDebugger[JavaClassConstructorDescriptor]

'placeholder' @ [397:9] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.updateFinallyPath[LocalVariableDescriptor]

'finallyPath' @ [397:21] ==> public var JsDebugger.finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'path' @ [397:35] ==> value-parameter path: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.updateFinallyPath[ValueParameterDescriptorImpl]

'listOf' @ [398:16] ==> public fun <T> listOf(element: JsDebugger): List<JsDebugger> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsDebugger

'placeholder' @ [398:23] ==> val placeholder: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.updateFinallyPath[LocalVariableDescriptor]

'if (statement in nodesToSplit) {
            action()
        }
        else {
            currentStatements += statement
        }' @ [402:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statement' @ [402:13] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.splitIfNecessary[ValueParameterDescriptorImpl]

'nodesToSplit' @ [402:26] ==> private final lateinit var nodesToSplit: Set<JsNode> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'invoke' @ [403:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'currentStatements' @ [406:13] ==> private final val currentStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statement' @ [406:34] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.splitIfNecessary[ValueParameterDescriptorImpl]

'breakTargets' @ [416:9] ==> private final val breakTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statement' @ [416:22] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'JumpTarget' @ [416:35] ==> public constructor JumpTarget(block: CoroutineBlock, tryDepth: Int) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[ClassConstructorDescriptorImpl]

'breakBlock' @ [416:46] ==> value-parameter breakBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'currentTryDepth' @ [416:58] ==> private final val currentTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'continueBlock' @ [417:13] ==> value-parameter continueBlock: CoroutineBlock? = ... defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargets' @ [418:13] ==> private final val continueTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'statement' @ [418:29] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'JumpTarget' @ [418:42] ==> public constructor JumpTarget(block: CoroutineBlock, tryDepth: Int) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.JumpTarget[ClassConstructorDescriptorImpl]

'continueBlock' @ [418:53] ==> value-parameter continueBlock: CoroutineBlock? = ... defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'currentTryDepth' @ [418:68] ==> private final val currentTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'invoke' @ [421:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'breakTargets' @ [423:9] ==> private final val breakTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'keys' @ [423:22] ==> public abstract val keys: MutableSet<JsStatement> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'statement' @ [423:30] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargets' @ [424:9] ==> private final val continueTargets: MutableMap<JsStatement, CoroutineBodyTransformer.JumpTarget> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'keys' @ [424:25] ==> public abstract val keys: MutableSet<JsStatement> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'statement' @ [424:33] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.withBreakAndContinue[ValueParameterDescriptorImpl]

'tryStack' @ [427:60] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'subList' @ [428:14] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<CoroutineBodyTransformer.TryBlock> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'targetTryDepth' @ [428:22] ==> value-parameter targetTryDepth: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.relativeFinallyPath[ValueParameterDescriptorImpl]

'tryStack' @ [428:38] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'size' @ [428:47] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'mapNotNull' @ [429:14] ==> public inline fun <T, R : Any> Iterable<CoroutineBodyTransformer.TryBlock>.mapNotNull(transform: (CoroutineBodyTransformer.TryBlock) -> CoroutineBlock?): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TryBlock
    <R : Any> -> CoroutineBlock

'it' @ [429:27] ==> value-parameter it: CoroutineBodyTransformer.TryBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.relativeFinallyPath.<anonymous>[ValueParameterDescriptorImpl]

'finallyBlock' @ [429:30] ==> public final val finallyBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.TryBlock[PropertyDescriptorImpl]

'reversed' @ [430:14] ==> public fun <T> Iterable<CoroutineBlock>.reversed(): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'tryStack' @ [432:46] ==> private final val tryStack: MutableList<CoroutineBodyTransformer.TryBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[PropertyDescriptorImpl]

'any' @ [432:55] ==> public inline fun <T> Iterable<CoroutineBodyTransformer.TryBlock>.any(predicate: (CoroutineBodyTransformer.TryBlock) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TryBlock

'it' @ [432:61] ==> value-parameter it: CoroutineBodyTransformer.TryBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.hasEnclosingFinallyBlock.<anonymous>[ValueParameterDescriptorImpl]

'finallyBlock' @ [432:64] ==> public final val finallyBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer.TryBlock[PropertyDescriptorImpl]

