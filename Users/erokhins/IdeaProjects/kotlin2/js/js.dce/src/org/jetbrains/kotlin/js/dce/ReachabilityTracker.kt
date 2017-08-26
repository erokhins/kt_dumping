'RecursiveJsVisitor' @ [27:5] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'setOf' @ [29:38] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableSetOf' @ [34:38] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'reachableNodesImpl' @ [36:43] ==> private final val reachableNodesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'shouldTraverse' @ [39:13] ==> private final fun shouldTraverse(x: JsNode): Boolean defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'x' @ [39:28] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visit[ValueParameterDescriptorImpl]

'super' @ [40:13] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visit' @ [40:19] ==> public open fun visit(x: JsVars.JsVar): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [40:25] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visit[ValueParameterDescriptorImpl]

'shouldTraverse' @ [45:13] ==> private final fun shouldTraverse(x: JsNode): Boolean defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'x' @ [45:28] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitExpressionStatement[ValueParameterDescriptorImpl]

'super' @ [46:13] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [46:19] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [46:44] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitExpressionStatement[ValueParameterDescriptorImpl]

'shouldTraverse' @ [51:13] ==> private final fun shouldTraverse(x: JsNode): Boolean defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'x' @ [51:28] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitReturn[ValueParameterDescriptorImpl]

'super' @ [52:13] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [52:19] ==> public open fun visitReturn(x: JsReturn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [52:31] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitReturn[ValueParameterDescriptorImpl]

'analysisResult' @ [57:13] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'nodeMap' @ [57:28] ==> public abstract val nodeMap: Map<JsNode, Context.Node> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'x' @ [57:36] ==> value-parameter x: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.shouldTraverse[ValueParameterDescriptorImpl]

'x' @ [57:50] ==> value-parameter x: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.shouldTraverse[ValueParameterDescriptorImpl]

'analysisResult' @ [57:56] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'astNodesToEliminate' @ [57:71] ==> public abstract val astNodesToEliminate: Set<JsNode> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'nameRef' @ [60:13] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[ValueParameterDescriptorImpl]

'analysisResult' @ [60:24] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'astNodesToSkip' @ [60:39] ==> public abstract val astNodesToSkip: Set<JsNode> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'context' @ [62:20] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'extractNode' @ [62:28] ==> public final fun extractNode(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'nameRef' @ [62:40] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[ValueParameterDescriptorImpl]

'if (node != null) {
            if (!node.reachable) {
                reportAndNest("reach: referenced name $node", currentNodeWithLocation) {
                    reach(node)
                    currentNodeWithLocation?.let { node.usedByAstNodes += it }
                }
            }
        }
        else {
            super.visitNameRef(nameRef)
        }' @ [63:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'node' @ [63:13] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[LocalVariableDescriptor]

'!' @ [64:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'node' @ [64:18] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[LocalVariableDescriptor]

'reachable' @ [64:23] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [65:17] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [65:56] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[LocalVariableDescriptor]

'currentNodeWithLocation' @ [65:63] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'reach' @ [66:21] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [66:27] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[LocalVariableDescriptor]

'currentNodeWithLocation' @ [67:21] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'let' @ [67:46] ==> @InlineOnly public inline fun <T, R> JsNode.let(block: (JsNode) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode
    <R> -> Unit

'node' @ [67:52] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[LocalVariableDescriptor]

'usedByAstNodes' @ [67:57] ==> public final val usedByAstNodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'it' @ [67:75] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [72:13] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [72:19] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [72:32] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitNameRef[ValueParameterDescriptorImpl]

'invocation' @ [77:24] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[ValueParameterDescriptorImpl]

'qualifier' @ [77:35] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'when {
            function is JsFunction && function in analysisResult.functionsToEnter -> {
                accept(function.body)
                for (argument in invocation.arguments.filter { it is JsFunction && it in analysisResult.functionsToEnter }) {
                    accept(argument)
                }
            }
            invocation in analysisResult.invocationsToSkip -> {}
            else -> {
                val node = context.extractNode(invocation.qualifier)
                if (node != null && node.qualifier?.memberName in CALL_FUNCTIONS) {
                    val parent = node.qualifier!!.parent
                    reach(parent)
                    currentNodeWithLocation?.let { parent.usedByAstNodes += it }
                }
                super.visitInvocation(invocation)
            }
        }' @ [78:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'function' @ [79:13] ==> val function: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'function' @ [79:39] ==> val function: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'analysisResult' @ [79:51] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'functionsToEnter' @ [79:66] ==> public abstract val functionsToEnter: Set<JsFunction> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'accept' @ [80:17] ==> public open fun <T : JsNode?> accept(node: JsBlock): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsBlock

'function' @ [80:24] ==> val function: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'body' @ [80:33] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'invocation' @ [81:34] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[ValueParameterDescriptorImpl]

'arguments' @ [81:45] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'filter' @ [81:55] ==> public inline fun <T> Iterable<(JsExpression..JsExpression?)>.filter(predicate: ((JsExpression..JsExpression?)) -> Boolean): List<(JsExpression..JsExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'it' @ [81:64] ==> value-parameter it: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [81:84] ==> value-parameter it: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation.<anonymous>[ValueParameterDescriptorImpl]

'analysisResult' @ [81:90] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'functionsToEnter' @ [81:105] ==> public abstract val functionsToEnter: Set<JsFunction> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'accept' @ [82:21] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'argument' @ [82:28] ==> val argument: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'invocation' @ [85:13] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[ValueParameterDescriptorImpl]

'analysisResult' @ [85:27] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'invocationsToSkip' @ [85:42] ==> public abstract val invocationsToSkip: Set<JsInvocation> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'context' @ [87:28] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'extractNode' @ [87:36] ==> public final fun extractNode(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'invocation' @ [87:48] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[ValueParameterDescriptorImpl]

'qualifier' @ [87:59] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'node' @ [88:21] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'node' @ [88:37] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'qualifier' @ [88:42] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'memberName' @ [88:53] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'CALL_FUNCTIONS' @ [88:67] ==> private final val CALL_FUNCTIONS: Set<String> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.Companion[PropertyDescriptorImpl]

'node' @ [89:34] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'qualifier' @ [89:39] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [89:51] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'reach' @ [90:21] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'parent' @ [90:27] ==> val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'currentNodeWithLocation' @ [91:21] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'let' @ [91:46] ==> @InlineOnly public inline fun <T, R> JsNode.let(block: (JsNode) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode
    <R> -> Unit

'parent' @ [91:52] ==> val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[LocalVariableDescriptor]

'usedByAstNodes' @ [91:59] ==> public final val usedByAstNodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'it' @ [91:77] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [93:17] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitInvocation' @ [93:23] ==> public open fun visitInvocation(invocation: JsInvocation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'invocation' @ [93:39] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitInvocation[ValueParameterDescriptorImpl]

'if (x !in analysisResult.functionsToEnter) {
            x.collectLocalVariables().let {
                context.addNodesForLocalVars(it)
                context.namesOfLocalVars += it
            }
            withErasedThis {
                super.visitFunction(x)
            }
        }
        else {
            super.visitFunction(x)
        }' @ [99:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'x' @ [99:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction[ValueParameterDescriptorImpl]

'analysisResult' @ [99:19] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'functionsToEnter' @ [99:34] ==> public abstract val functionsToEnter: Set<JsFunction> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'x' @ [100:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction[ValueParameterDescriptorImpl]

'collectLocalVariables' @ [100:15] ==> public fun JsFunction.collectLocalVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[DeserializedSimpleFunctionDescriptor]

'let' @ [100:39] ==> @InlineOnly public inline fun <T, R> Set<JsName>.let(block: (Set<JsName>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<JsName>
    <R> -> Unit

'context' @ [101:17] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'addNodesForLocalVars' @ [101:25] ==> public final fun addNodesForLocalVars(names: Collection<JsName>): Unit defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'it' @ [101:46] ==> value-parameter it: Set<JsName> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [102:17] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'namesOfLocalVars' @ [102:25] ==> public final val namesOfLocalVars: MutableSet<JsName> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'it' @ [102:45] ==> value-parameter it: Set<JsName> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'withErasedThis' @ [104:13] ==> private final fun withErasedThis(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'super' @ [105:17] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [105:23] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [105:37] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction[ValueParameterDescriptorImpl]

'super' @ [109:13] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [109:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [109:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitFunction[ValueParameterDescriptorImpl]

'context' @ [114:23] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'thisNode' @ [114:31] ==> public final var thisNode: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'context' @ [115:9] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'thisNode' @ [115:17] ==> public final var thisNode: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'invoke' @ [116:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'context' @ [117:9] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'thisNode' @ [117:17] ==> public final var thisNode: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'oldThis' @ [117:28] ==> val oldThis: Context.Node? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.withErasedThis[LocalVariableDescriptor]

'node' @ [125:13] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'reachable' @ [125:18] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'node' @ [126:9] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'reachable' @ [126:14] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reachableNodesImpl' @ [127:9] ==> private final val reachableNodesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'node' @ [127:31] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'reachDeclaration' @ [129:9] ==> private final fun reachDeclaration(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [129:26] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'reachDependencies' @ [131:9] ==> private final fun reachDependencies(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [131:27] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'node' @ [132:9] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'members' @ [132:14] ==> public final val members: Map<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'toList' @ [132:22] ==> public fun <K, V> Map<out String, Context.Node>.toList(): List<Pair<String, Context.Node>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Node

'forEach' @ [132:31] ==> @HidesMembers public inline fun <T> Iterable<Pair<String, Context.Node>>.forEach(action: (Pair<String, Context.Node>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Node>

'component1' @ [132:42] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [132:48] ==> public final operator fun component2(): Context.Node defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'!' @ [133:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [133:18] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach.<anonymous>[LocalVariableDescriptor]

'reachable' @ [133:25] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [134:17] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'name' @ [134:47] ==> val name: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach.<anonymous>[LocalVariableDescriptor]

'reach' @ [134:62] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'member' @ [134:68] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach.<anonymous>[LocalVariableDescriptor]

'node' @ [138:22] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'functions' @ [138:27] ==> public final val functions: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [139:13] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'expr' @ [139:49] ==> val expr: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[LocalVariableDescriptor]

'expr' @ [140:17] ==> val expr: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[LocalVariableDescriptor]

'collectLocalVariables' @ [140:22] ==> public fun JsFunction.collectLocalVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[DeserializedSimpleFunctionDescriptor]

'let' @ [140:46] ==> @InlineOnly public inline fun <T, R> Set<JsName>.let(block: (Set<JsName>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<JsName>
    <R> -> Unit

'context' @ [141:21] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'addNodesForLocalVars' @ [141:29] ==> public final fun addNodesForLocalVars(names: Collection<JsName>): Unit defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'it' @ [141:50] ==> value-parameter it: Set<JsName> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [142:21] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'namesOfLocalVars' @ [142:29] ==> public final val namesOfLocalVars: MutableSet<JsName> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'it' @ [142:49] ==> value-parameter it: Set<JsName> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withErasedThis' @ [144:17] ==> private final fun withErasedThis(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'expr' @ [144:34] ==> val expr: JsFunction defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[LocalVariableDescriptor]

'body' @ [144:39] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'accept' @ [144:44] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'this' @ [144:51] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'node' @ [147:22] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[ValueParameterDescriptorImpl]

'expressions' @ [147:27] ==> public final val expressions: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [148:13] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'expr' @ [148:46] ==> val expr: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[LocalVariableDescriptor]

'expr' @ [149:17] ==> val expr: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reach[LocalVariableDescriptor]

'accept' @ [149:22] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [149:29] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'mutableListOf' @ [155:20] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'node' @ [156:23] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[ValueParameterDescriptorImpl]

'current' @ [158:40] ==> var current: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'dependencies' @ [158:48] ==> public final val dependencies: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'current' @ [159:21] ==> var current: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'generateSequence' @ [159:32] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Context.Node?, nextFunction: (Context.Node) -> Context.Node?): Sequence<Context.Node> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Node

'ancestorDependency' @ [159:49] ==> val ancestorDependency: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'it' @ [159:71] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [159:74] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [159:85] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'path' @ [160:34] ==> val path: MutableList<String> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'asReversed' @ [160:39] ==> @JvmName public fun <T> MutableList<String>.asReversed(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fold' @ [160:52] ==> public inline fun <T, R> Iterable<String>.fold(initial: Context.Node, operation: (acc: Context.Node, String) -> Context.Node): Context.Node defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Node

'ancestorDependency' @ [160:57] ==> val ancestorDependency: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'n' @ [160:96] ==> value-parameter n: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [160:98] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'memberName' @ [160:105] ==> value-parameter memberName: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [161:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dependency' @ [161:22] ==> val dependency: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'reachable' @ [161:33] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [162:21] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'dependency' @ [162:55] ==> val dependency: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'reach' @ [162:76] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'dependency' @ [162:82] ==> val dependency: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'current' @ [165:29] ==> var current: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'qualifier' @ [165:37] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'path' @ [166:13] ==> val path: MutableList<String> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'qualifier' @ [166:21] ==> val qualifier: Context.Qualifier defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'memberName' @ [166:31] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'current' @ [167:13] ==> var current: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'qualifier' @ [167:23] ==> val qualifier: Context.Qualifier defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDependencies[LocalVariableDescriptor]

'parent' @ [167:33] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'if (node.hasSideEffects && !node.reachable) {
            reportAndNest("reach: because of side effect", null) {
                reach(node)
            }
        }
        else if (!node.declarationReachable) {
            node.declarationReachable = true

            node.original.qualifier?.parent?.let {
                reportAndNest("reach-decl: parent $it", null) {
                    reachDeclaration(it)
                }
            }

            for (expr in node.expressions) {
                reportAndNest("traverse: value", expr) {
                    expr.accept(this)
                }
            }
        }' @ [172:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'node' @ [172:13] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'hasSideEffects' @ [172:18] ==> public final var hasSideEffects: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'!' @ [172:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'node' @ [172:37] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'reachable' @ [172:42] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [173:13] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'reach' @ [174:17] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [174:23] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'!' @ [177:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'node' @ [177:19] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'declarationReachable' @ [177:24] ==> public final var declarationReachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'node' @ [178:13] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'declarationReachable' @ [178:18] ==> public final var declarationReachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'node' @ [180:13] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'original' @ [180:18] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'qualifier' @ [180:27] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [180:38] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'let' @ [180:46] ==> @InlineOnly public inline fun <T, R> Context.Node.let(block: (Context.Node) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> Unit

'reportAndNest' @ [181:17] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'it' @ [181:52] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'reachDeclaration' @ [182:21] ==> private final fun reachDeclaration(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'it' @ [182:38] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [186:26] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[ValueParameterDescriptorImpl]

'expressions' @ [186:31] ==> public final val expressions: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reportAndNest' @ [187:17] ==> private final fun reportAndNest(message: String, dueTo: JsNode?, action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'expr' @ [187:50] ==> val expr: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[LocalVariableDescriptor]

'expr' @ [188:21] ==> val expr: JsExpression defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reachDeclaration[LocalVariableDescriptor]

'accept' @ [188:26] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [188:33] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'x' @ [195:13] ==> value-parameter x: JsPrefixOperation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[ValueParameterDescriptorImpl]

'operator' @ [195:15] ==> public final val JsPrefixOperation.operator: (JsUnaryOperator..JsUnaryOperator?)[MyPropertyDescriptor]

'TYPEOF' @ [195:43] ==> enum entry TYPEOF defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'x' @ [196:23] ==> value-parameter x: JsPrefixOperation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[ValueParameterDescriptorImpl]

'arg' @ [196:25] ==> public final var JsPrefixOperation.arg: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'arg' @ [197:17] ==> val arg: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[LocalVariableDescriptor]

'arg' @ [197:37] ==> val arg: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[LocalVariableDescriptor]

'qualifier' @ [197:41] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'context' @ [198:17] ==> private final val context: Context defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'extractNode' @ [198:25] ==> public final fun extractNode(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'arg' @ [198:37] ==> val arg: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[LocalVariableDescriptor]

'let' @ [198:43] ==> @InlineOnly public inline fun <T, R> Context.Node.let(block: (Context.Node) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> Unit

'reachDeclaration' @ [198:49] ==> private final fun reachDeclaration(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'it' @ [198:66] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [202:9] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitPrefixOperation' @ [202:15] ==> public open fun visitPrefixOperation(x: JsPrefixOperation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [202:36] ==> value-parameter x: JsPrefixOperation defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitPrefixOperation[ValueParameterDescriptorImpl]

'node' @ [206:13] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[ValueParameterDescriptorImpl]

'analysisResult' @ [206:21] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'astNodesToSkip' @ [206:36] ==> public abstract val astNodesToSkip: Set<JsNode> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'node' @ [207:27] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[ValueParameterDescriptorImpl]

'extractLocation' @ [207:32] ==> public fun JsNode.extractLocation(): JsLocation? defined in org.jetbrains.kotlin.js.dce in file util.kt[SimpleFunctionDescriptorImpl]

'currentNodeWithLocation' @ [208:19] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'newLocation' @ [209:13] ==> val newLocation: JsLocation? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[LocalVariableDescriptor]

'currentNodeWithLocation' @ [210:13] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'node' @ [210:39] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[ValueParameterDescriptorImpl]

'super' @ [212:9] ==> <this> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[LazyClassReceiverParameterDescriptor]

'visitElement' @ [212:15] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [212:28] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[ValueParameterDescriptorImpl]

'currentNodeWithLocation' @ [213:9] ==> private final var currentNodeWithLocation: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'old' @ [213:35] ==> val old: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.visitElement[LocalVariableDescriptor]

'invoke' @ [217:9] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'+' @ [217:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'repeat' @ [217:26] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'depth' @ [217:33] ==> private final var depth: Int defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'message' @ [217:42] ==> value-parameter message: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.report[ValueParameterDescriptorImpl]

'dueTo' @ [221:24] ==> value-parameter dueTo: JsNode? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[ValueParameterDescriptorImpl]

'extractLocation' @ [221:31] ==> public fun JsNode.extractLocation(): JsLocation? defined in org.jetbrains.kotlin.js.dce in file util.kt[SimpleFunctionDescriptorImpl]

'if (location != null) "$message (due to ${location.asString()})" else message' @ [222:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'location' @ [222:31] ==> val location: JsLocation? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[LocalVariableDescriptor]

'message' @ [222:51] ==> value-parameter message: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[ValueParameterDescriptorImpl]

'location' @ [222:69] ==> val location: JsLocation? defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[LocalVariableDescriptor]

'asString' @ [222:78] ==> public fun JsLocation.asString(): String defined in org.jetbrains.kotlin.js.dce in file util.kt[SimpleFunctionDescriptorImpl]

'message' @ [222:97] ==> value-parameter message: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[ValueParameterDescriptorImpl]

'report' @ [223:9] ==> private final fun report(message: String): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'fullMessage' @ [223:16] ==> val fullMessage: String defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[LocalVariableDescriptor]

'nested' @ [224:9] ==> private final fun nested(action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'action' @ [224:16] ==> value-parameter action: () -> Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker.reportAndNest[ValueParameterDescriptorImpl]

'depth' @ [228:9] ==> private final var depth: Int defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'invoke' @ [229:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'depth' @ [230:9] ==> private final var depth: Int defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

