'CreateCallableMemberFromUsageFactory<KtCallableReferenceExpression>' @ [37:59] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtCallableReferenceExpression

'diagnostic' @ [39:16] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [39:27] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getStrictParentOfType' @ [39:38] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'element' @ [43:20] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'callableReference' @ [43:28] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedName' @ [43:46] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [44:32] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [44:40] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [45:23] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'analyze' @ [45:40] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'element' @ [45:48] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'PARTIAL' @ [45:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [46:16] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'guessTypes' @ [47:18] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'context' @ [47:29] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'resolutionFacade' @ [47:38] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'moduleDescriptor' @ [47:55] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'ifEmpty' @ [48:18] ==> public inline fun <T> Array<out KotlinType>.ifEmpty(body: () -> Array<out KotlinType>): Array<out KotlinType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'element' @ [48:28] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'guessTypes' @ [48:36] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'context' @ [48:47] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'resolutionFacade' @ [48:56] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'moduleDescriptor' @ [48:73] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'filter' @ [49:18] ==> public inline fun <T> Array<out KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'KotlinType' @ [49:25] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'mapNotNull' @ [50:18] ==> public inline fun <T, R : Any> Iterable<KotlinType>.mapNotNull(transform: (KotlinType) -> FunctionInfo?): List<FunctionInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> FunctionInfo

'it' @ [51:48] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getReceiverTypeFromFunctionType' @ [51:51] ==> public fun KotlinType.getReceiverTypeFromFunctionType(): KotlinType? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'element' @ [52:46] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'receiverExpression' @ [52:54] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'context' @ [53:42] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'get' @ [53:50] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> DoubleColonLHS

'DOUBLE_COLON_LHS' @ [53:69] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [53:87] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'type' @ [53:133] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[DeserializedPropertyDescriptor]

'qualifierType' @ [54:44] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'let' @ [54:59] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeInfo

'TypeInfo' @ [54:65] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [54:74] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [54:87] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'Empty' @ [54:114] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'TypeInfo' @ [55:42] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [55:51] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [55:54] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'OUT_VARIANCE' @ [55:96] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'element' @ [56:38] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getExtractionContainers' @ [56:46] ==> public fun PsiElement.getExtractionContainers(strict: Boolean = ..., includeAll: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'ifEmpty' @ [56:89] ==> public inline fun <T, C : Collection<KtElement>> List<KtElement>.ifEmpty(body: () -> List<KtElement>): List<KtElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <C : Collection<T>> -> List<KtElement>

'SmartList' @ [57:42] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ParameterInfo

'apply' @ [57:69] ==> @InlineOnly public inline fun <T> SmartList<ParameterInfo>.apply(block: SmartList<ParameterInfo>.() -> Unit): SmartList<ParameterInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartList<ParameterInfo>

'receiverExpression' @ [58:29] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'expectedReceiverType' @ [58:59] ==> val expectedReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'add' @ [59:29] ==> public open fun add(element: (ParameterInfo..ParameterInfo?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'ParameterInfo' @ [59:33] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'TypeInfo' @ [59:47] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'expectedReceiverType' @ [59:56] ==> val expectedReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'IN_VARIANCE' @ [59:87] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [62:25] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getValueParameterTypesFromFunctionType' @ [62:28] ==> public fun KotlinType.getValueParameterTypesFromFunctionType(): List<TypeProjection> defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'let' @ [63:34] ==> @InlineOnly public inline fun <T, R> List<TypeProjection>.let(block: (List<TypeProjection>) -> List<TypeProjection>): List<TypeProjection> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TypeProjection>
    <R> -> List<TypeProjection>

'if (receiverExpression != null && expectedReceiverType == null && it.isNotEmpty())
                                        it.subList(1, it.size)
                                    else it' @ [64:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TypeProjection>, elseBranch: List<TypeProjection>): List<TypeProjection>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TypeProjection>

'receiverExpression' @ [64:41] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'expectedReceiverType' @ [64:71] ==> val expectedReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'it' @ [64:103] ==> value-parameter it: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [64:106] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [65:41] ==> value-parameter it: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'subList' @ [65:44] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<TypeProjection> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [65:55] ==> value-parameter it: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [65:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'it' @ [66:42] ==> value-parameter it: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [68:34] ==> public inline fun <T, R, C : MutableCollection<in ParameterInfo>> Iterable<TypeProjection>.mapTo(destination: SmartList<ParameterInfo>, transform: (TypeProjection) -> ParameterInfo): SmartList<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> ParameterInfo
    <C : MutableCollection<in R>> -> SmartList<ParameterInfo>

'this' @ [68:40] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ParameterInfo' @ [69:37] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'TypeInfo' @ [69:51] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [69:60] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [69:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'it' @ [69:69] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [69:72] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'FunctionInfo' @ [73:21] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'name' @ [73:34] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'receiverTypeInfo' @ [73:40] ==> val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'returnTypeInfo' @ [73:58] ==> val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'containers' @ [73:74] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

'parameterInfos' @ [73:86] ==> val parameterInfos: SmartList<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateFunctionFromCallableReferenceActionFactory.extractFixData.<anonymous>[LocalVariableDescriptor]

