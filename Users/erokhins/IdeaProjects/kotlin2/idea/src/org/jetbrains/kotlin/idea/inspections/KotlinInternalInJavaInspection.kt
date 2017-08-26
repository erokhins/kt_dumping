'LocalInspectionTool' @ [28:40] ==> public constructor LocalInspectionTool() defined in com.intellij.codeInspection.LocalInspectionTool[JavaClassConstructorDescriptor]

'JavaElementVisitor' @ [30:25] ==> public constructor JavaElementVisitor() defined in com.intellij.psi.JavaElementVisitor[JavaClassConstructorDescriptor]

'expression' @ [32:17] ==> value-parameter expression: PsiReferenceExpression? defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.buildVisitor.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'checkAndReport' @ [32:29] ==> private final fun PsiElement.checkAndReport(holder: ProblemsHolder): Unit defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection[SimpleFunctionDescriptorImpl]

'holder' @ [32:44] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.buildVisitor[ValueParameterDescriptorImpl]

'reference' @ [36:17] ==> value-parameter reference: PsiJavaCodeReferenceElement? defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.buildVisitor.<no name provided>.visitReferenceElement[ValueParameterDescriptorImpl]

'checkAndReport' @ [36:28] ==> private final fun PsiElement.checkAndReport(holder: ProblemsHolder): Unit defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection[SimpleFunctionDescriptorImpl]

'holder' @ [36:43] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.buildVisitor[ValueParameterDescriptorImpl]

'?:' @ [42:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtLightElement<KtElement, PsiElement>?, right: KtLightElement<KtElement, PsiElement>): KtLightElement<KtElement, PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtLightElement<KtElement, PsiElement>

'this' @ [42:29] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[ReceiverParameterDescriptorImpl]

'resolve' @ [42:53] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'lightElement' @ [43:33] ==> val lightElement: KtLightElement<KtElement, PsiElement> defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[LocalVariableDescriptor]

'kotlinOrigin' @ [43:46] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'inSameModule' @ [44:12] ==> private final fun PsiElement.inSameModule(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection[SimpleFunctionDescriptorImpl]

'modifierListOwner' @ [44:25] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[LocalVariableDescriptor]

'modifierListOwner' @ [48:12] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[LocalVariableDescriptor]

'hasModifier' @ [48:30] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [48:42] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'holder' @ [49:13] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[ValueParameterDescriptorImpl]

'registerProblem' @ [49:20] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @Nullable vararg p2: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'this' @ [49:36] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.checkAndReport[ReceiverParameterDescriptorImpl]

'getNullableModuleInfo' @ [53:64] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'equals' @ [53:89] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[DeserializedSimpleFunctionDescriptor]

'element' @ [53:96] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinInternalInJavaInspection.inSameModule[ValueParameterDescriptorImpl]

'getNullableModuleInfo' @ [53:104] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

