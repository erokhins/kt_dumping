'KotlinIntentionActionFactoryWithDelegate<KtTypeArgumentList, CreateTypeParameterData>' @ [38:64] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtTypeArgumentList
    <D : Any> -> CreateTypeParameterData

'diagnostic' @ [39:65] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [39:76] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [42:23] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'project' @ [42:31] ==> public final val KtTypeArgumentList.project: Project[MyPropertyDescriptor]

'element' @ [43:29] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'arguments' @ [43:37] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'element' @ [44:23] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'analyze' @ [44:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [45:22] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'parent' @ [45:30] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtUserType -> context[BindingContext.REFERENCE_TARGET, parent.referenceExpression]
            is KtCallElement -> parent.getResolvedCall(context)?.resultingDescriptor
            else -> null
        }' @ [46:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'parent' @ [46:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'context' @ [47:30] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [47:53] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [47:71] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'referenceExpression' @ [47:78] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'parent' @ [48:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'getResolvedCall' @ [48:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [48:56] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'resultingDescriptor' @ [48:66] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'DescriptorToSourceUtilsIde' @ [51:37] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [51:64] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [51:82] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'referencedDescriptor' @ [51:91] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'typeArguments' @ [54:37] ==> val typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'size' @ [54:51] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'referencedDeclaration' @ [54:58] ==> val referencedDeclaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'typeParameters' @ [54:80] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'size' @ [54:95] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'missingParameterCount' @ [55:13] ==> val missingParameterCount: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'referencedDeclaration' @ [57:21] ==> val referencedDeclaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'getResolutionScope' @ [57:43] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [58:30] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesForTypeParameters' @ [58:50] ==> public final fun suggestNamesForTypeParameters(count: Int, validator: (String) -> Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'missingParameterCount' @ [59:17] ==> val missingParameterCount: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'CollectingNameValidator' @ [60:17] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'referencedDeclaration' @ [60:41] ==> val referencedDeclaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'typeParameters' @ [60:63] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'mapNotNull' @ [60:78] ==> public inline fun <T, R : Any> Iterable<(KtTypeParameter..KtTypeParameter?)>.mapNotNull(transform: ((KtTypeParameter..KtTypeParameter?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)
    <R : Any> -> String

'it' @ [60:91] ==> value-parameter it: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:94] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'scope' @ [61:21] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'findClassifier' @ [61:27] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [61:47] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [61:58] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [61:80] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'suggestedNames' @ [64:34] ==> val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'map' @ [64:49] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> TypeParameterInfo): List<TypeParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> TypeParameterInfo

'TypeParameterInfo' @ [65:21] ==> public constructor TypeParameterInfo(name: String, upperBoundType: KotlinType?, fakeTypeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[ClassConstructorDescriptorImpl]

'name' @ [66:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'createFakeTypeParameterDescriptor' @ [68:29] ==> public fun createFakeTypeParameterDescriptor(containingDescriptor: DeclarationDescriptor, name: String): TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter in file CreateTypeParameterByUnresolvedRefActionFactory.kt[SimpleFunctionDescriptorImpl]

'referencedDescriptor' @ [68:63] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'name' @ [68:85] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'CreateTypeParameterData' @ [71:16] ==> public constructor CreateTypeParameterData(declaration: KtTypeParameterListOwner, typeParameters: List<TypeParameterInfo>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[ClassConstructorDescriptorImpl]

'referencedDeclaration' @ [71:40] ==> val referencedDeclaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'typeParameterInfos' @ [71:63] ==> val typeParameterInfos: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'QuickFixWithDelegateFactory' @ [79:16] ==> public constructor QuickFixWithDelegateFactory(delegateFactory: () -> IntentionAction?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixWithDelegateFactory[ClassConstructorDescriptorImpl]

'originalElementPointer' @ [80:35] ==> value-parameter originalElementPointer: SmartPsiElementPointer<KtTypeArgumentList> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.createFixes[ValueParameterDescriptorImpl]

'element' @ [80:58] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtTypeArgumentList>.element: KtTypeArgumentList?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtTypeArgumentList

'invoke' @ [81:24] ==> public abstract operator fun invoke(): CreateTypeParameterData? defined in kotlin.Function0[FunctionInvokeDescriptor]

'CreateTypeParameterFromUsageFix' @ [82:13] ==> public constructor CreateTypeParameterFromUsageFix(originalElement: KtElement, data: CreateTypeParameterData, presentTypeParameterNames: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[ClassConstructorDescriptorImpl]

'originalElement' @ [82:45] ==> val originalElement: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.createFixes.<anonymous>[LocalVariableDescriptor]

'data' @ [82:62] ==> val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterUnmatchedTypeArgumentActionFactory.createFixes.<anonymous>[LocalVariableDescriptor]

'let' @ [83:11] ==> @InlineOnly public inline fun <T, R> QuickFixWithDelegateFactory.let(block: (QuickFixWithDelegateFactory) -> List<QuickFixWithDelegateFactory>): List<QuickFixWithDelegateFactory> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory
    <R> -> List<QuickFixWithDelegateFactory>

