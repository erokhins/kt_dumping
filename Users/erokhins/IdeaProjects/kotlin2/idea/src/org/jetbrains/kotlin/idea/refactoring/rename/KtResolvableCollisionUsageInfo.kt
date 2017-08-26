'ResolvableCollisionUsageInfo' @ [32:5] ==> public constructor ResolvableCollisionUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.rename.ResolvableCollisionUsageInfo[JavaClassConstructorDescriptor]

'element' @ [32:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KtResolvableCollisionUsageInfo.<init>[ValueParameterDescriptorImpl]

'referencedElement' @ [32:43] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KtResolvableCollisionUsageInfo.<init>[ValueParameterDescriptorImpl]

'KtResolvableCollisionUsageInfo' @ [43:5] ==> public constructor KtResolvableCollisionUsageInfo(element: PsiElement, referencedElement: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.rename.KtResolvableCollisionUsageInfo[ClassConstructorDescriptorImpl]

'element' @ [43:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithReplacement.<init>[ValueParameterDescriptorImpl]

'referencedElement' @ [43:45] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithReplacement.<init>[ValueParameterDescriptorImpl]

'element' @ [45:9] ==> public final val UsageInfoWithReplacement.element: PsiElement?[MyPropertyDescriptor]

'replaced' @ [45:18] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtElement): KtElement defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtElement

'replacement' @ [45:27] ==> private final val replacement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithReplacement[PropertyDescriptorImpl]

'addToShorteningWaitSet' @ [45:41] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'ShortenReferences' @ [45:64] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'ALL_ENABLED' @ [45:90] ==> public final val ALL_ENABLED: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'KtResolvableCollisionUsageInfo' @ [53:5] ==> public constructor KtResolvableCollisionUsageInfo(element: PsiElement, referencedElement: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.rename.KtResolvableCollisionUsageInfo[ClassConstructorDescriptorImpl]

'element' @ [53:36] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithFqNameReplacement.<init>[ValueParameterDescriptorImpl]

'referencedElement' @ [53:45] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithFqNameReplacement.<init>[ValueParameterDescriptorImpl]

'element' @ [55:10] ==> public final val UsageInfoWithFqNameReplacement.element: PsiElement?[MyPropertyDescriptor]

'mainReference' @ [55:47] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [55:62] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'newFqName' @ [55:75] ==> private final val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithFqNameReplacement[PropertyDescriptorImpl]

