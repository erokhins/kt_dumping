'KotlinQuickFixAction<KtTypeReference>' @ [29:68] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeReference

'typeReference' @ [29:106] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.<init>[ValueParameterDescriptorImpl]

'typeReference' @ [31:25] ==> public final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix[PropertyDescriptorImpl]

'parent' @ [31:39] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameter' @ [32:21] ==> val parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'extendsBound' @ [32:31] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'parameter' @ [33:29] ==> val parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'parent' @ [33:39] ==> public final val KtTypeParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeReference' @ [34:34] ==> public final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix[PropertyDescriptorImpl]

'getStrictParentOfType' @ [34:48] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'parameterListOwner' @ [35:23] ==> val parameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'analyzeFully' @ [35:42] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [36:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'TYPE_PARAMETER' @ [36:58] ==> public final val TYPE_PARAMETER: (WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [36:74] ==> val parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'parameterListOwner' @ [37:9] ==> val parameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'forEachDescendantOfType' @ [37:28] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtTypeReference) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'it' @ [38:31] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'typeElement' @ [38:34] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'context' @ [39:24] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'TYPE' @ [39:47] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [39:53] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'typeElement' @ [40:17] ==> val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[LocalVariableDescriptor]

'type' @ [40:40] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[LocalVariableDescriptor]

'type' @ [40:56] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[LocalVariableDescriptor]

'constructor' @ [40:61] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [40:73] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'parameterDescriptor' @ [40:98] ==> val parameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'typeElement' @ [41:17] ==> val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke.<anonymous>[LocalVariableDescriptor]

'replace' @ [41:29] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeElement[JavaMethodDescriptor]

'bound' @ [41:37] ==> val bound: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'if (parameterList.parameters.size == 1) {
            parameterList.delete()
        }
        else {
            EditCommaSeparatedListHelper.removeItem(parameter)
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameterList' @ [45:13] ==> val parameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'parameters' @ [45:27] ==> public final val KtTypeParameterList.parameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'size' @ [45:38] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameterList' @ [46:13] ==> val parameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'delete' @ [46:27] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeParameterList[JavaMethodDescriptor]

'removeItem' @ [49:42] ==> public final fun <TItem : KtElement> removeItem(item: KtTypeParameter): Unit defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TItem : KtElement> -> KtTypeParameter

'parameter' @ [49:53] ==> val parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.invoke[LocalVariableDescriptor]

'text' @ [55:36] ==> public final val InlineTypeParameterFix.text: String[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [57:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'InlineTypeParameterFix' @ [58:61] ==> public constructor InlineTypeParameterFix(typeReference: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix[ClassConstructorDescriptorImpl]

'FINAL_UPPER_BOUND' @ [58:91] ==> public final val FINAL_UPPER_BOUND: (DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [58:109] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [58:114] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.InlineTypeParameterFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [58:126] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>.psiElement: KtTypeReference[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

