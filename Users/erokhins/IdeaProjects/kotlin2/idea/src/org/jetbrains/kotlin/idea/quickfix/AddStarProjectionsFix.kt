'KotlinQuickFixAction<KtUserType>' @ [29:88] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtUserType) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtUserType

'element' @ [29:121] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.<init>[ValueParameterDescriptorImpl]

'getTypeNameAndStarProjectionsString' @ [31:61] ==> @NotNull public open fun getTypeNameAndStarProjectionsString(@NotNull p0: String, p1: Int): String defined in org.jetbrains.kotlin.types.expressions.TypeReconstructionUtil[JavaMethodDescriptor]

'argumentCount' @ [31:101] ==> private final val argumentCount: Int defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix[PropertyDescriptorImpl]

'element' @ [34:23] ==> protected final val element: KtUserType? defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix[PropertyDescriptorImpl]

'assert' @ [35:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [35:16] ==> val element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'typeArguments' @ [35:24] ==> public final val KtUserType.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isEmpty' @ [35:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getTypeNameAndStarProjectionsString' @ [37:49] ==> @NotNull public open fun getTypeNameAndStarProjectionsString(@NotNull p0: String, p1: Int): String defined in org.jetbrains.kotlin.types.expressions.TypeReconstructionUtil[JavaMethodDescriptor]

'element' @ [37:85] ==> val element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'text' @ [37:93] ==> public final val KtUserType.text: (String..String?)[MyPropertyDescriptor]

'argumentCount' @ [37:99] ==> private final val argumentCount: Int defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [38:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [38:40] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[ValueParameterDescriptorImpl]

'createType' @ [38:46] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeString' @ [38:57] ==> val typeString: String defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'typeElement' @ [38:69] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'sure' @ [38:81] ==> public inline fun <T : Any> KtTypeElement?.sure(message: () -> String): KtTypeElement defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtTypeElement

'+' @ [38:88] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeString' @ [38:123] ==> val typeString: String defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'element' @ [39:9] ==> val element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'replace' @ [39:17] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtUserType[JavaMethodDescriptor]

'replacement' @ [39:25] ==> val replacement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [42:34] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'NO_TYPE_ARGUMENTS_ON_RHS' @ [44:51] ==> public final val NO_TYPE_ARGUMENTS_ON_RHS: (DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)>..DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [44:76] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [44:81] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction[ValueParameterDescriptorImpl]

'diagnosticWithParameters' @ [45:46] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)> defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction[LocalVariableDescriptor]

'psiElement' @ [45:71] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)>.psiElement: (KtTypeReference..KtTypeReference?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <A : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'typeElement' @ [45:82] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'generateSequence' @ [46:33] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: KtTypeElement?, nextFunction: (KtTypeElement) -> KtTypeElement?): Sequence<KtTypeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtTypeElement

'typeElement' @ [46:50] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction[LocalVariableDescriptor]

'it' @ [46:66] ==> value-parameter it: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'innerType' @ [46:90] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'lastOrNull' @ [46:102] ==> public fun <T> Sequence<KtTypeElement>.lastOrNull(): KtTypeElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement

'AddStarProjectionsFix' @ [47:20] ==> private constructor AddStarProjectionsFix(element: KtUserType, argumentCount: Int) defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix[ClassConstructorDescriptorImpl]

'unwrappedType' @ [47:42] ==> val unwrappedType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction[LocalVariableDescriptor]

'diagnosticWithParameters' @ [47:57] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)> defined in org.jetbrains.kotlin.idea.quickfix.AddStarProjectionsFix.IsExpressionFactory.createAction[LocalVariableDescriptor]

'a' @ [47:82] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtTypeReference..KtTypeReference?), (Int..Int?), (String..String?)>.a: (Int..Int?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <A : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)

