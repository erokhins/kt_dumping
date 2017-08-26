'generateSequence' @ [29:13] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: HierarchicalScope?, nextFunction: (HierarchicalScope) -> HierarchicalScope?): Sequence<HierarchicalScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> HierarchicalScope

'this' @ [29:30] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.parentsWithSelf[ReceiverParameterDescriptorImpl]

'it' @ [29:38] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.<get-parentsWithSelf>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [29:41] ==> public abstract val parent: HierarchicalScope? defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[PropertyDescriptorImpl]

'parentsWithSelf' @ [32:13] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[PropertyDescriptorImpl]

'drop' @ [32:29] ==> public fun <T> Sequence<HierarchicalScope>.drop(n: Int): Sequence<HierarchicalScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'collectFromMeAndParent' @ [37:87] ==> private inline fun <T : Any> HierarchicalScope.collectFromMeAndParent(collect: (HierarchicalScope) -> ReceiverParameterDescriptor?): List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ReceiverParameterDescriptor

'it' @ [38:6] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.getImplicitReceiversHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'implicitReceiver' @ [38:28] ==> public abstract val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'collectAllFromMeAndParent' @ [41:95] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'if (it is LexicalScope && it.isOwnerDescriptorAccessibleByLabel && it.ownerDescriptor.name == labelName) {
        listOf(it.ownerDescriptor)
    }
    else {
        listOf()
    }' @ [42:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<DeclarationDescriptor>, elseBranch: List<DeclarationDescriptor>): List<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<DeclarationDescriptor>

'it' @ [42:9] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.getDeclarationsByLabel.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [42:31] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.getDeclarationsByLabel.<anonymous>[ValueParameterDescriptorImpl]

'isOwnerDescriptorAccessibleByLabel' @ [42:34] ==> public abstract val isOwnerDescriptorAccessibleByLabel: Boolean defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'it' @ [42:72] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.getDeclarationsByLabel.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [42:75] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'name' @ [42:91] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'labelName' @ [42:99] ==> value-parameter labelName: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.getDeclarationsByLabel[ValueParameterDescriptorImpl]

'listOf' @ [43:9] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [43:16] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.getDeclarationsByLabel.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [43:19] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'listOf' @ [46:9] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorKindFilter' @ [52:44] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'ALL' @ [52:65] ==> @field:JvmField public final val ALL: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'kindFilter' @ [56:9] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'kindMask' @ [56:20] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'listOf' @ [56:42] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'collectAllFromMeAndParent' @ [57:12] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'if (it is ImportingScope)
            it.getContributedDescriptors(kindFilter, nameFilter, changeNamesForAliased)
        else
            it.getContributedDescriptors(kindFilter, nameFilter)' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<DeclarationDescriptor>, elseBranch: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<DeclarationDescriptor>

'it' @ [58:13] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [59:13] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [59:16] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [59:42] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'nameFilter' @ [59:54] ==> value-parameter nameFilter: (Name) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'changeNamesForAliased' @ [59:66] ==> value-parameter changeNamesForAliased: Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'it' @ [61:13] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [61:16] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [61:42] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'nameFilter' @ [61:54] ==> value-parameter nameFilter: (Name) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'filter' @ [62:7] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'kindFilter' @ [62:16] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered[ValueParameterDescriptorImpl]

'accepts' @ [62:27] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'it' @ [62:35] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [62:42] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [62:53] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.utils.collectDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [62:56] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'Deprecated' @ [65:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'findFirstFromMeAndParent' @ [66:12] ==> public inline fun <T : Any> HierarchicalScope.findFirstFromMeAndParent(fetch: (HierarchicalScope) -> VariableDescriptor?): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> VariableDescriptor

'when {
            it is LexicalScopeWrapper -> it.delegate.findLocalVariable(name)

            it !is ImportingScope && it !is LexicalChainedScope -> it.getContributedVariables(name, NoLookupLocation.WHEN_GET_LOCAL_VARIABLE).singleOrNull() /* todo check this*/

            else -> null
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VariableDescriptor?, entry1: VariableDescriptor?, entry2: VariableDescriptor?): VariableDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VariableDescriptor?

'it' @ [68:13] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [68:42] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable.<anonymous>[ValueParameterDescriptorImpl]

'delegate' @ [68:45] ==> public final val delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'findLocalVariable' @ [68:54] ==> @Deprecated public fun LexicalScope.findLocalVariable(name: Name): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [68:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable[ValueParameterDescriptorImpl]

'it' @ [70:13] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:38] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:68] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [70:71] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [70:95] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findLocalVariable[ValueParameterDescriptorImpl]

'WHEN_GET_LOCAL_VARIABLE' @ [70:118] ==> enum entry WHEN_GET_LOCAL_VARIABLE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'singleOrNull' @ [70:143] ==> public fun <T> Iterable<VariableDescriptor>.singleOrNull(): VariableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'findFirstFromMeAndParent' @ [78:11] ==> public inline fun <T : Any> HierarchicalScope.findFirstFromMeAndParent(fetch: (HierarchicalScope) -> ClassifierDescriptor?): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'it' @ [78:38] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findClassifier.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [78:41] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [78:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findClassifier[ValueParameterDescriptorImpl]

'location' @ [78:72] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.findClassifier[ValueParameterDescriptorImpl]

'findFirstFromImportingScopes' @ [81:11] ==> public inline fun <T : Any> HierarchicalScope.findFirstFromImportingScopes(fetch: (ImportingScope) -> PackageViewDescriptor?): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> PackageViewDescriptor

'it' @ [81:42] ==> value-parameter it: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findPackage.<anonymous>[ValueParameterDescriptorImpl]

'getContributedPackage' @ [81:45] ==> public abstract fun getContributedPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[SimpleFunctionDescriptorImpl]

'name' @ [81:67] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findPackage[ValueParameterDescriptorImpl]

'collectAllFromMeAndParent' @ [84:11] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<VariableDescriptor>): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> VariableDescriptor

'it' @ [84:39] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectVariables.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [84:42] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [84:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.collectVariables[ValueParameterDescriptorImpl]

'location' @ [84:72] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.collectVariables[ValueParameterDescriptorImpl]

'collectAllFromMeAndParent' @ [87:11] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<FunctionDescriptor>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> FunctionDescriptor

'it' @ [87:39] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [87:42] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [87:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFunctions[ValueParameterDescriptorImpl]

'location' @ [87:72] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFunctions[ValueParameterDescriptorImpl]

'processForMeAndParent' @ [90:5] ==> public inline fun HierarchicalScope.processForMeAndParent(process: (HierarchicalScope) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'it' @ [91:9] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findVariable.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [91:12] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [91:36] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findVariable[ValueParameterDescriptorImpl]

'location' @ [91:42] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.findVariable[ValueParameterDescriptorImpl]

'firstOrNull' @ [91:52] ==> public inline fun <T> Iterable<VariableDescriptor>.firstOrNull(predicate: (VariableDescriptor) -> Boolean): VariableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'predicate' @ [91:64] ==> value-parameter predicate: (VariableDescriptor) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.findVariable[ValueParameterDescriptorImpl]

'let' @ [91:76] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Nothing

'it' @ [91:89] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.scopes.utils.findVariable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'processForMeAndParent' @ [97:5] ==> public inline fun HierarchicalScope.processForMeAndParent(process: (HierarchicalScope) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'it' @ [98:9] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findFunction.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [98:12] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [98:36] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.findFunction[ValueParameterDescriptorImpl]

'location' @ [98:42] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.findFunction[ValueParameterDescriptorImpl]

'firstOrNull' @ [98:52] ==> public inline fun <T> Iterable<FunctionDescriptor>.firstOrNull(predicate: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'predicate' @ [98:64] ==> value-parameter predicate: (FunctionDescriptor) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.findFunction[ValueParameterDescriptorImpl]

'let' @ [98:76] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Nothing

'it' @ [98:89] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.scopes.utils.findFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (this is LexicalWritableScope) takeSnapshot() else this' @ [103:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HierarchicalScope, elseBranch: HierarchicalScope): HierarchicalScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HierarchicalScope

'this' @ [103:63] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.takeSnapshot[ReceiverParameterDescriptorImpl]

'takeSnapshot' @ [103:93] ==> public final fun takeSnapshot(): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalWritableScope[SimpleFunctionDescriptorImpl]

'this' @ [103:113] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.takeSnapshot[ReceiverParameterDescriptorImpl]

'JvmOverloads' @ [105:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'MemberScopeToImportingScopeAdapter' @ [105:114] ==> public constructor MemberScopeToImportingScopeAdapter(parent: ImportingScope?, memberScope: MemberScope) defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[ClassConstructorDescriptorImpl]

'parentScope' @ [105:149] ==> value-parameter parentScope: ImportingScope? = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.memberScopeAsImportingScope[ValueParameterDescriptorImpl]

'this' @ [105:162] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.memberScopeAsImportingScope[ReceiverParameterDescriptorImpl]

'memberScope' @ [111:15] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'getContributedDescriptors' @ [111:27] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [111:53] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [111:65] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedDescriptors[ValueParameterDescriptorImpl]

'memberScope' @ [113:83] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'getContributedClassifier' @ [113:95] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [113:120] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [113:126] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedClassifier[ValueParameterDescriptorImpl]

'memberScope' @ [115:82] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'getContributedVariables' @ [115:94] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [115:118] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [115:124] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedVariables[ValueParameterDescriptorImpl]

'memberScope' @ [117:82] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'getContributedFunctions' @ [117:94] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [117:118] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [117:124] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.getContributedFunctions[ValueParameterDescriptorImpl]

'other' @ [119:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.equals[ValueParameterDescriptorImpl]

'other' @ [119:87] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.equals[ValueParameterDescriptorImpl]

'memberScope' @ [119:93] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'memberScope' @ [119:108] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'memberScope' @ [121:31] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'hashCode' @ [121:43] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'this' @ [123:34] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[LazyClassReceiverParameterDescriptor]

'java' @ [123:46] ==> public val <T> KClass<out MemberScopeToImportingScopeAdapter>.java: Class<out MemberScopeToImportingScopeAdapter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MemberScopeToImportingScopeAdapter

'simpleName' @ [123:51] ==> public final val <T : (Any..Any?)> Class<out MemberScopeToImportingScopeAdapter>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MemberScopeToImportingScopeAdapter

'memberScope' @ [123:68] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'p' @ [126:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.printStructure[ValueParameterDescriptorImpl]

'println' @ [126:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [126:19] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[LazyClassReceiverParameterDescriptor]

'java' @ [126:31] ==> public val <T> KClass<out MemberScopeToImportingScopeAdapter>.java: Class<out MemberScopeToImportingScopeAdapter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MemberScopeToImportingScopeAdapter

'simpleName' @ [126:36] ==> public final val <T : (Any..Any?)> Class<out MemberScopeToImportingScopeAdapter>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MemberScopeToImportingScopeAdapter

'p' @ [127:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.printStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [127:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'memberScope' @ [129:9] ==> public final val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter[PropertyDescriptorImpl]

'printScopeStructure' @ [129:21] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'p' @ [129:41] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.printStructure[ValueParameterDescriptorImpl]

'withholdIndentOnce' @ [129:43] ==> @NotNull public open fun withholdIndentOnce(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [131:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.printStructure[ValueParameterDescriptorImpl]

'popIndent' @ [131:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [132:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.utils.MemberScopeToImportingScopeAdapter.printStructure[ValueParameterDescriptorImpl]

'println' @ [132:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [137:24] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.processForMeAndParent[ReceiverParameterDescriptorImpl]

'invoke' @ [139:9] ==> public abstract operator fun invoke(p1: HierarchicalScope): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'currentScope' @ [139:17] ==> var currentScope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.processForMeAndParent[LocalVariableDescriptor]

'currentScope' @ [140:9] ==> var currentScope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.processForMeAndParent[LocalVariableDescriptor]

'currentScope' @ [140:24] ==> var currentScope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.processForMeAndParent[LocalVariableDescriptor]

'parent' @ [140:37] ==> public abstract val parent: HierarchicalScope? defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[PropertyDescriptorImpl]

'processForMeAndParent' @ [148:5] ==> public inline fun HierarchicalScope.processForMeAndParent(process: (HierarchicalScope) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'invoke' @ [149:23] ==> public abstract operator fun invoke(p1: HierarchicalScope): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [149:31] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [150:13] ==> val element: T? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent.<anonymous>[LocalVariableDescriptor]

'result' @ [151:17] ==> var result: MutableList<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent[LocalVariableDescriptor]

'result' @ [152:17] ==> var result: MutableList<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent[LocalVariableDescriptor]

'SmartList' @ [152:26] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'result' @ [154:13] ==> var result: MutableList<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent[LocalVariableDescriptor]

'add' @ [154:22] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [154:26] ==> val element: T? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent.<anonymous>[LocalVariableDescriptor]

'result' @ [157:12] ==> var result: MutableList<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectFromMeAndParent[LocalVariableDescriptor]

'emptyList' @ [157:22] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'processForMeAndParent' @ [164:5] ==> public inline fun HierarchicalScope.processForMeAndParent(process: (HierarchicalScope) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'result' @ [164:29] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromMeAndParent[LocalVariableDescriptor]

'result' @ [164:38] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromMeAndParent[LocalVariableDescriptor]

'concat' @ [164:45] ==> public fun <T> Collection<T>?.concat(collection: Collection<T>): Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [164:52] ==> public abstract operator fun invoke(p1: HierarchicalScope): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [164:60] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromMeAndParent.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [165:12] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromMeAndParent[LocalVariableDescriptor]

'emptySet' @ [165:22] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'processForMeAndParent' @ [169:5] ==> public inline fun HierarchicalScope.processForMeAndParent(process: (HierarchicalScope) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'invoke' @ [169:29] ==> public abstract operator fun invoke(p1: HierarchicalScope): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [169:35] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findFirstFromMeAndParent.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [169:40] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Nothing

'it' @ [169:53] ==> value-parameter it: T defined in org.jetbrains.kotlin.resolve.scopes.utils.findFirstFromMeAndParent.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'collectAllFromMeAndParent' @ [176:12] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<T>): Collection<T> defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'if (it is ImportingScope) collect(it) else emptyList()' @ [176:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<T>, elseBranch: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<T>

'it' @ [176:44] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [176:66] ==> public abstract operator fun invoke(p1: ImportingScope): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [176:74] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.collectAllFromImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [176:83] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'findFirstFromMeAndParent' @ [180:12] ==> public inline fun <T : Any> HierarchicalScope.findFirstFromMeAndParent(fetch: (HierarchicalScope) -> T?): T? defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'if (it is ImportingScope) fetch(it) else null' @ [180:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'it' @ [180:43] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findFirstFromImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [180:65] ==> public abstract operator fun invoke(p1: ImportingScope): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [180:71] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.findFirstFromImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [184:28] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[PropertyDescriptorImpl]

'last' @ [184:44] ==> public inline fun <T> Sequence<HierarchicalScope>.last(predicate: (HierarchicalScope) -> Boolean): HierarchicalScope defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'it' @ [184:51] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'lastLexicalScope' @ [185:26] ==> val lastLexicalScope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScopes[LocalVariableDescriptor]

'parent' @ [185:43] ==> public abstract val parent: HierarchicalScope? defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[PropertyDescriptorImpl]

'chainImportingScopes' @ [186:29] ==> public fun chainImportingScopes(scopes: List<ImportingScope>, tail: ImportingScope? = ...): ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'importScopes' @ [186:50] ==> value-parameter importScopes: List<ImportingScope> defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScopes[ValueParameterDescriptorImpl]

'firstImporting' @ [186:64] ==> val firstImporting: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScopes[LocalVariableDescriptor]

'replaceImportingScopes' @ [187:12] ==> public fun LexicalScope.replaceImportingScopes(importingScopeChain: ImportingScope?): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'newFirstImporting' @ [187:35] ==> val newFirstImporting: ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScopes[LocalVariableDescriptor]

'addImportingScopes' @ [191:11] ==> public fun LexicalScope.addImportingScopes(importScopes: List<ImportingScope>): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[SimpleFunctionDescriptorImpl]

'listOf' @ [191:30] ==> public fun <T> listOf(element: ImportingScope): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportingScope

'importScope' @ [191:37] ==> value-parameter importScope: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.addImportingScope[ValueParameterDescriptorImpl]

'this' @ [194:38] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.withParent[ReceiverParameterDescriptorImpl]

'newParent' @ [196:21] ==> value-parameter newParent: ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils.withParent[ValueParameterDescriptorImpl]

'importingScopeChain' @ [201:34] ==> value-parameter importingScopeChain: ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[ValueParameterDescriptorImpl]

'Empty' @ [201:72] ==> public object Empty : BaseImportingScope defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[FakeCallableDescriptorForObject]

'this' @ [202:9] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[ReceiverParameterDescriptorImpl]

'LexicalScopeWrapper' @ [203:16] ==> public constructor LexicalScopeWrapper(delegate: LexicalScope, newImportingScopeChain: ImportingScope) defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[ClassConstructorDescriptorImpl]

'this' @ [203:36] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[ReceiverParameterDescriptorImpl]

'delegate' @ [203:41] ==> public final val delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'newImportingScopeChain' @ [203:51] ==> val newImportingScopeChain: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[LocalVariableDescriptor]

'LexicalScopeWrapper' @ [205:12] ==> public constructor LexicalScopeWrapper(delegate: LexicalScope, newImportingScopeChain: ImportingScope) defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[ClassConstructorDescriptorImpl]

'this' @ [205:32] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[ReceiverParameterDescriptorImpl]

'newImportingScopeChain' @ [205:38] ==> val newImportingScopeChain: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.replaceImportingScopes[LocalVariableDescriptor]

'LexicalScopeImpl' @ [209:12] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[ClassConstructorDescriptorImpl]

'parent' @ [210:13] ==> public abstract val parent: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'ownerDescriptor' @ [210:21] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'isOwnerDescriptorAccessibleByLabel' @ [210:38] ==> public abstract val isOwnerDescriptorAccessibleByLabel: Boolean defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'newReceiver' @ [211:13] ==> value-parameter newReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils.createScopeForDestructuring[ValueParameterDescriptorImpl]

'FUNCTION_HEADER_FOR_DESTRUCTURING' @ [212:30] ==> enum entry FUNCTION_HEADER_FOR_DESTRUCTURING defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'delegate' @ [216:124] ==> value-parameter delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper.<init>[ValueParameterDescriptorImpl]

'assert' @ [218:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delegate' @ [218:16] ==> public final val delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'lazy' @ [223:47] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> HierarchicalScope): Lazy<HierarchicalScope> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'NONE' @ [223:73] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'assert' @ [224:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delegate' @ [224:16] ==> public final val delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'delegate' @ [226:22] ==> public final val delegate: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'parent' @ [226:31] ==> public abstract val parent: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'if (parent is LexicalScope) {
            parent.replaceImportingScopes(newImportingScopeChain)
        }
        else {
            newImportingScopeChain
        }' @ [227:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HierarchicalScope, elseBranch: HierarchicalScope): HierarchicalScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HierarchicalScope

'parent' @ [227:13] ==> val parent: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper.parent.<anonymous>[LocalVariableDescriptor]

'parent' @ [228:13] ==> val parent: HierarchicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper.parent.<anonymous>[LocalVariableDescriptor]

'replaceImportingScopes' @ [228:20] ==> public fun LexicalScope.replaceImportingScopes(importingScopeChain: ImportingScope?): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'newImportingScopeChain' @ [228:43] ==> public final val newImportingScopeChain: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'newImportingScopeChain' @ [231:13] ==> public final val newImportingScopeChain: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'kind' @ [235:31] ==> public open val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.utils.LexicalScopeWrapper[PropertyDescriptorImpl]

'toString' @ [235:36] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[DeserializedSimpleFunctionDescriptor]

'scopes' @ [239:12] ==> value-parameter scopes: List<ImportingScope> defined in org.jetbrains.kotlin.resolve.scopes.utils.chainImportingScopes[ValueParameterDescriptorImpl]

'asReversed' @ [239:19] ==> public fun <T> List<ImportingScope>.asReversed(): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportingScope

'fold' @ [240:14] ==> public inline fun <T, R> Iterable<ImportingScope>.fold(initial: ImportingScope?, operation: (ImportingScope?, ImportingScope) -> ImportingScope?): ImportingScope? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportingScope
    <R> -> ImportingScope?

'tail' @ [240:19] ==> value-parameter tail: ImportingScope? = ... defined in org.jetbrains.kotlin.resolve.scopes.utils.chainImportingScopes[ValueParameterDescriptorImpl]

'assert' @ [241:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'scope' @ [241:24] ==> value-parameter scope: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.chainImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [241:30] ==> public abstract val parent: ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[PropertyDescriptorImpl]

'scope' @ [242:17] ==> value-parameter scope: ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils.chainImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'withParent' @ [242:23] ==> public fun ImportingScope.withParent(newParent: ImportingScope?): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'current' @ [242:34] ==> value-parameter current: ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils.chainImportingScopes.<anonymous>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [248:23] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [251:23] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [253:23] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [255:23] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'THROWING' @ [257:34] ==> enum entry THROWING defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'IllegalStateException' @ [260:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [263:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [266:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [269:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [272:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

