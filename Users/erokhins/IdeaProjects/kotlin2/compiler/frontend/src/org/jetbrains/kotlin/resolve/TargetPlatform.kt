'platformName' @ [34:31] ==> public final val platformName: String defined in org.jetbrains.kotlin.resolve.TargetPlatform[PropertyDescriptorImpl]

'emptyList' @ [38:52] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'TargetPlatform' @ [42:22] ==> public constructor TargetPlatform(platformName: String) defined in org.jetbrains.kotlin.resolve.TargetPlatform[ClassConstructorDescriptorImpl]

'LockBasedStorageManager' @ [43:38] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'createMemoizedFunction' @ [43:64] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createMemoizedFunction(@NotNull compute: (Boolean) -> List<ImportPath>): MemoizedFunctionToNotNull<(Boolean..Boolean?), (List<ImportPath>..List<ImportPath>?)> defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Boolean
    <V : (Any..Any?)> -> List<ImportPath>

'ArrayList' @ [45:13] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ImportPath

'apply' @ [45:37] ==> @InlineOnly public inline fun <T> ArrayList<ImportPath>.apply(block: ArrayList<ImportPath>.() -> Unit): ArrayList<ImportPath> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ImportPath>

'listOf' @ [46:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'forEach' @ [54:19] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'add' @ [54:29] ==> public open fun add(element: ImportPath): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ImportPath' @ [54:33] ==> public companion object defined in org.jetbrains.kotlin.resolve.ImportPath[FakeCallableDescriptorForObject]

'fromString' @ [54:44] ==> @JvmStatic public final fun fromString(pathStr: String): ImportPath defined in org.jetbrains.kotlin.resolve.ImportPath.Companion[SimpleFunctionDescriptorImpl]

'it' @ [54:55] ==> value-parameter it: String defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default.defaultImports.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'includeKotlinComparisons' @ [56:21] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default.defaultImports.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [57:21] ==> public open fun add(element: ImportPath): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ImportPath' @ [57:25] ==> public companion object defined in org.jetbrains.kotlin.resolve.ImportPath[FakeCallableDescriptorForObject]

'fromString' @ [57:36] ==> @JvmStatic public final fun fromString(pathStr: String): ImportPath defined in org.jetbrains.kotlin.resolve.ImportPath.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [62:95] ==> public abstract fun invoke(p1: (Boolean..Boolean?)): (List<ImportPath>..List<ImportPath>?) defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'includeKotlinComparisons' @ [62:110] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default.getDefaultImports[ValueParameterDescriptorImpl]

'PlatformConfigurator' @ [65:26] ==> public constructor PlatformConfigurator(dynamicTypesSettings: DynamicTypesSettings, additionalDeclarationCheckers: List<DeclarationChecker>, additionalCallCheckers: List<CallChecker>, additionalTypeCheckers: List<AdditionalTypeChecker>, additionalClassifierUsageCheckers: List<ClassifierUsageChecker>, additionalAnnotationCheckers: List<AdditionalAnnotationChecker>, identifierChecker: IdentifierChecker, overloadFilter: OverloadFilter, platformToKotlinClassMap: PlatformToKotlinClassMap, delegationFilter: DelegationFilter, overridesBackwardCompatibilityHelper: OverridesBackwardCompatibilityHelper) defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[ClassConstructorDescriptorImpl]

'DynamicTypesSettings' @ [66:25] ==> public constructor DynamicTypesSettings() defined in org.jetbrains.kotlin.types.DynamicTypesSettings[DeserializedClassConstructorDescriptor]

'listOf' @ [66:49] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationChecker

'listOf' @ [66:59] ==> @InlineOnly public inline fun <T> listOf(): List<CallChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallChecker

'listOf' @ [66:69] ==> @InlineOnly public inline fun <T> listOf(): List<AdditionalTypeChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalTypeChecker

'listOf' @ [66:79] ==> @InlineOnly public inline fun <T> listOf(): List<ClassifierUsageChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierUsageChecker

'listOf' @ [66:89] ==> @InlineOnly public inline fun <T> listOf(): List<AdditionalAnnotationChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalAnnotationChecker

'DEFAULT' @ [67:43] ==> public object DEFAULT : IdentifierChecker defined in org.jetbrains.kotlin.resolve.IdentifierChecker[FakeCallableDescriptorForObject]

'DEFAULT' @ [67:67] ==> public object DEFAULT : OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadFilter[FakeCallableDescriptorForObject]

'EMPTY' @ [67:101] ==> public final val EMPTY: (PlatformToKotlinClassMap..PlatformToKotlinClassMap?) defined in org.jetbrains.kotlin.platform.PlatformToKotlinClassMap[JavaPropertyDescriptor]

'DEFAULT' @ [67:125] ==> public object DEFAULT : DelegationFilter defined in org.jetbrains.kotlin.resolve.lazy.DelegationFilter[FakeCallableDescriptorForObject]

'DEFAULT' @ [68:62] ==> public object DEFAULT : OverridesBackwardCompatibilityHelper defined in org.jetbrains.kotlin.resolve.OverridesBackwardCompatibilityHelper[FakeCallableDescriptorForObject]

'container' @ [71:25] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default.platformConfigurator.<no name provided>.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [71:35] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'Empty' @ [71:63] ==> public object Empty : SyntheticScopes defined in org.jetbrains.kotlin.resolve.scopes.SyntheticScopes[FakeCallableDescriptorForObject]

'container' @ [72:25] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default.platformConfigurator.<no name provided>.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [72:35] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'NONE' @ [72:73] ==> public object NONE : TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.results.TypeSpecificityComparator[FakeCallableDescriptorForObject]

'MultiTargetPlatform' @ [77:21] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [77:41] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'listOf' @ [81:44] ==> public fun <T> listOf(vararg elements: DeclarationChecker): List<DeclarationChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationChecker

'DataClassDeclarationChecker' @ [82:9] ==> public constructor DataClassDeclarationChecker() defined in org.jetbrains.kotlin.resolve.checkers.DataClassDeclarationChecker[ClassConstructorDescriptorImpl]

'ConstModifierChecker' @ [83:9] ==> public object ConstModifierChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file ConstModifierChecker.kt[FakeCallableDescriptorForObject]

'UnderscoreChecker' @ [84:9] ==> public object UnderscoreChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file UnderscoreChecker.kt[FakeCallableDescriptorForObject]

'InlineParameterChecker' @ [85:9] ==> public object InlineParameterChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file InlineParameterChecker.kt[FakeCallableDescriptorForObject]

'InfixModifierChecker' @ [86:9] ==> public constructor InfixModifierChecker() defined in org.jetbrains.kotlin.resolve.checkers.InfixModifierChecker[ClassConstructorDescriptorImpl]

'SinceKotlinAnnotationValueChecker' @ [87:9] ==> public object SinceKotlinAnnotationValueChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file SinceKotlinAnnotationValueChecker.kt[FakeCallableDescriptorForObject]

'ReifiedTypeParameterAnnotationChecker' @ [88:9] ==> public constructor ReifiedTypeParameterAnnotationChecker() defined in org.jetbrains.kotlin.resolve.checkers.ReifiedTypeParameterAnnotationChecker[ClassConstructorDescriptorImpl]

'DynamicReceiverChecker' @ [89:9] ==> public object DynamicReceiverChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file DynamicReceiverChecker.kt[FakeCallableDescriptorForObject]

'DelegationChecker' @ [90:9] ==> public constructor DelegationChecker() defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker[ClassConstructorDescriptorImpl]

'KClassWithIncorrectTypeArgumentChecker' @ [91:9] ==> public object KClassWithIncorrectTypeArgumentChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file KClassWithIncorrectTypeArgumentChecker.kt[FakeCallableDescriptorForObject]

'SuspendOperatorsCheckers' @ [92:9] ==> public object SuspendOperatorsCheckers : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers in file SuspendOperatorsCheckers.kt[FakeCallableDescriptorForObject]

'listOf' @ [95:37] ==> public fun <T> listOf(vararg elements: CallChecker): List<CallChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallChecker

'CapturingInClosureChecker' @ [96:9] ==> public constructor CapturingInClosureChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[ClassConstructorDescriptorImpl]

'InlineCheckerWrapper' @ [96:38] ==> public constructor InlineCheckerWrapper() defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper[ClassConstructorDescriptorImpl]

'SafeCallChecker' @ [96:62] ==> public constructor SafeCallChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.SafeCallChecker[ClassConstructorDescriptorImpl]

'DeprecatedCallChecker' @ [97:9] ==> public object DeprecatedCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file DeprecatedCallChecker.kt[FakeCallableDescriptorForObject]

'CallReturnsArrayOfNothingChecker' @ [97:32] ==> public constructor CallReturnsArrayOfNothingChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.CallReturnsArrayOfNothingChecker[ClassConstructorDescriptorImpl]

'InfixCallChecker' @ [97:68] ==> public constructor InfixCallChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.InfixCallChecker[ClassConstructorDescriptorImpl]

'OperatorCallChecker' @ [97:88] ==> public constructor OperatorCallChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.OperatorCallChecker[ClassConstructorDescriptorImpl]

'ConstructorHeaderCallChecker' @ [98:9] ==> public object ConstructorHeaderCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file ConstructorHeaderCallChecker.kt[FakeCallableDescriptorForObject]

'ProtectedConstructorCallChecker' @ [98:39] ==> public object ProtectedConstructorCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file ProtectedConstructorCallChecker.kt[FakeCallableDescriptorForObject]

'ApiVersionCallChecker' @ [98:72] ==> public object ApiVersionCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file ApiVersionCallChecker.kt[FakeCallableDescriptorForObject]

'CoroutineSuspendCallChecker' @ [99:9] ==> public object CoroutineSuspendCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[FakeCallableDescriptorForObject]

'BuilderFunctionsCallChecker' @ [99:38] ==> public object BuilderFunctionsCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[FakeCallableDescriptorForObject]

'DslScopeViolationCallChecker' @ [99:67] ==> public object DslScopeViolationCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[FakeCallableDescriptorForObject]

'MissingDependencyClassChecker' @ [99:97] ==> public object MissingDependencyClassChecker : CallChecker defined in org.jetbrains.kotlin.resolve.checkers in file MissingDependencyClassChecker.kt[FakeCallableDescriptorForObject]

'CallableReferenceCompatibilityChecker' @ [100:9] ==> public constructor CallableReferenceCompatibilityChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.CallableReferenceCompatibilityChecker[ClassConstructorDescriptorImpl]

'UnderscoreUsageChecker' @ [101:9] ==> public object UnderscoreUsageChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file UnderscoreUsageChecker.kt[FakeCallableDescriptorForObject]

'emptyList' @ [103:37] ==> public fun <T> emptyList(): List<AdditionalTypeChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalTypeChecker

'listOf' @ [104:49] ==> public fun <T> listOf(vararg elements: ClassifierUsageChecker): List<ClassifierUsageChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierUsageChecker

'DeprecatedClassifierUsageChecker' @ [105:9] ==> public constructor DeprecatedClassifierUsageChecker() defined in org.jetbrains.kotlin.resolve.checkers.DeprecatedClassifierUsageChecker[ClassConstructorDescriptorImpl]

'ApiVersionClassifierUsageChecker' @ [105:45] ==> public object ApiVersionClassifierUsageChecker : ClassifierUsageChecker defined in org.jetbrains.kotlin.resolve.checkers in file ApiVersionClassifierUsageChecker.kt[FakeCallableDescriptorForObject]

'MissingDependencyClassChecker' @ [105:79] ==> public object MissingDependencyClassChecker : CallChecker defined in org.jetbrains.kotlin.resolve.checkers in file MissingDependencyClassChecker.kt[FakeCallableDescriptorForObject]

'ClassifierUsage' @ [105:109] ==> public object ClassifierUsage : ClassifierUsageChecker defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[FakeCallableDescriptorForObject]

'DEFAULT_DECLARATION_CHECKERS' @ [122:65] ==> private val DEFAULT_DECLARATION_CHECKERS: List<DeclarationChecker> defined in org.jetbrains.kotlin.resolve in file TargetPlatform.kt[PropertyDescriptorImpl]

'additionalDeclarationCheckers' @ [122:96] ==> value-parameter additionalDeclarationCheckers: List<DeclarationChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.<init>[ValueParameterDescriptorImpl]

'DEFAULT_CALL_CHECKERS' @ [123:51] ==> private val DEFAULT_CALL_CHECKERS: List<CallChecker> defined in org.jetbrains.kotlin.resolve in file TargetPlatform.kt[PropertyDescriptorImpl]

'additionalCallCheckers' @ [123:75] ==> value-parameter additionalCallCheckers: List<CallChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.<init>[ValueParameterDescriptorImpl]

'DEFAULT_TYPE_CHECKERS' @ [124:61] ==> private val DEFAULT_TYPE_CHECKERS: List<AdditionalTypeChecker> defined in org.jetbrains.kotlin.resolve in file TargetPlatform.kt[PropertyDescriptorImpl]

'additionalTypeCheckers' @ [124:85] ==> value-parameter additionalTypeCheckers: List<AdditionalTypeChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.<init>[ValueParameterDescriptorImpl]

'DEFAULT_CLASSIFIER_USAGE_CHECKERS' @ [125:73] ==> private val DEFAULT_CLASSIFIER_USAGE_CHECKERS: List<ClassifierUsageChecker> defined in org.jetbrains.kotlin.resolve in file TargetPlatform.kt[PropertyDescriptorImpl]

'additionalClassifierUsageCheckers' @ [125:109] ==> value-parameter additionalClassifierUsageCheckers: List<ClassifierUsageChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.<init>[ValueParameterDescriptorImpl]

'composeContainer' @ [129:37] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'this' @ [129:54] ==> <this> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[LazyClassReceiverParameterDescriptor]

'java' @ [129:66] ==> public val <T> KClass<out PlatformConfigurator>.java: Class<out PlatformConfigurator> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PlatformConfigurator

'simpleName' @ [129:71] ==> public final val <T : (Any..Any?)> Class<out PlatformConfigurator>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PlatformConfigurator

'useInstance' @ [130:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'dynamicTypesSettings' @ [130:21] ==> private final val dynamicTypesSettings: DynamicTypesSettings defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'declarationCheckers' @ [131:9] ==> private final val declarationCheckers: List<DeclarationChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'forEach' @ [131:29] ==> @HidesMembers public inline fun <T> Iterable<DeclarationChecker>.forEach(action: (DeclarationChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationChecker

'useInstance' @ [131:39] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'it' @ [131:51] ==> value-parameter it: DeclarationChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.platformSpecificContainer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callCheckers' @ [132:9] ==> private final val callCheckers: List<CallChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'forEach' @ [132:22] ==> @HidesMembers public inline fun <T> Iterable<CallChecker>.forEach(action: (CallChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallChecker

'useInstance' @ [132:32] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'it' @ [132:44] ==> value-parameter it: CallChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.platformSpecificContainer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeCheckers' @ [133:9] ==> private final val typeCheckers: List<AdditionalTypeChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'forEach' @ [133:22] ==> @HidesMembers public inline fun <T> Iterable<AdditionalTypeChecker>.forEach(action: (AdditionalTypeChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalTypeChecker

'useInstance' @ [133:32] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'it' @ [133:44] ==> value-parameter it: AdditionalTypeChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.platformSpecificContainer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classifierUsageCheckers' @ [134:9] ==> private final val classifierUsageCheckers: List<ClassifierUsageChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'forEach' @ [134:33] ==> @HidesMembers public inline fun <T> Iterable<ClassifierUsageChecker>.forEach(action: (ClassifierUsageChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierUsageChecker

'useInstance' @ [134:43] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'it' @ [134:55] ==> value-parameter it: ClassifierUsageChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.platformSpecificContainer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'additionalAnnotationCheckers' @ [135:9] ==> private final val additionalAnnotationCheckers: List<AdditionalAnnotationChecker> defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'forEach' @ [135:38] ==> @HidesMembers public inline fun <T> Iterable<AdditionalAnnotationChecker>.forEach(action: (AdditionalAnnotationChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalAnnotationChecker

'useInstance' @ [135:48] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'it' @ [135:60] ==> value-parameter it: AdditionalAnnotationChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator.platformSpecificContainer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'useInstance' @ [136:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'identifierChecker' @ [136:21] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'useInstance' @ [137:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'overloadFilter' @ [137:21] ==> private final val overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'useInstance' @ [138:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'platformToKotlinClassMap' @ [138:21] ==> private final val platformToKotlinClassMap: PlatformToKotlinClassMap defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'useInstance' @ [139:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'delegationFilter' @ [139:21] ==> private final val delegationFilter: DelegationFilter defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'useInstance' @ [140:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'overridesBackwardCompatibilityHelper' @ [140:21] ==> private final val overridesBackwardCompatibilityHelper: OverridesBackwardCompatibilityHelper defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'composeContainer' @ [145:11] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'id' @ [145:28] ==> value-parameter id: String defined in org.jetbrains.kotlin.resolve.createContainer[ValueParameterDescriptorImpl]

'platform' @ [145:32] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.resolve.createContainer[ValueParameterDescriptorImpl]

'platformConfigurator' @ [145:41] ==> public abstract val platformConfigurator: PlatformConfigurator defined in org.jetbrains.kotlin.resolve.TargetPlatform[PropertyDescriptorImpl]

'platformSpecificContainer' @ [145:62] ==> public final val platformSpecificContainer: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[PropertyDescriptorImpl]

'init' @ [145:89] ==> value-parameter init: StorageComponentContainer.() -> Unit defined in org.jetbrains.kotlin.resolve.createContainer[ValueParameterDescriptorImpl]

