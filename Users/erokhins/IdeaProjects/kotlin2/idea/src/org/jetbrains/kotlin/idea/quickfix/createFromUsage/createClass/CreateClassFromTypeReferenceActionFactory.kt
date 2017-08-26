'CreateClassFromUsageFactory<KtUserType>' @ [33:52] ==> public constructor CreateClassFromUsageFactory<E : KtElement>() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtUserType

'getParentElementOfType' @ [35:29] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtUserType..KtUserType?)>..Class<(KtUserType..KtUserType?)>?)): KtUserType? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtUserType

'diagnostic' @ [35:52] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'java' @ [35:82] ==> public val <T> KClass<KtUserType>.java: Class<KtUserType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtUserType

'element' @ [39:29] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'parent' @ [39:37] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [39:44] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeRefParent' @ [40:13] ==> val typeRefParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'emptyList' @ [40:80] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassKind

'typeRefParent' @ [42:33] ==> val typeRefParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'?:' @ [44:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'element' @ [44:28] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'parent' @ [44:36] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [44:60] ==> @InlineOnly public inline fun <T, R> KtUserType.let(block: (KtUserType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtUserType
    <R> -> Boolean

'it' @ [44:66] ==> value-parameter it: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [44:69] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'element' @ [44:82] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'element' @ [46:29] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'parent' @ [46:37] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeReference' @ [47:28] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [47:43] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtTypeParameter.() -> PsiElement?): KtTypeParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameter

'extendsBound' @ [47:87] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [48:31] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [48:46] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtTypeConstraint.() -> PsiElement?): KtTypeConstraint? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeConstraint

'boundTypeReference' @ [48:91] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'when {
            interfaceExpected -> Collections.singletonList(ClassKind.INTERFACE)
            else -> ClassKind.values().filter {
                val noTypeArguments = element.typeArgumentsAsTypes.isEmpty()
                when (it) {
                    ClassKind.OBJECT -> noTypeArguments && isQualifier
                    ClassKind.ANNOTATION_CLASS -> noTypeArguments && !isQualifier && !isUpperBound
                    ClassKind.ENUM_ENTRY -> false
                    ClassKind.ENUM_CLASS -> noTypeArguments && !isUpperBound
                    else -> true
                }
            }
        }' @ [50:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ClassKind>, entry1: List<ClassKind>): List<ClassKind>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<ClassKind>

'interfaceExpected' @ [51:13] ==> val interfaceExpected: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'singletonList' @ [51:46] ==> public open fun <T : (Any..Any?)> singletonList(p0: (ClassKind..ClassKind?)): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassKind

'INTERFACE' @ [51:70] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'values' @ [52:31] ==> public final fun values(): Array<ClassKind> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[SimpleFunctionDescriptorImpl]

'filter' @ [52:40] ==> public inline fun <T> Array<out ClassKind>.filter(predicate: (ClassKind) -> Boolean): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'element' @ [53:39] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'typeArgumentsAsTypes' @ [53:47] ==> public final val KtUserType.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'isEmpty' @ [53:68] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'when (it) {
                    ClassKind.OBJECT -> noTypeArguments && isQualifier
                    ClassKind.ANNOTATION_CLASS -> noTypeArguments && !isQualifier && !isUpperBound
                    ClassKind.ENUM_ENTRY -> false
                    ClassKind.ENUM_CLASS -> noTypeArguments && !isUpperBound
                    else -> true
                }' @ [54:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [54:23] ==> value-parameter it: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT' @ [55:31] ==> enum entry OBJECT defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'noTypeArguments' @ [55:41] ==> val noTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds.<anonymous>[LocalVariableDescriptor]

'isQualifier' @ [55:60] ==> val isQualifier: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [56:31] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'noTypeArguments' @ [56:51] ==> val noTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds.<anonymous>[LocalVariableDescriptor]

'!' @ [56:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isQualifier' @ [56:71] ==> val isQualifier: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'!' @ [56:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpperBound' @ [56:87] ==> val isUpperBound: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ENUM_ENTRY' @ [57:31] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [58:31] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'noTypeArguments' @ [58:45] ==> val noTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds.<anonymous>[LocalVariableDescriptor]

'!' @ [58:64] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpperBound' @ [58:65] ==> val isUpperBound: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'?:' @ [66:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtTypeProjection?, right: KtTypeProjection): KtTypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtTypeProjection

'element' @ [66:27] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[ValueParameterDescriptorImpl]

'parent' @ [66:35] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [66:64] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'projection' @ [67:28] ==> val projection: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'parent' @ [67:39] ==> public final val KtTypeProjection.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argumentList' @ [68:21] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'arguments' @ [68:34] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'indexOf' @ [68:44] ==> public abstract fun indexOf(element: (KtTypeProjection..KtTypeProjection?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'projection' @ [68:52] ==> val projection: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'argumentList' @ [69:27] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'parent' @ [69:40] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callElement' @ [70:28] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'getResolvedCall' @ [70:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [70:56] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[ValueParameterDescriptorImpl]

'resolvedCall' @ [71:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'candidateDescriptor' @ [71:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'typeParameters' @ [71:72] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'getOrNull' @ [71:87] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.getOrNull(index: Int): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'index' @ [71:97] ==> val index: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'typeParameterDescriptor' @ [72:13] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'upperBounds' @ [72:37] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'isEmpty' @ [72:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getUpperBoundsAsType' @ [73:32] ==> @NotNull public open fun getUpperBoundsAsType(@NotNull p0: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'typeParameterDescriptor' @ [73:53] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.getExpectedUpperBound[LocalVariableDescriptor]

'element' @ [77:20] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'referenceExpression' @ [77:28] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'getReferencedName' @ [77:49] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [78:13] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'parent' @ [78:21] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [78:28] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'component1' @ [80:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [80:23] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'element' @ [80:33] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'analyzeAndGetResult' @ [80:41] ==> public fun KtElement.analyzeAndGetResult(): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [81:25] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'qualifier' @ [81:33] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'referenceExpression' @ [81:44] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'qualifier' @ [82:35] ==> val qualifier: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'let' @ [82:46] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> DeclarationDescriptor?

'context' @ [82:52] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [82:75] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [82:93] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getTargetParentsByQualifier' @ [84:29] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'element' @ [84:57] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'qualifier' @ [84:66] ==> val qualifier: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'qualifierDescriptor' @ [84:85] ==> val qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'ifEmpty' @ [84:106] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'getExpectedUpperBound' @ [85:34] ==> private final fun getExpectedUpperBound(element: KtUserType, context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [85:56] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'context' @ [85:65] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'module' @ [87:23] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'builtIns' @ [87:30] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [87:39] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'ClassInfo' @ [89:16] ==> public constructor ClassInfo(kind: ClassKind = ..., name: String, targetParents: List<PsiElement>, expectedTypeInfo: TypeInfo, inner: Boolean = ..., open: Boolean = ..., typeArguments: List<TypeInfo> = ..., parameterInfos: List<ParameterInfo> = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[ClassConstructorDescriptorImpl]

'name' @ [90:24] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'targetParents' @ [91:33] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'expectedUpperBound' @ [92:36] ==> val expectedUpperBound: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'let' @ [92:56] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> TypeInfo.ByType): TypeInfo.ByType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> ByType

'ByType' @ [92:71] ==> public constructor ByType(theType: KotlinType, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[ClassConstructorDescriptorImpl]

'it' @ [92:78] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [92:91] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'Empty' @ [92:116] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'element' @ [93:33] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'typeArgumentsAsTypes' @ [93:41] ==> public final val KtUserType.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'map' @ [93:62] ==> public inline fun <T, R> Iterable<(KtTypeReference..KtTypeReference?)>.map(transform: ((KtTypeReference..KtTypeReference?)) -> TypeInfo): List<TypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <R> -> TypeInfo

'if (it != null) TypeInfo(it, Variance.INVARIANT) else TypeInfo(anyType, Variance.INVARIANT)' @ [94:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeInfo, elseBranch: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeInfo

'it' @ [94:25] ==> value-parameter it: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'TypeInfo' @ [94:37] ==> public fun TypeInfo(typeReference: KtTypeReference, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [94:46] ==> value-parameter it: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [94:59] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [94:75] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'anyType' @ [94:84] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'INVARIANT' @ [94:102] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

