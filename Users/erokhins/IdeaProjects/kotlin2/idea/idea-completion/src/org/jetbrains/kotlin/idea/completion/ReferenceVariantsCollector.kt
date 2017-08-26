'ReferenceVariants' @ [40:12] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'imported' @ [40:30] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'union' @ [40:39] ==> public infix fun <T> Iterable<DeclarationDescriptor>.union(other: Iterable<DeclarationDescriptor>): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'other' @ [40:45] ==> value-parameter other: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.plus[ValueParameterDescriptorImpl]

'imported' @ [40:51] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'notImportedExtensions' @ [40:62] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'union' @ [40:84] ==> public infix fun <T> Iterable<CallableDescriptor>.union(other: Iterable<CallableDescriptor>): Set<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'other' @ [40:90] ==> value-parameter other: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.plus[ValueParameterDescriptorImpl]

'notImportedExtensions' @ [40:96] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'prefixMatcher' @ [61:26] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'prefix' @ [61:40] ==> public final val PrefixMatcher.prefix: String[MyPropertyDescriptor]

'prefixMatcher' @ [62:40] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'asStringNameFilter' @ [62:54] ==> public fun PrefixMatcher.asStringNameFilter(): (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'LinkedHashSet' @ [64:37] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'LinkedHashSet' @ [65:50] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'assert' @ [70:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isCollectingFinished' @ [70:20] ==> private final var isCollectingFinished: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'ReferenceVariants' @ [71:20] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'collectedImported' @ [71:38] ==> private final val collectedImported: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'collectedNotImportedExtensions' @ [71:57] ==> private final val collectedNotImportedExtensions: LinkedHashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'assert' @ [75:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [75:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCollectingFinished' @ [75:17] ==> private final var isCollectingFinished: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'isCollectingFinished' @ [76:9] ==> private final var isCollectingFinished: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'assert' @ [80:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [80:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCollectingFinished' @ [80:17] ==> private final var isCollectingFinished: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'configuration' @ [81:22] ==> private final fun configuration(descriptorKindFilter: DescriptorKindFilter): ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [81:36] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[ValueParameterDescriptorImpl]

'collectBasicVariants' @ [83:21] ==> private final fun collectBasicVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'config' @ [83:42] ==> val config: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'basic' @ [84:16] ==> val basic: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'collectExtensionVariants' @ [84:24] ==> private final fun collectExtensionVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration, basicVariants: ReferenceVariants): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'config' @ [84:49] ==> val config: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'basic' @ [84:57] ==> val basic: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'assert' @ [88:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [88:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCollectingFinished' @ [88:17] ==> private final var isCollectingFinished: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'configuration' @ [89:22] ==> private final fun configuration(descriptorKindFilter: DescriptorKindFilter): ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [89:36] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[ValueParameterDescriptorImpl]

'collectBasicVariants' @ [91:21] ==> private final fun collectBasicVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'config' @ [91:42] ==> val config: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'invoke' @ [92:9] ==> public abstract operator fun invoke(p1: ReferenceVariants): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'basic' @ [92:18] ==> val basic: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'collectExtensionVariants' @ [93:26] ==> private final fun collectExtensionVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration, basicVariants: ReferenceVariants): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'config' @ [93:51] ==> val config: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'basic' @ [93:59] ==> val basic: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'invoke' @ [94:9] ==> public abstract operator fun invoke(p1: ReferenceVariants): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'extensions' @ [94:18] ==> val extensions: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectReferenceVariants[LocalVariableDescriptor]

'doCollectBasicVariants' @ [98:24] ==> private final fun doCollectBasicVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'filterConfiguration' @ [98:47] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectBasicVariants[ValueParameterDescriptorImpl]

'collectedImported' @ [99:9] ==> private final val collectedImported: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'variants' @ [99:30] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectBasicVariants[LocalVariableDescriptor]

'imported' @ [99:39] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'variants' @ [100:16] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectBasicVariants[LocalVariableDescriptor]

'doCollectExtensionVariants' @ [104:24] ==> private final fun doCollectExtensionVariants(filterConfiguration: ReferenceVariantsCollector.FilterConfiguration, basicVariants: ReferenceVariants): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'filterConfiguration' @ [104:51] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectExtensionVariants[ValueParameterDescriptorImpl]

'basicVariants' @ [104:72] ==> value-parameter basicVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectExtensionVariants[ValueParameterDescriptorImpl]

'collectedImported' @ [105:9] ==> private final val collectedImported: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'variants' @ [105:30] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectExtensionVariants[LocalVariableDescriptor]

'imported' @ [105:39] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'collectedNotImportedExtensions' @ [106:9] ==> private final val collectedNotImportedExtensions: LinkedHashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'variants' @ [106:43] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectExtensionVariants[LocalVariableDescriptor]

'notImportedExtensions' @ [106:52] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'variants' @ [107:16] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.collectExtensionVariants[LocalVariableDescriptor]

'descriptorKindFilter' @ [111:45] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[ValueParameterDescriptorImpl]

'kindMask' @ [111:66] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [111:75] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [111:79] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES_MASK' @ [111:100] ==> public final val CALLABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'!in' @ [112:48] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Extensions' @ [112:70] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'descriptorKindFilter' @ [112:85] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[ValueParameterDescriptorImpl]

'excludes' @ [112:106] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'callTypeAndReceiver' @ [113:48] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'Suppress' @ [114:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (completeExtensionsFromIndices)
            descriptorKindFilter exclude TopLevelExtensionsExclude // handled via indices
        else
            descriptorKindFilter' @ [115:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorKindFilter, elseBranch: DescriptorKindFilter): DescriptorKindFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorKindFilter

'completeExtensionsFromIndices' @ [115:40] ==> val completeExtensionsFromIndices: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'descriptorKindFilter' @ [116:13] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[ValueParameterDescriptorImpl]

'TopLevelExtensionsExclude' @ [116:42] ==> private object TopLevelExtensionsExclude : DescriptorKindExclude defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[FakeCallableDescriptorForObject]

'descriptorKindFilter' @ [118:13] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[ValueParameterDescriptorImpl]

'GET_SET_PREFIXES' @ [120:30] ==> private final val GET_SET_PREFIXES: List<String> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'firstOrNull' @ [120:47] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'prefix' @ [120:61] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'startsWith' @ [120:68] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [120:79] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration.<anonymous>[ValueParameterDescriptorImpl]

'getOrSetPrefix' @ [121:68] ==> val getOrSetPrefix: String? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'let' @ [122:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (String) -> Boolean): (String) -> Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Function1<String, Boolean>

'prefixMatcher' @ [122:25] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'cloneWithPrefix' @ [122:39] ==> @NotNull public abstract fun cloneWithPrefix(@NotNull p0: String): PrefixMatcher defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'prefix' @ [122:55] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'removePrefix' @ [122:62] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getOrSetPrefix' @ [122:75] ==> val getOrSetPrefix: String? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'decapitalizeSmart' @ [122:91] ==> public fun String.decapitalizeSmart(asciiOnly: Boolean = ...): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize[DeserializedSimpleFunctionDescriptor]

'asStringNameFilter' @ [122:112] ==> public fun PrefixMatcher.asStringNameFilter(): (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'if (runtimeReceiver != null)
            ShadowedDeclarationsFilter(bindingContext, resolutionFacade, nameExpression, runtimeReceiver)
        else
            ShadowedDeclarationsFilter.create(bindingContext, resolutionFacade, nameExpression, callTypeAndReceiver)' @ [124:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShadowedDeclarationsFilter?, elseBranch: ShadowedDeclarationsFilter?): ShadowedDeclarationsFilter?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ShadowedDeclarationsFilter?

'runtimeReceiver' @ [124:46] ==> private final val runtimeReceiver: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'ShadowedDeclarationsFilter' @ [125:13] ==> public constructor ShadowedDeclarationsFilter(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, explicitReceiverValue: ReceiverValue?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedClassConstructorDescriptor]

'bindingContext' @ [125:40] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'resolutionFacade' @ [125:56] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'nameExpression' @ [125:74] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'runtimeReceiver' @ [125:90] ==> private final val runtimeReceiver: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'ShadowedDeclarationsFilter' @ [127:13] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[FakeCallableDescriptorForObject]

'create' @ [127:40] ==> public final fun create(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, callTypeAndReceiver: CallTypeAndReceiver<*, *>): ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [127:47] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'resolutionFacade' @ [127:63] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'nameExpression' @ [127:81] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [127:97] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'FilterConfiguration' @ [129:43] ==> internal constructor FilterConfiguration(descriptorKindFilter: DescriptorKindFilter, additionalPropertyNameFilter: ((String) -> Boolean)?, shadowedDeclarationsFilter: ShadowedDeclarationsFilter?, completeExtensionsFromIndices: Boolean) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[ClassConstructorDescriptorImpl]

'descriptorKindFilter' @ [129:63] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'additionalPropertyNameFilter' @ [129:85] ==> val additionalPropertyNameFilter: ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'shadowedDeclarationsFilter' @ [129:115] ==> val shadowedDeclarationsFilter: ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'completeExtensionsFromIndices' @ [129:143] ==> val completeExtensionsFromIndices: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.configuration[LocalVariableDescriptor]

'referenceVariantsHelper' @ [134:20] ==> private final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'getReferenceVariants' @ [134:44] ==> public final fun getReferenceVariants(expression: KtSimpleNameExpression, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, filterOutJavaGettersAndSetters: Boolean = ..., filterOutShadowed: Boolean = ..., excludeNonInitializedVariable: Boolean = ..., useReceiverType: KotlinType? = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]

'nameExpression' @ [135:21] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'kindFilter' @ [136:21] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants.getReferenceVariants[ValueParameterDescriptorImpl]

'nameFilter' @ [137:21] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants.getReferenceVariants[ValueParameterDescriptorImpl]

'runtimeReceiver' @ [141:39] ==> private final val runtimeReceiver: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'type' @ [141:56] ==> public final val ExpressionReceiver.type: KotlinType[MyPropertyDescriptor]

'component1' @ [144:14] ==> public final operator fun component1(): DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'component2' @ [144:36] ==> public final operator fun component2(): ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'filterConfiguration' @ [144:68] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[ValueParameterDescriptorImpl]

'getReferenceVariants' @ [146:29] ==> local final fun getReferenceVariants(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [146:50] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'descriptorNameFilter' @ [146:72] ==> private final val descriptorNameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'toNameFilter' @ [146:93] ==> public fun ((String) -> Boolean).toNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'additionalPropertyNameFilter' @ [147:13] ==> val additionalPropertyNameFilter: ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'basicVariants' @ [148:13] ==> var basicVariants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'getReferenceVariants' @ [148:30] ==> local final fun getReferenceVariants(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [148:51] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'intersect' @ [148:72] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [148:82] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'VARIABLES' @ [148:103] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'additionalPropertyNameFilter' @ [148:115] ==> val additionalPropertyNameFilter: ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'toNameFilter' @ [148:144] ==> public fun ((String) -> Boolean).toNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'basicVariants' @ [149:13] ==> var basicVariants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'basicVariants' @ [149:29] ==> var basicVariants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'distinct' @ [149:43] ==> public fun <T> Iterable<DeclarationDescriptor>.distinct(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ReferenceVariants' @ [151:16] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'filterConfiguration' @ [151:34] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[ValueParameterDescriptorImpl]

'filterVariants' @ [151:54] ==> private final fun <TDescriptor : DeclarationDescriptor> ReferenceVariantsCollector.FilterConfiguration.filterVariants(_variants: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'basicVariants' @ [151:69] ==> var basicVariants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectBasicVariants[LocalVariableDescriptor]

'toHashSet' @ [151:84] ==> public fun <T> Iterable<DeclarationDescriptor>.toHashSet(): HashSet<DeclarationDescriptor> /* = HashSet<DeclarationDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'emptyList' @ [151:97] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'component1' @ [155:14] ==> public final operator fun component1(): DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'component2' @ [155:17] ==> public final operator fun component2(): ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'component3' @ [155:47] ==> public final operator fun component3(): ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'component4' @ [155:75] ==> public final operator fun component4(): Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[SimpleFunctionDescriptorImpl]

'filterConfiguration' @ [155:108] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[ValueParameterDescriptorImpl]

'completeExtensionsFromIndices' @ [157:13] ==> val completeExtensionsFromIndices: Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'if (additionalPropertyNameFilter != null)
                descriptorNameFilter or additionalPropertyNameFilter
            else
                descriptorNameFilter' @ [158:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String) -> Boolean, elseBranch: (String) -> Boolean): (String) -> Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<String, Boolean>

'additionalPropertyNameFilter' @ [158:34] ==> val additionalPropertyNameFilter: ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'descriptorNameFilter' @ [159:17] ==> private final val descriptorNameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'additionalPropertyNameFilter' @ [159:41] ==> val additionalPropertyNameFilter: ((String) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'descriptorNameFilter' @ [161:17] ==> private final val descriptorNameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'if (runtimeReceiver != null)
                indicesHelper.getCallableTopLevelExtensions(callTypeAndReceiver, listOf(runtimeReceiver.type), nameFilter)
            else
                indicesHelper.getCallableTopLevelExtensions(callTypeAndReceiver, nameExpression, bindingContext, nameFilter)' @ [162:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<CallableDescriptor>, elseBranch: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<CallableDescriptor>

'runtimeReceiver' @ [162:34] ==> private final val runtimeReceiver: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'indicesHelper' @ [163:17] ==> private final val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'getCallableTopLevelExtensions' @ [163:31] ==> public final fun getCallableTopLevelExtensions(callTypeAndReceiver: CallTypeAndReceiver<*, *>, receiverTypes: Collection<KotlinType>, nameFilter: (String) -> Boolean): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [163:61] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'listOf' @ [163:82] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'runtimeReceiver' @ [163:89] ==> private final val runtimeReceiver: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'type' @ [163:105] ==> public final val ExpressionReceiver.type: KotlinType[MyPropertyDescriptor]

'nameFilter' @ [163:112] ==> val nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'indicesHelper' @ [165:17] ==> private final val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'getCallableTopLevelExtensions' @ [165:31] ==> public final fun getCallableTopLevelExtensions(callTypeAndReceiver: CallTypeAndReceiver<*, *>, position: KtExpression, bindingContext: BindingContext, nameFilter: (String) -> Boolean): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [165:61] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'nameExpression' @ [165:82] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'bindingContext' @ [165:98] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'nameFilter' @ [165:114] ==> val nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'component1' @ [167:18] ==> public final operator fun component1(): List<CallableDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [167:38] ==> public final operator fun component2(): List<CallableDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'extensions' @ [167:63] ==> val extensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'partition' @ [167:74] ==> public inline fun <T> Iterable<CallableDescriptor>.partition(predicate: (CallableDescriptor) -> Boolean): Pair<List<CallableDescriptor>, List<CallableDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'importableFqNameClassifier' @ [167:86] ==> private final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'isImportableDescriptorImported' @ [167:113] ==> public fun ImportableFqNameClassifier.isImportableDescriptorImported(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [167:144] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants.<anonymous>[ValueParameterDescriptorImpl]

'shadowedDeclarationsFilter' @ [170:21] ==> val shadowedDeclarationsFilter: ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'createNonImportedDeclarationsFilter' @ [170:49] ==> public final fun <TDescriptor : DeclarationDescriptor> createNonImportedDeclarationsFilter(importedDeclarations: Collection<DeclarationDescriptor>): (Collection<CallableDescriptor>) -> Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> CallableDescriptor

'basicVariants' @ [170:128] ==> value-parameter basicVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[ValueParameterDescriptorImpl]

'imported' @ [170:142] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'extensionsVariants' @ [170:153] ==> val extensionsVariants: List<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'filterConfiguration' @ [172:36] ==> value-parameter filterConfiguration: ReferenceVariantsCollector.FilterConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[ValueParameterDescriptorImpl]

'filterVariants' @ [172:56] ==> private final fun <TDescriptor : DeclarationDescriptor> ReferenceVariantsCollector.FilterConfiguration.filterVariants(_variants: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'extensionsVariants' @ [172:71] ==> val extensionsVariants: List<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'basicVariants' @ [172:92] ==> value-parameter basicVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[ValueParameterDescriptorImpl]

'imported' @ [172:106] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'filteredImported' @ [174:46] ==> val filteredImported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'filter' @ [174:63] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [174:72] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants.<anonymous>[ValueParameterDescriptorImpl]

'basicVariants' @ [174:79] ==> value-parameter basicVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[ValueParameterDescriptorImpl]

'imported' @ [174:93] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'ReferenceVariants' @ [176:20] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'importedExtensionsVariants' @ [177:21] ==> val importedExtensionsVariants: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'notImportedExtensions' @ [178:21] ==> val notImportedExtensions: List<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'let' @ [178:43] ==> @InlineOnly public inline fun <T, R> List<CallableDescriptor>.let(block: (List<CallableDescriptor>) -> Collection<CallableDescriptor>): Collection<CallableDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<CallableDescriptor>
    <R> -> Collection<CallableDescriptor>

'notImportedDeclarationsFilter' @ [178:61] ==> val notImportedDeclarationsFilter: ((Collection<CallableDescriptor>) -> Collection<CallableDescriptor>)? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants[LocalVariableDescriptor]

'invoke' @ [178:92] ==> public abstract operator fun invoke(p1: Collection<CallableDescriptor>): Collection<CallableDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'variants' @ [178:99] ==> value-parameter variants: List<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants.<anonymous>[ValueParameterDescriptorImpl]

'variants' @ [178:112] ==> value-parameter variants: List<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.doCollectExtensionVariants.<anonymous>[ValueParameterDescriptorImpl]

'ReferenceVariants' @ [182:16] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'emptyList' @ [182:34] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'emptyList' @ [182:47] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'_variants' @ [186:24] ==> value-parameter _variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[ValueParameterDescriptorImpl]

'shadowedDeclarationsFilter' @ [188:13] ==> public final val shadowedDeclarationsFilter: ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[PropertyDescriptorImpl]

'variants' @ [189:13] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'shadowedDeclarationsFilter' @ [189:24] ==> public final val shadowedDeclarationsFilter: ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.FilterConfiguration[PropertyDescriptorImpl]

'filter' @ [189:51] ==> public final fun <TDescriptor : DeclarationDescriptor> filter(declarations: Collection<TDescriptor>): Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> TDescriptor

'variants' @ [189:58] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'!' @ [191:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [191:14] ==> private final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'javaGettersAndSetters' @ [191:28] ==> public final val javaGettersAndSetters: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'variants' @ [192:13] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'referenceVariantsHelper' @ [192:24] ==> private final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'filterOutJavaGettersAndSetters' @ [192:48] ==> public final fun <TDescriptor : DeclarationDescriptor> filterOutJavaGettersAndSetters(variants: Collection<TDescriptor>): Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> TDescriptor

'variants' @ [192:79] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'!' @ [194:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [194:14] ==> private final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'dataClassComponentFunctions' @ [194:28] ==> public final val dataClassComponentFunctions: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'variants' @ [195:13] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'variants' @ [195:24] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'filter' @ [195:33] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'!' @ [195:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDataClassComponentFunction' @ [195:43] ==> private final fun isDataClassComponentFunction(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'it' @ [195:72] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants.<anonymous>[ValueParameterDescriptorImpl]

'variants' @ [197:16] ==> var variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.filterVariants[LocalVariableDescriptor]

'listOf' @ [201:36] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DescriptorKindExclude' @ [203:48] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[DeserializedClassConstructorDescriptor]

'descriptor' @ [205:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [206:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [206:28] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [207:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[ValueParameterDescriptorImpl]

'kind' @ [207:28] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [207:66] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [208:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[ValueParameterDescriptorImpl]

'isArtificialImportAliasedDescriptor' @ [208:28] ==> public val DeclarationDescriptor.isArtificialImportAliasedDescriptor: Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [209:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[ValueParameterDescriptorImpl]

'containingDeclaration' @ [209:48] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingPackage' @ [210:17] ==> val containingPackage: PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.TopLevelExtensionsExclude.excludes[LocalVariableDescriptor]

'fqName' @ [210:35] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [210:42] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'startsWith' @ [210:53] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [218:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.isDataClassComponentFunction[ValueParameterDescriptorImpl]

'descriptor' @ [219:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.isDataClassComponentFunction[ValueParameterDescriptorImpl]

'isOperator' @ [219:27] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'DataClassDescriptorResolver' @ [220:16] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'isComponentLike' @ [220:44] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [220:60] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.isDataClassComponentFunction[ValueParameterDescriptorImpl]

'name' @ [220:71] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [221:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector.isDataClassComponentFunction[ValueParameterDescriptorImpl]

'kind' @ [221:27] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'SYNTHESIZED' @ [221:65] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

