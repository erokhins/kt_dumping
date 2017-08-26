'JvmOverloads' @ [28:27] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'Deprecated' @ [35:9] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'parent' @ [38:27] ==> value-parameter parent: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.<init>[ValueParameterDescriptorImpl]

'takeSnapshot' @ [38:34] ==> public fun HierarchicalScope.takeSnapshot(): HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'getFromAllScopes' @ [41:15] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> DeclarationDescriptor

'memberScopes' @ [41:32] ==> private final val memberScopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'it' @ [41:48] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [41:51] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'getFirstClassifierDiscriminateHeaders' @ [43:83] ==> public inline fun <Scope, T : ClassifierDescriptor> getFirstClassifierDiscriminateHeaders(scopes: List<MemberScope>, callback: (MemberScope) -> ClassifierDescriptor?): ClassifierDescriptor? defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T : ClassifierDescriptor> -> ClassifierDescriptor

'memberScopes' @ [43:121] ==> private final val memberScopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'it' @ [43:137] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [43:140] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [43:165] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [43:171] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedClassifier[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [45:82] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> PropertyDescriptor

'memberScopes' @ [45:99] ==> private final val memberScopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'it' @ [45:115] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [45:118] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [45:142] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [45:148] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedVariables[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [47:82] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> SimpleFunctionDescriptor

'memberScopes' @ [47:99] ==> private final val memberScopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'it' @ [47:115] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [47:118] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [47:142] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [47:148] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.getContributedFunctions[ValueParameterDescriptorImpl]

'kind' @ [49:39] ==> public open val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'toString' @ [49:44] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[DeserializedSimpleFunctionDescriptor]

'p' @ [52:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'println' @ [52:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [52:19] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[LazyClassReceiverParameterDescriptor]

'java' @ [52:31] ==> public val <T> KClass<out LexicalChainedScope>.java: Class<out LexicalChainedScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out LexicalChainedScope)

'simpleName' @ [52:36] ==> public final val <T : (Any..Any?)> Class<out LexicalChainedScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out LexicalChainedScope)

'kind' @ [52:54] ==> public open val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'ownerDescriptor' @ [52:82] ==> public open val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'name' @ [52:98] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'implicitReceiver' @ [53:47] ==> public open val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'value' @ [53:65] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'p' @ [54:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [54:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'memberScopes' @ [56:23] ==> private final val memberScopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'scope' @ [57:13] ==> val scope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[LocalVariableDescriptor]

'printScopeStructure' @ [57:19] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'p' @ [57:39] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'p' @ [60:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'print' @ [60:11] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'parent' @ [61:9] ==> public open val parent: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[PropertyDescriptorImpl]

'printStructure' @ [61:16] ==> public abstract fun printStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[SimpleFunctionDescriptorImpl]

'p' @ [61:31] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'withholdIndentOnce' @ [61:33] ==> @NotNull public open fun withholdIndentOnce(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [63:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'popIndent' @ [63:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [64:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope.printStructure[ValueParameterDescriptorImpl]

'println' @ [64:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

