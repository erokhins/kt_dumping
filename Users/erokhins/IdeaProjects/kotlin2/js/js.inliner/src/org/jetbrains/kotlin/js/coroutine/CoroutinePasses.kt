'this' @ [26:16] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[ReceiverParameterDescriptorImpl]

'mutableSetOf' @ [27:17] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'RecursiveJsVisitor' @ [29:28] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [34:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [34:19] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [34:44] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'if (x.expression.isSuspend) {
                nodes += x.expression
                childrenInSet = true
            }
            else {
                val assignment = JsAstUtils.decomposeAssignment(x.expression)
                if (assignment != null && assignment.second.isSuspend) {
                    nodes += assignment.second
                    childrenInSet = true
                }
            }' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'x' @ [35:17] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [35:19] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'isSuspend' @ [35:30] ==> public var JsExpression.isSuspend: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'nodes' @ [36:17] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'x' @ [36:26] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [36:28] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'childrenInSet' @ [37:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'decomposeAssignment' @ [40:45] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [40:65] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [40:67] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'assignment' @ [41:21] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'assignment' @ [41:43] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'second' @ [41:54] ==> public final val second: (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'isSuspend' @ [41:61] ==> public var JsExpression.isSuspend: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'nodes' @ [42:21] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'assignment' @ [42:30] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'second' @ [42:41] ==> public final val second: (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'childrenInSet' @ [43:21] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'super' @ [49:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [49:19] ==> public open fun visitReturn(x: JsReturn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [49:31] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'root' @ [51:17] ==> val root: JsNode defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'nodes' @ [51:25] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'finallyLevel' @ [51:34] ==> public final var finallyLevel: Int defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'nodes' @ [52:17] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'x' @ [52:26] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'childrenInSet' @ [53:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'super' @ [62:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitBreak' @ [62:19] ==> public open fun visitBreak(x: JsBreak): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [62:30] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'breakContinueTargets' @ [64:31] ==> value-parameter breakContinueTargets: Map<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[ValueParameterDescriptorImpl]

'x' @ [64:52] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'breakTarget' @ [65:17] ==> val breakTarget: JsStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitBreak[LocalVariableDescriptor]

'nodes' @ [65:32] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'nodes' @ [66:17] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'x' @ [66:26] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'childrenInSet' @ [67:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'super' @ [72:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitContinue' @ [72:19] ==> public open fun visitContinue(x: JsContinue): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [72:33] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'breakContinueTargets' @ [74:34] ==> value-parameter breakContinueTargets: Map<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[ValueParameterDescriptorImpl]

'x' @ [74:55] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'continueTarget' @ [75:17] ==> val continueTarget: JsStatement defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitContinue[LocalVariableDescriptor]

'nodes' @ [75:35] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'nodes' @ [76:17] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'x' @ [76:26] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'childrenInSet' @ [77:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'x' @ [82:17] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitTry[ValueParameterDescriptorImpl]

'finallyBlock' @ [82:19] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'finallyLevel' @ [83:17] ==> public final var finallyLevel: Int defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'super' @ [85:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitTry' @ [85:19] ==> public open fun visitTry(x: JsTry): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [85:28] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitTry[ValueParameterDescriptorImpl]

'x' @ [86:17] ==> value-parameter x: JsTry defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitTry[ValueParameterDescriptorImpl]

'finallyBlock' @ [86:19] ==> public final var JsTry.finallyBlock: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'finallyLevel' @ [87:17] ==> public final var finallyLevel: Int defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'childrenInSet' @ [92:36] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'childrenInSet' @ [93:13] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'node' @ [95:13] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [95:18] ==> public abstract fun acceptChildren(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'this' @ [95:33] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[LazyClassReceiverParameterDescriptor]

'if (childrenInSet) {
                nodes += node
            }
            else {
                childrenInSet = oldChildrenInSet
            }' @ [97:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'childrenInSet' @ [97:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'nodes' @ [98:17] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'node' @ [98:26] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'childrenInSet' @ [101:17] ==> public final var childrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[PropertyDescriptorImpl]

'oldChildrenInSet' @ [101:33] ==> val oldChildrenInSet: Boolean defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>.visitElement[LocalVariableDescriptor]

'nodes' @ [107:27] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'size' @ [107:33] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'visitor' @ [108:9] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'accept' @ [108:17] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'this' @ [108:24] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[ReceiverParameterDescriptorImpl]

'nodes' @ [109:26] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'size' @ [109:32] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'countAfter' @ [110:13] ==> val countAfter: Int defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'countBefore' @ [110:27] ==> val countBefore: Int defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'nodes' @ [113:12] ==> val nodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.coroutine.collectNodesToSplit[LocalVariableDescriptor]

'withIndex' @ [117:24] ==> public fun <T> Iterable<CoroutineBlock>.withIndex(): Iterable<IndexedValue<CoroutineBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'associate' @ [117:36] ==> public inline fun <T, K, V> Iterable<IndexedValue<CoroutineBlock>>.associate(transform: (IndexedValue<CoroutineBlock>) -> Pair<CoroutineBlock, Int>): Map<CoroutineBlock, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<CoroutineBlock>
    <K> -> CoroutineBlock
    <V> -> Int

'component1' @ [117:49] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [117:56] ==> public final operator fun component2(): CoroutineBlock defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'Pair' @ [117:66] ==> public constructor Pair<out A, out B>(first: CoroutineBlock, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CoroutineBlock
    <out B> -> Int

'block' @ [117:71] ==> val block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<anonymous>[LocalVariableDescriptor]

'index' @ [117:78] ==> val index: Int defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<anonymous>[LocalVariableDescriptor]

'JsVisitorWithContextImpl' @ [119:44] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [121:26] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'targetBlock' @ [121:28] ==> public var JsDebugger.targetBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'target' @ [122:17] ==> val target: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'JsNameRef' @ [123:27] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [123:37] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[ValueParameterDescriptorImpl]

'metadata' @ [123:45] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'stateName' @ [123:54] ==> public final val stateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [123:76] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsIntLiteral' @ [124:27] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'blockIndexes' @ [124:40] ==> val blockIndexes: Map<CoroutineBlock, Int> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[LocalVariableDescriptor]

'target' @ [124:53] ==> val target: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'ctx' @ [125:17] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [125:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpressionStatement..JsExpressionStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsExpressionStatement

'JsExpressionStatement' @ [125:31] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [125:64] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'lhs' @ [125:75] ==> val lhs: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'rhs' @ [125:80] ==> val rhs: JsIntLiteral defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'source' @ [125:85] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [125:92] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [125:94] ==> public final var JsDebugger.source: (Any..Any?)[MyPropertyDescriptor]

'apply' @ [125:103] ==> @InlineOnly public inline fun <T> JsExpressionStatement.apply(block: JsExpressionStatement.() -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'targetBlock' @ [126:21] ==> public var JsExpressionStatement.targetBlock: Boolean defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'x' @ [130:35] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'targetExceptionBlock' @ [130:37] ==> public var JsDebugger.targetExceptionBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'exceptionTarget' @ [131:17] ==> val exceptionTarget: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'JsNameRef' @ [132:27] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [132:37] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[ValueParameterDescriptorImpl]

'metadata' @ [132:45] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionStateName' @ [132:54] ==> public final val exceptionStateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [132:85] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsIntLiteral' @ [133:27] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'blockIndexes' @ [133:40] ==> val blockIndexes: Map<CoroutineBlock, Int> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[LocalVariableDescriptor]

'exceptionTarget' @ [133:53] ==> val exceptionTarget: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'ctx' @ [134:17] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [134:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpressionStatement..JsExpressionStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsExpressionStatement

'JsExpressionStatement' @ [134:31] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [134:64] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'lhs' @ [134:75] ==> val lhs: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'rhs' @ [134:80] ==> val rhs: JsIntLiteral defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'source' @ [134:85] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [134:92] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [134:94] ==> public final var JsDebugger.source: (Any..Any?)[MyPropertyDescriptor]

'apply' @ [134:103] ==> @InlineOnly public inline fun <T> JsExpressionStatement.apply(block: JsExpressionStatement.() -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'targetExceptionBlock' @ [135:21] ==> public var JsExpressionStatement.targetExceptionBlock: Boolean defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'x' @ [139:31] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'finallyPath' @ [139:33] ==> public var JsDebugger.finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'finallyPath' @ [140:17] ==> val finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'if (finallyPath.isNotEmpty()) {
                    val lhs = JsNameRef(context.metadata.finallyPathName, JsAstUtils.stateMachineReceiver())
                    val rhs = JsArrayLiteral(finallyPath.map { JsIntLiteral(blockIndexes[it]!!) })
                    ctx.replaceMe(JsExpressionStatement(JsAstUtils.assignment(lhs, rhs).source(x.source)).apply {
                        this.finallyPath = true
                    })
                }
                else {
                    ctx.removeMe()
                }' @ [141:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'finallyPath' @ [141:21] ==> val finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'isNotEmpty' @ [141:33] ==> @InlineOnly public inline fun <T> Collection<CoroutineBlock>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'JsNameRef' @ [142:31] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [142:41] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[ValueParameterDescriptorImpl]

'metadata' @ [142:49] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'finallyPathName' @ [142:58] ==> public final val finallyPathName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'stateMachineReceiver' @ [142:86] ==> @NotNull public open fun stateMachineReceiver(): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsArrayLiteral' @ [143:31] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'finallyPath' @ [143:46] ==> val finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'map' @ [143:58] ==> public inline fun <T, R> Iterable<CoroutineBlock>.map(transform: (CoroutineBlock) -> JsIntLiteral): List<JsIntLiteral> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock
    <R> -> JsIntLiteral

'JsIntLiteral' @ [143:64] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'blockIndexes' @ [143:77] ==> val blockIndexes: Map<CoroutineBlock, Int> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[LocalVariableDescriptor]

'it' @ [143:90] ==> value-parameter it: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'ctx' @ [144:21] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [144:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpressionStatement..JsExpressionStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsExpressionStatement

'JsExpressionStatement' @ [144:35] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [144:68] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'lhs' @ [144:79] ==> val lhs: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'rhs' @ [144:84] ==> val rhs: JsArrayLiteral defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[LocalVariableDescriptor]

'source' @ [144:89] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [144:96] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [144:98] ==> public final var JsDebugger.source: (Any..Any?)[MyPropertyDescriptor]

'apply' @ [144:107] ==> @InlineOnly public inline fun <T> JsExpressionStatement.apply(block: JsExpressionStatement.() -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'this' @ [145:25] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit.<anonymous>[ReceiverParameterDescriptorImpl]

'finallyPath' @ [145:30] ==> public var JsExpressionStatement.finallyPath: Boolean defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'ctx' @ [149:21] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'removeMe' @ [149:25] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'forEach' @ [154:12] ==> @HidesMembers public inline fun <T> Iterable<CoroutineBlock>.forEach(action: (CoroutineBlock) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'blockReplacementVisitor' @ [154:22] ==> val blockReplacementVisitor: <no name provided> defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements[LocalVariableDescriptor]

'accept' @ [154:46] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsBlock..JsBlock?)): (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsBlock

'it' @ [154:53] ==> value-parameter it: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.replaceCoroutineFlowStatements.<anonymous>[ValueParameterDescriptorImpl]

'jsBlock' @ [154:56] ==> public final val jsBlock: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'mutableSetOf' @ [160:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'mutableMapOf' @ [161:17] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CoroutineBlock
    <V> -> MutableSet<CoroutineBlock>

'block' @ [164:13] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'visitedBlocks' @ [164:22] ==> val visitedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'block' @ [166:29] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'collectFinallyPaths' @ [166:35] ==> private fun CoroutineBlock.collectFinallyPaths(): List<List<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine[SimpleFunctionDescriptorImpl]

'component1' @ [167:19] ==> public final operator fun component1(): CoroutineBlock defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [167:34] ==> public final operator fun component2(): CoroutineBlock defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'iterator' @ [167:52] ==> public abstract fun iterator(): Iterator<Pair<CoroutineBlock, CoroutineBlock>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [167:53] ==> public fun <T> listOf(element: CoroutineBlock): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'block' @ [167:60] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'finallyPath' @ [167:69] ==> val finallyPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'zip' @ [167:82] ==> public infix fun <T, R> Iterable<CoroutineBlock>.zip(other: Iterable<CoroutineBlock>): List<Pair<CoroutineBlock, CoroutineBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock
    <R> -> CoroutineBlock

'finallyPath' @ [167:86] ==> val finallyPath: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'graph' @ [168:21] ==> val graph: MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'getOrPut' @ [168:27] ==> public inline fun <K, V> MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>>.getOrPut(key: CoroutineBlock, defaultValue: () -> MutableSet<CoroutineBlock>): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CoroutineBlock
    <V> -> MutableSet<CoroutineBlock>

'finallySource' @ [168:36] ==> val finallySource: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'mutableSetOf' @ [168:53] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'add' @ [168:70] ==> public abstract fun add(element: CoroutineBlock): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'finallyTarget' @ [168:74] ==> val finallyTarget: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'visitedBlocks' @ [169:21] ==> val visitedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'finallySource' @ [169:38] ==> val finallySource: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'visitedBlocks' @ [174:9] ==> val visitedBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'block' @ [174:26] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'graph' @ [176:26] ==> val graph: MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'getOrPut' @ [176:32] ==> public inline fun <K, V> MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>>.getOrPut(key: CoroutineBlock, defaultValue: () -> MutableSet<CoroutineBlock>): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CoroutineBlock
    <V> -> MutableSet<CoroutineBlock>

'block' @ [176:41] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'mutableSetOf' @ [176:50] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'successors' @ [177:9] ==> val successors: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'block' @ [177:23] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'collectTargetBlocks' @ [177:29] ==> private fun CoroutineBlock.collectTargetBlocks(): Set<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine[SimpleFunctionDescriptorImpl]

'block' @ [178:13] ==> value-parameter block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[ValueParameterDescriptorImpl]

'this' @ [178:22] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[ReceiverParameterDescriptorImpl]

'globalCatchBlock' @ [178:30] ==> value-parameter globalCatchBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.buildGraph[ValueParameterDescriptorImpl]

'successors' @ [179:13] ==> val successors: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'globalCatchBlock' @ [179:27] ==> value-parameter globalCatchBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine.buildGraph[ValueParameterDescriptorImpl]

'successors' @ [181:9] ==> val successors: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.buildGraph.visitBlock[LocalVariableDescriptor]

'forEach' @ [181:20] ==> @HidesMembers public inline fun <T> Iterable<CoroutineBlock>.forEach(action: (CoroutineBlock) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'visitBlock' @ [184:5] ==> local final fun visitBlock(block: CoroutineBlock): Unit defined in org.jetbrains.kotlin.js.coroutine.buildGraph[SimpleFunctionDescriptorImpl]

'this' @ [184:16] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[ReceiverParameterDescriptorImpl]

'graph' @ [186:12] ==> val graph: MutableMap<CoroutineBlock, MutableSet<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.buildGraph[LocalVariableDescriptor]

'mutableSetOf' @ [190:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'jsBlock' @ [191:5] ==> public final val jsBlock: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'accept' @ [191:13] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [191:29] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'targetBlocks' @ [193:13] ==> val targetBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.collectTargetBlocks[LocalVariableDescriptor]

'listOfNotNull' @ [193:29] ==> public fun <T : Any> listOfNotNull(element: CoroutineBlock?): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CoroutineBlock

'x' @ [193:43] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.collectTargetBlocks.<no name provided>.visitDebugger[ValueParameterDescriptorImpl]

'targetExceptionBlock' @ [193:45] ==> public var JsDebugger.targetExceptionBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'listOfNotNull' @ [193:69] ==> public fun <T : Any> listOfNotNull(element: CoroutineBlock?): List<CoroutineBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CoroutineBlock

'x' @ [193:83] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.collectTargetBlocks.<no name provided>.visitDebugger[ValueParameterDescriptorImpl]

'targetBlock' @ [193:85] ==> public var JsDebugger.targetBlock: CoroutineBlock? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'targetBlocks' @ [196:12] ==> val targetBlocks: MutableSet<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.collectTargetBlocks[LocalVariableDescriptor]

'mutableListOf' @ [200:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<List<CoroutineBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<CoroutineBlock>

'jsBlock' @ [201:5] ==> public final val jsBlock: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'accept' @ [201:13] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [201:29] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [203:13] ==> value-parameter x: JsDebugger defined in org.jetbrains.kotlin.js.coroutine.collectFinallyPaths.<no name provided>.visitDebugger[ValueParameterDescriptorImpl]

'finallyPath' @ [203:15] ==> public var JsDebugger.finallyPath: List<CoroutineBlock>? defined in org.jetbrains.kotlin.js.coroutine in file CoroutineMetadataProperties.kt[PropertyDescriptorImpl]

'let' @ [203:28] ==> @InlineOnly public inline fun <T, R> List<CoroutineBlock>.let(block: (List<CoroutineBlock>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<CoroutineBlock>
    <R> -> Unit

'finallyPaths' @ [203:34] ==> val finallyPaths: MutableList<List<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.collectFinallyPaths[LocalVariableDescriptor]

'it' @ [203:50] ==> value-parameter it: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.collectFinallyPaths.<no name provided>.visitDebugger.<anonymous>[ValueParameterDescriptorImpl]

'finallyPaths' @ [206:12] ==> val finallyPaths: MutableList<List<CoroutineBlock>> defined in org.jetbrains.kotlin.js.coroutine.collectFinallyPaths[LocalVariableDescriptor]

'JsVisitorWithContextImpl' @ [210:28] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'ctx' @ [212:13] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [212:17] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsNameRef..JsNameRef?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsNameRef

'JsNameRef' @ [212:27] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [212:37] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences[ValueParameterDescriptorImpl]

'receiverFieldName' @ [212:45] ==> public final val receiverFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'JsThisRef' @ [212:64] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'when {
                x.coroutineReceiver -> {
                    ctx.replaceMe(JsThisRef())
                }

                x.coroutineController -> {
                    ctx.replaceMe(JsNameRef(context.controllerFieldName, x.qualifier).apply {
                        source = x.source
                        sideEffects = SideEffectKind.PURE
                    })
                }

                x.coroutineResult -> {
                    ctx.replaceMe(JsNameRef(context.metadata.resultName, x.qualifier).apply {
                        source = x.source
                        sideEffects = SideEffectKind.DEPENDS_ON_STATE
                    })
                }
            }' @ [218:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'x' @ [219:17] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'coroutineReceiver' @ [219:19] ==> public var JsNameRef.coroutineReceiver: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'ctx' @ [220:21] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [220:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsThisRef..JsThisRef?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsThisRef

'JsThisRef' @ [220:35] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'x' @ [223:17] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'coroutineController' @ [223:19] ==> public var JsNameRef.coroutineController: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'ctx' @ [224:21] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [224:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsNameRef..JsNameRef?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsNameRef

'JsNameRef' @ [224:35] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [224:45] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences[ValueParameterDescriptorImpl]

'controllerFieldName' @ [224:53] ==> public final val controllerFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'x' @ [224:74] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [224:76] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'apply' @ [224:87] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'source' @ [225:25] ==> public final var JsNameRef.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [225:34] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [225:36] ==> public final var JsNameRef.source: (Any..Any?)[MyPropertyDescriptor]

'sideEffects' @ [226:25] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [226:54] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'x' @ [230:17] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'coroutineResult' @ [230:19] ==> public var JsNameRef.coroutineResult: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'ctx' @ [231:21] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [231:25] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsNameRef..JsNameRef?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsNameRef

'JsNameRef' @ [231:35] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [231:45] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences[ValueParameterDescriptorImpl]

'metadata' @ [231:53] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'resultName' @ [231:62] ==> public final val resultName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'x' @ [231:74] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [231:76] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'apply' @ [231:87] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'source' @ [232:25] ==> public final var JsNameRef.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [232:34] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [232:36] ==> public final var JsNameRef.source: (Any..Any?)[MyPropertyDescriptor]

'sideEffects' @ [233:25] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'DEPENDS_ON_STATE' @ [233:54] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'visitor' @ [239:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences[LocalVariableDescriptor]

'accept' @ [239:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsBlock..JsBlock?)): (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsBlock

'this' @ [239:20] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.replaceSpecialReferences[ReceiverParameterDescriptorImpl]

'replaceSpecialReferences' @ [243:5] ==> public fun JsBlock.replaceSpecialReferences(context: CoroutineTransformationContext): Unit defined in org.jetbrains.kotlin.js.coroutine in file CoroutinePasses.kt[SimpleFunctionDescriptorImpl]

'context' @ [243:30] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'JsVisitorWithContextImpl' @ [245:28] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [249:28] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'collectFreeVariables' @ [249:30] ==> public fun JsFunction.collectFreeVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'intersect' @ [249:53] ==> public infix fun <T> Iterable<JsName>.intersect(other: Iterable<JsName>): Set<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'localVariables' @ [249:63] ==> value-parameter localVariables: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'freeVars' @ [250:17] ==> val freeVars: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'isNotEmpty' @ [250:26] ==> @InlineOnly public inline fun <T> Collection<JsName>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'JsFunction' @ [251:39] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'x' @ [251:50] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'scope' @ [251:52] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'parent' @ [251:58] ==> public final val JsFunctionScope.parent: (JsScope..JsScope?)[MyPropertyDescriptor]

'JsBlock' @ [251:66] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'JsInvocation' @ [252:41] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'wrapperFunction' @ [252:54] ==> val wrapperFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'wrapperFunction' @ [253:17] ==> val wrapperFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'body' @ [253:33] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [253:38] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsReturn' @ [253:52] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'x' @ [253:61] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'freeVars' @ [254:31] ==> val freeVars: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'associate' @ [254:40] ==> public inline fun <T, K, V> Iterable<JsName>.associate(transform: (JsName) -> Pair<JsName, JsName>): Map<JsName, JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <K> -> JsName
    <V> -> JsName

'it' @ [254:52] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'declareTemporaryName' @ [254:66] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'it' @ [254:87] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [254:90] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'freeVars' @ [255:33] ==> val freeVars: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'wrapperFunction' @ [256:21] ==> val wrapperFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'parameters' @ [256:37] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [256:51] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'nameMap' @ [256:63] ==> val nameMap: Map<JsName, JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'freeVar' @ [256:71] ==> val freeVar: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'wrapperInvocation' @ [257:21] ==> val wrapperInvocation: JsInvocation defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'arguments' @ [257:39] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'JsNameRef' @ [257:52] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [257:62] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'getFieldName' @ [257:70] ==> public final fun getFieldName(variableName: JsName): JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[SimpleFunctionDescriptorImpl]

'freeVar' @ [257:83] ==> val freeVar: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'JsThisRef' @ [257:93] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'x' @ [259:17] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'body' @ [259:19] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'replaceNames' @ [259:26] ==> public fun <T : JsNode> replaceNames(node: JsBlock, replaceMap: Map<JsName, JsExpression>): JsBlock defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsBlock

'x' @ [259:39] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'body' @ [259:41] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'nameMap' @ [259:47] ==> val nameMap: Map<JsName, JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'mapValues' @ [259:55] ==> public inline fun <K, V, R> Map<out JsName, JsName>.mapValues(transform: (Map.Entry<JsName, JsName>) -> JsNameRef): Map<JsName, JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsName
    <R> -> JsNameRef

'it' @ [259:67] ==> value-parameter it: Map.Entry<JsName, JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [259:70] ==> public abstract val value: JsName defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'makeRef' @ [259:76] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'ctx' @ [260:17] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [260:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsInvocation..JsInvocation?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsInvocation

'wrapperInvocation' @ [260:31] ==> val wrapperInvocation: JsInvocation defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'x' @ [265:17] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [265:19] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'x' @ [265:40] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'name' @ [265:42] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'localVariables' @ [265:50] ==> value-parameter localVariables: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'context' @ [266:33] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'getFieldName' @ [266:41] ==> public final fun getFieldName(variableName: JsName): JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[SimpleFunctionDescriptorImpl]

'x' @ [266:54] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'name' @ [266:56] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'ctx' @ [267:17] ==> value-parameter ctx: JsContext<in JsNode> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [267:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsNode)..CapturedType(in JsNode)?)> -> JsExpression

'JsNameRef' @ [267:31] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'fieldName' @ [267:41] ==> val fieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'JsThisRef' @ [267:52] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'source' @ [267:65] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'x' @ [267:72] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'source' @ [267:74] ==> public final var JsNameRef.source: (Any..Any?)[MyPropertyDescriptor]

'x' @ [272:31] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'vars' @ [272:33] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [272:38] ==> public inline fun <T, R : Any> Iterable<(JsVars.JsVar..JsVars.JsVar?)>.mapNotNull(transform: ((JsVars.JsVar..JsVars.JsVar?)) -> JsBinaryOperation?): List<JsBinaryOperation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)
    <R : Any> -> JsBinaryOperation

'context' @ [273:33] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ValueParameterDescriptorImpl]

'getFieldName' @ [273:41] ==> public final fun getFieldName(variableName: JsName): JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[SimpleFunctionDescriptorImpl]

'it' @ [273:54] ==> value-parameter it: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [273:57] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'it' @ [274:38] ==> value-parameter it: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'initExpression' @ [274:41] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'if (initExpression != null) {
                    JsAstUtils.assignment(JsNameRef(fieldName, JsThisRef()), it.initExpression)
                }
                else {
                    null
                }' @ [275:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsBinaryOperation?, elseBranch: JsBinaryOperation?): JsBinaryOperation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsBinaryOperation?

'initExpression' @ [275:21] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[LocalVariableDescriptor]

'assignment' @ [276:32] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [276:43] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'fieldName' @ [276:53] ==> val fieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[LocalVariableDescriptor]

'JsThisRef' @ [276:64] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'it' @ [276:78] ==> value-parameter it: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'initExpression' @ [276:81] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'if (assignments.isNotEmpty()) {
                ctx.replaceMe(JsExpressionStatement(JsAstUtils.newSequence(assignments)))
            }
            else {
                ctx.removeMe()
            }' @ [283:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'assignments' @ [283:17] ==> val assignments: List<JsBinaryOperation> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'isNotEmpty' @ [283:29] ==> @InlineOnly public inline fun <T> Collection<JsBinaryOperation>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsBinaryOperation

'ctx' @ [284:17] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [284:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpressionStatement..JsExpressionStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsExpressionStatement

'JsExpressionStatement' @ [284:31] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'newSequence' @ [284:64] ==> @NotNull public open fun newSequence(@NotNull expressions: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'assignments' @ [284:76] ==> val assignments: List<JsBinaryOperation> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[LocalVariableDescriptor]

'ctx' @ [287:17] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'removeMe' @ [287:21] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'visitor' @ [291:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[LocalVariableDescriptor]

'accept' @ [291:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsBlock..JsBlock?)): (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsBlock

'this' @ [291:20] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.replaceLocalVariables[ReceiverParameterDescriptorImpl]

