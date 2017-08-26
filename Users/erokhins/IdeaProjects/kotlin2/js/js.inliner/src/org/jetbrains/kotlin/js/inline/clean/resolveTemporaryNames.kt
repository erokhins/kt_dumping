'resolveNames' @ [23:21] ==> private fun JsNode.resolveNames(): Map<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean in file resolveTemporaryNames.kt[SimpleFunctionDescriptorImpl]

'accept' @ [24:5] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [24:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [26:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [26:19] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [26:32] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'node' @ [27:17] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'node' @ [28:28] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'name' @ [28:33] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [29:21] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[LocalVariableDescriptor]

'renamings' @ [30:21] ==> val renamings: Map<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames[LocalVariableDescriptor]

'name' @ [30:31] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[LocalVariableDescriptor]

'let' @ [30:38] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'node' @ [30:44] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'name' @ [30:49] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'it' @ [30:56] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [36:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'coroutineMetadata' @ [36:15] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'apply' @ [36:34] ==> @InlineOnly public inline fun <T> CoroutineMetadata.apply(block: CoroutineMetadata.() -> Unit): CoroutineMetadata defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineMetadata

'accept' @ [37:17] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'suspendObjectRef' @ [37:24] ==> public final val suspendObjectRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'accept' @ [38:17] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'baseClassRef' @ [38:24] ==> public final val baseClassRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'super' @ [40:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [40:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [40:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.resolveTemporaryNames.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'computeScopes' @ [46:21] ==> private fun JsNode.computeScopes(): Scope defined in org.jetbrains.kotlin.js.inline.clean in file resolveTemporaryNames.kt[SimpleFunctionDescriptorImpl]

'liftUsedNames' @ [46:37] ==> private fun Scope.liftUsedNames(): Scope defined in org.jetbrains.kotlin.js.inline.clean in file resolveTemporaryNames.kt[SimpleFunctionDescriptorImpl]

'mutableMapOf' @ [47:24] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsName

'scope' @ [51:29] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[ValueParameterDescriptorImpl]

'declaredNames' @ [51:35] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'asSequence' @ [51:49] ==> public fun <T> Iterable<JsName>.asSequence(): Sequence<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'filter' @ [51:62] ==> public fun <T> Sequence<JsName>.filter(predicate: (JsName) -> Boolean): Sequence<JsName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'!' @ [51:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [51:72] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'isTemporary' @ [51:75] ==> public final val JsName.isTemporary: Boolean[MyPropertyDescriptor]

'map' @ [51:89] ==> public fun <T, R> Sequence<JsName>.map(transform: (JsName) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> String

'it' @ [51:95] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [51:98] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'toMutableSet' @ [51:106] ==> public fun <T> Sequence<String>.toMutableSet(): MutableSet<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'occupiedNames' @ [58:9] ==> val occupiedNames: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'scope' @ [58:26] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[ValueParameterDescriptorImpl]

'usedNames' @ [58:32] ==> public final val usedNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'asSequence' @ [58:42] ==> public fun <T> Iterable<JsName>.asSequence(): Sequence<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'mapNotNull' @ [58:55] ==> public fun <T, R : Any> Sequence<JsName>.mapNotNull(transform: (JsName) -> String?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R : Any> -> String

'if (!it.isTemporary) it.ident else replacements[it]?.ident' @ [58:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [58:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [58:73] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'isTemporary' @ [58:76] ==> public final val JsName.isTemporary: Boolean[MyPropertyDescriptor]

'it' @ [58:89] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [58:92] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'replacements' @ [58:103] ==> val replacements: MutableMap<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[LocalVariableDescriptor]

'it' @ [58:116] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [58:121] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'scope' @ [60:31] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[ValueParameterDescriptorImpl]

'declaredNames' @ [60:37] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'asSequence' @ [60:51] ==> public fun <T> Iterable<JsName>.asSequence(): Sequence<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'filter' @ [60:64] ==> public fun <T> Sequence<JsName>.filter(predicate: (JsName) -> Boolean): Sequence<JsName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'it' @ [60:73] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'isTemporary' @ [60:76] ==> public final val JsName.isTemporary: Boolean[MyPropertyDescriptor]

'temporaryName' @ [61:32] ==> val temporaryName: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'ident' @ [61:46] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'resolvedName' @ [63:20] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'JsDeclarationScope' @ [63:36] ==> public companion object defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[FakeCallableDescriptorForObject]

'RESERVED_WORDS' @ [63:55] ==> public final val RESERVED_WORDS: Set<String> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.Companion[DeserializedPropertyDescriptor]

'!' @ [63:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'occupiedNames' @ [63:74] ==> val occupiedNames: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'add' @ [63:88] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'resolvedName' @ [63:92] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'resolvedName' @ [64:17] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'temporaryName' @ [64:35] ==> val temporaryName: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'ident' @ [64:49] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'suffix' @ [64:58] ==> var suffix: Int defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'replacements' @ [66:13] ==> val replacements: MutableMap<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[LocalVariableDescriptor]

'temporaryName' @ [66:26] ==> val temporaryName: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'declareName' @ [66:58] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDynamicScope[JavaMethodDescriptor]

'resolvedName' @ [66:70] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'apply' @ [66:84] ==> @InlineOnly public inline fun <T> JsName.apply(block: (JsName).() -> Unit): JsName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'copyMetadataFrom' @ [66:92] ==> public final fun copyMetadataFrom(other: HasMetadata): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsName[DeserializedSimpleFunctionDescriptor]

'temporaryName' @ [66:109] ==> val temporaryName: JsName defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'occupiedNames' @ [67:13] ==> val occupiedNames: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'resolvedName' @ [67:30] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[LocalVariableDescriptor]

'scope' @ [69:9] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.traverse[ValueParameterDescriptorImpl]

'children' @ [69:15] ==> public final val children: MutableSet<Scope> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'forEach' @ [69:24] ==> @HidesMembers public inline fun <T> Iterable<Scope>.forEach(action: (Scope) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Scope

'traverse' @ [69:34] ==> local final fun traverse(scope: Scope): Unit defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[SimpleFunctionDescriptorImpl]

'traverse' @ [72:5] ==> local final fun traverse(scope: Scope): Unit defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[SimpleFunctionDescriptorImpl]

'rootScope' @ [72:14] ==> val rootScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[LocalVariableDescriptor]

'accept' @ [76:5] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [76:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableSetOf' @ [77:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableSetOf' @ [80:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'x' @ [81:17] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [81:19] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'isTemporary' @ [81:24] ==> public final val JsName.isTemporary: Boolean[MyPropertyDescriptor]

'x' @ [82:36] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [82:38] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [82:43] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'!' @ [84:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'labels' @ [84:25] ==> public final var labels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[PropertyDescriptorImpl]

'add' @ [84:32] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'resolvedName' @ [84:36] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'resolvedName' @ [85:21] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'x' @ [85:39] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [85:41] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [85:46] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'suffix' @ [85:55] ==> var suffix: Int defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'replacements' @ [87:17] ==> val replacements: MutableMap<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[LocalVariableDescriptor]

'x' @ [87:30] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [87:32] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'declareName' @ [87:55] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDynamicScope[JavaMethodDescriptor]

'resolvedName' @ [87:67] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'addedNames' @ [88:17] ==> val addedNames: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'resolvedName' @ [88:31] ==> var resolvedName: String defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'super' @ [90:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLabel' @ [90:19] ==> public open fun visitLabel(x: JsLabel): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [90:30] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'labels' @ [91:13] ==> public final var labels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[PropertyDescriptorImpl]

'removeAll' @ [91:20] ==> public abstract fun removeAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'addedNames' @ [91:30] ==> val addedNames: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitLabel[LocalVariableDescriptor]

'labels' @ [95:29] ==> public final var labels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[PropertyDescriptorImpl]

'labels' @ [96:13] ==> public final var labels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[PropertyDescriptorImpl]

'mutableSetOf' @ [96:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'super' @ [97:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [97:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [97:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'labels' @ [98:13] ==> public final var labels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>[PropertyDescriptorImpl]

'oldLabels' @ [98:22] ==> val oldLabels: MutableSet<String> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames.<no name provided>.visitFunction[LocalVariableDescriptor]

'replacements' @ [102:12] ==> val replacements: MutableMap<JsName, JsName> defined in org.jetbrains.kotlin.js.inline.clean.resolveNames[LocalVariableDescriptor]

'scope' @ [108:9] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse[ValueParameterDescriptorImpl]

'children' @ [108:15] ==> public final val children: MutableSet<Scope> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'forEach' @ [108:24] ==> @HidesMembers public inline fun <T> Iterable<Scope>.forEach(action: (Scope) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Scope

'scope' @ [109:13] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse[ValueParameterDescriptorImpl]

'usedNames' @ [109:19] ==> public final val usedNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'scope' @ [109:32] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse[ValueParameterDescriptorImpl]

'declaredNames' @ [109:38] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'traverse' @ [110:13] ==> local final fun traverse(scope: Scope): Unit defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames[SimpleFunctionDescriptorImpl]

'child' @ [110:22] ==> value-parameter child: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [111:13] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse[ValueParameterDescriptorImpl]

'usedNames' @ [111:19] ==> public final val usedNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'child' @ [111:32] ==> value-parameter child: Scope defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse.<anonymous>[ValueParameterDescriptorImpl]

'usedNames' @ [111:38] ==> public final val usedNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'filter' @ [111:48] ==> public inline fun <T> Iterable<JsName>.filter(predicate: (JsName) -> Boolean): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'!' @ [111:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [111:58] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames.traverse.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isTemporary' @ [111:61] ==> public final val JsName.isTemporary: Boolean[MyPropertyDescriptor]

'traverse' @ [114:5] ==> local final fun traverse(scope: Scope): Unit defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames[SimpleFunctionDescriptorImpl]

'this' @ [114:14] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames[ReceiverParameterDescriptorImpl]

'this' @ [115:12] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.liftUsedNames[ReceiverParameterDescriptorImpl]

'Scope' @ [119:21] ==> public constructor Scope() defined in org.jetbrains.kotlin.js.inline.clean.Scope[ClassConstructorDescriptorImpl]

'accept' @ [120:5] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [120:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'rootScope' @ [121:35] ==> val rootScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes[LocalVariableDescriptor]

'x' @ [124:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'name' @ [124:15] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'let' @ [124:21] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'currentScope' @ [124:27] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'declaredNames' @ [124:40] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'it' @ [124:57] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'currentScope' @ [125:28] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'currentScope' @ [126:13] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'Scope' @ [126:28] ==> public constructor Scope() defined in org.jetbrains.kotlin.js.inline.clean.Scope[ClassConstructorDescriptorImpl]

'apply' @ [126:36] ==> @InlineOnly public inline fun <T> Scope.apply(block: Scope.() -> Unit): Scope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Scope

'parent' @ [127:17] ==> public final var parent: Scope? defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'currentScope' @ [127:26] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'currentScope' @ [128:17] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'children' @ [128:30] ==> public final val children: MutableSet<Scope> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'this' @ [128:42] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction.<anonymous>[ReceiverParameterDescriptorImpl]

'currentScope' @ [130:13] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'declaredNames' @ [130:26] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'x' @ [130:43] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'parameters' @ [130:45] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [130:56] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [130:62] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [130:65] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'super' @ [131:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [131:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [131:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'currentScope' @ [132:13] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'oldScope' @ [132:28] ==> val oldScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitFunction[LocalVariableDescriptor]

'currentScope' @ [136:13] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'declaredNames' @ [136:26] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'x' @ [136:43] ==> value-parameter x: JsCatch defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitCatch[ValueParameterDescriptorImpl]

'parameter' @ [136:45] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [136:55] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'super' @ [137:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCatch' @ [137:19] ==> public open fun visitCatch(x: JsCatch): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [137:30] ==> value-parameter x: JsCatch defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitCatch[ValueParameterDescriptorImpl]

'currentScope' @ [141:13] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'declaredNames' @ [141:26] ==> public final val declaredNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'x' @ [141:43] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [141:45] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'super' @ [142:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [142:19] ==> public open fun visit(x: JsVars.JsVar): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [142:25] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visit[ValueParameterDescriptorImpl]

'nameRef' @ [146:17] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'qualifier' @ [146:25] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'nameRef' @ [147:28] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [147:36] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'currentScope' @ [148:17] ==> public final var currentScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[PropertyDescriptorImpl]

'usedNames' @ [148:30] ==> public final val usedNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.Scope[PropertyDescriptorImpl]

'name' @ [148:43] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitNameRef[LocalVariableDescriptor]

'declareName' @ [148:66] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDynamicScope[JavaMethodDescriptor]

'nameRef' @ [148:78] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'ident' @ [148:86] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'super' @ [151:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [151:19] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [151:32] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.computeScopes.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'rootScope' @ [159:12] ==> val rootScope: Scope defined in org.jetbrains.kotlin.js.inline.clean.computeScopes[LocalVariableDescriptor]

'mutableSetOf' @ [164:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'mutableSetOf' @ [165:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'mutableSetOf' @ [166:20] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Scope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Scope

