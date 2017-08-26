'KotlinQuickFixAction<KtExpression>' @ [29:79] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'expression' @ [29:114] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.<init>[ValueParameterDescriptorImpl]

'if (KotlinBuiltIns.isArray(expectedType)) {
        "arrayOf"
    }
    else {
        val typeName = DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(expectedType)
        "${typeName.decapitalize()}Of"

    }' @ [31:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isArray' @ [31:45] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [31:53] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.<init>[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [35:24] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [35:43] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [35:64] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [35:75] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.<init>[ValueParameterDescriptorImpl]

'typeName' @ [36:12] ==> val typeName: String defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.prefix[LocalVariableDescriptor]

'decapitalize' @ [36:21] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [40:36] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix[PropertyDescriptorImpl]

'element' @ [44:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [45:33] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [45:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [45:55] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'prefix' @ [45:91] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix[PropertyDescriptorImpl]

'element' @ [45:99] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.invoke[LocalVariableDescriptor]

'element' @ [46:9] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.invoke[LocalVariableDescriptor]

'replace' @ [46:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'arrayOfExpression' @ [46:25] ==> val arrayOfExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix.invoke[LocalVariableDescriptor]

