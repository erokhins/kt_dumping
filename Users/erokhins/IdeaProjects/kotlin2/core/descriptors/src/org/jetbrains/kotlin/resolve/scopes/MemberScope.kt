'MemberScopeImpl' @ [41:20] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[ClassConstructorDescriptorImpl]

'p' @ [43:13] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Empty.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [43:15] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'emptySet' @ [46:43] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'emptySet' @ [47:43] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'DescriptorKindFilter' @ [59:44] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'ALL' @ [59:65] ==> @JvmField public final val ALL: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'kindFilter' @ [62:9] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered[ValueParameterDescriptorImpl]

'kindMask' @ [62:20] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'listOf' @ [62:42] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getContributedDescriptors' @ [63:12] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [63:38] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered[ValueParameterDescriptorImpl]

'nameFilter' @ [63:50] ==> value-parameter nameFilter: (Name) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered[ValueParameterDescriptorImpl]

'filter' @ [63:62] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'kindFilter' @ [63:71] ==> value-parameter kindFilter: DescriptorKindFilter = ... defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered[ValueParameterDescriptorImpl]

'accepts' @ [63:82] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'it' @ [63:90] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [63:97] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [63:108] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.getDescriptorsFiltered.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [63:111] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'listOf' @ [68:53] ==> @InlineOnly public inline fun <T> listOf(): List<DescriptorKindExclude> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindExclude

'kindMask' @ [73:20] ==> value-parameter kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.<init>[ValueParameterDescriptorImpl]

'excludes' @ [74:9] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'forEach' @ [74:18] ==> @HidesMembers public inline fun <T> Iterable<DescriptorKindExclude>.forEach(action: (DescriptorKindExclude) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindExclude

'mask' @ [74:28] ==> var mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.<init>[LocalVariableDescriptor]

'mask' @ [74:35] ==> var mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.<init>[LocalVariableDescriptor]

'it' @ [74:44] ==> value-parameter it: DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'fullyExcludedDescriptorKinds' @ [74:47] ==> public abstract val fullyExcludedDescriptorKinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[PropertyDescriptorImpl]

'inv' @ [74:76] ==> public final fun inv(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [75:9] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[LazyClassReceiverParameterDescriptor]

'kindMask' @ [75:14] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'mask' @ [75:25] ==> var mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.<init>[LocalVariableDescriptor]

'kindMask' @ [79:15] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'descriptor' @ [79:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.accepts[ValueParameterDescriptorImpl]

'kind' @ [79:39] ==> private final fun DeclarationDescriptor.kind(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'excludes' @ [79:54] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'all' @ [79:63] ==> public inline fun <T> Iterable<DescriptorKindExclude>.all(predicate: (DescriptorKindExclude) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindExclude

'!' @ [79:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [79:70] ==> value-parameter it: DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.accepts.<anonymous>[ValueParameterDescriptorImpl]

'excludes' @ [79:73] ==> public abstract fun excludes(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[SimpleFunctionDescriptorImpl]

'descriptor' @ [79:82] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.accepts[ValueParameterDescriptorImpl]

'kindMask' @ [82:15] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kinds' @ [82:28] ==> value-parameter kinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.acceptsKinds[ValueParameterDescriptorImpl]

'DescriptorKindFilter' @ [85:15] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'kindMask' @ [85:36] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'excludes' @ [85:46] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'listOf' @ [85:57] ==> public fun <T> listOf(element: DescriptorKindExclude): List<DescriptorKindExclude> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindExclude

'exclude' @ [85:64] ==> value-parameter exclude: DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.exclude[ValueParameterDescriptorImpl]

'DescriptorKindFilter' @ [88:15] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'kindMask' @ [88:36] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kinds' @ [88:49] ==> value-parameter kinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.withoutKinds[ValueParameterDescriptorImpl]

'inv' @ [88:55] ==> public final fun inv(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'excludes' @ [88:62] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'DescriptorKindFilter' @ [91:15] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'kindMask' @ [91:36] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kinds' @ [91:48] ==> value-parameter kinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.withKinds[ValueParameterDescriptorImpl]

'excludes' @ [91:55] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'DescriptorKindFilter' @ [94:15] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'kindMask' @ [94:36] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kinds' @ [94:49] ==> value-parameter kinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.restrictedToKinds[ValueParameterDescriptorImpl]

'excludes' @ [94:56] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kindMask' @ [97:20] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'kinds' @ [97:33] ==> value-parameter kinds: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.restrictedToKindsOrNull[ValueParameterDescriptorImpl]

'mask' @ [98:13] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.restrictedToKindsOrNull[LocalVariableDescriptor]

'DescriptorKindFilter' @ [99:16] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'mask' @ [99:37] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.restrictedToKindsOrNull[LocalVariableDescriptor]

'excludes' @ [99:43] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'DescriptorKindFilter' @ [102:50] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'kindMask' @ [102:71] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'other' @ [102:84] ==> value-parameter other: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.intersect[ValueParameterDescriptorImpl]

'kindMask' @ [102:90] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'excludes' @ [102:100] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'other' @ [102:111] ==> value-parameter other: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.intersect[ValueParameterDescriptorImpl]

'excludes' @ [102:117] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'DEBUG_PREDEFINED_FILTERS_MASK_NAMES' @ [105:36] ==> private final val DEBUG_PREDEFINED_FILTERS_MASK_NAMES: List<DescriptorKindFilter.Companion.MaskToName> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'firstOrNull' @ [105:72] ==> public inline fun <T> Iterable<DescriptorKindFilter.Companion.MaskToName>.firstOrNull(predicate: (DescriptorKindFilter.Companion.MaskToName) -> Boolean): DescriptorKindFilter.Companion.MaskToName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MaskToName

'it' @ [105:86] ==> value-parameter it: DescriptorKindFilter.Companion.MaskToName defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.toString.<anonymous>[ValueParameterDescriptorImpl]

'mask' @ [105:89] ==> public final val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[PropertyDescriptorImpl]

'kindMask' @ [105:97] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'name' @ [105:110] ==> public final val name: String defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[PropertyDescriptorImpl]

'predefinedFilterName' @ [106:26] ==> val predefinedFilterName: String? defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.toString[LocalVariableDescriptor]

'DEBUG_MASK_BIT_NAMES' @ [106:50] ==> private final val DEBUG_MASK_BIT_NAMES: List<DescriptorKindFilter.Companion.MaskToName> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'mapNotNull' @ [107:18] ==> public inline fun <T, R : Any> Iterable<DescriptorKindFilter.Companion.MaskToName>.mapNotNull(transform: (DescriptorKindFilter.Companion.MaskToName) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MaskToName
    <R : Any> -> String

'if (acceptsKinds(it.mask)) it.name else null' @ [107:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'acceptsKinds' @ [107:35] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'it' @ [107:48] ==> value-parameter it: DescriptorKindFilter.Companion.MaskToName defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.toString.<anonymous>[ValueParameterDescriptorImpl]

'mask' @ [107:51] ==> public final val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[PropertyDescriptorImpl]

'it' @ [107:58] ==> value-parameter it: DescriptorKindFilter.Companion.MaskToName defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.toString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [107:61] ==> public final val name: String defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[PropertyDescriptorImpl]

'joinToString' @ [108:18] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'kindString' @ [110:39] ==> val kindString: String defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.toString[LocalVariableDescriptor]

'excludes' @ [110:52] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'when (this) {
            is ClassDescriptor -> if (this.kind.isSingleton) SINGLETON_CLASSIFIERS_MASK else NON_SINGLETON_CLASSIFIERS_MASK
            is TypeAliasDescriptor -> TYPE_ALIASES_MASK
            is ClassifierDescriptor -> NON_SINGLETON_CLASSIFIERS_MASK
            is PackageFragmentDescriptor, is PackageViewDescriptor -> PACKAGES_MASK
            is FunctionDescriptor -> FUNCTIONS_MASK
            is VariableDescriptor -> VARIABLES_MASK
            else -> 0
        }' @ [114:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int, entry5: Int, entry6: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'this' @ [114:22] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.kind[ReceiverParameterDescriptorImpl]

'if (this.kind.isSingleton) SINGLETON_CLASSIFIERS_MASK else NON_SINGLETON_CLASSIFIERS_MASK' @ [115:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'this' @ [115:39] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.kind[ReceiverParameterDescriptorImpl]

'kind' @ [115:44] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [115:49] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'SINGLETON_CLASSIFIERS_MASK' @ [115:62] ==> public final val SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [115:94] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'TYPE_ALIASES_MASK' @ [116:39] ==> public final val TYPE_ALIASES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [117:40] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'PACKAGES_MASK' @ [118:71] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'FUNCTIONS_MASK' @ [119:38] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'VARIABLES_MASK' @ [120:38] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'nextMaskValue' @ [127:34] ==> private final var nextMaskValue: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'apply' @ [127:48] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'nextMaskValue' @ [127:56] ==> private final var nextMaskValue: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'nextMaskValue' @ [127:72] ==> private final var nextMaskValue: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'nextMask' @ [129:51] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [130:47] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [131:38] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [132:34] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [133:35] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [134:35] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'nextMask' @ [136:35] ==> private final fun nextMask(): Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [137:37] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'SINGLETON_CLASSIFIERS_MASK' @ [137:71] ==> public final val SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'TYPE_ALIASES_MASK' @ [137:101] ==> public final val TYPE_ALIASES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'SINGLETON_CLASSIFIERS_MASK' @ [138:32] ==> public final val SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'FUNCTIONS_MASK' @ [138:62] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'VARIABLES_MASK' @ [138:80] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'FUNCTIONS_MASK' @ [139:35] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'VARIABLES_MASK' @ [139:53] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [141:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [141:51] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'ALL_KINDS_MASK' @ [141:72] ==> public final val ALL_KINDS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [142:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [142:57] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'CALLABLES_MASK' @ [142:78] ==> public final val CALLABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [143:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [143:73] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [143:94] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [144:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [144:69] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'SINGLETON_CLASSIFIERS_MASK' @ [144:90] ==> public final val SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [145:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [145:60] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'TYPE_ALIASES_MASK' @ [145:81] ==> public final val TYPE_ALIASES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [146:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [146:59] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'CLASSIFIERS_MASK' @ [146:80] ==> public final val CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [147:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [147:56] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'PACKAGES_MASK' @ [147:77] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [148:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [148:57] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'FUNCTIONS_MASK' @ [148:78] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [149:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [149:57] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'VARIABLES_MASK' @ [149:78] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'JvmField' @ [150:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [150:54] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[ClassConstructorDescriptorImpl]

'VALUES_MASK' @ [150:75] ==> public final val VALUES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'staticFields' @ [154:59] ==> private final inline fun <reified T : Any> staticFields(): List<(Field..Field?)> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> DescriptorKindFilter

'mapNotNull' @ [155:18] ==> public inline fun <T, R : Any> Iterable<(Field..Field?)>.mapNotNull(transform: ((Field..Field?)) -> DescriptorKindFilter.Companion.MaskToName?): List<DescriptorKindFilter.Companion.MaskToName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)
    <R : Any> -> MaskToName

'field' @ [156:34] ==> value-parameter field: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_PREDEFINED_FILTERS_MASK_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [156:40] ==> public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'if (filter != null) MaskToName(filter.kindMask, field.name) else null' @ [157:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorKindFilter.Companion.MaskToName?, elseBranch: DescriptorKindFilter.Companion.MaskToName?): DescriptorKindFilter.Companion.MaskToName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MaskToName?

'filter' @ [157:25] ==> val filter: DescriptorKindFilter? defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_PREDEFINED_FILTERS_MASK_NAMES.<anonymous>[LocalVariableDescriptor]

'MaskToName' @ [157:41] ==> public constructor MaskToName(mask: Int, name: String) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[ClassConstructorDescriptorImpl]

'filter' @ [157:52] ==> val filter: DescriptorKindFilter? defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_PREDEFINED_FILTERS_MASK_NAMES.<anonymous>[LocalVariableDescriptor]

'kindMask' @ [157:59] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'field' @ [157:69] ==> value-parameter field: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_PREDEFINED_FILTERS_MASK_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [157:75] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'toList' @ [159:18] ==> public fun <T> Iterable<DescriptorKindFilter.Companion.MaskToName>.toList(): List<DescriptorKindFilter.Companion.MaskToName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MaskToName

'staticFields' @ [161:44] ==> private final inline fun <reified T : Any> staticFields(): List<(Field..Field?)> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> DescriptorKindFilter

'filter' @ [162:18] ==> public inline fun <T> Iterable<(Field..Field?)>.filter(predicate: ((Field..Field?)) -> Boolean): List<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'it' @ [162:27] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [162:30] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'TYPE' @ [162:46] ==> public final val TYPE: (Class<(Int..Int?)>..Class<(Int..Int?)>?) defined in java.lang.Integer[JavaPropertyDescriptor]

'mapNotNull' @ [163:18] ==> public inline fun <T, R : Any> Iterable<(Field..Field?)>.mapNotNull(transform: ((Field..Field?)) -> DescriptorKindFilter.Companion.MaskToName?): List<DescriptorKindFilter.Companion.MaskToName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)
    <R : Any> -> MaskToName

'field' @ [164:32] ==> value-parameter field: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [164:38] ==> public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'mask' @ [165:40] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[LocalVariableDescriptor]

'mask' @ [165:49] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[LocalVariableDescriptor]

'-' @ [165:59] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'mask' @ [165:60] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[LocalVariableDescriptor]

'if (isOneBitMask) MaskToName(mask, field.name) else null' @ [166:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorKindFilter.Companion.MaskToName?, elseBranch: DescriptorKindFilter.Companion.MaskToName?): DescriptorKindFilter.Companion.MaskToName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MaskToName?

'isOneBitMask' @ [166:25] ==> val isOneBitMask: Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[LocalVariableDescriptor]

'MaskToName' @ [166:39] ==> public constructor MaskToName(mask: Int, name: String) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.MaskToName[ClassConstructorDescriptorImpl]

'mask' @ [166:50] ==> val mask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[LocalVariableDescriptor]

'field' @ [166:56] ==> value-parameter field: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.DEBUG_MASK_BIT_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [166:62] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'toList' @ [168:18] ==> public fun <T> Iterable<DescriptorKindFilter.Companion.MaskToName>.toList(): List<DescriptorKindFilter.Companion.MaskToName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MaskToName

'java' @ [170:72] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'fields' @ [170:77] ==> public final val <T : (Any..Any?)> Class<T>.fields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'filter' @ [170:84] ==> public inline fun <T> Array<out (Field..Field?)>.filter(predicate: ((Field..Field?)) -> Boolean): List<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isStatic' @ [170:102] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [170:111] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion.staticFields.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [170:114] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'this' @ [183:31] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[LazyClassReceiverParameterDescriptor]

'java' @ [183:43] ==> public val <T> KClass<out DescriptorKindExclude>.java: Class<out DescriptorKindExclude> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out DescriptorKindExclude)

'simpleName' @ [183:48] ==> public final val <T : (Any..Any?)> Class<out DescriptorKindExclude>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out DescriptorKindExclude)

'DescriptorKindExclude' @ [185:25] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[ClassConstructorDescriptorImpl]

'descriptor' @ [187:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.Extensions.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [187:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.Extensions.excludes[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [187:66] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'DescriptorKindExclude' @ [192:28] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[ClassConstructorDescriptorImpl]

'descriptor' @ [194:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.NonExtensions.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [194:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.NonExtensions.excludes[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [194:67] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'DescriptorKindFilter' @ [197:19] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'ALL_KINDS_MASK' @ [197:40] ==> public final val ALL_KINDS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'DescriptorKindFilter' @ [197:60] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS_MASK' @ [197:81] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'VARIABLES_MASK' @ [197:120] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'inv' @ [197:136] ==> public final fun inv(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DescriptorKindExclude' @ [200:24] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[ClassConstructorDescriptorImpl]

'descriptor' @ [202:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.EnumEntry.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [202:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.EnumEntry.excludes[ValueParameterDescriptorImpl]

'kind' @ [202:63] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [202:81] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'DescriptorKindExclude' @ [207:31] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[ClassConstructorDescriptorImpl]

'when (descriptor) {
                is PackageFragmentDescriptor -> descriptor.fqName
                is PackageViewDescriptor -> descriptor.fqName
                else -> return false
            }' @ [209:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FqName, entry1: FqName, entry2: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FqName

'descriptor' @ [209:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.TopLevelPackages.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [210:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.TopLevelPackages.excludes[ValueParameterDescriptorImpl]

'fqName' @ [210:60] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'descriptor' @ [211:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.TopLevelPackages.excludes[ValueParameterDescriptorImpl]

'fqName' @ [211:56] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'fqName' @ [214:20] ==> val fqName: FqName defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude.TopLevelPackages.excludes[LocalVariableDescriptor]

'parent' @ [214:27] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [214:36] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

