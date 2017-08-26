'BaseImportingScope' @ [31:5] ==> public constructor BaseImportingScope(parent: ImportingScope?) defined in org.jetbrains.kotlin.resolve.scopes.BaseImportingScope[DeserializedClassConstructorDescriptor]

'if (descriptor is ClassDescriptor) {
        listOf(descriptor.staticScope, descriptor.unsubstitutedInnerClassesScope)
    }
    else {
        assert(descriptor is PackageViewDescriptor) {
            "Must be class or package view descriptor: $descriptor"
        }
        listOf((descriptor as PackageViewDescriptor).memberScope)
    }' @ [33:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ResolutionScope>, elseBranch: List<ResolutionScope>): List<ResolutionScope>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ResolutionScope>

'descriptor' @ [33:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'listOf' @ [34:9] ==> public fun <T> listOf(vararg elements: MemberScope): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'descriptor' @ [34:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'staticScope' @ [34:27] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'descriptor' @ [34:40] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [34:51] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'assert' @ [37:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [37:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [38:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'listOf' @ [40:9] ==> public fun <T> listOf(element: MemberScope): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'descriptor' @ [40:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'memberScope' @ [40:54] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'if (excludedImportNames.isEmpty()) { // optimization
        emptySet<Name>()
    }
    else {
        val fqName = DescriptorUtils.getFqNameSafe(descriptor)
        // toSet() is used here instead mapNotNullTo(hashSetOf()) because it results in not keeping empty sets as separate instances
        excludedImportNames.mapNotNull { if (it.parent() == fqName) it.shortName() else null }.toSet()
    }' @ [43:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<Name>, elseBranch: Set<Name>): Set<Name>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<Name>

'excludedImportNames' @ [43:48] ==> value-parameter excludedImportNames: Collection<FqName> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'isEmpty' @ [43:68] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptySet' @ [44:9] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'getFqNameSafe' @ [47:38] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [47:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'excludedImportNames' @ [49:9] ==> value-parameter excludedImportNames: Collection<FqName> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.<init>[ValueParameterDescriptorImpl]

'mapNotNull' @ [49:29] ==> public inline fun <T, R : Any> Iterable<FqName>.mapNotNull(transform: (FqName) -> Name?): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R : Any> -> Name

'if (it.parent() == fqName) it.shortName() else null' @ [49:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'it' @ [49:46] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.excludedNames.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [49:49] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [49:61] ==> val fqName: FqName defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.excludedNames[LocalVariableDescriptor]

'it' @ [49:69] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.excludedNames.<anonymous>[ValueParameterDescriptorImpl]

'shortName' @ [49:72] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'toSet' @ [49:96] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'if (excludedNames.isEmpty()) { // optimization
            nameFilter
        }
        else {
            { it !in excludedNames && nameFilter(it) }
        }' @ [57:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Name) -> Boolean, elseBranch: (Name) -> Boolean): (Name) -> Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<Name, Boolean>

'excludedNames' @ [57:35] ==> private final val excludedNames: Set<Name> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'isEmpty' @ [57:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'nameFilter' @ [58:13] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'it' @ [61:15] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'excludedNames' @ [61:22] ==> private final val excludedNames: Set<Name> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'invoke' @ [61:39] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [61:50] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'kindFilter' @ [64:36] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'withoutKinds' @ [64:47] ==> public final fun withoutKinds(kinds: Int): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [64:60] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'PACKAGES_MASK' @ [64:81] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'scopes' @ [65:16] ==> private final val scopes: List<ResolutionScope> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'flatMap' @ [66:18] ==> public inline fun <T, R> Iterable<ResolutionScope>.flatMap(transform: (ResolutionScope) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionScope
    <R> -> DeclarationDescriptor

'it' @ [66:28] ==> value-parameter it: ResolutionScope defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [66:31] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'noPackagesKindFilter' @ [66:57] ==> val noPackagesKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors[LocalVariableDescriptor]

'nameFilterToUse' @ [66:79] ==> val nameFilterToUse: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors[LocalVariableDescriptor]

'filter' @ [67:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [67:27] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [71:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'excludedNames' @ [71:21] ==> private final val excludedNames: Set<Name> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'scopes' @ [72:16] ==> private final val scopes: List<ResolutionScope> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'asSequence' @ [72:23] ==> public fun <T> Iterable<ResolutionScope>.asSequence(): Sequence<ResolutionScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionScope

'mapNotNull' @ [72:36] ==> public fun <T, R : Any> Sequence<ResolutionScope>.mapNotNull(transform: (ResolutionScope) -> ClassifierDescriptor?): Sequence<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionScope
    <R : Any> -> ClassifierDescriptor

'it' @ [72:49] ==> value-parameter it: ResolutionScope defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [72:52] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [72:77] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [72:83] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'singleOrNull' @ [72:95] ==> public fun <T> Sequence<ClassifierDescriptor>.singleOrNull(): ClassifierDescriptor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'name' @ [76:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedVariables[ValueParameterDescriptorImpl]

'excludedNames' @ [76:21] ==> private final val excludedNames: Set<Name> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'emptyList' @ [76:43] ==> public fun <T> emptyList(): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'scopes' @ [77:16] ==> private final val scopes: List<ResolutionScope> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'flatMap' @ [77:23] ==> public inline fun <T, R> Iterable<ResolutionScope>.flatMap(transform: (ResolutionScope) -> Iterable<VariableDescriptor>): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionScope
    <R> -> VariableDescriptor

'it' @ [77:33] ==> value-parameter it: ResolutionScope defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [77:36] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [77:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [77:66] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedVariables[ValueParameterDescriptorImpl]

'name' @ [81:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedFunctions[ValueParameterDescriptorImpl]

'excludedNames' @ [81:21] ==> private final val excludedNames: Set<Name> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'emptyList' @ [81:43] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'scopes' @ [82:16] ==> private final val scopes: List<ResolutionScope> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[PropertyDescriptorImpl]

'flatMap' @ [82:23] ==> public inline fun <T, R> Iterable<ResolutionScope>.flatMap(transform: (ResolutionScope) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionScope
    <R> -> FunctionDescriptor

'it' @ [82:33] ==> value-parameter it: ResolutionScope defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [82:36] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [82:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [82:66] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.getContributedFunctions[ValueParameterDescriptorImpl]

'p' @ [86:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.AllUnderImportScope.printStructure[ValueParameterDescriptorImpl]

'println' @ [86:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [86:19] ==> <this> defined in org.jetbrains.kotlin.resolve.AllUnderImportScope[LazyClassReceiverParameterDescriptor]

'java' @ [86:31] ==> public val <T> KClass<out AllUnderImportScope>.java: Class<out AllUnderImportScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AllUnderImportScope

'simpleName' @ [86:36] ==> public final val <T : (Any..Any?)> Class<out AllUnderImportScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AllUnderImportScope

