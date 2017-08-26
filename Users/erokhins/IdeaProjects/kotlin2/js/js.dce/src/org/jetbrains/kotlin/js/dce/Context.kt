'Node' @ [24:23] ==> public constructor Node(localName: JsName? = ...) defined in org.jetbrains.kotlin.js.dce.Context.Node[ClassConstructorDescriptorImpl]

'globalScope' @ [25:29] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'member' @ [25:41] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'member' @ [25:58] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'globalScope' @ [26:25] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'mutableMapOf' @ [27:17] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Node

'globalScope' @ [28:27] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'mutableSetOf' @ [29:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'nodes' @ [32:9] ==> public final val nodes: MutableMap<JsName, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'names' @ [32:18] ==> value-parameter names: Collection<JsName> defined in org.jetbrains.kotlin.js.dce.Context.addNodesForLocalVars[ValueParameterDescriptorImpl]

'filter' @ [32:24] ==> public inline fun <T> Iterable<JsName>.filter(predicate: (JsName) -> Boolean): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'it' @ [32:33] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.dce.Context.addNodesForLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'nodes' @ [32:40] ==> public final val nodes: MutableMap<JsName, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'associate' @ [32:48] ==> public inline fun <T, K, V> Iterable<JsName>.associate(transform: (JsName) -> Pair<JsName, Context.Node>): Map<JsName, Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <K> -> JsName
    <V> -> Node

'it' @ [32:60] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.dce.Context.addNodesForLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'Node' @ [32:66] ==> public constructor Node(localName: JsName? = ...) defined in org.jetbrains.kotlin.js.dce.Context.Node[ClassConstructorDescriptorImpl]

'it' @ [32:71] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.dce.Context.addNodesForLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'extractNodeImpl' @ [36:20] ==> private final fun extractNodeImpl(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'expression' @ [36:36] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNode[ValueParameterDescriptorImpl]

'original' @ [36:49] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'if (node != null && moduleExportsNode in generateSequence(node) { it.qualifier?.parent }) {
            val path = node.pathFromRoot().drop(2)
            path.fold(currentModule.original) { n, memberName -> n.member(memberName) }
        }
        else {
            node
        }' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Context.Node?, elseBranch: Context.Node?): Context.Node?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Node?

'node' @ [37:20] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context.extractNode[LocalVariableDescriptor]

'moduleExportsNode' @ [37:36] ==> public final val moduleExportsNode: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'generateSequence' @ [37:57] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Context.Node?, nextFunction: (Context.Node) -> Context.Node?): Sequence<Context.Node> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Node

'node' @ [37:74] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context.extractNode[LocalVariableDescriptor]

'it' @ [37:82] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.extractNode.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [37:85] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [37:96] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'node' @ [38:24] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context.extractNode[LocalVariableDescriptor]

'pathFromRoot' @ [38:29] ==> public final fun pathFromRoot(): List<String> defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'drop' @ [38:44] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'path' @ [39:13] ==> val path: List<String> defined in org.jetbrains.kotlin.js.dce.Context.extractNode[LocalVariableDescriptor]

'fold' @ [39:18] ==> public inline fun <T, R> Iterable<String>.fold(initial: Context.Node, operation: (acc: Context.Node, String) -> Context.Node): Context.Node defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Node

'currentModule' @ [39:23] ==> public final var currentModule: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'original' @ [39:37] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'n' @ [39:66] ==> value-parameter n: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.extractNode.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [39:68] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'memberName' @ [39:75] ==> value-parameter memberName: String defined in org.jetbrains.kotlin.js.dce.Context.extractNode.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [42:13] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context.extractNode[LocalVariableDescriptor]

'when (expression) {
            is JsNameRef -> {
                val qualifier = expression.qualifier
                if (qualifier == null) {
                    val name = expression.name
                    if (name != null) {
                        if (name in namesOfLocalVars) return null
                        nodes[name]?.original?.let { return it }
                    }
                    globalScope.member(expression.ident)
                }
                else {
                    extractNodeImpl(qualifier)?.member(expression.ident)
                }
            }
            is JsArrayAccess -> {
                val index = expression.index
                if (index is JsStringLiteral) extractNodeImpl(expression.array)?.member(index.value) else null
            }
            is JsThisRef -> {
                thisNode
            }
            is JsInvocation -> {
                val qualifier = expression.qualifier
                if (qualifier is JsNameRef && qualifier.qualifier == null && qualifier.ident == "require" &&
                    qualifier.name !in nodes && expression.arguments.size == 1
                ) {
                    val argument = expression.arguments[0]
                    if (argument is JsStringLiteral) {
                        return globalScope.member(argument.value)
                    }
                }
                null
            }
            else -> {
                null
            }
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Context.Node?, entry1: Context.Node?, entry2: Context.Node?, entry3: Context.Node?, entry4: Context.Node?): Context.Node?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Node?

'expression' @ [47:22] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'expression' @ [49:33] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'qualifier' @ [49:44] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'if (qualifier == null) {
                    val name = expression.name
                    if (name != null) {
                        if (name in namesOfLocalVars) return null
                        nodes[name]?.original?.let { return it }
                    }
                    globalScope.member(expression.ident)
                }
                else {
                    extractNodeImpl(qualifier)?.member(expression.ident)
                }' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Context.Node?, elseBranch: Context.Node?): Context.Node?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Node?

'qualifier' @ [50:21] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'expression' @ [51:32] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'name' @ [51:43] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [52:25] ==> val name: JsName? defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'name' @ [53:29] ==> val name: JsName? defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'namesOfLocalVars' @ [53:37] ==> public final val namesOfLocalVars: MutableSet<JsName> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'nodes' @ [54:25] ==> public final val nodes: MutableMap<JsName, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'name' @ [54:31] ==> val name: JsName? defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'original' @ [54:38] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'let' @ [54:48] ==> @InlineOnly public inline fun <T, R> Context.Node.let(block: (Context.Node) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> Nothing

'it' @ [54:61] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl.<anonymous>[ValueParameterDescriptorImpl]

'globalScope' @ [56:21] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'member' @ [56:33] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'expression' @ [56:40] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'ident' @ [56:51] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'extractNodeImpl' @ [59:21] ==> private final fun extractNodeImpl(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'qualifier' @ [59:37] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'member' @ [59:49] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'expression' @ [59:56] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'ident' @ [59:67] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'expression' @ [63:29] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'index' @ [63:40] ==> public var JsArrayAccess.index: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils[DeserializedPropertyDescriptor]

'if (index is JsStringLiteral) extractNodeImpl(expression.array)?.member(index.value) else null' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Context.Node?, elseBranch: Context.Node?): Context.Node?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Node?

'index' @ [64:21] ==> val index: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'extractNodeImpl' @ [64:47] ==> private final fun extractNodeImpl(expression: JsExpression): Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'expression' @ [64:63] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'array' @ [64:74] ==> public var JsArrayAccess.array: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils[DeserializedPropertyDescriptor]

'member' @ [64:82] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'index' @ [64:89] ==> val index: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'value' @ [64:95] ==> public final val JsStringLiteral.value: (String..String?)[MyPropertyDescriptor]

'thisNode' @ [67:17] ==> public final var thisNode: Context.Node? defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'expression' @ [70:33] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'qualifier' @ [70:44] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [71:21] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'qualifier' @ [71:47] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'qualifier' @ [71:57] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'qualifier' @ [71:78] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'ident' @ [71:88] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'qualifier' @ [72:21] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'name' @ [72:31] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'nodes' @ [72:40] ==> public final val nodes: MutableMap<JsName, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'expression' @ [72:49] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'arguments' @ [72:60] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'size' @ [72:70] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expression' @ [74:36] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[ValueParameterDescriptorImpl]

'arguments' @ [74:47] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'argument' @ [75:25] ==> val argument: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'globalScope' @ [76:32] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'member' @ [76:44] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'argument' @ [76:51] ==> val argument: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.dce.Context.extractNodeImpl[LocalVariableDescriptor]

'value' @ [76:60] ==> public final val JsStringLiteral.value: (String..String?)[MyPropertyDescriptor]

'mutableSetOf' @ [88:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'mutableSetOf' @ [89:39] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'mutableSetOf' @ [90:37] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsFunction

'mutableMapOf' @ [94:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Node

'mutableSetOf' @ [95:42] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'original' @ [98:52] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'dependenciesImpl' @ [98:61] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [100:59] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'expressionsImpl' @ [100:68] ==> private final val expressionsImpl: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [102:55] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'functionsImpl' @ [102:64] ==> private final val functionsImpl: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [105:21] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'hasSideEffectsImpl' @ [105:30] ==> private final var hasSideEffectsImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [107:17] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'hasSideEffectsImpl' @ [107:26] ==> private final var hasSideEffectsImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'value' @ [107:47] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node.<set-hasSideEffects>[ValueParameterDescriptorImpl]

'original' @ [111:21] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reachableImpl' @ [111:30] ==> private final var reachableImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [113:17] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'reachableImpl' @ [113:26] ==> private final var reachableImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'value' @ [113:42] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node.<set-reachable>[ValueParameterDescriptorImpl]

'original' @ [117:21] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'declarationReachableImpl' @ [117:30] ==> private final var declarationReachableImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [119:17] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'declarationReachableImpl' @ [119:26] ==> private final var declarationReachableImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'value' @ [119:53] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node.<set-declarationReachable>[ValueParameterDescriptorImpl]

'qualifier' @ [122:37] ==> value-parameter qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node.<init>[ValueParameterDescriptorImpl]

'original' @ [126:56] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'usedByAstNodesImpl' @ [126:65] ==> private final val usedByAstNodesImpl: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [128:53] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'membersImpl' @ [128:62] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'keys' @ [128:74] ==> public abstract val keys: MutableSet<String> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'this' @ [130:50] ==> private constructor Node(localName: JsName?, qualifier: Context.Qualifier?) defined in org.jetbrains.kotlin.js.dce.Context.Node[ClassConstructorDescriptorImpl]

'localName' @ [130:55] ==> value-parameter localName: JsName? = ... defined in org.jetbrains.kotlin.js.dce.Context.Node.<init>[ValueParameterDescriptorImpl]

'this' @ [132:30] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'field' @ [134:21] ==> var field: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.<get-original>[SyntheticFieldDescriptor]

'this' @ [134:30] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'field' @ [135:21] ==> var field: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.<get-original>[SyntheticFieldDescriptor]

'field' @ [135:29] ==> var field: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.<get-original>[SyntheticFieldDescriptor]

'original' @ [135:35] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'field' @ [137:24] ==> var field: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.<get-original>[SyntheticFieldDescriptor]

'original' @ [141:48] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'membersImpl' @ [141:57] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [143:42] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'membersImpl' @ [143:51] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'getOrPut' @ [143:63] ==> public inline fun <K, V> MutableMap<String, Context.Node>.getOrPut(key: String, defaultValue: () -> Context.Node): Context.Node defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Node

'name' @ [143:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.member[ValueParameterDescriptorImpl]

'Node' @ [143:80] ==> private constructor Node(localName: JsName?, qualifier: Context.Qualifier?) defined in org.jetbrains.kotlin.js.dce.Context.Node[ClassConstructorDescriptorImpl]

'Qualifier' @ [143:91] ==> public constructor Qualifier(parent: Context.Node, memberName: String) defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[ClassConstructorDescriptorImpl]

'this' @ [143:101] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'name' @ [143:107] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.member[ValueParameterDescriptorImpl]

'original' @ [143:116] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'original' @ [146:21] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [147:21] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[ValueParameterDescriptorImpl]

'original' @ [147:27] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'a' @ [148:17] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'b' @ [148:22] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'if (a.qualifier == null && b.qualifier == null) {
                a.merge(b)
            }
            else if (a.qualifier == null) {
                if (b.root() == a) a.makeDependencies(b) else b.evacuateFrom(a)
            }
            else if (b.qualifier == null) {
                if (a.root() == b) a.makeDependencies(b) else a.evacuateFrom(b)
            }
            else {
                a.makeDependencies(b)
            }' @ [150:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'a' @ [150:17] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'qualifier' @ [150:19] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'b' @ [150:40] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'qualifier' @ [150:42] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'a' @ [151:17] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'merge' @ [151:19] ==> private final fun merge(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [151:25] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'if (a.qualifier == null) {
                if (b.root() == a) a.makeDependencies(b) else b.evacuateFrom(a)
            }
            else if (b.qualifier == null) {
                if (a.root() == b) a.makeDependencies(b) else a.evacuateFrom(b)
            }
            else {
                a.makeDependencies(b)
            }' @ [153:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'a' @ [153:22] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'qualifier' @ [153:24] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'if (b.root() == a) a.makeDependencies(b) else b.evacuateFrom(a)' @ [154:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'b' @ [154:21] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'root' @ [154:23] ==> public final fun root(): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'a' @ [154:33] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'a' @ [154:36] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'makeDependencies' @ [154:38] ==> private final fun makeDependencies(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [154:55] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'b' @ [154:63] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'evacuateFrom' @ [154:65] ==> private final fun evacuateFrom(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'a' @ [154:78] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'if (b.qualifier == null) {
                if (a.root() == b) a.makeDependencies(b) else a.evacuateFrom(b)
            }
            else {
                a.makeDependencies(b)
            }' @ [156:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'b' @ [156:22] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'qualifier' @ [156:24] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'if (a.root() == b) a.makeDependencies(b) else a.evacuateFrom(b)' @ [157:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'a' @ [157:21] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'root' @ [157:23] ==> public final fun root(): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [157:33] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'a' @ [157:36] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'makeDependencies' @ [157:38] ==> private final fun makeDependencies(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [157:55] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'a' @ [157:63] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'evacuateFrom' @ [157:65] ==> private final fun evacuateFrom(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [157:78] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'a' @ [160:17] ==> val a: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'makeDependencies' @ [160:19] ==> private final fun makeDependencies(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'b' @ [160:36] ==> val b: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.alias[LocalVariableDescriptor]

'dependenciesImpl' @ [165:13] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [165:33] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.makeDependencies[ValueParameterDescriptorImpl]

'other' @ [166:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.makeDependencies[ValueParameterDescriptorImpl]

'dependenciesImpl' @ [166:19] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'this' @ [166:39] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'component1' @ [170:18] ==> public final operator fun component1(): List<Pair<String, Context.Node>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [170:35] ==> public final operator fun component2(): List<Pair<String, Context.Node>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'other' @ [170:49] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'members' @ [170:55] ==> public final val members: Map<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'toList' @ [170:63] ==> public fun <K, V> Map<out String, Context.Node>.toList(): List<Pair<String, Context.Node>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Node

'partition' @ [170:72] ==> public inline fun <T> Iterable<Pair<String, Context.Node>>.partition(predicate: (Pair<String, Context.Node>) -> Boolean): Pair<List<Pair<String, Context.Node>>, List<Pair<String, Context.Node>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Node>

'component1' @ [170:85] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [170:91] ==> public final operator fun component2(): Context.Node defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'name' @ [170:97] ==> val name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom.<anonymous>[LocalVariableDescriptor]

'membersImpl' @ [170:105] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [171:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'original' @ [171:19] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'this' @ [171:30] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'component1' @ [173:19] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [173:25] ==> public final operator fun component2(): Context.Node defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'newMembers' @ [173:36] ==> val newMembers: List<Pair<String, Context.Node>> defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'membersImpl' @ [174:17] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'name' @ [174:29] ==> val name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'member' @ [174:37] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'member' @ [175:17] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [175:24] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'qualifier' @ [175:33] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'Qualifier' @ [175:45] ==> public constructor Qualifier(parent: Context.Node, memberName: String) defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[ClassConstructorDescriptorImpl]

'this' @ [175:55] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'member' @ [175:61] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [175:68] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'qualifier' @ [175:77] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'memberName' @ [175:89] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'component1' @ [177:19] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [177:25] ==> public final operator fun component2(): Context.Node defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'existingMembers' @ [177:36] ==> val existingMembers: List<Pair<String, Context.Node>> defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'membersImpl' @ [178:17] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'name' @ [178:29] ==> val name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [178:37] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'merge' @ [178:46] ==> private final fun merge(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'member' @ [178:52] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [178:59] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'membersImpl' @ [179:17] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'name' @ [179:29] ==> val name: String defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'member' @ [179:37] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [179:44] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'member' @ [180:17] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [180:24] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'qualifier' @ [180:33] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'Qualifier' @ [180:45] ==> public constructor Qualifier(parent: Context.Node, memberName: String) defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[ClassConstructorDescriptorImpl]

'this' @ [180:55] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'member' @ [180:61] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[LocalVariableDescriptor]

'original' @ [180:68] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'qualifier' @ [180:77] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'memberName' @ [180:89] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'other' @ [182:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'membersImpl' @ [182:19] ==> private final val membersImpl: MutableMap<String, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'clear' @ [182:31] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'hasSideEffectsImpl' @ [184:13] ==> private final var hasSideEffectsImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'hasSideEffectsImpl' @ [184:34] ==> private final var hasSideEffectsImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [184:56] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'hasSideEffectsImpl' @ [184:62] ==> private final var hasSideEffectsImpl: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'expressionsImpl' @ [185:13] ==> private final val expressionsImpl: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [185:32] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'expressionsImpl' @ [185:38] ==> private final val expressionsImpl: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'functionsImpl' @ [186:13] ==> private final val functionsImpl: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [186:30] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'functionsImpl' @ [186:36] ==> private final val functionsImpl: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'dependenciesImpl' @ [187:13] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [187:33] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'dependenciesImpl' @ [187:39] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'usedByAstNodesImpl' @ [188:13] ==> private final val usedByAstNodesImpl: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [188:35] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'usedByAstNodesImpl' @ [188:41] ==> private final val usedByAstNodesImpl: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [190:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'expressionsImpl' @ [190:19] ==> private final val expressionsImpl: MutableSet<JsExpression> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'clear' @ [190:35] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'other' @ [191:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'functionsImpl' @ [191:19] ==> private final val functionsImpl: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'clear' @ [191:33] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'other' @ [192:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'dependenciesImpl' @ [192:19] ==> private final val dependenciesImpl: MutableSet<Context.Node> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'clear' @ [192:36] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'other' @ [193:13] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.evacuateFrom[ValueParameterDescriptorImpl]

'usedByAstNodesImpl' @ [193:19] ==> private final val usedByAstNodesImpl: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'clear' @ [193:38] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'this' @ [197:17] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'other' @ [197:25] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.merge[ValueParameterDescriptorImpl]

'if (rank < other.rank) {
                other.evacuateFrom(this)
            }
            else {
                evacuateFrom(other)
            }' @ [199:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'rank' @ [199:17] ==> private final var rank: Int defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [199:24] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.merge[ValueParameterDescriptorImpl]

'rank' @ [199:30] ==> private final var rank: Int defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [200:17] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.merge[ValueParameterDescriptorImpl]

'evacuateFrom' @ [200:23] ==> private final fun evacuateFrom(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'this' @ [200:36] ==> <this> defined in org.jetbrains.kotlin.js.dce.Context.Node[LazyClassReceiverParameterDescriptor]

'evacuateFrom' @ [203:17] ==> private final fun evacuateFrom(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'other' @ [203:30] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.merge[ValueParameterDescriptorImpl]

'rank' @ [206:17] ==> private final var rank: Int defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'other' @ [206:25] ==> value-parameter other: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.merge[ValueParameterDescriptorImpl]

'rank' @ [206:31] ==> private final var rank: Int defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'rank' @ [207:17] ==> private final var rank: Int defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'generateSequence' @ [211:28] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Context.Node?, nextFunction: (Context.Node) -> Context.Node?): Sequence<Context.Node> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Node

'original' @ [211:45] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'it' @ [211:57] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.root.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [211:60] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [211:71] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'original' @ [211:79] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'last' @ [211:90] ==> public fun <T> Sequence<Context.Node>.last(): Context.Node defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'generateSequence' @ [214:17] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Context.Node?, nextFunction: (Context.Node) -> Context.Node?): Sequence<Context.Node> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Node

'original' @ [214:34] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'it' @ [214:46] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.pathFromRoot.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [214:49] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'parent' @ [214:60] ==> public final val parent: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'original' @ [214:68] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'mapNotNull' @ [214:79] ==> public fun <T, R : Any> Sequence<Context.Node>.mapNotNull(transform: (Context.Node) -> String?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R : Any> -> String

'it' @ [214:92] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node.pathFromRoot.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [214:95] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'memberName' @ [214:106] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'toList' @ [215:26] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asReversed' @ [215:35] ==> public fun <T> List<String>.asReversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [217:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'root' @ [217:44] ==> public final fun root(): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'localName' @ [217:51] ==> public final val localName: JsName? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'ident' @ [217:62] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'pathFromRoot' @ [217:86] ==> public final fun pathFromRoot(): List<String> defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'joinToString' @ [217:101] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [217:123] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.dce.Context.Node.toString.<anonymous>[ValueParameterDescriptorImpl]

