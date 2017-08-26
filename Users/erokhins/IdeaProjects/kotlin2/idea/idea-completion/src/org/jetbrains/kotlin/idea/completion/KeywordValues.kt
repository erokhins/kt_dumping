'callTypeAndReceiver' @ [57:13] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'info' @ [60:38] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'additionalData' @ [60:43] ==> public final val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'when (additionalData) {
                    is IfConditionAdditionalData -> true
                    is WhenEntryAdditionalData -> !additionalData.whenWithSubject
                    else -> false
                }' @ [61:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'additionalData' @ [61:43] ==> val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[LocalVariableDescriptor]

'!' @ [63:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'additionalData' @ [63:52] ==> val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[LocalVariableDescriptor]

'whenWithSubject' @ [63:67] ==> public final val whenWithSubject: Boolean defined in org.jetbrains.kotlin.idea.core.WhenEntryAdditionalData[DeserializedPropertyDescriptor]

'skipTrueFalse' @ [66:21] ==> val skipTrueFalse: Boolean defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[LocalVariableDescriptor]

'ExpectedInfoMatch' @ [67:36] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'noMatch' @ [67:54] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'if (info.fuzzyType?.type?.isBooleanOrNullableBoolean() ?: false)
                    ExpectedInfoMatch.match(TypeSubstitutor.EMPTY)
                else
                    ExpectedInfoMatch.noMatch' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpectedInfoMatch, elseBranch: ExpectedInfoMatch): ExpectedInfoMatch[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpectedInfoMatch

'info' @ [70:21] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [70:26] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [70:37] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isBooleanOrNullableBoolean' @ [70:43] ==> public fun KotlinType.isBooleanOrNullableBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'match' @ [71:39] ==> public final fun match(substitutor: TypeSubstitutor): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[SimpleFunctionDescriptorImpl]

'EMPTY' @ [71:61] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'noMatch' @ [73:39] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'consumer' @ [75:13] ==> value-parameter consumer: KeywordValues.Consumer defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'consume' @ [75:22] ==> public abstract fun consume(lookupString: String, expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, priority: SmartCompletionItemPriority, factory: () -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues.Consumer[SimpleFunctionDescriptorImpl]

'booleanInfoMatcher' @ [75:39] ==> val booleanInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'TRUE' @ [75:87] ==> enum entry TRUE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [76:38] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KeywordLookupObject' @ [76:45] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'bold' @ [76:76] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'consumer' @ [78:13] ==> value-parameter consumer: KeywordValues.Consumer defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'consume' @ [78:22] ==> public abstract fun consume(lookupString: String, expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, priority: SmartCompletionItemPriority, factory: () -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues.Consumer[SimpleFunctionDescriptorImpl]

'booleanInfoMatcher' @ [78:40] ==> val booleanInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'FALSE' @ [78:88] ==> enum entry FALSE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [79:38] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KeywordLookupObject' @ [79:45] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'bold' @ [79:77] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'when {
                    (info.additionalData as? ComparisonOperandAdditionalData)?.suppressNullLiteral == true -> ExpectedInfoMatch.noMatch

                    info.fuzzyType?.type?.isMarkedNullable == true -> ExpectedInfoMatch.match(TypeSubstitutor.EMPTY)

                    else -> ExpectedInfoMatch.noMatch
                }' @ [83:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ExpectedInfoMatch, entry1: ExpectedInfoMatch, entry2: ExpectedInfoMatch): ExpectedInfoMatch[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExpectedInfoMatch

'==' @ [84:21] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [84:22] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'additionalData' @ [84:27] ==> public final val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'suppressNullLiteral' @ [84:80] ==> public final val suppressNullLiteral: Boolean defined in org.jetbrains.kotlin.idea.core.ComparisonOperandAdditionalData[DeserializedPropertyDescriptor]

'noMatch' @ [84:129] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'info' @ [86:21] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [86:26] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [86:37] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [86:43] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'match' @ [86:89] ==> public final fun match(substitutor: TypeSubstitutor): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[SimpleFunctionDescriptorImpl]

'EMPTY' @ [86:111] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'noMatch' @ [88:47] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'consumer' @ [91:13] ==> value-parameter consumer: KeywordValues.Consumer defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'consume' @ [91:22] ==> public abstract fun consume(lookupString: String, expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, priority: SmartCompletionItemPriority, factory: () -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues.Consumer[SimpleFunctionDescriptorImpl]

'nullMatcher' @ [91:38] ==> val nullMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'NULL' @ [91:79] ==> enum entry NULL defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [92:38] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KeywordLookupObject' @ [92:45] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'bold' @ [92:76] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'callTypeAndReceiver' @ [96:13] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [96:78] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'receiver' @ [96:98] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.CALLABLE_REFERENCE[DeserializedPropertyDescriptor]

'bindingContext' @ [97:33] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'get' @ [97:48] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [97:67] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callTypeAndReceiver' @ [97:85] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'receiver' @ [97:105] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.CALLABLE_REFERENCE[DeserializedPropertyDescriptor]

'type' @ [97:118] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[DeserializedPropertyDescriptor]

'qualifierType' @ [98:17] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'resolutionFacade' @ [99:40] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'getFrontendService' @ [99:57] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<ReflectionTypes>): ReflectionTypes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReflectionTypes

'ReflectionTypes' @ [99:76] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'java' @ [99:99] ==> public val <T> KClass<ReflectionTypes>.java: Class<ReflectionTypes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReflectionTypes

'kClass' @ [99:105] ==> public final val kClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedPropertyDescriptor]

'KotlinTypeFactory' @ [100:40] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleNotNullType' @ [100:58] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [100:88] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'kClassDescriptor' @ [100:95] ==> val kClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'listOf' @ [100:113] ==> public fun <T> listOf(element: TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjectionImpl

'TypeProjectionImpl' @ [100:120] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'qualifierType' @ [100:139] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'listOf' @ [101:35] ==> public fun <T> listOf(element: FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'classLiteralType' @ [101:42] ==> val classLiteralType: SimpleType defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'toFuzzyType' @ [101:59] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [101:71] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'kClassTypes' @ [102:61] ==> val kClassTypes: List<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'matchExpectedInfo' @ [102:73] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'info' @ [102:91] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'consumer' @ [103:17] ==> value-parameter consumer: KeywordValues.Consumer defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'consume' @ [103:26] ==> public abstract fun consume(lookupString: String, expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, priority: SmartCompletionItemPriority, factory: () -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues.Consumer[SimpleFunctionDescriptorImpl]

'kClassMatcher' @ [103:43] ==> val kClassMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'CLASS_LITERAL' @ [103:86] ==> enum entry CLASS_LITERAL defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [104:42] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KeywordLookupObject' @ [104:49] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'bold' @ [104:81] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'isJvmModule' @ [107:21] ==> value-parameter isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'resolutionFacade' @ [108:51] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'resolveImportReference' @ [108:68] ==> public fun ResolutionFacade.resolveImportReference(moduleDescriptor: ModuleDescriptor, fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [108:91] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'FqName' @ [108:109] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'singleOrNull' @ [109:30] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'javaLangClassDescriptor' @ [111:25] ==> val javaLangClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'KotlinTypeFactory' @ [112:49] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleNotNullType' @ [112:67] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [112:97] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'javaLangClassDescriptor' @ [112:104] ==> val javaLangClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'listOf' @ [112:129] ==> public fun <T> listOf(element: TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjectionImpl

'TypeProjectionImpl' @ [112:136] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'qualifierType' @ [112:155] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'listOf' @ [113:46] ==> public fun <T> listOf(element: FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'javaLangClassType' @ [113:53] ==> val javaLangClassType: SimpleType defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'toFuzzyType' @ [113:71] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [113:83] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'javaClassTypes' @ [114:72] ==> val javaClassTypes: List<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'matchExpectedInfo' @ [114:87] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'info' @ [114:105] ==> value-parameter info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process.<anonymous>[ValueParameterDescriptorImpl]

'consumer' @ [115:25] ==> value-parameter consumer: KeywordValues.Consumer defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[ValueParameterDescriptorImpl]

'consume' @ [115:34] ==> public abstract fun consume(lookupString: String, expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, priority: SmartCompletionItemPriority, factory: () -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues.Consumer[SimpleFunctionDescriptorImpl]

'javaClassMatcher' @ [115:51] ==> val javaClassMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.KeywordValues.process[LocalVariableDescriptor]

'CLASS_LITERAL' @ [115:97] ==> enum entry CLASS_LITERAL defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [116:50] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KeywordLookupObject' @ [116:57] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'withPresentableText' @ [117:38] ==> @Contract public open fun withPresentableText(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'withTailText' @ [118:38] ==> @Contract public open fun withTailText(@Nullable p0: String?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'bold' @ [119:38] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

