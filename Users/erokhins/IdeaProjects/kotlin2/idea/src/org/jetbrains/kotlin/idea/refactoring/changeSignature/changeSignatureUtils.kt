'when {
        this is KtClassOrObject -> getSuperTypeList()
        this is KtPrimaryConstructor -> getContainingClassOrObject().getSuperTypeList()
        this is KtSecondaryConstructor -> getDelegationCall()
        this is KtNamedFunction -> bodyExpression
        else -> null
    }' @ [48:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?, entry3: KtElement?, entry4: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'this' @ [49:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getDeclarationBody[ReceiverParameterDescriptorImpl]

'getSuperTypeList' @ [49:36] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'this' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getDeclarationBody[ReceiverParameterDescriptorImpl]

'getContainingClassOrObject' @ [50:41] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'getSuperTypeList' @ [50:70] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'this' @ [51:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getDeclarationBody[ReceiverParameterDescriptorImpl]

'getDelegationCall' @ [51:43] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'this' @ [52:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getDeclarationBody[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [52:36] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [58:31] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[ReceiverParameterDescriptorImpl]

'primaryConstructor' @ [58:50] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'if (primaryConstructor != null) listOf(primaryConstructor, this) else listOf(this)' @ [59:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiElement>, elseBranch: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiElement>

'primaryConstructor' @ [59:32] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[LocalVariableDescriptor]

'listOf' @ [59:60] ==> public fun <T> listOf(vararg elements: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'primaryConstructor' @ [59:67] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[LocalVariableDescriptor]

'this' @ [59:87] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[ReceiverParameterDescriptorImpl]

'listOf' @ [59:98] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'this' @ [59:105] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[ReceiverParameterDescriptorImpl]

'allUsages' @ [60:12] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[ValueParameterDescriptorImpl]

'asSequence' @ [61:14] ==> public fun <T> Array<out UsageInfo>.asSequence(): Sequence<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'filter' @ [62:14] ==> public fun <T> Sequence<UsageInfo>.filter(predicate: (UsageInfo) -> Boolean): Sequence<UsageInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'?:' @ [63:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: UsageInfo?, right: UsageInfo): UsageInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> UsageInfo

'it' @ [63:30] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[ValueParameterDescriptorImpl]

'delegateUsage' @ [63:76] ==> public abstract val delegateUsage: KotlinUsageInfo<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'it' @ [63:93] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[ValueParameterDescriptorImpl]

'usage' @ [64:17] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[LocalVariableDescriptor]

'usage' @ [65:20] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[LocalVariableDescriptor]

'usage' @ [66:20] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[LocalVariableDescriptor]

'usage' @ [67:21] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[LocalVariableDescriptor]

'!' @ [67:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usage' @ [67:53] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[LocalVariableDescriptor]

'isOriginalOverrider' @ [67:59] ==> public final val OverriderUsageInfo.isOriginalOverrider: Boolean[MyPropertyDescriptor]

'any' @ [69:14] ==> public inline fun <T> Sequence<UsageInfo>.any(predicate: (UsageInfo) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [69:20] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [69:23] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'elementsToSearch' @ [69:34] ==> val elementsToSearch: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isCaller[LocalVariableDescriptor]

'parentsWithSelf' @ [73:21] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [73:37] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [74:9] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [74:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [74:60] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [76:16] ==> val container: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody[LocalVariableDescriptor]

'getDeclarationBody' @ [76:26] ==> public fun KtNamedDeclaration.getDeclarationBody(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [77:12] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody[LocalVariableDescriptor]

'textRange' @ [77:17] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [77:27] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'textRange' @ [77:36] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'container' @ [77:50] ==> val container: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody[LocalVariableDescriptor]

'isCaller' @ [77:60] ==> public fun PsiElement.isCaller(allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'allUsages' @ [77:69] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isInsideOfCallerBody[ValueParameterDescriptorImpl]

'baseFunction' @ [84:31] ==> value-parameter baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getCallableSubstitutor[ValueParameterDescriptorImpl]

'currentCallableDescriptor' @ [84:44] ==> public final val currentCallableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'derivedCallable' @ [85:34] ==> value-parameter derivedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getCallableSubstitutor[ValueParameterDescriptorImpl]

'currentCallableDescriptor' @ [85:50] ==> public final val currentCallableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'getCallableSubstitutor' @ [86:12] ==> public fun getCallableSubstitutor(baseCallable: CallableDescriptor, derivedCallable: CallableDescriptor): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'currentBaseFunction' @ [86:35] ==> val currentBaseFunction: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getCallableSubstitutor[LocalVariableDescriptor]

'currentDerivedFunction' @ [86:56] ==> val currentDerivedFunction: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.getCallableSubstitutor[LocalVariableDescriptor]

'substitutor' @ [90:19] ==> value-parameter substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[ValueParameterDescriptorImpl]

'substitute' @ [90:32] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'this' @ [90:43] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[ReceiverParameterDescriptorImpl]

'INVARIANT' @ [90:58] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'defaultText' @ [90:79] ==> value-parameter defaultText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[ValueParameterDescriptorImpl]

'if (inArgumentPosition) IdeDescriptorRenderers.SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION else IdeDescriptorRenderers.SOURCE_CODE' @ [91:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorRenderer, elseBranch: DescriptorRenderer): DescriptorRenderer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorRenderer

'inArgumentPosition' @ [91:24] ==> value-parameter inArgumentPosition: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [91:44] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION' @ [91:67] ==> @field:JvmField public final val SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [91:112] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [91:135] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderer' @ [92:12] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[LocalVariableDescriptor]

'renderType' @ [92:21] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'newType' @ [92:32] ==> val newType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderTypeWithSubstitution[LocalVariableDescriptor]

'?:' @ [98:46] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'this' @ [98:47] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createDeepCopy[ReceiverParameterDescriptorImpl]

'substitute' @ [98:79] ==> public open fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaMethodDescriptor]

'create' @ [98:106] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'ForceTypeCopySubstitution' @ [98:113] ==> private object ForceTypeCopySubstitution : TypeSubstitution defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[FakeCallableDescriptorForObject]

'this' @ [98:144] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createDeepCopy[ReceiverParameterDescriptorImpl]

'TypeSubstitution' @ [100:44] ==> public constructor TypeSubstitution() defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedClassConstructorDescriptor]

'with' @ [102:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinType, block: KotlinType.() -> TypeProjection): TypeProjection defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeProjection

'key' @ [102:18] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ForceTypeCopySubstitution.get[ValueParameterDescriptorImpl]

'isError' @ [103:21] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'asTypeProjection' @ [103:42] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'KotlinTypeFactory' @ [104:17] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [104:35] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [104:46] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'constructor' @ [104:59] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'arguments' @ [104:72] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [104:83] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScope' @ [104:101] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'asTypeProjection' @ [104:114] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'DescriptorToSourceUtilsIde' @ [111:20] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [111:47] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [111:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[ValueParameterDescriptorImpl]

'descriptor' @ [111:74] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[ValueParameterDescriptorImpl]

'emptyList' @ [111:122] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'callable' @ [112:22] ==> val callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

'bodyExpression' @ [112:48] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [112:64] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> LexicalScope): LexicalScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> LexicalScope

'it' @ [112:70] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>[ValueParameterDescriptorImpl]

'getResolutionScope' @ [112:73] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'it' @ [112:92] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [112:95] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'it' @ [112:106] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [112:109] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [113:22] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[ValueParameterDescriptorImpl]

'valueParameters' @ [113:33] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [113:49] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> String

'it' @ [113:55] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [113:58] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [113:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'bodyScope' @ [114:21] ==> val bodyScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

'let' @ [114:32] ==> @InlineOnly public inline fun <T, R> LexicalScope.let(block: (LexicalScope) -> CollectingNameValidator): CollectingNameValidator defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScope
    <R> -> CollectingNameValidator

'CollectingNameValidator' @ [115:9] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'paramNames' @ [115:33] ==> val paramNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

'bodyScope' @ [116:13] ==> value-parameter bodyScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>[ValueParameterDescriptorImpl]

'findVariable' @ [116:23] ==> public fun HierarchicalScope.findVariable(name: Name, location: LookupLocation, predicate: (VariableDescriptor) -> Boolean = ...): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [116:41] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [116:52] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [116:74] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'CollectingNameValidator' @ [118:10] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'paramNames' @ [118:34] ==> val paramNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

'descriptor' @ [119:24] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [119:35] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [119:63] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'emptyList' @ [119:78] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KotlinNameSuggester' @ [120:12] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [120:32] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [120:51] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

'validator' @ [120:65] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.suggestReceiverNames[LocalVariableDescriptor]

