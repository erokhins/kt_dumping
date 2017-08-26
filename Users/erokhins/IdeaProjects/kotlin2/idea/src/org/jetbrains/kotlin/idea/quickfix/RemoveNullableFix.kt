'KotlinQuickFixAction<KtNullableType>' @ [30:84] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNullableType) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNullableType

'element' @ [30:121] ==> value-parameter element: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.<init>[ValueParameterDescriptorImpl]

'' @ [32:18] ==> private constructor NullableKind(message: String) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[ClassConstructorDescriptorImpl]

'' @ [33:18] ==> private constructor NullableKind(message: String) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[ClassConstructorDescriptorImpl]

'' @ [34:16] ==> private constructor NullableKind(message: String) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[ClassConstructorDescriptorImpl]

'' @ [35:17] ==> private constructor NullableKind(message: String) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[ClassConstructorDescriptorImpl]

'typeOfError' @ [40:30] ==> private final val typeOfError: RemoveNullableFix.NullableKind defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix[PropertyDescriptorImpl]

'message' @ [40:42] ==> public final val message: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[PropertyDescriptorImpl]

'element' @ [43:23] ==> protected final val element: KtNullableType? defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix[PropertyDescriptorImpl]

'element' @ [44:20] ==> val element: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.invoke[LocalVariableDescriptor]

'innerType' @ [44:28] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'error' @ [44:41] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [44:47] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [44:66] ==> val element: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.invoke[LocalVariableDescriptor]

'text' @ [44:74] ==> public final val KtNullableType.text: (String..String?)[MyPropertyDescriptor]

'element' @ [45:9] ==> val element: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.invoke[LocalVariableDescriptor]

'replace' @ [45:17] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNullableType[JavaMethodDescriptor]

'type' @ [45:25] ==> val type: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [48:60] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [50:28] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [50:39] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [50:50] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNullableType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNullableType

'nullType' @ [51:17] ==> val nullType: KtNullableType? defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.Factory.createAction[LocalVariableDescriptor]

'innerType' @ [51:27] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'RemoveNullableFix' @ [52:20] ==> public constructor RemoveNullableFix(element: KtNullableType, typeOfError: RemoveNullableFix.NullableKind) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix[ClassConstructorDescriptorImpl]

'nullType' @ [52:38] ==> val nullType: KtNullableType? defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.Factory.createAction[LocalVariableDescriptor]

'typeOfError' @ [52:48] ==> private final val typeOfError: RemoveNullableFix.NullableKind defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.Factory[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [56:31] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [58:42] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [58:73] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [58:78] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [58:90] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)>.psiElement: PsiElement[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'lateinitElement' @ [59:28] ==> val lateinitElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [59:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [60:33] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[LocalVariableDescriptor]

'typeReference' @ [60:42] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'?:' @ [61:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNullableType?, right: KtNullableType): KtNullableType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNullableType

'typeReference' @ [61:32] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[LocalVariableDescriptor]

'typeElement' @ [61:46] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeElement' @ [62:17] ==> val typeElement: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[LocalVariableDescriptor]

'innerType' @ [62:29] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'RemoveNullableFix' @ [63:20] ==> public constructor RemoveNullableFix(element: KtNullableType, typeOfError: RemoveNullableFix.NullableKind) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix[ClassConstructorDescriptorImpl]

'typeElement' @ [63:38] ==> val typeElement: KtNullableType defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.LATEINIT_FACTORY.createAction[LocalVariableDescriptor]

'PROPERTY' @ [63:64] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.RemoveNullableFix.NullableKind[FakeCallableDescriptorForObject]

