'sourceClass' @ [43:28] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getResolutionFacade' @ [43:40] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [45:30] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyzeFullyAndGetResult' @ [45:47] ==> public abstract fun analyzeFullyAndGetResult(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'listOf' @ [45:72] ==> public fun <T> listOf(element: KtClassOrObject): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'sourceClass' @ [45:79] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'bindingContext' @ [45:93] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'sourceClassContext' @ [47:33] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [47:67] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'sourceClass' @ [47:94] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'membersToMove' @ [49:29] ==> public final val membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'keysToMap' @ [49:43] ==> public fun <K, V> Iterable<KtNamedDeclaration>.keysToMap(value: (KtNamedDeclaration) -> DeclarationDescriptor): Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> DeclarationDescriptor

'when (it) {
            is KtPsiClassWrapper -> it.psiClass.getJavaClassDescriptor(resolutionFacade)!!
            is KtParameter -> sourceClassContext[BindingContext.PRIMARY_CONSTRUCTOR_PARAMETER, it]!!
            else -> sourceClassContext[BindingContext.DECLARATION_TO_DESCRIPTOR, it]!!
        }' @ [50:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'it' @ [50:15] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [51:37] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'psiClass' @ [51:40] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'getJavaClassDescriptor' @ [51:49] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [51:72] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'sourceClassContext' @ [52:31] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [52:65] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [52:96] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'sourceClassContext' @ [53:21] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [53:55] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [53:82] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'targetClass' @ [57:33] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getClassDescriptorIfAny' @ [57:45] ==> public fun PsiNamedElement.getClassDescriptorIfAny(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [57:69] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'sourceClass' @ [59:36] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getSuperTypeEntryByDescriptor' @ [59:48] ==> public fun KtClassOrObject.getSuperTypeEntryByDescriptor(descriptor: ClassDescriptor, context: BindingContext): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'targetClassDescriptor' @ [59:78] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'sourceClassContext' @ [59:101] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'superEntryForTargetClass' @ [61:40] ==> public final val superEntryForTargetClass: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getResolvedCall' @ [61:65] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'sourceClassContext' @ [61:81] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'lazy' @ [63:55] ==> public fun <T> lazy(initializer: () -> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>): Lazy<List<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>

'sourceClassDescriptor' @ [64:9] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'declaredTypeParameters' @ [64:31] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'sourceClass' @ [65:9] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getResolutionScope' @ [65:21] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'sourceClassContext' @ [65:40] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'resolutionFacade' @ [65:60] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'collectDescriptorsFiltered' @ [66:18] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [66:45] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'NON_SINGLETON_CLASSIFIERS' @ [66:66] ==> @field:JvmField public final val NON_SINGLETON_CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [67:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TypeParameterDescriptor

'lazy' @ [70:60] ==> public fun <T> lazy(initializer: () -> TypeSubstitutor): Lazy<TypeSubstitutor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor

'LinkedHashMap' @ [71:28] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeConstructor
    <V : (Any..Any?)> -> TypeProjection

'typeParametersInSourceClassContext' @ [73:9] ==> private final val typeParametersInSourceClassContext: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'forEach' @ [73:44] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'substitution' @ [74:13] ==> val substitution: LinkedHashMap<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'it' @ [74:26] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [74:29] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [74:48] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'getUpperBoundsAsType' @ [74:83] ==> @NotNull public open fun getUpperBoundsAsType(@NotNull p0: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'it' @ [74:104] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getTypeSubstitution' @ [77:38] ==> public fun getTypeSubstitution(baseType: KotlinType, derivedType: KotlinType): LinkedHashMap<TypeConstructor, TypeProjection>? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'targetClassDescriptor' @ [77:58] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'defaultType' @ [77:80] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'sourceClassDescriptor' @ [77:93] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'defaultType' @ [77:115] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'emptyMap' @ [78:41] ==> public fun <K, V> emptyMap(): Map<TypeConstructor, TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> TypeProjection

'component1' @ [79:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<TypeConstructor, TypeProjection>.component1(): TypeConstructor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> TypeProjection

'component2' @ [79:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<TypeConstructor, TypeProjection>.component2(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> TypeProjection

'superClassSubstitution' @ [79:51] ==> val superClassSubstitution: Map<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'typeProjection' @ [80:41] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'type' @ [80:56] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [80:61] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [80:73] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeConstructor' @ [82:43] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'declarationDescriptor' @ [82:59] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'substitution' @ [84:13] ==> val substitution: LinkedHashMap<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'subClassTypeParameter' @ [84:26] ==> val subClassTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'typeConstructor' @ [84:48] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [84:67] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'superClassTypeParameter' @ [84:86] ==> val superClassTypeParameter: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [84:110] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'create' @ [87:25] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substitution' @ [87:32] ==> val substitution: LinkedHashMap<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData.sourceToTargetClassSubstitutor.<anonymous>[LocalVariableDescriptor]

'targetClassDescriptor' @ [90:38] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'kind' @ [90:60] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [90:78] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

