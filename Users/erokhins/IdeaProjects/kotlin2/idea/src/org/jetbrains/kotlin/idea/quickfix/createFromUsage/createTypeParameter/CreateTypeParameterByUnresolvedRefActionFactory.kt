'KotlinIntentionActionFactoryWithDelegate<KtUserType, CreateTypeParameterData>' @ [51:58] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtUserType
    <D : Any> -> CreateTypeParameterData

'diagnostic' @ [53:26] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [53:37] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [53:48] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'referenceExpression' @ [53:87] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'ktUserType' @ [54:13] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [54:24] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtConstructorCalleeExpression.() -> PsiElement?): KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtConstructorCalleeExpression

'typeReference' @ [54:82] ==> public final val KtConstructorCalleeExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'ktUserType' @ [55:13] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[LocalVariableDescriptor]

'qualifier' @ [55:24] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'ktUserType' @ [56:13] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [56:24] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'qualifier' @ [56:69] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'ktUserType' @ [57:13] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[LocalVariableDescriptor]

'typeArgumentList' @ [57:24] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'ktUserType' @ [58:16] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.getElementOfInterest[LocalVariableDescriptor]

'element' @ [62:27] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'parents' @ [62:35] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [62:43] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [63:13] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [63:33] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [63:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [65:36] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [65:48] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'createFakeTypeParameterDescriptor' @ [66:33] ==> public fun createFakeTypeParameterDescriptor(containingDescriptor: DeclarationDescriptor, name: String): TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter in file CreateTypeParameterByUnresolvedRefActionFactory.kt[SimpleFunctionDescriptorImpl]

'containingDescriptor' @ [66:67] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'newName' @ [66:89] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getUnsubstitutedTypeConstraintInfo' @ [67:30] ==> public fun getUnsubstitutedTypeConstraintInfo(element: KtTypeElement): UnsubstitutedTypeConstraintInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [67:65] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'let' @ [67:75] ==> @InlineOnly public inline fun <T, R> UnsubstitutedTypeConstraintInfo.let(block: (UnsubstitutedTypeConstraintInfo) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnsubstitutedTypeConstraintInfo
    <R> -> KotlinType?

'it' @ [68:13] ==> value-parameter it: UnsubstitutedTypeConstraintInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'performSubstitution' @ [68:16] ==> public final fun performSubstitution(vararg substitution: Pair<TypeConstructor, TypeProjection>): TypeConstraintInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[SimpleFunctionDescriptorImpl]

'it' @ [68:36] ==> value-parameter it: UnsubstitutedTypeConstraintInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'typeParameter' @ [68:39] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[PropertyDescriptorImpl]

'typeConstructor' @ [68:53] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [68:72] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'fakeTypeParameter' @ [68:91] ==> val fakeTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'defaultType' @ [68:109] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'upperBound' @ [68:124] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.TypeConstraintInfo[PropertyDescriptorImpl]

'upperBoundType' @ [70:13] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'upperBoundType' @ [70:39] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'containsError' @ [70:54] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'CreateTypeParameterData' @ [71:16] ==> public constructor CreateTypeParameterData(declaration: KtTypeParameterListOwner, typeParameters: List<TypeParameterInfo>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[ClassConstructorDescriptorImpl]

'declaration' @ [71:40] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'listOf' @ [71:53] ==> public fun <T> listOf(element: TypeParameterInfo): List<TypeParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo

'TypeParameterInfo' @ [71:60] ==> public constructor TypeParameterInfo(name: String, upperBoundType: KotlinType?, fakeTypeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[ClassConstructorDescriptorImpl]

'newName' @ [71:78] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'upperBoundType' @ [71:87] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'fakeTypeParameter' @ [71:103] ==> val fakeTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'element' @ [75:20] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'referencedName' @ [75:28] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'extractFixData' @ [76:16] ==> public final fun extractFixData(element: KtTypeElement, newName: String): CreateTypeParameterData? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [76:31] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[ValueParameterDescriptorImpl]

'name' @ [76:40] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.extractFixData[LocalVariableDescriptor]

'originalElementPointer' @ [84:26] ==> value-parameter originalElementPointer: SmartPsiElementPointer<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes[ValueParameterDescriptorImpl]

'element' @ [84:49] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtUserType>.element: KtUserType?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtUserType

'emptyList' @ [84:67] ==> public fun <T> emptyList(): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory

'ktUserType' @ [85:20] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes[LocalVariableDescriptor]

'referencedName' @ [85:31] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'emptyList' @ [85:56] ==> public fun <T> emptyList(): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory

'getPossibleTypeParameterContainers' @ [86:16] ==> public fun getPossibleTypeParameterContainers(startFrom: PsiElement): List<KtTypeParameterListOwner> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter[SimpleFunctionDescriptorImpl]

'ktUserType' @ [86:51] ==> val ktUserType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes[LocalVariableDescriptor]

'filter' @ [87:18] ==> public inline fun <T> Iterable<KtTypeParameterListOwner>.filter(predicate: (KtTypeParameterListOwner) -> Boolean): List<KtTypeParameterListOwner> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameterListOwner

'it' @ [87:27] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [87:30] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'all' @ [87:45] ==> public inline fun <T> Iterable<(KtTypeParameter..KtTypeParameter?)>.all(predicate: ((KtTypeParameter..KtTypeParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)

'it' @ [87:51] ==> value-parameter it: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [87:54] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'name' @ [87:62] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes[LocalVariableDescriptor]

'map' @ [88:18] ==> public inline fun <T, R> Iterable<KtTypeParameterListOwner>.map(transform: (KtTypeParameterListOwner) -> QuickFixWithDelegateFactory): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameterListOwner
    <R> -> QuickFixWithDelegateFactory

'QuickFixWithDelegateFactory' @ [89:21] ==> public constructor QuickFixWithDelegateFactory(delegateFactory: () -> IntentionAction?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixWithDelegateFactory[ClassConstructorDescriptorImpl]

'originalElementPointer' @ [90:47] ==> value-parameter originalElementPointer: SmartPsiElementPointer<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes[ValueParameterDescriptorImpl]

'element' @ [90:70] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtUserType>.element: KtUserType?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtUserType

'invoke' @ [91:36] ==> public abstract operator fun invoke(): CreateTypeParameterData? defined in kotlin.Function0[FunctionInvokeDescriptor]

'copy' @ [91:59] ==> public final fun copy(declaration: KtTypeParameterListOwner = ..., typeParameters: List<TypeParameterInfo> = ...): CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[SimpleFunctionDescriptorImpl]

'it' @ [91:78] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'CreateTypeParameterFromUsageFix' @ [92:25] ==> public constructor CreateTypeParameterFromUsageFix(originalElement: KtElement, data: CreateTypeParameterData, presentTypeParameterNames: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[ClassConstructorDescriptorImpl]

'originalElement' @ [92:57] ==> val originalElement: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'data' @ [92:74] ==> val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory.createFixes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createWithDefaultBound' @ [100:14] ==> @NotNull public open fun createWithDefaultBound(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: Variance, @NotNull p4: Name, p5: Int): TypeParameterDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl[JavaMethodDescriptor]

'containingDescriptor' @ [100:37] ==> value-parameter containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.createFakeTypeParameterDescriptor[ValueParameterDescriptorImpl]

'Annotations' @ [100:59] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [100:71] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'INVARIANT' @ [100:94] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'identifier' @ [100:110] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [100:121] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.createFakeTypeParameterDescriptor[ValueParameterDescriptorImpl]

'-' @ [100:128] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'startFrom' @ [104:18] ==> value-parameter startFrom: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers[ValueParameterDescriptorImpl]

'parents' @ [104:28] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [104:36] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'parent' @ [104:76] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (stopAt != null) startFrom.parents.takeWhile { it != stopAt } else startFrom.parents' @ [105:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<PsiElement>, elseBranch: Sequence<PsiElement>): Sequence<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<PsiElement>

'stopAt' @ [105:17] ==> val stopAt: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers[LocalVariableDescriptor]

'startFrom' @ [105:33] ==> value-parameter startFrom: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers[ValueParameterDescriptorImpl]

'parents' @ [105:43] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [105:51] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [105:63] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'stopAt' @ [105:69] ==> val stopAt: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers[LocalVariableDescriptor]

'startFrom' @ [105:83] ==> value-parameter startFrom: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers[ValueParameterDescriptorImpl]

'parents' @ [105:93] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [106:14] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtTypeParameterListOwner> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtTypeParameterListOwner

'filter' @ [107:14] ==> public fun <T> Sequence<KtTypeParameterListOwner>.filter(predicate: (KtTypeParameterListOwner) -> Boolean): Sequence<KtTypeParameterListOwner> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameterListOwner

'it' @ [108:19] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [108:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [108:37] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [108:40] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'it' @ [108:57] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:18] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [110:19] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [110:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [110:40] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [110:43] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'it' @ [111:18] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [111:40] ==> value-parameter it: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.getPossibleTypeParameterContainers.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [111:43] ==> public final val KtTypeParameterListOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'toList' @ [113:14] ==> public fun <T> Sequence<KtTypeParameterListOwner>.toList(): List<KtTypeParameterListOwner> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameterListOwner

