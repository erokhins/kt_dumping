'KotlinQuickFixAction<KtExpression>' @ [39:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'expression' @ [39:40] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.<init>[ValueParameterDescriptorImpl]

'nullableExpression' @ [40:45] ==> value-parameter nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.<init>[ValueParameterDescriptorImpl]

'createSmartPointer' @ [40:64] ==> public fun <E : PsiElement> KtExpression.createSmartPointer(): SmartPsiElementPointer<KtExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtExpression

'text' @ [42:36] ==> public final val SurroundWithNullCheckFix.text: String[MyPropertyDescriptor]

'element' @ [47:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix[PropertyDescriptorImpl]

'nullableExpressionPointer' @ [48:34] ==> private final val nullableExpressionPointer: SmartPsiElementPointer<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix[PropertyDescriptorImpl]

'element' @ [48:60] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtExpression>.element: KtExpression?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtExpression

'KtPsiFactory' @ [49:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [49:36] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'factory' @ [50:26] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [50:34] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'nullableExpression' @ [50:86] ==> val nullableExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'element' @ [50:106] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'element' @ [51:9] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'replace' @ [51:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'surrounded' @ [51:25] ==> val surrounded: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [54:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'with' @ [56:58] ==> @InlineOnly public inline fun <T, R> with(receiver: (PsiElement..PsiElement?), block: (PsiElement..PsiElement?).() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> Boolean

'parent' @ [56:64] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [57:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.hasAcceptableParent.<anonymous>[ReceiverParameterDescriptorImpl]

'this' @ [57:42] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.hasAcceptableParent.<anonymous>[ReceiverParameterDescriptorImpl]

'parent' @ [57:47] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [58:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.hasAcceptableParent.<anonymous>[ReceiverParameterDescriptorImpl]

'this' @ [58:36] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.hasAcceptableParent.<anonymous>[ReceiverParameterDescriptorImpl]

'parent' @ [58:41] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'diagnostic' @ [62:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [62:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [63:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [63:44] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'element' @ [63:83] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'expressionParent' @ [64:27] ==> val expressionParent: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'analyze' @ [64:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [64:68] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [66:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [66:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                        is KtDotQualifiedExpression -> parent.receiverExpression
                        is KtBinaryExpression -> parent.left
                        is KtCallExpression -> parent.calleeExpression
                        else -> return null
                    }' @ [68:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'parent' @ [68:27] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [69:56] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'receiverExpression' @ [69:63] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'parent' @ [70:50] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'left' @ [70:57] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'parent' @ [71:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'calleeExpression' @ [71:55] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullableExpression' @ [75:18] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'isStable' @ [75:37] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [75:46] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'expressionParent' @ [77:36] ==> val expressionParent: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfTypesAndPredicate' @ [77:53] ==> public fun <T : PsiElement> PsiElement.getParentOfTypesAndPredicate(strict: Boolean = ..., vararg parentClasses: Class<KtExpression>, predicate: (KtExpression) -> Boolean): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'java' @ [77:134] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [78:18] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [78:21] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [78:40] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'it' @ [78:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'hasAcceptableParent' @ [78:55] ==> private final fun KtExpression.hasAcceptableParent(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion[SimpleFunctionDescriptorImpl]

'expressionTarget' @ [81:17] ==> val expressionTarget: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'SurroundWithNullCheckFix' @ [83:20] ==> public constructor SurroundWithNullCheckFix(expression: KtExpression, nullableExpression: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix[ClassConstructorDescriptorImpl]

'expressionTarget' @ [83:45] ==> val expressionTarget: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'nullableExpression' @ [83:63] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.Companion.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [87:40] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [90:38] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [90:49] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'nullableExpression' @ [91:33] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[LocalVariableDescriptor]

'parent' @ [91:52] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [91:59] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'forExpression' @ [92:17] ==> val forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[LocalVariableDescriptor]

'parent' @ [92:31] ==> public final val KtForExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [94:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullableExpression' @ [94:18] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[LocalVariableDescriptor]

'isStable' @ [94:37] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'SurroundWithNullCheckFix' @ [96:20] ==> public constructor SurroundWithNullCheckFix(expression: KtExpression, nullableExpression: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix[ClassConstructorDescriptorImpl]

'forExpression' @ [96:45] ==> val forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[LocalVariableDescriptor]

'nullableExpression' @ [96:60] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.IteratorOnNullableFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [100:34] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'TYPE_MISMATCH' @ [103:39] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [103:53] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [103:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'typeMismatch' @ [104:38] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'psiElement' @ [104:51] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.psiElement: (KtExpression..KtExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'nullableExpression' @ [105:28] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'parent' @ [105:47] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [106:24] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'getParentOfType' @ [106:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'call' @ [108:28] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'getLastParentOfTypeInRow' @ [108:33] ==> public inline fun <reified T : PsiElement> PsiElement.getLastParentOfTypeInRow(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtQualifiedExpression

'call' @ [108:86] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'rootCall' @ [109:17] ==> val rootCall: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'parent' @ [109:26] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [111:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullabilityMismatch' @ [111:18] ==> public fun isNullabilityMismatch(expected: KotlinType, actual: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'typeMismatch' @ [111:51] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'a' @ [111:64] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.a: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typeMismatch' @ [111:76] ==> val typeMismatch: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'b' @ [111:89] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.b: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'!' @ [113:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullableExpression' @ [113:18] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'isStable' @ [113:37] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'SurroundWithNullCheckFix' @ [115:20] ==> public constructor SurroundWithNullCheckFix(expression: KtExpression, nullableExpression: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix[ClassConstructorDescriptorImpl]

'rootCall' @ [115:45] ==> val rootCall: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

'nullableExpression' @ [115:55] ==> val nullableExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.SurroundWithNullCheckFix.TypeMismatchFactory.createAction[LocalVariableDescriptor]

