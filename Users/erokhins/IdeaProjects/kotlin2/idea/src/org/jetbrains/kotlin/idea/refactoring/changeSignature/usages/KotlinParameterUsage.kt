'KotlinUsageInfo<T>' @ [32:74] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: T) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'element' @ [32:93] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.<init>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [40:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [40:39] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[ValueParameterDescriptorImpl]

'project' @ [40:47] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'createExpression' @ [40:56] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getReplacementText' @ [40:73] ==> public abstract fun getReplacementText(changeInfo: KotlinChangeInfo): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [40:92] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[ValueParameterDescriptorImpl]

'?:' @ [41:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'element' @ [41:33] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[ValueParameterDescriptorImpl]

'parent' @ [41:41] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [41:73] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[ValueParameterDescriptorImpl]

'processReplacedElement' @ [42:9] ==> protected open fun processReplacedElement(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage[SimpleFunctionDescriptorImpl]

'elementToReplace' @ [42:32] ==> val elementToReplace: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[LocalVariableDescriptor]

'replace' @ [42:49] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'newElement' @ [42:57] ==> val newElement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage.processUsage[LocalVariableDescriptor]

'KotlinExplicitReferenceUsage<KtElement>' @ [51:5] ==> public constructor KotlinExplicitReferenceUsage<T : KtElement>(element: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtElement

'element' @ [51:45] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.<init>[ValueParameterDescriptorImpl]

'element' @ [53:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[ValueParameterDescriptorImpl]

'parent' @ [53:43] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (qualifiedExpression?.receiverExpression == element) qualifiedExpression else element' @ [54:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'qualifiedExpression' @ [54:36] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[LocalVariableDescriptor]

'receiverExpression' @ [54:57] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [54:79] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[ValueParameterDescriptorImpl]

'qualifiedExpression' @ [54:88] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[LocalVariableDescriptor]

'element' @ [54:113] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[ValueParameterDescriptorImpl]

'elementToShorten' @ [55:9] ==> val elementToShorten: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.processReplacedElement[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [55:26] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'Options' @ [55:49] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'changeInfo' @ [59:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.getReplacementText[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [59:24] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'parameterInfo' @ [59:49] ==> private final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[PropertyDescriptorImpl]

'parameterInfo' @ [59:71] ==> private final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[PropertyDescriptorImpl]

'getInheritedName' @ [59:85] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'containingCallable' @ [59:102] ==> public final val containingCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[PropertyDescriptorImpl]

'changeInfo' @ [61:23] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.getReplacementText[ValueParameterDescriptorImpl]

'newName' @ [61:34] ==> public final var KotlinChangeInfo.newName: String[MyPropertyDescriptor]

'KotlinNameSuggester' @ [62:13] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [62:33] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'newName' @ [62:46] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.getReplacementText[LocalVariableDescriptor]

'newName' @ [62:70] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage.getReplacementText[LocalVariableDescriptor]

'KotlinExplicitReferenceUsage<KtThisExpression>' @ [71:5] ==> public constructor KotlinExplicitReferenceUsage<T : KtElement>(element: KtThisExpression) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinExplicitReferenceUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtThisExpression

'element' @ [71:52] ==> value-parameter element: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinNonQualifiedOuterThisUsage.<init>[ValueParameterDescriptorImpl]

'element' @ [73:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinNonQualifiedOuterThisUsage.processReplacedElement[ValueParameterDescriptorImpl]

'addToShorteningWaitSet' @ [73:17] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'Options' @ [73:40] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'targetDescriptor' @ [76:85] ==> public final val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinNonQualifiedOuterThisUsage[PropertyDescriptorImpl]

'name' @ [76:102] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [76:107] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

