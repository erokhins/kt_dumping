'getFirstClassifierDiscriminateHeaders' @ [33:15] ==> public inline fun <Scope, T : ClassifierDescriptor> getFirstClassifierDiscriminateHeaders(scopes: List<MemberScope>, callback: (MemberScope) -> ClassifierDescriptor?): ClassifierDescriptor? defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <Scope> -> MemberScope
    <T : ClassifierDescriptor> -> ClassifierDescriptor

'scopes' @ [33:53] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'it' @ [33:63] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [33:66] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [33:91] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [33:97] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [36:15] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <Scope> -> MemberScope
    <T> -> PropertyDescriptor

'scopes' @ [36:32] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'it' @ [36:42] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [36:45] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [36:69] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [36:75] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [39:15] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <Scope> -> MemberScope
    <T> -> SimpleFunctionDescriptor

'scopes' @ [39:32] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'it' @ [39:42] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [39:45] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [39:69] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [39:75] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [42:15] ==> public inline fun <Scope, T> getFromAllScopes(scopes: List<MemberScope>, callback: (MemberScope) -> Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <Scope> -> MemberScope
    <T> -> DeclarationDescriptor

'scopes' @ [42:32] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'it' @ [42:42] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [42:45] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [42:71] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [42:83] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'scopes' @ [44:39] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'flatMapTo' @ [44:46] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<MemberScope>.flatMapTo(destination: MutableSet<Name>, transform: (MemberScope) -> Iterable<Name>): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [44:56] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [44:74] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'getFunctionNames' @ [44:77] ==> public abstract fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'scopes' @ [45:39] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'flatMapTo' @ [45:46] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<MemberScope>.flatMapTo(destination: MutableSet<Name>, transform: (MemberScope) -> Iterable<Name>): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [45:56] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [45:74] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.getVariableNames.<anonymous>[ValueParameterDescriptorImpl]

'getVariableNames' @ [45:77] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'debugName' @ [47:31] ==> internal final val debugName: String defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'p' @ [50:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [50:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [50:19] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[LazyClassReceiverParameterDescriptor]

'java' @ [50:31] ==> public val <T> KClass<out ChainedMemberScope>.java: Class<out ChainedMemberScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ChainedMemberScope

'simpleName' @ [50:36] ==> public final val <T : (Any..Any?)> Class<out ChainedMemberScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ChainedMemberScope

'debugName' @ [50:54] ==> internal final val debugName: String defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'p' @ [51:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [51:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'scopes' @ [53:23] ==> private final val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[PropertyDescriptorImpl]

'scope' @ [54:13] ==> val scope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[LocalVariableDescriptor]

'printScopeStructure' @ [54:19] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'p' @ [54:39] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'p' @ [57:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [57:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [58:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [58:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'when (scopes.size) {
                0 -> MemberScope.Empty
                1 -> scopes.single()
                else -> ChainedMemberScope(debugName, scopes)
            }' @ [63:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope, entry1: MemberScope, entry2: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope

'scopes' @ [63:26] ==> value-parameter scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion.create[ValueParameterDescriptorImpl]

'size' @ [63:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'MemberScope' @ [64:22] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [64:34] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'scopes' @ [65:22] ==> value-parameter scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion.create[ValueParameterDescriptorImpl]

'single' @ [65:29] ==> public fun <T> List<MemberScope>.single(): MemberScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'ChainedMemberScope' @ [66:25] ==> public constructor ChainedMemberScope(debugName: String, scopes: List<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[ClassConstructorDescriptorImpl]

'debugName' @ [66:44] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion.create[ValueParameterDescriptorImpl]

'scopes' @ [66:55] ==> value-parameter scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion.create[ValueParameterDescriptorImpl]

