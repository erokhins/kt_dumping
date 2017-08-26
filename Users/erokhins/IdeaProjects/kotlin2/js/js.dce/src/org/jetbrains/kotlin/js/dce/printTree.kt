'printTree' @ [22:5] ==> private fun printTree(node: Context.Node, consumer: (String) -> Unit, depth: Int, settings: Settings): Unit defined in org.jetbrains.kotlin.js.dce[SimpleFunctionDescriptorImpl]

'root' @ [22:15] ==> value-parameter root: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'consumer' @ [22:21] ==> value-parameter consumer: (String) -> Unit defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'Settings' @ [22:34] ==> public constructor Settings(printNestedMembers: Boolean, showLocations: Boolean) defined in org.jetbrains.kotlin.js.dce.Settings[ClassConstructorDescriptorImpl]

'printNestedMembers' @ [22:43] ==> value-parameter printNestedMembers: Boolean = ... defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'showLocations' @ [22:63] ==> value-parameter showLocations: Boolean = ... defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'StringBuilder' @ [26:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [27:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'append' @ [27:8] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'repeat' @ [27:20] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'depth' @ [27:27] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'append' @ [27:35] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'node' @ [27:42] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'qualifier' @ [27:47] ==> public final var qualifier: Context.Qualifier? defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'memberName' @ [27:58] ==> public final val memberName: String defined in org.jetbrains.kotlin.js.dce.Context.Qualifier[PropertyDescriptorImpl]

'node' @ [27:72] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'toString' @ [27:77] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'node' @ [29:9] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'reachable' @ [29:14] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'sb' @ [30:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'append' @ [30:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'settings' @ [31:13] ==> value-parameter settings: Settings defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'showLocations' @ [31:22] ==> public final val showLocations: Boolean defined in org.jetbrains.kotlin.js.dce.Settings[PropertyDescriptorImpl]

'node' @ [32:29] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'usedByAstNodes' @ [32:34] ==> public final val usedByAstNodes: MutableSet<JsNode> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'mapNotNull' @ [32:49] ==> public inline fun <T, R : Any> Iterable<JsNode>.mapNotNull(transform: (JsNode) -> JsLocation?): List<JsLocation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode
    <R : Any> -> JsLocation

'it' @ [32:62] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.dce.printTree.<anonymous>[ValueParameterDescriptorImpl]

'extractLocation' @ [32:65] ==> public fun JsNode.extractLocation(): JsLocation? defined in org.jetbrains.kotlin.js.dce in file util.kt[SimpleFunctionDescriptorImpl]

'locations' @ [33:17] ==> val locations: List<JsLocation> defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'isNotEmpty' @ [33:27] ==> @InlineOnly public inline fun <T> Collection<JsLocation>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLocation

'sb' @ [34:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'append' @ [34:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [34:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'locations' @ [34:44] ==> val locations: List<JsLocation> defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'joinToString' @ [34:54] ==> public fun <T> Iterable<JsLocation>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((JsLocation) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLocation

'it' @ [34:69] ==> value-parameter it: JsLocation defined in org.jetbrains.kotlin.js.dce.printTree.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [34:72] ==> public fun JsLocation.asString(): String defined in org.jetbrains.kotlin.js.dce in file util.kt[SimpleFunctionDescriptorImpl]

'sb' @ [37:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'append' @ [37:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'invoke' @ [40:5] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'sb' @ [40:14] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'toString' @ [40:17] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'node' @ [42:24] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'memberNames' @ [42:29] ==> public final val memberNames: MutableSet<String> defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'sorted' @ [42:41] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'node' @ [43:22] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'member' @ [43:27] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'memberName' @ [43:34] ==> val memberName: String defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'!' @ [44:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [44:14] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'declarationReachable' @ [44:21] ==> public final var declarationReachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'!' @ [46:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'node' @ [46:15] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'reachable' @ [46:20] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'!' @ [46:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [46:34] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'reachable' @ [46:41] ==> public final var reachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'settings' @ [46:55] ==> value-parameter settings: Settings defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'printNestedMembers' @ [46:64] ==> public final val printNestedMembers: Boolean defined in org.jetbrains.kotlin.js.dce.Settings[PropertyDescriptorImpl]

'printTree' @ [47:13] ==> private fun printTree(node: Context.Node, consumer: (String) -> Unit, depth: Int, settings: Settings): Unit defined in org.jetbrains.kotlin.js.dce[SimpleFunctionDescriptorImpl]

'member' @ [47:23] ==> val member: Context.Node defined in org.jetbrains.kotlin.js.dce.printTree[LocalVariableDescriptor]

'consumer' @ [47:31] ==> value-parameter consumer: (String) -> Unit defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'depth' @ [47:41] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

'settings' @ [47:52] ==> value-parameter settings: Settings defined in org.jetbrains.kotlin.js.dce.printTree[ValueParameterDescriptorImpl]

