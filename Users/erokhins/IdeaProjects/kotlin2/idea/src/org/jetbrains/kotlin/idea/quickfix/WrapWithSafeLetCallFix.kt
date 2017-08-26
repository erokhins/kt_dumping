'KotlinQuickFixAction<KtExpression>' @ [37:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'expression' @ [37:40] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.<init>[ValueParameterDescriptorImpl]

'nullableExpression' @ [38:45] ==> value-parameter nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.<init>[ValueParameterDescriptorImpl]

'createSmartPointer' @ [38:64] ==> public fun <E : PsiElement> KtExpression.createSmartPointer(): SmartPsiElementPointer<KtExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtExpression

'text' @ [40:36] ==> public final val WrapWithSafeLetCallFix.text: String[MyPropertyDescriptor]

'element' @ [45:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix[PropertyDescriptorImpl]

'nullableExpressionPointer' @ [46:34] ==> private final val nullableExpressionPointer: SmartPsiElementPointer<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix[PropertyDescriptorImpl]

'element' @ [46:60] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtExpression>.element: KtExpression?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtExpression

'KtPsiFactory' @ [47:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [47:36] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'nullableExpression' @ [48:28] ==> val nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'text' @ [48:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'NewDeclarationNameValidator' @ [49:25] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'element' @ [49:53] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'nullableExpression' @ [49:62] ==> val nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'VARIABLES' @ [49:117] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'KotlinNameSuggester' @ [50:20] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [50:40] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'validator' @ [50:64] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'nullableExpression' @ [51:9] ==> val nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'replace' @ [51:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'factory' @ [51:36] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'createExpression' @ [51:44] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [51:61] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'when (name) {
            "it" -> factory.createExpressionByPattern("$0?.let { $1 }", nullableText, element)
            else -> factory.createExpressionByPattern("$0?.let { $1 -> $2 }", nullableText, name, element)
        }' @ [52:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'name' @ [52:29] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'factory' @ [53:21] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [53:29] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'nullableText' @ [53:73] ==> val nullableText: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'element' @ [53:87] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'factory' @ [54:21] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [54:29] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'nullableText' @ [54:79] ==> val nullableText: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'name' @ [54:93] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'element' @ [54:99] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'element' @ [56:9] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'replace' @ [56:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'wrapped' @ [56:25] ==> val wrapped: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [59:28] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [61:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [61:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [63:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'element' @ [64:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'getResolvedCall' @ [64:44] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [64:60] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'analyze' @ [64:68] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [65:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'call' @ [65:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'callType' @ [65:41] ==> public final val Call.callType: Call.CallType[MyPropertyDescriptor]

'INVOKE' @ [65:67] ==> enum entry INVOKE defined in org.jetbrains.kotlin.psi.Call.CallType[FakeCallableDescriptorForObject]

'element' @ [68:30] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'getParentOfType' @ [68:38] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'element' @ [70:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'parent' @ [70:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [71:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'parent' @ [71:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'calleeExpression' @ [71:69] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'WrapWithSafeLetCallFix' @ [73:20] ==> public constructor WrapWithSafeLetCallFix(expression: KtExpression, nullableExpression: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix[ClassConstructorDescriptorImpl]

'expression' @ [73:43] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'nullableExpression' @ [73:55] ==> val nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.UnsafeFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [77:34] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'TYPE_MISMATCH' @ [79:39] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [79:53] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [79:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'typeMismatch' @ [80:28] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'psiElement' @ [80:41] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.psiElement: (KtExpression..KtExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'parent' @ [80:52] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [81:24] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'getParentOfType' @ [81:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'!' @ [83:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullabilityMismatch' @ [83:18] ==> public fun isNullabilityMismatch(expected: KotlinType, actual: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'typeMismatch' @ [83:51] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'a' @ [83:64] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.a: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typeMismatch' @ [83:76] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'b' @ [83:89] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.b: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'WrapWithSafeLetCallFix' @ [85:20] ==> public constructor WrapWithSafeLetCallFix(expression: KtExpression, nullableExpression: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix[ClassConstructorDescriptorImpl]

'call' @ [85:43] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'getLastParentOfTypeInRow' @ [85:48] ==> public inline fun <reified T : PsiElement> PsiElement.getLastParentOfTypeInRow(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtQualifiedExpression

'call' @ [85:101] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'typeMismatch' @ [85:107] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.WrapWithSafeLetCallFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'psiElement' @ [85:120] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.psiElement: (KtExpression..KtExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

