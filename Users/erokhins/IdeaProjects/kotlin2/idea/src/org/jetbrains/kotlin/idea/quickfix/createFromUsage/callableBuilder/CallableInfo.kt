'TypeInfo' @ [41:19] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'INVARIANT' @ [41:37] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'emptyList' @ [42:97] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TypeInfo' @ [45:75] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'variance' @ [45:84] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.<init>[ValueParameterDescriptorImpl]

'KotlinNameSuggester' @ [47:20] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByExpressionOnly' @ [47:40] ==> public final fun suggestNamesByExpressionOnly(expression: KtExpression, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'expression' @ [47:69] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression[PropertyDescriptorImpl]

'bindingContext' @ [47:81] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleNamesFromExpression[ValueParameterDescriptorImpl]

'toTypedArray' @ [47:107] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'expression' @ [51:17] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression[PropertyDescriptorImpl]

'guessTypes' @ [51:28] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'builder' @ [52:35] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleTypes[ValueParameterDescriptorImpl]

'currentFileContext' @ [52:43] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'builder' @ [53:34] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleTypes[ValueParameterDescriptorImpl]

'currentFileModule' @ [53:42] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'builder' @ [54:38] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleTypes[ValueParameterDescriptorImpl]

'pseudocode' @ [54:46] ==> public final val pseudocode: Pseudocode? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'flatMap' @ [55:19] ==> public inline fun <T, R> Array<out KotlinType>.flatMap(transform: (KotlinType) -> Iterable<KotlinType>): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'it' @ [55:29] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'getPossibleSupertypes' @ [55:32] ==> protected final fun KotlinType?.getPossibleSupertypes(variance: Variance, callableBuilder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression[SimpleFunctionDescriptorImpl]

'variance' @ [55:54] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression[PropertyDescriptorImpl]

'builder' @ [55:64] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression.getPossibleTypes[ValueParameterDescriptorImpl]

'TypeInfo' @ [58:84] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'variance' @ [58:93] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference.<init>[ValueParameterDescriptorImpl]

'builder' @ [60:17] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference.getPossibleTypes[ValueParameterDescriptorImpl]

'currentFileContext' @ [60:25] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'TYPE' @ [60:59] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [60:65] ==> public final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference[PropertyDescriptorImpl]

'getPossibleSupertypes' @ [60:80] ==> protected final fun KotlinType?.getPossibleSupertypes(variance: Variance, callableBuilder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference[SimpleFunctionDescriptorImpl]

'variance' @ [60:102] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference[PropertyDescriptorImpl]

'builder' @ [60:112] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference.getPossibleTypes[ValueParameterDescriptorImpl]

'TypeInfo' @ [63:64] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'variance' @ [63:73] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType.<init>[ValueParameterDescriptorImpl]

'theType' @ [65:17] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[PropertyDescriptorImpl]

'getPossibleSupertypes' @ [65:25] ==> protected final fun KotlinType?.getPossibleSupertypes(variance: Variance, callableBuilder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[SimpleFunctionDescriptorImpl]

'variance' @ [65:47] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[PropertyDescriptorImpl]

'builder' @ [65:57] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType.getPossibleTypes[ValueParameterDescriptorImpl]

'TypeInfo' @ [68:47] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'variance' @ [68:56] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByReceiverType.<init>[ValueParameterDescriptorImpl]

'builder' @ [70:18] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByReceiverType.getPossibleTypes[ValueParameterDescriptorImpl]

'placement' @ [70:26] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'receiverTypeCandidate' @ [70:71] ==> public final val receiverTypeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[PropertyDescriptorImpl]

'theType' @ [70:93] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'getPossibleSupertypes' @ [70:101] ==> protected final fun KotlinType?.getPossibleSupertypes(variance: Variance, callableBuilder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByReceiverType[SimpleFunctionDescriptorImpl]

'variance' @ [70:123] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByReceiverType[PropertyDescriptorImpl]

'builder' @ [70:133] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByReceiverType.getPossibleTypes[ValueParameterDescriptorImpl]

'TypeInfo' @ [73:64] ==> public constructor TypeInfo(variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ClassConstructorDescriptorImpl]

'delegate' @ [73:73] ==> value-parameter delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo.<init>[ValueParameterDescriptorImpl]

'variance' @ [73:82] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'delegate' @ [74:54] ==> public final val delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[PropertyDescriptorImpl]

'substitutionsAllowed' @ [74:63] ==> public open val substitutionsAllowed: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'delegate' @ [75:87] ==> public final val delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[PropertyDescriptorImpl]

'getPossibleNamesFromExpression' @ [75:96] ==> public open fun getPossibleNamesFromExpression(bindingContext: BindingContext): Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'bindingContext' @ [75:127] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo.getPossibleNamesFromExpression[ValueParameterDescriptorImpl]

'delegate' @ [76:85] ==> public final val delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[PropertyDescriptorImpl]

'getPossibleTypes' @ [76:94] ==> public abstract fun getPossibleTypes(builder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'builder' @ [76:111] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo.getPossibleTypes[ValueParameterDescriptorImpl]

'DelegatingTypeInfo' @ [79:48] ==> public constructor DelegatingTypeInfo(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[ClassConstructorDescriptorImpl]

'delegate' @ [79:67] ==> value-parameter delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.NoSubstitutions.<init>[ValueParameterDescriptorImpl]

'DelegatingTypeInfo' @ [83:54] ==> public constructor DelegatingTypeInfo(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[ClassConstructorDescriptorImpl]

'delegate' @ [83:73] ==> value-parameter delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.StaticContextRequired.<init>[ValueParameterDescriptorImpl]

'EMPTY_STRING_ARRAY' @ [89:104] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'placement' @ [93:13] ==> value-parameter placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'config' @ [93:39] ==> value-parameter config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'originalElement' @ [93:46] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'getResolutionScope' @ [93:62] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'when (placement) {
            is CallablePlacement.NoReceiver -> {
                placement.containingElement
            }
            is CallablePlacement.WithReceiver -> {
                val receiverClassDescriptor =
                        placement.receiverTypeCandidate.theType.constructor.declarationDescriptor
                val classDeclaration = receiverClassDescriptor?.let { DescriptorToSourceUtils.getSourceFromDescriptor(it) }
                if (!config.isExtension && classDeclaration != null) classDeclaration else config.currentFile
            }
        }' @ [95:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'placement' @ [95:39] ==> value-parameter placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'placement' @ [97:17] ==> value-parameter placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'containingElement' @ [97:27] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.NoReceiver[PropertyDescriptorImpl]

'placement' @ [101:25] ==> value-parameter placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'receiverTypeCandidate' @ [101:35] ==> public final val receiverTypeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[PropertyDescriptorImpl]

'theType' @ [101:57] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'constructor' @ [101:65] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [101:77] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'receiverClassDescriptor' @ [102:40] ==> val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'let' @ [102:65] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [102:71] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [102:95] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [102:119] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation.<anonymous>[ValueParameterDescriptorImpl]

'if (!config.isExtension && classDeclaration != null) classDeclaration else config.currentFile' @ [103:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'!' @ [103:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'config' @ [103:22] ==> value-parameter config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'isExtension' @ [103:29] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'classDeclaration' @ [103:44] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'classDeclaration' @ [103:70] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'config' @ [103:92] ==> value-parameter config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[ValueParameterDescriptorImpl]

'currentFile' @ [103:99] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'when (containingElement) {
            is KtClassOrObject -> (containingElement.resolveToDescriptor() as? ClassDescriptorWithResolutionScopes)?.scopeForMemberDeclarationResolution
            is KtBlockExpression -> (containingElement.statements.firstOrNull() ?: containingElement).getResolutionScope()
            is KtElement -> containingElement.containingKtFile.getResolutionScope()
            else -> null
        }' @ [106:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope?, entry1: LexicalScope?, entry2: LexicalScope?, entry3: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope?

'containingElement' @ [106:22] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'containingElement' @ [107:36] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'resolveToDescriptor' @ [107:54] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'scopeForMemberDeclarationResolution' @ [107:118] ==> public final val ClassDescriptorWithResolutionScopes.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'containingElement' @ [108:38] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'statements' @ [108:56] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'firstOrNull' @ [108:67] ==> public fun <T> List<(KtExpression..KtExpression?)>.firstOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'containingElement' @ [108:84] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'getResolutionScope' @ [108:103] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'containingElement' @ [109:29] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getScopeForTypeApproximation[LocalVariableDescriptor]

'containingKtFile' @ [109:47] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'getResolutionScope' @ [109:64] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'this' @ [115:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ReceiverParameterDescriptorImpl]

'containsErrorType' @ [115:40] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'this' @ [115:58] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ReceiverParameterDescriptorImpl]

'singletonList' @ [116:32] ==> public open fun <T : (Any..Any?)> singletonList(p0: (SimpleType..SimpleType?)): (MutableList<(SimpleType..SimpleType?)>..List<(SimpleType..SimpleType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'callableBuilder' @ [116:46] ==> value-parameter callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ValueParameterDescriptorImpl]

'currentFileModule' @ [116:62] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'builtIns' @ [116:80] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [116:89] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'getScopeForTypeApproximation' @ [118:21] ==> private final fun getScopeForTypeApproximation(config: CallableBuilderConfiguration, placement: CallablePlacement?): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'callableBuilder' @ [118:50] ==> value-parameter callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ValueParameterDescriptorImpl]

'config' @ [118:66] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableBuilder' @ [118:74] ==> value-parameter callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ValueParameterDescriptorImpl]

'placement' @ [118:90] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'getResolvableApproximations' @ [119:30] ==> public fun KotlinType.getResolvableApproximations(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'scope' @ [119:58] ==> val scope: LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[LocalVariableDescriptor]

'when (variance) {
            Variance.IN_VARIANCE -> approximations.toList()
            else -> listOf(approximations.firstOrNull() ?: this)
        }' @ [120:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KotlinType>, entry1: List<KotlinType>): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KotlinType>

'variance' @ [120:22] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [121:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'approximations' @ [121:37] ==> val approximations: Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[LocalVariableDescriptor]

'toList' @ [121:52] ==> public fun <T> Sequence<KotlinType>.toList(): List<KotlinType> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'listOf' @ [122:21] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'approximations' @ [122:28] ==> val approximations: Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[LocalVariableDescriptor]

'firstOrNull' @ [122:43] ==> public fun <T> Sequence<KotlinType>.firstOrNull(): KotlinType? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'this' @ [122:60] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.getPossibleSupertypes[ReceiverParameterDescriptorImpl]

'ByExpression' @ [127:87] ==> public constructor ByExpression(expression: KtExpression, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByExpression[ClassConstructorDescriptorImpl]

'expressionOfType' @ [127:100] ==> value-parameter expressionOfType: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'variance' @ [127:118] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'ByTypeReference' @ [128:87] ==> public constructor ByTypeReference(typeReference: KtTypeReference, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByTypeReference[ClassConstructorDescriptorImpl]

'typeReference' @ [128:103] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'variance' @ [128:118] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'ByType' @ [129:76] ==> public constructor ByType(theType: KotlinType, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[ClassConstructorDescriptorImpl]

'theType' @ [129:83] ==> value-parameter theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'variance' @ [129:92] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[ValueParameterDescriptorImpl]

'?:' @ [131:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TypeInfo?, right: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TypeInfo

'this' @ [131:45] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.noSubstitutions[ReceiverParameterDescriptorImpl]

'NoSubstitutions' @ [131:92] ==> public constructor NoSubstitutions(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.NoSubstitutions[ClassConstructorDescriptorImpl]

'this' @ [131:108] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.noSubstitutions[ReceiverParameterDescriptorImpl]

'TypeInfo.DelegatingTypeInfo' @ [134:46] ==> public constructor DelegatingTypeInfo(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[ClassConstructorDescriptorImpl]

'delegate' @ [134:74] ==> value-parameter delegate: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull.ForcedNotNull.<init>[ValueParameterDescriptorImpl]

'super' @ [136:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull.ForcedNotNull[LazyClassReceiverParameterDescriptor]

'getPossibleTypes' @ [136:23] ==> public open fun getPossibleTypes(builder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.DelegatingTypeInfo[SimpleFunctionDescriptorImpl]

'builder' @ [136:40] ==> value-parameter builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull.ForcedNotNull.getPossibleTypes[ValueParameterDescriptorImpl]

'map' @ [136:49] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'it' @ [136:55] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull.ForcedNotNull.getPossibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'makeNotNullable' @ [136:58] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'?:' @ [139:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TypeInfo?, right: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TypeInfo

'this' @ [139:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull[ReceiverParameterDescriptorImpl]

'ForcedNotNull' @ [139:40] ==> public constructor ForcedNotNull(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull.ForcedNotNull[ClassConstructorDescriptorImpl]

'this' @ [139:54] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.forceNotNull[ReceiverParameterDescriptorImpl]

'this' @ [168:52] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[LazyClassReceiverParameterDescriptor]

'receiverTypeInfo' @ [168:57] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'this' @ [169:61] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[LazyClassReceiverParameterDescriptor]

'possibleContainers' @ [169:66] ==> public final val possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'this' @ [170:45] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[LazyClassReceiverParameterDescriptor]

'isAbstract' @ [170:50] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'emptyList' @ [176:70] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'emptyList' @ [177:83] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ParameterInfo..ParameterInfo?)>..List<(ParameterInfo..ParameterInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo?)

'emptyList' @ [178:69] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeInfo..TypeInfo?)>..List<(TypeInfo..TypeInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo?)

'CallableInfo' @ [182:5] ==> public constructor CallableInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement>, typeParameterInfos: List<TypeInfo>, isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[ClassConstructorDescriptorImpl]

'name' @ [182:18] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'receiverTypeInfo' @ [182:24] ==> value-parameter receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [182:42] ==> value-parameter returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'possibleContainers' @ [182:58] ==> value-parameter possibleContainers: List<KtElement> = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'typeParameterInfos' @ [182:78] ==> value-parameter typeParameterInfos: List<TypeInfo> = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'isAbstract' @ [182:98] ==> value-parameter isAbstract: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.<init>[ValueParameterDescriptorImpl]

'FUNCTION' @ [183:58] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'FunctionInfo' @ [185:111] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'name' @ [186:13] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'receiverTypeInfo' @ [187:13] ==> value-parameter receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.copy[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [188:13] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'possibleContainers' @ [189:13] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.copy[ValueParameterDescriptorImpl]

'parameterInfos' @ [190:13] ==> public open val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'typeParameterInfos' @ [191:13] ==> public final val typeParameterInfos: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'isOperator' @ [192:13] ==> public final val isOperator: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'isInfix' @ [193:13] ==> public final val isInfix: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'isAbstract' @ [194:13] ==> value-parameter isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo.copy[ValueParameterDescriptorImpl]

'CallableInfo' @ [198:85] ==> public constructor CallableInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement>, typeParameterInfos: List<TypeInfo>, isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[ClassConstructorDescriptorImpl]

'classInfo' @ [199:9] ==> value-parameter classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [199:19] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'Empty' @ [199:34] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'expectedTypeInfo' @ [199:41] ==> value-parameter expectedTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo.<init>[ValueParameterDescriptorImpl]

'forceNotNull' @ [199:58] ==> public fun TypeInfo.forceNotNull(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [199:86] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'classInfo' @ [199:99] ==> value-parameter classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo.<init>[ValueParameterDescriptorImpl]

'typeArguments' @ [199:109] ==> public final val typeArguments: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'CLASS_WITH_PRIMARY_CONSTRUCTOR' @ [201:58] ==> enum entry CLASS_WITH_PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'classInfo' @ [202:62] ==> public final val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo[PropertyDescriptorImpl]

'parameterInfos' @ [202:72] ==> public final val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [204:117] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'CallableInfo' @ [210:4] ==> public constructor CallableInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement>, typeParameterInfos: List<TypeInfo>, isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[ClassConstructorDescriptorImpl]

'Empty' @ [210:30] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'Empty' @ [210:46] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'emptyList' @ [210:65] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'emptyList' @ [210:90] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeInfo..TypeInfo?)>..List<(TypeInfo..TypeInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo?)

'SECONDARY_CONSTRUCTOR' @ [211:58] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [213:117] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'emptyList' @ [220:70] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'emptyList' @ [221:69] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeInfo..TypeInfo?)>..List<(TypeInfo..TypeInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo?)

'CallableInfo' @ [224:5] ==> public constructor CallableInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement>, typeParameterInfos: List<TypeInfo>, isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[ClassConstructorDescriptorImpl]

'name' @ [224:18] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'receiverTypeInfo' @ [224:24] ==> value-parameter receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [224:42] ==> value-parameter returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'possibleContainers' @ [224:58] ==> value-parameter possibleContainers: List<KtElement> = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'typeParameterInfos' @ [224:78] ==> value-parameter typeParameterInfos: List<TypeInfo> = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'isAbstract' @ [224:98] ==> value-parameter isAbstract: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.<init>[ValueParameterDescriptorImpl]

'PROPERTY' @ [225:58] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'emptyList' @ [226:74] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ParameterInfo..ParameterInfo?)>..List<(ParameterInfo..ParameterInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo?)

'PropertyInfo' @ [228:111] ==> public constructor PropertyInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, writable: Boolean, possibleContainers: List<KtElement> = ..., typeParameterInfos: List<TypeInfo> = ..., isAbstract: Boolean = ..., isLateinitPreferred: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[ClassConstructorDescriptorImpl]

'name' @ [229:13] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'receiverTypeInfo' @ [230:13] ==> value-parameter receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.copy[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [231:13] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'writable' @ [232:13] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'possibleContainers' @ [233:13] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.copy[ValueParameterDescriptorImpl]

'typeParameterInfos' @ [234:13] ==> public final val typeParameterInfos: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'isAbstract' @ [235:13] ==> value-parameter isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo.copy[ValueParameterDescriptorImpl]

'isLateinitPreferred' @ [236:13] ==> public final val isLateinitPreferred: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

